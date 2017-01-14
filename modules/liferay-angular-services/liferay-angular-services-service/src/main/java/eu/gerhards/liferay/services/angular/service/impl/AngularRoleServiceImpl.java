/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package eu.gerhards.liferay.services.angular.service.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.security.membershippolicy.OrganizationMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.RoleMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.SiteMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.RolePermissionUtil;
import com.liferay.portal.kernel.service.permission.UserGroupRolePermissionUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.users.admin.kernel.util.UsersAdminUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularRoleServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the Role remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularRoleService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularRoleServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularRoleServiceUtil
 */
@ProviderType
public class AngularRoleServiceImpl extends AngularRoleServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularRoleServiceUtil} to access the Role remote service.
	 */

    public static Log _log = LogFactoryUtil.getLog(AngularRoleServiceImpl.class.getName());

    @Override
    public List<Role> getRolesInCompany(long companyId) throws PortalException {

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_ROLES);

        List<Role> companyRoles = RoleLocalServiceUtil.getRoles(companyId);

        return companyRoles;
    }

    @Override
    public List<Role> getRegularRoles(long companyId) throws PortalException {

        try {
            List<Role> allRoles = this.getRolesInCompany(companyId);
            return this.getRolesForSpecificType(allRoles, RoleConstants.TYPE_REGULAR);

        } catch (PortalException e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public List<Role> getSiteRoles(long companyId) throws PortalException {
        try {
            List<Role> allRoles = this.getRolesInCompany(companyId);
            return this.getRolesForSpecificType(allRoles, RoleConstants.TYPE_SITE);
        } catch (PortalException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Role createRole(String name, int type, String className, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String subType) throws PortalException {
        _log.info("Creating role ... ");

        _log.debug("    security check ... ");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_ROLE);

        _log.debug("    writing information ... ");

        return RoleLocalServiceUtil.addRole(this.getUserId(), className, 0, name, titleMap, descriptionMap, type, subType, null);
    }

    @Override
    public Role updateRole(long roleId, String name, int type, String className, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String subType) throws PortalException {

        _log.info("Updating role ... ");

        _log.debug("    security check ... ");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.UPDATE);
        RolePermissionUtil.check(getPermissionChecker(), roleId, ActionKeys.UPDATE);

        _log.debug("    writing information ... ");

        return RoleLocalServiceUtil.updateRole(roleId, name, titleMap, descriptionMap,subType, null);
    }

    @Override
    public Role deleteRole(long roleId) throws PortalException {

        _log.info("Deleting role with id: "+String.valueOf(roleId));

        _log.debug("    security check ...");

        RolePermissionUtil.check(getPermissionChecker(), roleId, ActionKeys.DELETE);

        _log.debug("    deleting role ...");

        return RoleLocalServiceUtil.deleteRole(roleId);
    }

    @Override
    public List<Role> getOrganizationRoles(long companyId) {
        List<Role> allRoles = null;
        try {
            allRoles = this.getRolesInCompany(companyId);
        } catch (PortalException e) {
            e.printStackTrace();
        }
        return this.getRolesForSpecificType(allRoles, RoleConstants.TYPE_ORGANIZATION);
    }

    private List<Role> getRolesForSpecificType(List<Role> roles, int type) {
        List<Role> typedRoles = new ArrayList<Role>();
        if (roles != null && !roles.isEmpty()) {
            for(Role role:roles) {
                if (role.getType() == type) {
                    typedRoles.add(role);
                }
            }
        }

        return typedRoles;
    }

    public long[] checkRoles(long userId, long[] roleIds)
            throws PortalException {

        long[] oldRoleIds = null;

        PermissionChecker permissionChecker = getPermissionChecker();

        if (userId != CompanyConstants.SYSTEM) {

            // Add back any mandatory roles or roles that the administrator does
            // not have the rights to remove and check that he has the
            // permission to add a new role

            List<Role> oldRoles = roleLocalService.getUserRoles(userId);

            oldRoleIds = new long[oldRoles.size()];

            for (int i = 0; i < oldRoles.size(); i++) {
                Role role = oldRoles.get(i);

                if (!ArrayUtil.contains(roleIds, role.getRoleId()) &&
                        (!RolePermissionUtil.contains(
                                permissionChecker, role.getRoleId(),
                                ActionKeys.ASSIGN_MEMBERS) ||
                                RoleMembershipPolicyUtil.isRoleRequired(
                                        userId, role.getRoleId()))) {

                    roleIds = ArrayUtil.append(roleIds, role.getRoleId());
                }

                oldRoleIds[i] = role.getRoleId();
            }
        }

        // Check that the administrator has the permission to add a new role and
        // that the role membership is allowed

        for (long roleId : roleIds) {
            if ((oldRoleIds != null) &&
                    ArrayUtil.contains(oldRoleIds, roleId)) {

                continue;
            }

            RolePermissionUtil.check(
                    permissionChecker, roleId, ActionKeys.ASSIGN_MEMBERS);
        }

        if (userId != CompanyConstants.SYSTEM) {
            return UsersAdminUtil.addRequiredRoles(userId, roleIds);
        }

        return roleIds;
    }

    public List<UserGroupRole> checkUserGroupRoles(
            long userId, List<UserGroupRole> userGroupRoles)
            throws PortalException {

        List<UserGroupRole> oldUserGroupRoles = null;

        PermissionChecker permissionChecker = getPermissionChecker();

        if (userId != CompanyConstants.SYSTEM) {

            // Add back any user group roles that the administrator does not
            // have the rights to remove or that have a mandatory membership

            oldUserGroupRoles = userGroupRoleLocalService.getUserGroupRoles(
                    userId);

            for (UserGroupRole oldUserGroupRole : oldUserGroupRoles) {
                Role role = oldUserGroupRole.getRole();
                Group group = oldUserGroupRole.getGroup();

                if (userGroupRoles.contains(oldUserGroupRole)) {
                    continue;
                }

                if (role.getType() == RoleConstants.TYPE_ORGANIZATION) {
                    Organization organization =
                            organizationPersistence.findByPrimaryKey(
                                    group.getOrganizationId());

                    if (!UserGroupRolePermissionUtil.contains(
                            permissionChecker, group, role) ||
                            OrganizationMembershipPolicyUtil.isRoleProtected(
                                    getPermissionChecker(), userId,
                                    organization.getOrganizationId(),
                                    role.getRoleId()) ||
                            OrganizationMembershipPolicyUtil.isRoleRequired(
                                    userId, organization.getOrganizationId(),
                                    role.getRoleId())) {

                        userGroupRoles.add(oldUserGroupRole);
                    }
                }
                else if (role.getType() == RoleConstants.TYPE_SITE) {
                    if (!userGroupRoles.contains(oldUserGroupRole) &&
                            (!UserGroupRolePermissionUtil.contains(
                                    permissionChecker, group, role) ||
                                    SiteMembershipPolicyUtil.isRoleProtected(
                                            getPermissionChecker(), userId, group.getGroupId(),
                                            role.getRoleId()) ||
                                    SiteMembershipPolicyUtil.isRoleRequired(
                                            userId, group.getGroupId(), role.getRoleId()))) {

                        userGroupRoles.add(oldUserGroupRole);
                    }
                }
            }
        }

        // Check that the administrator has the permission to add a new user
        // group role and that the user group role membership is allowed

        for (UserGroupRole userGroupRole : userGroupRoles) {
            if ((oldUserGroupRoles == null) ||
                    !oldUserGroupRoles.contains(userGroupRole)) {

                UserGroupRolePermissionUtil.check(
                        permissionChecker, userGroupRole.getGroupId(),
                        userGroupRole.getRoleId());
            }
        }

        return userGroupRoles;
    }
}
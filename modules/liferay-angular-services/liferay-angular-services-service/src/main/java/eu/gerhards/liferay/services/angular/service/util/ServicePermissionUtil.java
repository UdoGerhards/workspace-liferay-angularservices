package eu.gerhards.liferay.services.angular.service.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.membershippolicy.OrganizationMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.RoleMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.SiteMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.UserGroupMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.RolePermissionUtil;
import com.liferay.portal.kernel.service.permission.UserGroupPermissionUtil;

import java.util.Iterator;
import java.util.List;

/**
 * Created by udogerhards on 06.01.17.
 */
public class ServicePermissionUtil {

    public static Log _log = LogFactoryUtil.getLog(ServicePermissionUtil.class);

    public static void checkAllPersonalPermissions(User user, String action, long companyId, PermissionChecker permissionChecker, String model) throws PrincipalException, PortalException {

        boolean allowed = false;

        if (!PortalPermissionUtil.contains(permissionChecker, action) && (
                !permissionChecker.isOmniadmin()
                        || !permissionChecker.isCompanyAdmin(companyId))) {

            // Normal users are limited to their own company
            if (user.getCompanyId() != companyId) {
                throw new PrincipalException.MustBeEnabled(companyId, model);
            }

            // User personal permissions
            // allowed = UserPermissionUtil.contains(permissionChecker, user.getUserId(), action);

            allowed = permissionChecker.hasPermission(user.getGroupId(), model, user.getUserId(), action);

            // Assigned roles to user with according permissions
            // role => user
            if (!allowed) {
                List<Role> userRoles = user.getRoles();

                // related roles
                List<Role> relatedRoles = RoleLocalServiceUtil.getUserRelatedRoles(user.getUserId(), user.getGroupIds());
                if (relatedRoles != null && !relatedRoles.isEmpty()) {
                    userRoles.addAll(relatedRoles);
                }

                // User group Roles
                List<UserGroupRole> userGroupRoles = UserGroupRoleLocalServiceUtil.getUserGroupRoles(user.getUserId());
                if (userGroupRoles != null && !userGroupRoles.isEmpty()) {
                    for(UserGroupRole userGroupRole:userGroupRoles) {
                        userRoles.add(userGroupRole.getRole());
                    }
                }

                Iterator<Role> roleIterator = userRoles.iterator();
                while (!allowed && roleIterator.hasNext()) {
                    Role userRole = roleIterator.next();
                    _log.debug("Checking role: "+userRole.toString());
                    allowed = RolePermissionUtil.contains(permissionChecker, userRole.getRoleId(), action);
                }
            }

            // Assigned user groups and according roles with permissions
            // role => group => user
            if (!allowed) {
                long[] creatorUserGroupIds = user.getUserGroupIds();
                int index = 0;
                _log.debug("Checking user groups: "+user.getUserGroups());

                while (!allowed && index < creatorUserGroupIds.length) {
                    _log.debug(creatorUserGroupIds[index]);
                    List<Role> userGroupRoles = RoleLocalServiceUtil.getUserGroupGroupRoles(user.getUserId(), creatorUserGroupIds[index++]);
                    Iterator<Role> userGroupRoleIterator = userGroupRoles.iterator();
                    while (!allowed && userGroupRoleIterator.hasNext()) {
                        Role role = userGroupRoleIterator.next();
                        _log.debug(role);
                        allowed = UserGroupPermissionUtil.contains(permissionChecker, role.getRoleId(), action);
                    }

                }
            }

            if (!allowed) {
                throw new PrincipalException.MustHavePermission(
                        permissionChecker, model, 0, action);
            }

        }
    }

    public static void checkMembership(
            long[] userIds, long[] groupIds, long[] organizationIds,
            long[] roleIds, long[] userGroupIds)
            throws PortalException {

        if (groupIds != null) {
            SiteMembershipPolicyUtil.checkMembership(userIds, groupIds, null);
        }

        if (organizationIds != null) {
            OrganizationMembershipPolicyUtil.checkMembership(
                    userIds, organizationIds, null);
        }

        if (roleIds != null) {
            RoleMembershipPolicyUtil.checkRoles(userIds, roleIds, null);
        }

        if (userGroupIds != null) {
            UserGroupMembershipPolicyUtil.checkMembership(
                    userIds, userGroupIds, null);
        }
    }
}

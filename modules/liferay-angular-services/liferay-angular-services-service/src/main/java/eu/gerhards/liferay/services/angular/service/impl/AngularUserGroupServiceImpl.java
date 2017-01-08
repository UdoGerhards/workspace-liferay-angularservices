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
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.membershippolicy.UserGroupMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.TeamLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.TeamPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserGroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularUserGroupServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the User group remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularUserGroupService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularUserGroupServiceUtil
 */
@ProviderType
public class AngularUserGroupServiceImpl extends AngularUserGroupServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularUserGroupServiceUtil} to access the User group remote service.
	 */

    public static final Log _log = LogFactoryUtil.getLog(AngularTeamServiceImpl.class);

    @Override
    public com.liferay.portal.kernel.model.UserGroup getUserGroup(long userGroupId) throws PortalException {

        _log.info("Getting user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        this.checkPersonalPermission(AngularActionKeys.LIST_USER_USER_GROUPS);

        this.hasResourcePermission(userGroupId, ActionKeys.VIEW);

        _log.debug("    ... processing ... ");

        return UserGroupLocalServiceUtil.getUserGroup(userGroupId);
    }

    @Override
    public java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroups(long[] userGroupIds) throws PortalException {

        _log.info("Getting user groups for ids: "+userGroupIds);

        _log.debug("    ... security check ... ");

        this.checkPersonalPermission(AngularActionKeys.LIST_USER_USER_GROUPS);

        List<com.liferay.portal.kernel.model.UserGroup> userGroups = new ArrayList<com.liferay.portal.kernel.model.UserGroup>();
        if (userGroupIds != null) {
            for (long userGroupId:userGroupIds) {
                this.hasResourcePermission(userGroupId, ActionKeys.VIEW);
            }

            _log.debug("    ... processing ... ");

            userGroups = UserGroupLocalServiceUtil.getUserGroups(userGroupIds);
        }

        return userGroups;
    }

    @Override
    public List<User> getUserGroupUsers(long userGroupId) throws PortalException {

        _log.info("Getting user for user group with id "+userGroupId);

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_USER_USER_GROUPS);

        this.checkPersonalPermission(AngularActionKeys.LIST_USERS);

        this.hasResourcePermission(userGroupId, ActionKeys.VIEW);

        _log.debug("    ... processing ... ");

        java.util.List<com.liferay.portal.kernel.model.User> users = UserLocalServiceUtil.getUserGroupUsers(userGroupId);

        return users;
    }

    @Override
    public java.util.List<com.liferay.portal.kernel.model.UserGroup> getTeamUserGroups(long teamId) throws PortalException {

        _log.info("Getting user groups for team with id "+teamId);

        _log.debug("    ... security check ... ");

        this.checkPersonalPermission(AngularActionKeys.LIST_TEAMS);

        this.checkPersonalPermission(AngularActionKeys.LIST_USER_USER_GROUPS);

        _log.debug("    ... processing ... ");

        return UserGroupLocalServiceUtil.getTeamUserGroups(teamId);
    }

    @Override
    public com.liferay.portal.kernel.model.UserGroup createUserGroup(long userId, long companyId, String name, String description) throws PortalException {

        _log.info("Creating new user group ...");

        _log.debug("    ... security check ... ");

        this.crossCompanyCheck(companyId);

        this.checkPersonalPermission(ActionKeys.ADD_USER_GROUP);

        return UserGroupLocalServiceUtil.addUserGroup(userId, companyId, name, description, new ServiceContext());
    }

    @Override
    public com.liferay.portal.kernel.model.UserGroup updateUserGroup(long companyId, long userGroupId, String name, String description) throws PortalException {

        _log.info("Updating user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        this.crossCompanyCheck(companyId);

        this.checkPersonalPermission(AngularActionKeys.UPDATE_USER_GROUP);

        this.hasResourcePermission(userGroupId, ActionKeys.UPDATE);

        return UserGroupLocalServiceUtil.updateUserGroup(companyId, userGroupId, name, description, new ServiceContext());
    }

    @Override
    public void deleteUserGroup(long userGroupId) throws PortalException {

        _log.info("Deleting user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        this.checkPersonalPermission(AngularActionKeys.DELETE_USER_GROUP);

        com.liferay.portal.kernel.model.UserGroup  userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);

        this.crossCompanyCheck(userGroup.getCompanyId());

        this.hasResourcePermission(userGroupId, ActionKeys.DELETE);

        _log.debug("    ... processing ... ");

        UserGroupLocalServiceUtil.deleteUserGroup(userGroupId);

    }

    @Override
    public void deleteUserGroups(long[] userGroupIds) throws PortalException {

        _log.info("Deleting user groups "+userGroupIds);

        _log.debug("    ... security check ... ");

        this.checkPersonalPermission(AngularActionKeys.DELETE_USER_GROUP);

        List<com.liferay.portal.kernel.model.UserGroup> userGroups = UserGroupLocalServiceUtil.getUserGroups(userGroupIds);
        for (com.liferay.portal.kernel.model.UserGroup userGroup:userGroups) {
            this.crossCompanyCheck(userGroup.getCompanyId());
            this.hasResourcePermission(userGroup.getUserGroupId(), ActionKeys.DELETE);
        }

        _log.debug("    ... processing ... ");

        for (com.liferay.portal.kernel.model.UserGroup userGroup:userGroups) {
            UserGroupLocalServiceUtil.deleteUserGroup(userGroup);
        }
    }

    @Override
    public void assignTeamUserGroup(long teamId, long userGroupId) throws PortalException {

        _log.info("Assigning team with id "+teamId+" to user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        // Personal rights
        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_GROUP_TO_TEAM, AngularActionKeys.UPDATE_TEAM });

        com.liferay.portal.kernel.model.Team team = TeamLocalServiceUtil.getTeam(teamId);
        this.crossCompanyCheck(team.getCompanyId());

        TeamPermissionUtil.check(getPermissionChecker(), teamId, ActionKeys.UPDATE);

        com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
        this.crossCompanyCheck(userGroup.getCompanyId());

        this.hasResourcePermission(userGroupId, ActionKeys.ASSIGN_MEMBERS);

        _log.debug("    ... processing ... ");

        UserGroupLocalServiceUtil.addTeamUserGroup(teamId, userGroupId);
    }

    @Override
    public void assignTeamUserGroups(long teamId, long[] userGroupIds) throws PortalException {

        _log.info("Assigning team with id "+teamId+" to multiple teams "+userGroupIds);

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_GROUP_TO_TEAM, AngularActionKeys.UPDATE_TEAM });

        com.liferay.portal.kernel.model.Team team = TeamLocalServiceUtil.getTeam(teamId);
        this.crossCompanyCheck(team.getCompanyId());
        TeamPermissionUtil.check(getPermissionChecker(), teamId, ActionKeys.ASSIGN_MEMBERS);

        if (userGroupIds != null) {
            for(long userGroupId:userGroupIds) {

                // Cross company checks
                com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
                this.crossCompanyCheck(userGroup.getCompanyId());

                // Resource checks
                this.hasResourcePermission(userGroupId, ActionKeys.ASSIGN_MEMBERS);
            }

            _log.debug("    ... processing ... ");

            UserGroupLocalServiceUtil.addTeamUserGroups(teamId, userGroupIds);
        }

    }

    @Override
    public void removeTeamUserGroup(long teamId, long userGroupId) throws PortalException {

        _log.info("Removing team with id "+teamId+" from user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        // Personal rights
        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_GROUP_TO_TEAM, AngularActionKeys.UPDATE_TEAM });

        com.liferay.portal.kernel.model.Team team = TeamLocalServiceUtil.getTeam(teamId);
        this.crossCompanyCheck(team.getCompanyId());

        TeamPermissionUtil.check(getPermissionChecker(), teamId, AngularActionKeys.REMOVE_MEMBERS);

        com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
        this.crossCompanyCheck(userGroup.getCompanyId());

        this.hasResourcePermission(userGroupId, AngularActionKeys.REMOVE_MEMBERS);

        _log.debug("    ... processing ... ");

        UserGroupLocalServiceUtil.deleteTeamUserGroup(teamId, userGroupId);

    }

    @Override
    public void removeTeamUserGroups(long teamId, long[] userGroupIds) throws PortalException {

        _log.info("Removing team with id "+teamId+" from multiple teams "+userGroupIds);

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_GROUP_TO_TEAM, AngularActionKeys.UPDATE_TEAM });

        com.liferay.portal.kernel.model.Team team = TeamLocalServiceUtil.getTeam(teamId);
        this.crossCompanyCheck(team.getCompanyId());
        TeamPermissionUtil.check(getPermissionChecker(), teamId, AngularActionKeys.REMOVE_MEMBERS);

        if (userGroupIds != null) {
            for(long userGroupId:userGroupIds) {

                // Cross company checks
                com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
                this.crossCompanyCheck(userGroup.getCompanyId());

                // Resource checks
                this.hasResourcePermission(userGroupId, AngularActionKeys.REMOVE_MEMBERS);
            }

            _log.debug("    ... processing ... ");

            UserGroupLocalServiceUtil.deleteTeamUserGroups(teamId, userGroupIds);
        }

    }

    @Override
    public void assignUserUserGroup(long userId, long userGroupId) throws PortalException {

        _log.info("Assigning user with id "+userId+" to user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        // Personal rights
        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_TO_USER_GROUP, AngularActionKeys.UPDATE_USER });

        com.liferay.portal.kernel.model.User user = UserLocalServiceUtil.getUser(userId);
        this.crossCompanyCheck(user.getCompanyId());

        com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
        this.crossCompanyCheck(userGroup.getCompanyId());

        this.hasResourcePermission(userGroupId, ActionKeys.ASSIGN_MEMBERS);

        _log.debug("    ... processing ... ");

        UserGroupLocalServiceUtil.addUserUserGroup(userId, userGroupId);

    }

    @Override
    public void assignUserUserGroups(long userId, long[] userGroupIds) throws PortalException {

        _log.info("Assigning user with id "+userId+" to multiple teams "+userGroupIds);

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_TO_USER_GROUP, AngularActionKeys.UPDATE_USER });

        com.liferay.portal.kernel.model.User user = UserLocalServiceUtil.getUser(userId);
        this.crossCompanyCheck(user.getCompanyId());

        if (userGroupIds != null) {
            for(long userGroupId:userGroupIds) {

                // Cross company checks
                com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
                this.crossCompanyCheck(userGroup.getCompanyId());

                // Resource checks
                this.hasResourcePermission(userGroupId, ActionKeys.ASSIGN_MEMBERS);
            }

            _log.debug("    ... processing ... ");

            UserGroupLocalServiceUtil.addUserUserGroups(userId, userGroupIds);
        }

    }

    @Override
    public void removeUserUserGroup(long userId, long userGroupId) throws PortalException {

        _log.info("Removing team with id "+userId+" from user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        // Personal rights
        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_TO_USER_GROUP, AngularActionKeys.UPDATE_USER });

        com.liferay.portal.kernel.model.User user = UserLocalServiceUtil.getUser(userId);
        this.crossCompanyCheck(user.getCompanyId());

        com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
        this.crossCompanyCheck(userGroup.getCompanyId());

        this.hasResourcePermission(userGroupId, AngularActionKeys.REMOVE_MEMBERS);

        _log.debug("    ... processing ... ");

        UserGroupLocalServiceUtil.deleteUserUserGroup(userId, userGroupId);

    }

    @Override
    public void removeUserUserGroups(long userId, long[] userGroupIds) throws PortalException {

        _log.info("Removing team with id "+userId+" from multiple teams "+userGroupIds);

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.UPDATE_USER_GROUP, AngularActionKeys.ASSIGN_USER_TO_USER_GROUP, AngularActionKeys.UPDATE_USER });

        com.liferay.portal.kernel.model.User user = UserLocalServiceUtil.getUser(userId);
        this.crossCompanyCheck(user.getCompanyId());

        if (userGroupIds != null) {
            for(long userGroupId:userGroupIds) {

                // Cross company checks
                com.liferay.portal.kernel.model.UserGroup userGroup = UserGroupLocalServiceUtil.getUserGroup(userGroupId);
                this.crossCompanyCheck(userGroup.getCompanyId());

                // Resource checks
                this.hasResourcePermission(userGroupId, AngularActionKeys.REMOVE_MEMBERS);
            }

            _log.debug("    ... processing ... ");

            UserGroupLocalServiceUtil.deleteUserUserGroups(userId, userGroupIds);
        }

    }

    @Override
    public boolean isUserGroupMemberOfTeam(long teamId, long userGroupId) throws PortalException {

        _log.info("Checking if team with id "+teamId+" has user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[] {AngularActionKeys.LIST_TEAMS, AngularActionKeys.LIST_USER_USER_GROUPS});

        TeamPermissionUtil.check(getPermissionChecker(), teamId, ActionKeys.VIEW);

        this.hasResourcePermission(userGroupId, ActionKeys.VIEW);

        _log.debug("    ... processing ... ");

        return UserGroupLocalServiceUtil.hasTeamUserGroup(teamId, userGroupId);
    }

    @Override
    public boolean hasTeamUserGroups(long teamId) throws PortalException {

        _log.info("Checking if team "+teamId+" has user groups");

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.LIST_TEAMS, AngularActionKeys.LIST_USER_USER_GROUPS});

        TeamPermissionUtil.check(getPermissionChecker(), teamId, ActionKeys.VIEW);

        _log.debug("    ... processing ... ");

        return UserGroupLocalServiceUtil.hasTeamUserGroups(teamId);
    }

    @Override
    public boolean isUserMemberOfUserGroup(long userId, long userGroupId) throws PortalException {

        _log.info("Checking if team with id "+userId+" has user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.LIST_USERS, AngularActionKeys.LIST_USER_USER_GROUPS});

        UserPermissionUtil.check(getPermissionChecker(), userId, ActionKeys.VIEW);

        this.hasResourcePermission(userGroupId, ActionKeys.VIEW);

        _log.debug("    ... processing ... ");

        return UserGroupLocalServiceUtil.hasUserUserGroup(userId, userGroupId);
    }

    @Override
    public boolean hasUserUserGroups(long userId) throws PortalException {

        _log.info("Checking if team "+userId+" has user groups");

        _log.debug("    ... security check ... ");

        this.checkMultiplePersonalPermission(new String[]{AngularActionKeys.LIST_USERS, AngularActionKeys.LIST_USER_USER_GROUPS});

        TeamPermissionUtil.check(getPermissionChecker(), userId, ActionKeys.VIEW);

        _log.debug("    ... processing ... ");

        return UserGroupLocalServiceUtil.hasUserUserGroups(userId);
    }

    @Override
    public List<UserGroup> getUserGroupsInCompany(long companyId) {
        List<UserGroup> userGroupsPerCompany = UserGroupLocalServiceUtil.getUserGroups(companyId);
        return userGroupsPerCompany;
    }

    @Override
    public boolean hasPermission(long userGroupId, String actionId) throws PortalException {

        _log.info("Checking permission for user group with id "+userGroupId);

        _log.debug("    ... security check ... ");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.CHECK_PERMISSIONS);

        this.checkPersonalPermission(AngularActionKeys.LIST_USER_USER_GROUPS);

        this.hasResourcePermission(userGroupId, ActionKeys.VIEW);

        _log.debug("    ... processing ...");

        try {
            this.hasResourcePermission(userGroupId, actionId);
            return true;
        } catch(PortalException pe) {
            return false;
        }
    }

    public long[] checkUserGroupIds(long userId, long[] userGroupIds)
            throws PortalException {

        long[] oldUserGroupIds = null;

        PermissionChecker permissionChecker = getPermissionChecker();

        if (userId != CompanyConstants.SYSTEM) {

            // Add back any user groups that the administrator does not have the
            // rights to remove or that have a mandatory membership

            List<UserGroup> oldUserGroups =
                    userGroupLocalService.getUserUserGroups(userId);

            oldUserGroupIds = new long[oldUserGroups.size()];

            for (int i = 0; i < oldUserGroups.size(); i++) {
                UserGroup userGroup = oldUserGroups.get(i);

                if (!ArrayUtil.contains(
                        userGroupIds, userGroup.getUserGroupId()) &&
                        (!UserGroupPermissionUtil.contains(
                                permissionChecker, userGroup.getUserGroupId(),
                                ActionKeys.ASSIGN_MEMBERS) ||
                                UserGroupMembershipPolicyUtil.isMembershipRequired(
                                        userId, userGroup.getUserGroupId()))) {

                    userGroupIds = ArrayUtil.append(
                            userGroupIds, userGroup.getUserGroupId());
                }

                oldUserGroupIds[i] = userGroup.getUserGroupId();
            }
        }

        // Check that the administrator has the permission to add a new user
        // group and that the user group membership is allowed

        for (long userGroupId : userGroupIds) {
            if ((oldUserGroupIds == null) ||
                    !ArrayUtil.contains(oldUserGroupIds, userGroupId)) {

                UserGroupPermissionUtil.check(
                        permissionChecker, userGroupId, ActionKeys.ASSIGN_MEMBERS);
            }
        }

        return userGroupIds;
    }

    protected void crossCompanyCheck(long targetCompany) throws PortalException {

        long userCompanyId = this.getGuestOrUser().getCompanyId();

        PermissionChecker permissionChecker = getPermissionChecker();

        if (permissionChecker.isSignedIn()) {

            if (userCompanyId != targetCompany && (!permissionChecker.isOmniadmin() || !permissionChecker.isCompanyAdmin(targetCompany))) {
                throw new PrincipalException.MustBeOmniadmin(this.getGuestOrUserId());
            }

        } else {

            throw new PrincipalException.MustBeAuthenticated(this.getGuestOrUserId());
        }
    }

    protected void checkMultiplePersonalPermission(String[] actionIds) throws PortalException{
        _log.debug("    ... checking multiple rights ... ");

        for (String actionId:actionIds) {
            this.checkPersonalPermission(actionId);
        }
    }

    protected void checkPersonalPermission(String actionId) throws PortalException {

        _log.debug("    ... "+actionId+" right on user ... ");

        User user = this.getGuestOrUser();

        PermissionChecker permissionChecker = getPermissionChecker();

        if (!permissionChecker.isOmniadmin() && permissionChecker.isSignedIn()) {

            PortalPermissionUtil.check(getPermissionChecker(), actionId);

        } else if (!permissionChecker.isSignedIn()) {

            throw new PrincipalException.MustBeAuthenticated(this.getGuestOrUserId());

        }

    }

    protected void hasResourcePermission(long userGroupId, String actionId) throws PortalException {

        _log.debug("    ... "+actionId+" right on resource team "+userGroupId);

        PermissionChecker permissionChecker = getPermissionChecker();

        if (!permissionChecker.isOmniadmin() && permissionChecker.isSignedIn()) {

            UserGroupPermissionUtil.check(getPermissionChecker(), userGroupId, actionId);

        } else if (!permissionChecker.isSignedIn()) {

            throw new PrincipalException.MustBeAuthenticated(this.getGuestOrUserId());

        }
    }
}
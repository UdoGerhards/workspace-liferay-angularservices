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
import com.liferay.portal.kernel.model.Team;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.TeamLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.*;
import eu.gerhards.liferay.services.angular.service.base.AngularTeamServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the Team remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularTeamService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularTeamServiceUtil
 */
@ProviderType
public class AngularTeamServiceImpl extends AngularTeamServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularTeamServiceUtil} to access the Team remote service.
	 */

    public static final Log _log = LogFactoryUtil.getLog(AngularTeamServiceImpl.class);

    @Override
    public com.liferay.portal.kernel.model.Team getTeam(long teamId) throws PortalException {

        _log.info("Getting user team with team id: "+String.valueOf(teamId));

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_TEAMS);

        this.hasResourcePermission(teamId, ActionKeys.VIEW);

        _log.debug("    ... getting information ... ");

        com.liferay.portal.kernel.model.Team team = TeamLocalServiceUtil.getTeam(teamId);

        _log.debug("    ... returning team => "+team);

        return team;
    }

    @Override
    public java.util.List<com.liferay.portal.kernel.model.Team> getTeamsForUserGroup(long userGroupId) throws PortalException {

        _log.info("Getting user group teams for user group "+String.valueOf(userGroupId));

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_TEAMS);

        // Check if user has the right to view the group
        UserGroupPermissionUtil.check(getPermissionChecker(), userGroupId, ActionKeys.VIEW);

        java.util.List<com.liferay.portal.kernel.model.Team> teams = TeamLocalServiceUtil.getUserGroupTeams(userGroupId);

        if (teams != null) {
            for (com.liferay.portal.kernel.model.Team team:teams) {

                // All teams have also the right to be shown?
                this.hasResourcePermission(team.getTeamId(), ActionKeys.VIEW);
            }
        }

        _log.debug("    ... returning team list => "+teams);

        return teams;
    }

    @Override
    public java.util.List<com.liferay.portal.kernel.model.Team> getUserTeams(long userId) throws PortalException {

        _log.info("Getting teams for user "+userId);

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_TEAMS);

        UserPermissionUtil.check(getPermissionChecker(), userId, ActionKeys.VIEW);

        com.liferay.portal.kernel.model.User user = UserLocalServiceUtil.getUser(userId);

        long[] teamIds = user.getTeamIds();
        java.util.List<com.liferay.portal.kernel.model.Team> teams = new ArrayList<com.liferay.portal.kernel.model.Team>();

        if (teamIds != null && teamIds.length > 0) {
            for (long teamId:teamIds) {

                // Can all teams be shown?
                this.hasResourcePermission(teamId, ActionKeys.VIEW);
            }

            teams = TeamLocalServiceUtil.getUserTeams(userId);
        }

        _log.debug("    ... returning team list => "+teams);

        return teams;
    }

    @Override
    public Team createTeam(long userId, long groupId, String name, String description) throws PortalException {

        _log.info("Creating team ... ");

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.ADD_TEAM);

        _log.debug("    ... processing ...");

        com.liferay.portal.kernel.model.Team team = TeamLocalServiceUtil.addTeam(userId, groupId, name, description, new ServiceContext());

        _log.debug("    returning team => "+team);

        return team;
    }

    @Override
    public void assignUserToTeam(long userId, long teamId) throws PortalException {

        _log.info("Assigning user to team ...");

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.ASSIGN_USER_TO_TEAM);

        TeamPermissionUtil.check(getPermissionChecker(), teamId, ActionKeys.ASSIGN_MEMBERS);

        _log.debug("    ... processing ...");

        TeamLocalServiceUtil.addUserTeam(userId, teamId);
    }

    @Override
    public void assignUserToTeams(long userId, List<com.liferay.portal.kernel.model.Team> teams) throws PortalException {

        _log.info("Assigning user to teams ... ");

        if (teams != null) {
            for(com.liferay.portal.kernel.model.Team team:teams) {
                this.assignUserToTeam(userId, team.getTeamId());
            }
        }

    }

    @Override
    public void assignUserToTeams(long userId, long[] teamIds) throws PortalException {

        _log.info("Assigning user with id "+userId+" to teams ... ");

        if (teamIds != null) {
            for(long teamId:teamIds) {
                this.assignUserToTeam(userId, teamId);
            }
        }

    }

    @Override
    public void assignUserGroupTeam(long userGroupId, long teamId) throws PortalException {

        _log.info("Assigning user group with id "+userGroupId+" to team with id "+teamId);

        this.checkPersonalPermission(AngularActionKeys.ASSIGN_USER_TO_TEAM);

        GroupPermissionUtil.check(getPermissionChecker(), teamId, ActionKeys.ASSIGN_MEMBERS);

        _log.debug("    ... processing ...");

        TeamLocalServiceUtil.addUserGroupTeam(userGroupId, teamId);

    }

    @Override
    public void assignUserGroupTeams(long userGroupId, List<com.liferay.portal.kernel.model.Team> teams) throws PortalException {

        _log.info("Assigning user group with id "+userGroupId+" to teams");

        if (teams != null) {
            for (com.liferay.portal.kernel.model.Team team:teams) {
                this.assignUserGroupTeam(userGroupId, team.getTeamId());
            }
        }

    }

    @Override
    public void assignUserGroupTeams(long userGroupId, long[] teamIds) throws PortalException {

        _log.info("Assigning user group with id "+userGroupId+" to teams");

        if (teamIds != null) {
            for (long teamId:teamIds) {
                this.assignUserGroupTeam(userGroupId, teamId);
            }
        }
    }

    @Override
    public com.liferay.portal.kernel.model.Team deleteTeam(long teamId) throws PortalException {

        _log.info("Deleting team with id "+teamId);

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.DELETE_TEAM);

        this.hasResourcePermission(teamId, ActionKeys.DELETE);

        _log.debug("    ... processing ...");

        return TeamLocalServiceUtil.deleteTeam(teamId);

    }

    @Override
    public void deleteUserTeam(long userId, long teamId) throws PortalException {

        _log.info("Removing user with id "+userId+" from team with id "+teamId);

        _log.debug("    ... security check ...");

        this.checkPersonalPermission(AngularActionKeys.ASSIGN_USER_TO_TEAM);

        this.hasResourcePermission(teamId, ActionKeys.ASSIGN_MEMBERS);

        _log.debug("    ... processing ...");

        TeamLocalServiceUtil.deleteUserTeam(userId, teamId);

    }

    @Override
    public void deleteUserGroupTeams(long userGroupId, long[] teamIds) throws PortalException {
        _log.info("Removing user group with id "+userGroupId+" from teams");

        _log.debug("    ... security check ... ");

        this.checkPersonalPermission(AngularActionKeys.ASSIGN_USER_GROUP_TO_TEAM);

        if (teamIds != null) {
            for (long teamId:teamIds) {
                this.hasResourcePermission(teamId, ActionKeys.ASSIGN_MEMBERS);
            }

            _log.debug("    ... processing ...");

            TeamLocalServiceUtil.deleteUserGroupTeams(userGroupId, teamIds);
        }
    }

    @Override
    public boolean hasUserGroupTeam(long userGroupId, long teamId) throws PortalException {
        _log.info("Checking if user group with id "+userGroupId+" is part of team with id "+teamId);

        _log.debug("    ... service context ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_USERS);

        GroupPermissionUtil.check(getPermissionChecker(), userGroupId, ActionKeys.VIEW);

        this.hasResourcePermission(teamId, ActionKeys.VIEW);

        _log.debug("    ... processing ...");

        return TeamLocalServiceUtil.hasUserGroupTeam(userGroupId, teamId);
    }

    @Override
    public boolean hasUserGroupTeams(long userGroupId) throws PortalException {

        _log.info("Checking if user group with id "+userGroupId+" is part of several teams");

        _log.debug("    ... service context ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_USER_USER_GROUPS);

        GroupPermissionUtil.check(getPermissionChecker(), userGroupId, ActionKeys.VIEW);

        _log.debug("    ... processing ...");

        return TeamLocalServiceUtil.hasUserGroupTeams(userGroupId);
    }

    @Override
    public boolean hasUserTeam(long userId, long teamId) throws PortalException {

        _log.info("Checking if user with id "+userId+" is part of team with id "+teamId);

        _log.debug("    ... service context ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_USERS);

        UserPermissionUtil.check(getPermissionChecker(), userId, ActionKeys.VIEW);

        this.hasResourcePermission(teamId, ActionKeys.VIEW);

        _log.debug("    ... processing ...");

        return TeamLocalServiceUtil.hasUserTeam(userId, teamId);
    }

    @Override
    public boolean hasUserTeams(long userId) throws PortalException {

        _log.info("Checking if user group with id "+userId+" is part of several teams");

        _log.debug("    ... service context ...");

        this.checkPersonalPermission(AngularActionKeys.LIST_USERS);

        UserPermissionUtil.check(getPermissionChecker(), userId, ActionKeys.VIEW);

        _log.debug("    ... processing ...");

        return TeamLocalServiceUtil.hasUserTeams(userId);
    }

    @Override
    public boolean hasPermission(long teamId, String actionId) throws PortalException {

        _log.info("Checking permission '"+actionId+"' on team with id "+teamId);

        _log.debug("    ... security check ... ");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.CHECK_PERMISSIONS);

        this.checkPersonalPermission(AngularActionKeys.LIST_TEAMS);

        this.hasResourcePermission(teamId, ActionKeys.VIEW);

        _log.debug("    ... processing ...");

        try {
            this.hasResourcePermission(teamId, actionId);
            return true;
        } catch(PortalException pe) {
            return false;
        }
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

    protected void hasResourcePermission(long teamId, String actionId) throws PortalException {

        _log.debug("    ... "+actionId+" right on resource team "+teamId);

        PermissionChecker permissionChecker = getPermissionChecker();

        if (!permissionChecker.isOmniadmin() && permissionChecker.isSignedIn()) {

            TeamPermissionUtil.check(getPermissionChecker(), teamId, actionId);

        } else if (!permissionChecker.isSignedIn()) {

            throw new PrincipalException.MustBeAuthenticated(this.getGuestOrUserId());

        }
    }
}
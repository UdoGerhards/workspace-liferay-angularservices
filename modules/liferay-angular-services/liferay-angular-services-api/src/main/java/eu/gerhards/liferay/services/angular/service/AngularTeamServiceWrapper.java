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

package eu.gerhards.liferay.services.angular.service;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Team;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.List;

/**
 * Provides a wrapper for {@link AngularTeamService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamService
 * @generated
 */
@ProviderType
public class AngularTeamServiceWrapper implements AngularTeamService,
	ServiceWrapper<AngularTeamService> {
	public AngularTeamServiceWrapper(AngularTeamService angularTeamService) {
		_angularTeamService = angularTeamService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularTeamService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularTeamService getWrappedService() {
		return _angularTeamService;
	}

	@Override
	public void setWrappedService(AngularTeamService angularTeamService) {
		_angularTeamService = angularTeamService;
	}

	@Override
	public Team getTeam(long teamId) throws PortalException {
		return _angularTeamService.getTeam(teamId);
	}

	@Override
	public List<Team> getTeamsForUserGroup(long groupId) throws PortalException {
		return _angularTeamService.getTeamsForUserGroup(groupId);
	}

	@Override
	public List<Team> getUserTeams(long userId) throws PortalException {
		return _angularTeamService.getUserTeams(userId);
	}

	@Override
	public Team createTeam(long userId, long groupId, String name, String description) throws PortalException {
		return _angularTeamService.createTeam(userId, groupId, name, description);
	}

	@Override
	public void assignUserToTeam(long userId, long teamId) throws PortalException {
		_angularTeamService.assignUserToTeam(userId, teamId);
	}

	@Override
	public void assignUserToTeams(long userId, List<Team> teams) throws PortalException {
		_angularTeamService.assignUserToTeams(userId, teams);
	}

	@Override
	public void assignUserToTeams(long userId, long[] teamIds) throws PortalException {
		_angularTeamService.assignUserToTeams(userId, teamIds);
	}

	@Override
	public void assignUserGroupTeam(long userGroupId, long teamId) throws PortalException {
		_angularTeamService.assignUserGroupTeam(userGroupId, teamId);
	}

	@Override
	public void assignUserGroupTeams(long userGroupId, List<Team> teams) throws PortalException {
		_angularTeamService.assignUserToTeams(userGroupId, teams);
	}

	@Override
	public void assignUserGroupTeams(long userGroupId, long[] teamIds) throws PortalException {
		_angularTeamService.assignUserGroupTeams(userGroupId, teamIds);
	}

	@Override
	public Team deleteTeam(long teamId) throws PortalException {
		return _angularTeamService.deleteTeam(teamId);
	}

	@Override
	public void deleteUserTeam(long userId, long teamId) throws PortalException {
		_angularTeamService.deleteUserTeam(userId, teamId);
	}

	@Override
	public void deleteUserGroupTeams(long userGroupId, long[] teamIds) throws PortalException {
		_angularTeamService.deleteUserGroupTeams(userGroupId, teamIds);
	}

	@Override
	public boolean hasUserGroupTeam(long userGroupId, long teamId) throws PortalException {
		return _angularTeamService.hasUserGroupTeam(userGroupId, teamId);
	}

	@Override
	public boolean hasUserGroupTeams(long userGroupId) throws PortalException {
		return _angularTeamService.hasUserGroupTeams(userGroupId);
	}

	@Override
	public boolean hasUserTeam(long userId, long teamId) throws PortalException {
		return _angularTeamService.hasUserTeam(userId, teamId);
	}

	@Override
	public boolean hasUserTeams(long userId) throws PortalException {
		return _angularTeamService.hasUserTeams(userId);
	}

	@Override
	public boolean hasPermission(long teamId, String actionId) throws PortalException {
		return _angularTeamService.hasPermission(teamId, actionId);
	}

	private AngularTeamService _angularTeamService;
}
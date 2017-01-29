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
import com.liferay.portal.kernel.service.ServiceWrapper;

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

	@Override
	public boolean hasPermission(long teamId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.hasPermission(teamId, actionId);
	}

	@Override
	public boolean hasUserGroupTeam(long userGroupId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.hasUserGroupTeam(userGroupId, teamId);
	}

	@Override
	public boolean hasUserGroupTeams(long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.hasUserGroupTeams(userGroupId);
	}

	@Override
	public boolean hasUserTeam(long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.hasUserTeam(userId, teamId);
	}

	@Override
	public boolean hasUserTeams(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.hasUserTeams(userId);
	}

	@Override
	public com.liferay.portal.kernel.model.Team createTeam(long userId,
		long groupId, java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.createTeam(userId, groupId, name, description);
	}

	@Override
	public com.liferay.portal.kernel.model.Team deleteTeam(long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.deleteTeam(teamId);
	}

	@Override
	public com.liferay.portal.kernel.model.Team getTeam(long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.getTeam(teamId);
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
	public java.util.List<com.liferay.portal.kernel.model.Team> getTeamsForUserGroup(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.getTeamsForUserGroup(userGroupId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Team> getUserTeams(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularTeamService.getUserTeams(userId);
	}

	@Override
	public void assignUserGroupTeam(long userGroupId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.assignUserGroupTeam(userGroupId, teamId);
	}

	@Override
	public void assignUserGroupTeams(long userGroupId,
		java.util.List<com.liferay.portal.kernel.model.Team> teams)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.assignUserGroupTeams(userGroupId, teams);
	}

	@Override
	public void assignUserGroupTeams(long userGroupId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.assignUserGroupTeams(userGroupId, teamIds);
	}

	@Override
	public void assignUserToTeam(long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.assignUserToTeam(userId, teamId);
	}

	@Override
	public void assignUserToTeams(long userId,
		java.util.List<com.liferay.portal.kernel.model.Team> teams)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.assignUserToTeams(userId, teams);
	}

	@Override
	public void assignUserToTeams(long userId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.assignUserToTeams(userId, teamIds);
	}

	@Override
	public void deleteUserGroupTeams(long userGroupId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.deleteUserGroupTeams(userGroupId, teamIds);
	}

	@Override
	public void deleteUserTeam(long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularTeamService.deleteUserTeam(userId, teamId);
	}

	@Override
	public AngularTeamService getWrappedService() {
		return _angularTeamService;
	}

	@Override
	public void setWrappedService(AngularTeamService angularTeamService) {
		_angularTeamService = angularTeamService;
	}

	private AngularTeamService _angularTeamService;
}
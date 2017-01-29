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
 * Provides a wrapper for {@link AngularUserGroupService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupService
 * @generated
 */
@ProviderType
public class AngularUserGroupServiceWrapper implements AngularUserGroupService,
	ServiceWrapper<AngularUserGroupService> {
	public AngularUserGroupServiceWrapper(
		AngularUserGroupService angularUserGroupService) {
		_angularUserGroupService = angularUserGroupService;
	}

	@Override
	public boolean hasPermission(long userGroupId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.hasPermission(userGroupId, actionId);
	}

	@Override
	public boolean hasTeamUserGroups(long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.hasTeamUserGroups(teamId);
	}

	@Override
	public boolean hasUserUserGroups(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.hasUserUserGroups(userId);
	}

	@Override
	public boolean isUserGroupMemberOfTeam(long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.isUserGroupMemberOfTeam(teamId,
			userGroupId);
	}

	@Override
	public boolean isUserMemberOfUserGroup(long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.isUserMemberOfUserGroup(userId,
			userGroupId);
	}

	@Override
	public com.liferay.portal.kernel.model.UserGroup createUserGroup(
		long userId, long companyId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.createUserGroup(userId, companyId,
			name, description);
	}

	@Override
	public com.liferay.portal.kernel.model.UserGroup getUserGroup(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.getUserGroup(userGroupId);
	}

	@Override
	public com.liferay.portal.kernel.model.UserGroup updateUserGroup(
		long companyId, long userGroupId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.updateUserGroup(companyId, userGroupId,
			name, description);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularUserGroupService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.UserGroup> getTeamUserGroups(
		long teamId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.getTeamUserGroups(teamId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.User> getUserGroupUsers(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.getUserGroupUsers(userGroupId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroups(
		long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.getUserGroups(userGroupIds);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroupsInCompany(
		long companyId) {
		return _angularUserGroupService.getUserGroupsInCompany(companyId);
	}

	@Override
	public long[] checkUserGroupIds(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupService.checkUserGroupIds(userId, userGroupIds);
	}

	@Override
	public void assignTeamUserGroup(long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.assignTeamUserGroup(teamId, userGroupId);
	}

	@Override
	public void assignTeamUserGroups(long teamId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.assignTeamUserGroups(teamId, userGroupIds);
	}

	@Override
	public void assignUserUserGroup(long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.assignUserUserGroup(userId, userGroupId);
	}

	@Override
	public void assignUserUserGroups(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.assignUserUserGroups(userId, userGroupIds);
	}

	@Override
	public void deleteUserGroup(long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.deleteUserGroup(userGroupId);
	}

	@Override
	public void deleteUserGroups(long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.deleteUserGroups(userGroupIds);
	}

	@Override
	public void removeTeamUserGroup(long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.removeTeamUserGroup(teamId, userGroupId);
	}

	@Override
	public void removeTeamUserGroups(long teamId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.removeTeamUserGroups(teamId, userGroupIds);
	}

	@Override
	public void removeUserUserGroup(long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.removeUserUserGroup(userId, userGroupId);
	}

	@Override
	public void removeUserUserGroups(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserGroupService.removeUserUserGroups(userId, userGroupIds);
	}

	@Override
	public AngularUserGroupService getWrappedService() {
		return _angularUserGroupService;
	}

	@Override
	public void setWrappedService(
		AngularUserGroupService angularUserGroupService) {
		_angularUserGroupService = angularUserGroupService;
	}

	private AngularUserGroupService _angularUserGroupService;
}
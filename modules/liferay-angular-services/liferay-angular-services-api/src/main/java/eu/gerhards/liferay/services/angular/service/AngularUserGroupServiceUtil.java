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
import com.liferay.osgi.util.ServiceTrackerFactory;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AngularUserGroup. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularUserGroupServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularUserGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularUserGroupServiceImpl
 * @generated
 */
@ProviderType
public class AngularUserGroupServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularUserGroupServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasPermission(long userGroupId,
		java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasPermission(userGroupId, actionId);
	}

	public static boolean hasTeamUserGroups(long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasTeamUserGroups(teamId);
	}

	public static boolean hasUserUserGroups(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasUserUserGroups(userId);
	}

	public static boolean isUserGroupMemberOfTeam(long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().isUserGroupMemberOfTeam(teamId, userGroupId);
	}

	public static boolean isUserMemberOfUserGroup(long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().isUserMemberOfUserGroup(userId, userGroupId);
	}

	public static com.liferay.portal.kernel.model.UserGroup createUserGroup(
		long userId, long companyId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().createUserGroup(userId, companyId, name, description);
	}

	public static com.liferay.portal.kernel.model.UserGroup getUserGroup(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserGroup(userGroupId);
	}

	public static com.liferay.portal.kernel.model.UserGroup updateUserGroup(
		long companyId, long userGroupId, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateUserGroup(companyId, userGroupId, name, description);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.UserGroup> getTeamUserGroups(
		long teamId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTeamUserGroups(teamId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.User> getUserGroupUsers(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserGroupUsers(userGroupId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroups(
		long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserGroups(userGroupIds);
	}

	public static java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroupsInCompany(
		long companyId) {
		return getService().getUserGroupsInCompany(companyId);
	}

	public static long[] checkUserGroupIds(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().checkUserGroupIds(userId, userGroupIds);
	}

	public static void assignTeamUserGroup(long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignTeamUserGroup(teamId, userGroupId);
	}

	public static void assignTeamUserGroups(long teamId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignTeamUserGroups(teamId, userGroupIds);
	}

	public static void assignUserUserGroup(long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserUserGroup(userId, userGroupId);
	}

	public static void assignUserUserGroups(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserUserGroups(userId, userGroupIds);
	}

	public static void deleteUserGroup(long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteUserGroup(userGroupId);
	}

	public static void deleteUserGroups(long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteUserGroups(userGroupIds);
	}

	public static void removeTeamUserGroup(long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().removeTeamUserGroup(teamId, userGroupId);
	}

	public static void removeTeamUserGroups(long teamId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().removeTeamUserGroups(teamId, userGroupIds);
	}

	public static void removeUserUserGroup(long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().removeUserUserGroup(userId, userGroupId);
	}

	public static void removeUserUserGroups(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().removeUserUserGroups(userId, userGroupIds);
	}

	public static AngularUserGroupService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularUserGroupService, AngularUserGroupService> _serviceTracker =
		ServiceTrackerFactory.open(AngularUserGroupService.class);
}
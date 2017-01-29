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
 * Provides the remote service utility for AngularTeam. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularTeamServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularTeamServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularTeamServiceImpl
 * @generated
 */
@ProviderType
public class AngularTeamServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularTeamServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean hasPermission(long teamId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasPermission(teamId, actionId);
	}

	public static boolean hasUserGroupTeam(long userGroupId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasUserGroupTeam(userGroupId, teamId);
	}

	public static boolean hasUserGroupTeams(long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasUserGroupTeams(userGroupId);
	}

	public static boolean hasUserTeam(long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasUserTeam(userId, teamId);
	}

	public static boolean hasUserTeams(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().hasUserTeams(userId);
	}

	public static com.liferay.portal.kernel.model.Team createTeam(long userId,
		long groupId, java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().createTeam(userId, groupId, name, description);
	}

	public static com.liferay.portal.kernel.model.Team deleteTeam(long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTeam(teamId);
	}

	public static com.liferay.portal.kernel.model.Team getTeam(long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTeam(teamId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.Team> getTeamsForUserGroup(
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTeamsForUserGroup(userGroupId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Team> getUserTeams(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserTeams(userId);
	}

	public static void assignUserGroupTeam(long userGroupId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserGroupTeam(userGroupId, teamId);
	}

	public static void assignUserGroupTeams(long userGroupId,
		java.util.List<com.liferay.portal.kernel.model.Team> teams)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserGroupTeams(userGroupId, teams);
	}

	public static void assignUserGroupTeams(long userGroupId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserGroupTeams(userGroupId, teamIds);
	}

	public static void assignUserToTeam(long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserToTeam(userId, teamId);
	}

	public static void assignUserToTeams(long userId,
		java.util.List<com.liferay.portal.kernel.model.Team> teams)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserToTeams(userId, teams);
	}

	public static void assignUserToTeams(long userId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().assignUserToTeams(userId, teamIds);
	}

	public static void deleteUserGroupTeams(long userGroupId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteUserGroupTeams(userGroupId, teamIds);
	}

	public static void deleteUserTeam(long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteUserTeam(userId, teamId);
	}

	public static AngularTeamService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularTeamService, AngularTeamService> _serviceTracker =
		ServiceTrackerFactory.open(AngularTeamService.class);
}
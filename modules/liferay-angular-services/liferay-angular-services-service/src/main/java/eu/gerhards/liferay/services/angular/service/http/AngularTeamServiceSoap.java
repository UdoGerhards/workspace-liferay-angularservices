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

package eu.gerhards.liferay.services.angular.service.http;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import eu.gerhards.liferay.services.angular.service.AngularTeamServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link AngularTeamServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularTeamSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularTeam}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularTeamSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularTeamSoap
 * @see AngularTeamServiceUtil
 * @generated
 */
@ProviderType
public class AngularTeamServiceSoap {
	public static com.liferay.portal.kernel.model.Team getTeam(long teamId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Team returnValue = AngularTeamServiceUtil.getTeam(teamId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.TeamSoap[] getTeamsForUserGroup(
		long userGroupId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Team> returnValue = AngularTeamServiceUtil.getTeamsForUserGroup(userGroupId);

			return com.liferay.portal.kernel.model.TeamSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.TeamSoap[] getUserTeams(
		long userId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Team> returnValue = AngularTeamServiceUtil.getUserTeams(userId);

			return com.liferay.portal.kernel.model.TeamSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Team createTeam(long userId,
		long groupId, java.lang.String name, java.lang.String description)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Team returnValue = AngularTeamServiceUtil.createTeam(userId,
					groupId, name, description);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserToTeam(long userId, long teamId)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.assignUserToTeam(userId, teamId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserToTeams(long userId,
		com.liferay.portal.kernel.model.TeamSoap[] teams)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.assignUserToTeams(userId,
				com.liferay.portal.model.impl.TeamModelImpl.toModels(teams));
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserToTeams(long userId, long[] teamIds)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.assignUserToTeams(userId, teamIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserGroupTeam(long userGroupId, long teamId)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.assignUserGroupTeam(userGroupId, teamId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserGroupTeams(long userGroupId,
		com.liferay.portal.kernel.model.TeamSoap[] teams)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.assignUserGroupTeams(userGroupId,
				com.liferay.portal.model.impl.TeamModelImpl.toModels(teams));
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserGroupTeams(long userGroupId, long[] teamIds)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.assignUserGroupTeams(userGroupId, teamIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Team deleteTeam(long teamId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Team returnValue = AngularTeamServiceUtil.deleteTeam(teamId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteUserTeam(long userId, long teamId)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.deleteUserTeam(userId, teamId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteUserGroupTeams(long userGroupId, long[] teamIds)
		throws RemoteException {
		try {
			AngularTeamServiceUtil.deleteUserGroupTeams(userGroupId, teamIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasUserGroupTeam(long userGroupId, long teamId)
		throws RemoteException {
		try {
			boolean returnValue = AngularTeamServiceUtil.hasUserGroupTeam(userGroupId,
					teamId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasUserGroupTeams(long userGroupId)
		throws RemoteException {
		try {
			boolean returnValue = AngularTeamServiceUtil.hasUserGroupTeams(userGroupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasUserTeam(long userId, long teamId)
		throws RemoteException {
		try {
			boolean returnValue = AngularTeamServiceUtil.hasUserTeam(userId,
					teamId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasUserTeams(long userId) throws RemoteException {
		try {
			boolean returnValue = AngularTeamServiceUtil.hasUserTeams(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasPermission(long teamId, java.lang.String actionId)
		throws RemoteException {
		try {
			boolean returnValue = AngularTeamServiceUtil.hasPermission(teamId,
					actionId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularTeamServiceSoap.class);
}
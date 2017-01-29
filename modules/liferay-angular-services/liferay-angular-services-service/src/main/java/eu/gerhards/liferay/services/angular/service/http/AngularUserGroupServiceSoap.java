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
import eu.gerhards.liferay.services.angular.service.AngularUserGroupServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link AngularUserGroupServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularUserGroupSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularUserGroup}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularUserGroupSoap}. Methods that SOAP cannot
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
 * @see AngularUserGroupServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularUserGroupSoap
 * @see AngularUserGroupServiceUtil
 * @generated
 */
@ProviderType
public class AngularUserGroupServiceSoap {
	public static com.liferay.portal.kernel.model.UserGroup getUserGroup(
		long userGroupId) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.UserGroup returnValue = AngularUserGroupServiceUtil.getUserGroup(userGroupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.UserGroupSoap[] getUserGroups(
		long[] userGroupIds) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.UserGroup> returnValue =
				AngularUserGroupServiceUtil.getUserGroups(userGroupIds);

			return com.liferay.portal.kernel.model.UserGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.UserSoap[] getUserGroupUsers(
		long userGroupId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.User> returnValue = AngularUserGroupServiceUtil.getUserGroupUsers(userGroupId);

			return com.liferay.portal.kernel.model.UserSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.UserGroupSoap[] getTeamUserGroups(
		long teamId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.UserGroup> returnValue =
				AngularUserGroupServiceUtil.getTeamUserGroups(teamId);

			return com.liferay.portal.kernel.model.UserGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.UserGroup createUserGroup(
		long userId, long companyId, java.lang.String name,
		java.lang.String description) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.UserGroup returnValue = AngularUserGroupServiceUtil.createUserGroup(userId,
					companyId, name, description);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.UserGroup updateUserGroup(
		long companyId, long userGroupId, java.lang.String name,
		java.lang.String description) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.UserGroup returnValue = AngularUserGroupServiceUtil.updateUserGroup(companyId,
					userGroupId, name, description);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteUserGroup(long userGroupId)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.deleteUserGroup(userGroupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteUserGroups(long[] userGroupIds)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.deleteUserGroups(userGroupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignTeamUserGroup(long teamId, long userGroupId)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.assignTeamUserGroup(teamId, userGroupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignTeamUserGroups(long teamId, long[] userGroupIds)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.assignTeamUserGroups(teamId,
				userGroupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeTeamUserGroup(long teamId, long userGroupId)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.removeTeamUserGroup(teamId, userGroupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeTeamUserGroups(long teamId, long[] userGroupIds)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.removeTeamUserGroups(teamId,
				userGroupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserUserGroup(long userId, long userGroupId)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.assignUserUserGroup(userId, userGroupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignUserUserGroups(long userId, long[] userGroupIds)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.assignUserUserGroups(userId,
				userGroupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeUserUserGroup(long userId, long userGroupId)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.removeUserUserGroup(userId, userGroupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void removeUserUserGroups(long userId, long[] userGroupIds)
		throws RemoteException {
		try {
			AngularUserGroupServiceUtil.removeUserUserGroups(userId,
				userGroupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isUserGroupMemberOfTeam(long teamId, long userGroupId)
		throws RemoteException {
		try {
			boolean returnValue = AngularUserGroupServiceUtil.isUserGroupMemberOfTeam(teamId,
					userGroupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasTeamUserGroups(long teamId)
		throws RemoteException {
		try {
			boolean returnValue = AngularUserGroupServiceUtil.hasTeamUserGroups(teamId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isUserMemberOfUserGroup(long userId, long userGroupId)
		throws RemoteException {
		try {
			boolean returnValue = AngularUserGroupServiceUtil.isUserMemberOfUserGroup(userId,
					userGroupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasUserUserGroups(long userId)
		throws RemoteException {
		try {
			boolean returnValue = AngularUserGroupServiceUtil.hasUserUserGroups(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.UserGroupSoap[] getUserGroupsInCompany(
		long companyId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.UserGroup> returnValue =
				AngularUserGroupServiceUtil.getUserGroupsInCompany(companyId);

			return com.liferay.portal.kernel.model.UserGroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean hasPermission(long userGroupId,
		java.lang.String actionId) throws RemoteException {
		try {
			boolean returnValue = AngularUserGroupServiceUtil.hasPermission(userGroupId,
					actionId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long[] checkUserGroupIds(long userId, long[] userGroupIds)
		throws RemoteException {
		try {
			long[] returnValue = AngularUserGroupServiceUtil.checkUserGroupIds(userId,
					userGroupIds);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularUserGroupServiceSoap.class);
}
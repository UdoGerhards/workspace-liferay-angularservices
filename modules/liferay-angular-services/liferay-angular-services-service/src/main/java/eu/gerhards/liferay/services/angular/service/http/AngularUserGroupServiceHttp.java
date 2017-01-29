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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import eu.gerhards.liferay.services.angular.service.AngularUserGroupServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link AngularUserGroupServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupServiceSoap
 * @see HttpPrincipal
 * @see AngularUserGroupServiceUtil
 * @generated
 */
@ProviderType
public class AngularUserGroupServiceHttp {
	public static com.liferay.portal.kernel.model.UserGroup getUserGroup(
		HttpPrincipal httpPrincipal, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"getUserGroup", _getUserGroupParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.model.UserGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroups(
		HttpPrincipal httpPrincipal, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"getUserGroups", _getUserGroupsParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupIds);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.kernel.model.UserGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.User> getUserGroupUsers(
		HttpPrincipal httpPrincipal, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"getUserGroupUsers", _getUserGroupUsersParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.kernel.model.User>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.UserGroup> getTeamUserGroups(
		HttpPrincipal httpPrincipal, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"getTeamUserGroups", _getTeamUserGroupsParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.kernel.model.UserGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.model.UserGroup createUserGroup(
		HttpPrincipal httpPrincipal, long userId, long companyId,
		java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"createUserGroup", _createUserGroupParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					companyId, name, description);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.model.UserGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.model.UserGroup updateUserGroup(
		HttpPrincipal httpPrincipal, long companyId, long userGroupId,
		java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"updateUserGroup", _updateUserGroupParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, userGroupId, name, description);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.model.UserGroup)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteUserGroup(HttpPrincipal httpPrincipal,
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"deleteUserGroup", _deleteUserGroupParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteUserGroups(HttpPrincipal httpPrincipal,
		long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"deleteUserGroups", _deleteUserGroupsParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupIds);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void assignTeamUserGroup(HttpPrincipal httpPrincipal,
		long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"assignTeamUserGroup", _assignTeamUserGroupParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId,
					userGroupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void assignTeamUserGroups(HttpPrincipal httpPrincipal,
		long teamId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"assignTeamUserGroups", _assignTeamUserGroupsParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId,
					userGroupIds);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void removeTeamUserGroup(HttpPrincipal httpPrincipal,
		long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"removeTeamUserGroup", _removeTeamUserGroupParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId,
					userGroupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void removeTeamUserGroups(HttpPrincipal httpPrincipal,
		long teamId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"removeTeamUserGroups",
					_removeTeamUserGroupsParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId,
					userGroupIds);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void assignUserUserGroup(HttpPrincipal httpPrincipal,
		long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"assignUserUserGroup", _assignUserUserGroupParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					userGroupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void assignUserUserGroups(HttpPrincipal httpPrincipal,
		long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"assignUserUserGroups",
					_assignUserUserGroupsParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					userGroupIds);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void removeUserUserGroup(HttpPrincipal httpPrincipal,
		long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"removeUserUserGroup", _removeUserUserGroupParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					userGroupId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void removeUserUserGroups(HttpPrincipal httpPrincipal,
		long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"removeUserUserGroups",
					_removeUserUserGroupsParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					userGroupIds);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean isUserGroupMemberOfTeam(HttpPrincipal httpPrincipal,
		long teamId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"isUserGroupMemberOfTeam",
					_isUserGroupMemberOfTeamParameterTypes16);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId,
					userGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean hasTeamUserGroups(HttpPrincipal httpPrincipal,
		long teamId) throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"hasTeamUserGroups", _hasTeamUserGroupsParameterTypes17);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean isUserMemberOfUserGroup(HttpPrincipal httpPrincipal,
		long userId, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"isUserMemberOfUserGroup",
					_isUserMemberOfUserGroupParameterTypes18);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					userGroupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean hasUserUserGroups(HttpPrincipal httpPrincipal,
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"hasUserUserGroups", _hasUserUserGroupsParameterTypes19);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroupsInCompany(
		HttpPrincipal httpPrincipal, long companyId) {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"getUserGroupsInCompany",
					_getUserGroupsInCompanyParameterTypes20);

			MethodHandler methodHandler = new MethodHandler(methodKey, companyId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.portal.kernel.model.UserGroup>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean hasPermission(HttpPrincipal httpPrincipal,
		long userGroupId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"hasPermission", _hasPermissionParameterTypes21);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId, actionId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long[] checkUserGroupIds(HttpPrincipal httpPrincipal,
		long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularUserGroupServiceUtil.class,
					"checkUserGroupIds", _checkUserGroupIdsParameterTypes22);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					userGroupIds);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (long[])returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularUserGroupServiceHttp.class);
	private static final Class<?>[] _getUserGroupParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getUserGroupsParameterTypes1 = new Class[] {
			long[].class
		};
	private static final Class<?>[] _getUserGroupUsersParameterTypes2 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getTeamUserGroupsParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _createUserGroupParameterTypes4 = new Class[] {
			long.class, long.class, java.lang.String.class,
			java.lang.String.class
		};
	private static final Class<?>[] _updateUserGroupParameterTypes5 = new Class[] {
			long.class, long.class, java.lang.String.class,
			java.lang.String.class
		};
	private static final Class<?>[] _deleteUserGroupParameterTypes6 = new Class[] {
			long.class
		};
	private static final Class<?>[] _deleteUserGroupsParameterTypes7 = new Class[] {
			long[].class
		};
	private static final Class<?>[] _assignTeamUserGroupParameterTypes8 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _assignTeamUserGroupsParameterTypes9 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _removeTeamUserGroupParameterTypes10 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _removeTeamUserGroupsParameterTypes11 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _assignUserUserGroupParameterTypes12 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _assignUserUserGroupsParameterTypes13 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _removeUserUserGroupParameterTypes14 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _removeUserUserGroupsParameterTypes15 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _isUserGroupMemberOfTeamParameterTypes16 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _hasTeamUserGroupsParameterTypes17 = new Class[] {
			long.class
		};
	private static final Class<?>[] _isUserMemberOfUserGroupParameterTypes18 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _hasUserUserGroupsParameterTypes19 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getUserGroupsInCompanyParameterTypes20 = new Class[] {
			long.class
		};
	private static final Class<?>[] _hasPermissionParameterTypes21 = new Class[] {
			long.class, java.lang.String.class
		};
	private static final Class<?>[] _checkUserGroupIdsParameterTypes22 = new Class[] {
			long.class, long[].class
		};
}
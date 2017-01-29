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
import eu.gerhards.liferay.services.angular.service.AngularTeamServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link AngularTeamServiceUtil} service utility. The
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
 * @see AngularTeamServiceSoap
 * @see HttpPrincipal
 * @see AngularTeamServiceUtil
 * @generated
 */
@ProviderType
public class AngularTeamServiceHttp {
	public static com.liferay.portal.kernel.model.Team getTeam(
		HttpPrincipal httpPrincipal, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"getTeam", _getTeamParameterTypes0);

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

			return (com.liferay.portal.kernel.model.Team)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.Team> getTeamsForUserGroup(
		HttpPrincipal httpPrincipal, long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"getTeamsForUserGroup", _getTeamsForUserGroupParameterTypes1);

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

			return (java.util.List<com.liferay.portal.kernel.model.Team>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.Team> getUserTeams(
		HttpPrincipal httpPrincipal, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"getUserTeams", _getUserTeamsParameterTypes2);

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

			return (java.util.List<com.liferay.portal.kernel.model.Team>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.model.Team createTeam(
		HttpPrincipal httpPrincipal, long userId, long groupId,
		java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"createTeam", _createTeamParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					groupId, name, description);

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

			return (com.liferay.portal.kernel.model.Team)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void assignUserToTeam(HttpPrincipal httpPrincipal,
		long userId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"assignUserToTeam", _assignUserToTeamParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					teamId);

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

	public static void assignUserToTeams(HttpPrincipal httpPrincipal,
		long userId, java.util.List<com.liferay.portal.kernel.model.Team> teams)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"assignUserToTeams", _assignUserToTeamsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					teams);

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

	public static void assignUserToTeams(HttpPrincipal httpPrincipal,
		long userId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"assignUserToTeams", _assignUserToTeamsParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					teamIds);

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

	public static void assignUserGroupTeam(HttpPrincipal httpPrincipal,
		long userGroupId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"assignUserGroupTeam", _assignUserGroupTeamParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId, teamId);

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

	public static void assignUserGroupTeams(HttpPrincipal httpPrincipal,
		long userGroupId,
		java.util.List<com.liferay.portal.kernel.model.Team> teams)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"assignUserGroupTeams", _assignUserGroupTeamsParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId, teams);

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

	public static void assignUserGroupTeams(HttpPrincipal httpPrincipal,
		long userGroupId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"assignUserGroupTeams", _assignUserGroupTeamsParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId, teamIds);

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

	public static com.liferay.portal.kernel.model.Team deleteTeam(
		HttpPrincipal httpPrincipal, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"deleteTeam", _deleteTeamParameterTypes10);

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

			return (com.liferay.portal.kernel.model.Team)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteUserTeam(HttpPrincipal httpPrincipal, long userId,
		long teamId) throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"deleteUserTeam", _deleteUserTeamParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					teamId);

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

	public static void deleteUserGroupTeams(HttpPrincipal httpPrincipal,
		long userGroupId, long[] teamIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"deleteUserGroupTeams",
					_deleteUserGroupTeamsParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId, teamIds);

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

	public static boolean hasUserGroupTeam(HttpPrincipal httpPrincipal,
		long userGroupId, long teamId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"hasUserGroupTeam", _hasUserGroupTeamParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					userGroupId, teamId);

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

	public static boolean hasUserGroupTeams(HttpPrincipal httpPrincipal,
		long userGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"hasUserGroupTeams", _hasUserGroupTeamsParameterTypes14);

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

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean hasUserTeam(HttpPrincipal httpPrincipal, long userId,
		long teamId) throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"hasUserTeam", _hasUserTeamParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					teamId);

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

	public static boolean hasUserTeams(HttpPrincipal httpPrincipal, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"hasUserTeams", _hasUserTeamsParameterTypes16);

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

	public static boolean hasPermission(HttpPrincipal httpPrincipal,
		long teamId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularTeamServiceUtil.class,
					"hasPermission", _hasPermissionParameterTypes17);

			MethodHandler methodHandler = new MethodHandler(methodKey, teamId,
					actionId);

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

	private static Log _log = LogFactoryUtil.getLog(AngularTeamServiceHttp.class);
	private static final Class<?>[] _getTeamParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getTeamsForUserGroupParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getUserTeamsParameterTypes2 = new Class[] {
			long.class
		};
	private static final Class<?>[] _createTeamParameterTypes3 = new Class[] {
			long.class, long.class, java.lang.String.class,
			java.lang.String.class
		};
	private static final Class<?>[] _assignUserToTeamParameterTypes4 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _assignUserToTeamsParameterTypes5 = new Class[] {
			long.class, java.util.List.class
		};
	private static final Class<?>[] _assignUserToTeamsParameterTypes6 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _assignUserGroupTeamParameterTypes7 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _assignUserGroupTeamsParameterTypes8 = new Class[] {
			long.class, java.util.List.class
		};
	private static final Class<?>[] _assignUserGroupTeamsParameterTypes9 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _deleteTeamParameterTypes10 = new Class[] {
			long.class
		};
	private static final Class<?>[] _deleteUserTeamParameterTypes11 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _deleteUserGroupTeamsParameterTypes12 = new Class[] {
			long.class, long[].class
		};
	private static final Class<?>[] _hasUserGroupTeamParameterTypes13 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _hasUserGroupTeamsParameterTypes14 = new Class[] {
			long.class
		};
	private static final Class<?>[] _hasUserTeamParameterTypes15 = new Class[] {
			long.class, long.class
		};
	private static final Class<?>[] _hasUserTeamsParameterTypes16 = new Class[] {
			long.class
		};
	private static final Class<?>[] _hasPermissionParameterTypes17 = new Class[] {
			long.class, java.lang.String.class
		};
}
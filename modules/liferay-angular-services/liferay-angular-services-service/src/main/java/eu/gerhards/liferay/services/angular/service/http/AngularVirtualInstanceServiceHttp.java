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
import eu.gerhards.liferay.services.angular.service.AngularVirtualInstanceServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link AngularVirtualInstanceServiceUtil} service utility. The
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
 * @see AngularVirtualInstanceServiceSoap
 * @see HttpPrincipal
 * @see AngularVirtualInstanceServiceUtil
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceServiceHttp {
	public static java.util.List<com.liferay.portal.kernel.model.Company> getAvailableInstances(
		HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"getAvailableInstances",
					_getAvailableInstancesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey);

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

			return (java.util.List<com.liferay.portal.kernel.model.Company>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.model.Company createVirtualInstance(
		HttpPrincipal httpPrincipal, java.lang.String webId,
		java.lang.String virtualHostname, java.lang.String mx, boolean system,
		int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"createVirtualInstance",
					_createVirtualInstanceParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey, webId,
					virtualHostname, mx, system, maxUsers, active);

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

			return (com.liferay.portal.kernel.model.Company)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.model.Company updateVirtualInstance(
		HttpPrincipal httpPrincipal, long companyId,
		java.lang.String virtualHostname, java.lang.String mx, int maxUsers,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"updateVirtualInstance",
					_updateVirtualInstanceParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, virtualHostname, mx, maxUsers, active);

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

			return (com.liferay.portal.kernel.model.Company)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.model.Company updateVirtualInstanceExtended(
		HttpPrincipal httpPrincipal, long companyId,
		java.lang.String virtualHostname, java.lang.String mx,
		java.lang.String homeUrl, boolean logo, byte[] logoBytes,
		java.lang.String name, java.lang.String legalName,
		java.lang.String legalId, java.lang.String legalType,
		java.lang.String sicCode, java.lang.String tickerSymbol,
		java.lang.String industry, java.lang.String type, java.lang.String size)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"updateVirtualInstanceExtended",
					_updateVirtualInstanceExtendedParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, virtualHostname, mx, homeUrl, logo, logoBytes,
					name, legalName, legalId, legalType, sicCode, tickerSymbol,
					industry, type, size);

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

			return (com.liferay.portal.kernel.model.Company)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteVirtualInstance(HttpPrincipal httpPrincipal,
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"deleteVirtualInstance",
					_deleteVirtualInstanceParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, companyId);

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

	public static com.liferay.portal.kernel.model.Company updateLogo(
		HttpPrincipal httpPrincipal, long companyId, byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"updateLogo", _updateLogoParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, bytes);

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

			return (com.liferay.portal.kernel.model.Company)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteCompanyLogo(HttpPrincipal httpPrincipal,
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"deleteCompanyLogo", _deleteCompanyLogoParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, companyId);

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

	public static com.liferay.portal.kernel.model.Company getVirtualInstance(
		HttpPrincipal httpPrincipal, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"getVirtualInstance", _getVirtualInstanceParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, companyId);

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

			return (com.liferay.portal.kernel.model.Company)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void updateCompanySecurity(HttpPrincipal httpPrincipal,
		long companyId, java.lang.String authType, boolean autoLogin,
		boolean sendPassword, boolean strangers, boolean strangesWithMx,
		boolean strangersVerify, boolean siteLogo)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularVirtualInstanceServiceUtil.class,
					"updateCompanySecurity",
					_updateCompanySecurityParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, authType, autoLogin, sendPassword, strangers,
					strangesWithMx, strangersVerify, siteLogo);

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

	private static Log _log = LogFactoryUtil.getLog(AngularVirtualInstanceServiceHttp.class);
	private static final Class<?>[] _getAvailableInstancesParameterTypes0 = new Class[] {
			
		};
	private static final Class<?>[] _createVirtualInstanceParameterTypes1 = new Class[] {
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, int.class, boolean.class
		};
	private static final Class<?>[] _updateVirtualInstanceParameterTypes2 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			int.class, boolean.class
		};
	private static final Class<?>[] _updateVirtualInstanceExtendedParameterTypes3 =
		new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			java.lang.String.class, boolean.class, byte[].class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class, java.lang.String.class,
			java.lang.String.class
		};
	private static final Class<?>[] _deleteVirtualInstanceParameterTypes4 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateLogoParameterTypes5 = new Class[] {
			long.class, byte[].class
		};
	private static final Class<?>[] _deleteCompanyLogoParameterTypes6 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getVirtualInstanceParameterTypes7 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateCompanySecurityParameterTypes8 = new Class[] {
			long.class, java.lang.String.class, boolean.class, boolean.class,
			boolean.class, boolean.class, boolean.class, boolean.class
		};
}
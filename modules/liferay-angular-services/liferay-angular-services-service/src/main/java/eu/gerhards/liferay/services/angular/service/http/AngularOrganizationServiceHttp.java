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
import com.liferay.portal.kernel.model.EmailAddress;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.Website;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import eu.gerhards.liferay.services.angular.service.AngularOrganizationServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link AngularOrganizationServiceUtil} service utility. The
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
 * @see AngularOrganizationServiceSoap
 * @see HttpPrincipal
 * @see AngularOrganizationServiceUtil
 * @generated
 */
@ProviderType
public class AngularOrganizationServiceHttp {
	public static Organization getOrganization(HttpPrincipal httpPrincipal,
											   long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"getOrganization", _getOrganizationParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

			return (Organization)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portal.kernel.model.User> getOrganizationUsers(
		HttpPrincipal httpPrincipal, long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"getOrganizationUsers", _getOrganizationUsersParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

	public static java.util.List<com.liferay.portal.kernel.model.Address> getOrganizationAdresses(
		HttpPrincipal httpPrincipal, long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"getOrganizationAdresses",
					_getOrganizationAdressesParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

			return (java.util.List<com.liferay.portal.kernel.model.Address>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<Phone> getOrganizationPhones(
		HttpPrincipal httpPrincipal, long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"getOrganizationPhones",
					_getOrganizationPhonesParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

			return (java.util.List<Phone>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<EmailAddress> getOrganizationEmailAddresses(
		HttpPrincipal httpPrincipal, long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"getOrganizationEmailAddresses",
					_getOrganizationEmailAddressesParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

			return (java.util.List<EmailAddress>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<Website> getOrganizationWebsites(
		HttpPrincipal httpPrincipal, long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"getOrganizationWebsites",
					_getOrganizationWebsitesParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

			return (java.util.List<Website>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static Organization createOrganization(HttpPrincipal httpPrincipal,
		java.lang.String name, java.lang.String type, long regionId,
		long countryId, long statusId, java.lang.String comment, boolean site,
		long[] addresses, long[] emailAddresses, long[] phones,
		long[] websites, long[] orgLabors)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"createOrganization", _createOrganizationParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, name,
					type, regionId, countryId, statusId, comment, site,
					addresses, emailAddresses, phones, websites, orgLabors);

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

			return (Organization)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static Organization updateOrganization(HttpPrincipal httpPrincipal,
		long organizationId, java.lang.String name, java.lang.String type,
		long regionId, long countryId, long statusId, java.lang.String comment,
		boolean site, long[] addresses, long[] emailAddresses, long[] phones,
		long[] websites, long[] orgLabors)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"updateOrganization", _updateOrganizationParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId, name, type, regionId, countryId, statusId,
					comment, site, addresses, emailAddresses, phones, websites,
					orgLabors);

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

			return (Organization)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static Organization deleteOrganization(HttpPrincipal httpPrincipal,
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"deleteOrganization", _deleteOrganizationParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					organizationId);

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

			return (Organization)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long[] checkOrganizations(HttpPrincipal httpPrincipal,
		long userId, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(AngularOrganizationServiceUtil.class,
					"checkOrganizations", _checkOrganizationsParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey, userId,
					organizationIds);

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

	private static Log _log = LogFactoryUtil.getLog(AngularOrganizationServiceHttp.class);
	private static final Class<?>[] _getOrganizationParameterTypes0 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getOrganizationUsersParameterTypes1 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getOrganizationAdressesParameterTypes2 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getOrganizationPhonesParameterTypes3 = new Class[] {
			long.class
		};
	private static final Class<?>[] _getOrganizationEmailAddressesParameterTypes4 =
		new Class[] { long.class };
	private static final Class<?>[] _getOrganizationWebsitesParameterTypes5 = new Class[] {
			long.class
		};
	private static final Class<?>[] _createOrganizationParameterTypes6 = new Class[] {
			java.lang.String.class, java.lang.String.class, long.class,
			long.class, long.class, java.lang.String.class, boolean.class,
			long[].class, long[].class, long[].class, long[].class, long[].class
		};
	private static final Class<?>[] _updateOrganizationParameterTypes7 = new Class[] {
			long.class, java.lang.String.class, java.lang.String.class,
			long.class, long.class, long.class, java.lang.String.class,
			boolean.class, long[].class, long[].class, long[].class,
			long[].class, long[].class
		};
	private static final Class<?>[] _deleteOrganizationParameterTypes8 = new Class[] {
			long.class
		};
	private static final Class<?>[] _checkOrganizationsParameterTypes10 = new Class[] {
			long.class, long[].class
		};
}
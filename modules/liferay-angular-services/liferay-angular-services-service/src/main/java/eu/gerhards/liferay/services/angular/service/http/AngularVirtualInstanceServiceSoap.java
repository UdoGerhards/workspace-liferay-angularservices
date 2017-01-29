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
import eu.gerhards.liferay.services.angular.service.AngularVirtualInstanceServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link AngularVirtualInstanceServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularVirtualInstanceSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularVirtualInstance}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularVirtualInstanceSoap}. Methods that SOAP cannot
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
 * @see AngularVirtualInstanceServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularVirtualInstanceSoap
 * @see AngularVirtualInstanceServiceUtil
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceServiceSoap {
	public static com.liferay.portal.kernel.model.CompanySoap[] getAvailableInstances()
		throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Company> returnValue = AngularVirtualInstanceServiceUtil.getAvailableInstances();

			return com.liferay.portal.kernel.model.CompanySoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Company createVirtualInstance(
		java.lang.String webId, java.lang.String virtualHostname,
		java.lang.String mx, boolean system, int maxUsers, boolean active)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Company returnValue = AngularVirtualInstanceServiceUtil.createVirtualInstance(webId,
					virtualHostname, mx, system, maxUsers, active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Company updateVirtualInstance(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		int maxUsers, boolean active) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Company returnValue = AngularVirtualInstanceServiceUtil.updateVirtualInstance(companyId,
					virtualHostname, mx, maxUsers, active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Company updateVirtualInstanceExtended(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		java.lang.String homeUrl, boolean logo, byte[] logoBytes,
		java.lang.String name, java.lang.String legalName,
		java.lang.String legalId, java.lang.String legalType,
		java.lang.String sicCode, java.lang.String tickerSymbol,
		java.lang.String industry, java.lang.String type, java.lang.String size)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Company returnValue = AngularVirtualInstanceServiceUtil.updateVirtualInstanceExtended(companyId,
					virtualHostname, mx, homeUrl, logo, logoBytes, name,
					legalName, legalId, legalType, sicCode, tickerSymbol,
					industry, type, size);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteVirtualInstance(long companyId)
		throws RemoteException {
		try {
			AngularVirtualInstanceServiceUtil.deleteVirtualInstance(companyId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Company updateLogo(
		long companyId, byte[] bytes) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Company returnValue = AngularVirtualInstanceServiceUtil.updateLogo(companyId,
					bytes);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCompanyLogo(long companyId)
		throws RemoteException {
		try {
			AngularVirtualInstanceServiceUtil.deleteCompanyLogo(companyId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Company getVirtualInstance(
		long companyId) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Company returnValue = AngularVirtualInstanceServiceUtil.getVirtualInstance(companyId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateCompanySecurity(long companyId,
		java.lang.String authType, boolean autoLogin, boolean sendPassword,
		boolean strangers, boolean strangesWithMx, boolean strangersVerify,
		boolean siteLogo) throws RemoteException {
		try {
			AngularVirtualInstanceServiceUtil.updateCompanySecurity(companyId,
				authType, autoLogin, sendPassword, strangers, strangesWithMx,
				strangersVerify, siteLogo);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularVirtualInstanceServiceSoap.class);
}
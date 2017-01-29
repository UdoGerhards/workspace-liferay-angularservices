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
 * Provides the remote service utility for AngularVirtualInstance. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstanceService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularVirtualInstanceServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceServiceImpl
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Company createVirtualInstance(
		java.lang.String webId, java.lang.String virtualHostname,
		java.lang.String mx, boolean system, int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .createVirtualInstance(webId, virtualHostname, mx, system,
			maxUsers, active);
	}

	public static com.liferay.portal.kernel.model.Company getVirtualInstance(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVirtualInstance(companyId);
	}

	public static com.liferay.portal.kernel.model.Company updateLogo(
		long companyId, byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateLogo(companyId, bytes);
	}

	public static com.liferay.portal.kernel.model.Company updateVirtualInstance(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateVirtualInstance(companyId, virtualHostname, mx,
			maxUsers, active);
	}

	public static com.liferay.portal.kernel.model.Company updateVirtualInstanceExtended(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		java.lang.String homeUrl, boolean logo, byte[] logoBytes,
		java.lang.String name, java.lang.String legalName,
		java.lang.String legalId, java.lang.String legalType,
		java.lang.String sicCode, java.lang.String tickerSymbol,
		java.lang.String industry, java.lang.String type, java.lang.String size)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateVirtualInstanceExtended(companyId, virtualHostname,
			mx, homeUrl, logo, logoBytes, name, legalName, legalId, legalType,
			sicCode, tickerSymbol, industry, type, size);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.Company> getAvailableInstances()
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAvailableInstances();
	}

	public static void deleteCompanyLogo(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteCompanyLogo(companyId);
	}

	public static void deleteVirtualInstance(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteVirtualInstance(companyId);
	}

	public static void updateCompanySecurity(long companyId,
		java.lang.String authType, boolean autoLogin, boolean sendPassword,
		boolean strangers, boolean strangesWithMx, boolean strangersVerify,
		boolean siteLogo)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.updateCompanySecurity(companyId, authType, autoLogin,
			sendPassword, strangers, strangesWithMx, strangersVerify, siteLogo);
	}

	public static AngularVirtualInstanceService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularVirtualInstanceService, AngularVirtualInstanceService> _serviceTracker =
		ServiceTrackerFactory.open(AngularVirtualInstanceService.class);
}
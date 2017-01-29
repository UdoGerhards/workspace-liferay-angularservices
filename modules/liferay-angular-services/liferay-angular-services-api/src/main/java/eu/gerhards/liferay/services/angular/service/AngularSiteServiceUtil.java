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
 * Provides the remote service utility for AngularSite. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularSiteServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularSiteService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularSiteServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularSiteServiceImpl
 * @generated
 */
@ProviderType
public class AngularSiteServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularSiteServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Group createSite(
		long parentSiteId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .createSite(parentSiteId, liveGroupId, nameMap,
			descriptionMap, type, manualMembership, membershipRestriction,
			friendlyURL, site, inheritContent, active);
	}

	public static com.liferay.portal.kernel.model.Group updateSite(
		long siteId, long parentSiteId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateSite(siteId, parentSiteId, liveGroupId, nameMap,
			descriptionMap, type, manualMembership, membershipRestriction,
			friendlyURL, site, inheritContent, active);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.Group> getActiveSites(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getActiveSites(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Group> getInactiveSites(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getInactiveSites(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Group> getInstanceSites(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getInstanceSites(companyId);
	}

	public static void deleteSite(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteSite(siteId);
	}

	public static AngularSiteService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularSiteService, AngularSiteService> _serviceTracker =
		ServiceTrackerFactory.open(AngularSiteService.class);
}
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
import com.liferay.portal.kernel.model.EmailAddress;
import com.liferay.portal.kernel.model.Phone;
import com.liferay.portal.kernel.model.Website;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AngularOrganization. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularOrganizationServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularOrganizationServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularOrganizationServiceImpl
 * @generated
 */
@ProviderType
public class AngularOrganizationServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularOrganizationServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Organization createOrganization(java.lang.String name,
												  java.lang.String type, long regionId, long countryId, long statusId,
												  java.lang.String comment, boolean site, long[] addresses,
												  long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .createOrganization(name, type, regionId, countryId,
			statusId, comment, site, addresses, emailAddresses, phones,
			websites, orgLabors);
	}

	public static com.liferay.portal.kernel.model.Organization deleteOrganization(long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteOrganization(organizationId);
	}

	public static com.liferay.portal.kernel.model.Organization getOrganization(long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrganization(organizationId);
	}

	public static com.liferay.portal.kernel.model.Organization updateOrganization(long organizationId,
		java.lang.String name, java.lang.String type, long regionId,
		long countryId, long statusId, java.lang.String comment, boolean site,
		long[] addresses, long[] emailAddresses, long[] phones,
		long[] websites, long[] orgLabors)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateOrganization(organizationId, name, type, regionId,
			countryId, statusId, comment, site, addresses, emailAddresses,
			phones, websites, orgLabors);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.Address> getOrganizationAdresses(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrganizationAdresses(organizationId);
	}

	public static java.util.List<EmailAddress> getOrganizationEmailAddresses(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrganizationEmailAddresses(organizationId);
	}

	public static java.util.List<Phone> getOrganizationPhones(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrganizationPhones(organizationId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.User> getOrganizationUsers(long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrganizationUsers(organizationId);
	}

	public static java.util.List<Website> getOrganizationWebsites(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOrganizationWebsites(organizationId);
	}

	public static long[] checkOrganizations(long userId, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().checkOrganizations(userId, organizationIds);
	}

	public static AngularOrganizationService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularOrganizationService, AngularOrganizationService> _serviceTracker =
		ServiceTrackerFactory.open(AngularOrganizationService.class);
}
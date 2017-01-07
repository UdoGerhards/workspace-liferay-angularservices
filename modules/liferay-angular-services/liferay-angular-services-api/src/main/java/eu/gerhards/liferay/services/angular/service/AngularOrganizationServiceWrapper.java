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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AngularOrganizationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationService
 * @generated
 */
@ProviderType
public class AngularOrganizationServiceWrapper
	implements AngularOrganizationService,
		ServiceWrapper<AngularOrganizationService> {
	public AngularOrganizationServiceWrapper(
		AngularOrganizationService angularOrganizationService) {
		_angularOrganizationService = angularOrganizationService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularOrganizationService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularOrganizationService getWrappedService() {
		return _angularOrganizationService;
	}

	@Override
	public Organization getOrganization(long organizationId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationService.getOrganization(organizationId);
	}

	@Override
	public void setWrappedService(
		AngularOrganizationService angularOrganizationService) {
		_angularOrganizationService = angularOrganizationService;
	}

	@Override
	public java.util.List<Address> getOrganizationAdresses(long organizationId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationService.getOrganizationAdresses(organizationId);
	}

	@Override
	public Organization createOrganization(String name, String type, long regionId, long countryId, long statusId, String comment, boolean site, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException {
		return _angularOrganizationService.createOrganization(name, type, regionId, countryId, statusId,comment, site, addresses, emailAddresses, phones, websites, orgLabors);
	}

	@Override
	public Organization updateOrganization(long organizationId, String name, String type, long regionId, long countryId, long statusId, String comment, boolean site, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException {
		return _angularOrganizationService.updateOrganization(organizationId, name, type, regionId, countryId, statusId, comment, site, addresses, emailAddresses, phones, websites, orgLabors);
	}

	@Override
	public java.util.List<EmailAddress> getOrganizationEmailAddresses(
			long organizationId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationService.getOrganizationEmailAddresses(organizationId);
	}

	@Override
	public java.util.List<Phone> getOrganizationPhones(long organizationId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationService.getOrganizationPhones(organizationId);
	}

	@Override
	public java.util.List<User> getOrganizationUsers(long organizationId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationService.getOrganizationUsers(organizationId);
	}

	@Override
	public java.util.List<Website> getOrganizationWebsites(long organizationId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationService.getOrganizationWebsites(organizationId);
	}

	@Override
	public Organization deleteOrganization(long organizationId) throws PortalException {
		return _angularOrganizationService.deleteOrganization(organizationId);
	}

	@Override
	public long[] checkOrganizations(long userId, long[] organizationIds) throws PortalException {
		return _angularOrganizationService.checkOrganizations(userId, organizationIds);
	}

	private AngularOrganizationService _angularOrganizationService;
}
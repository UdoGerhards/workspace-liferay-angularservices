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
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AngularSiteService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularSiteService
 * @generated
 */
@ProviderType
public class AngularSiteServiceWrapper implements AngularSiteService,
	ServiceWrapper<AngularSiteService> {
	public AngularSiteServiceWrapper(AngularSiteService angularSiteService) {
		_angularSiteService = angularSiteService;
	}

	@Override
	public com.liferay.portal.kernel.model.Group createSite(long parentSiteId,
		long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularSiteService.createSite(parentSiteId, liveGroupId,
			nameMap, descriptionMap, type, manualMembership,
			membershipRestriction, friendlyURL, site, inheritContent, active);
	}

	@Override
	public com.liferay.portal.kernel.model.Group updateSite(long siteId,
		long parentSiteId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularSiteService.updateSite(siteId, parentSiteId,
			liveGroupId, nameMap, descriptionMap, type, manualMembership,
			membershipRestriction, friendlyURL, site, inheritContent, active);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularSiteService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getActiveSites(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularSiteService.getActiveSites(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getInactiveSites(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularSiteService.getInactiveSites(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getInstanceSites(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularSiteService.getInstanceSites(companyId);
	}

	@Override
	public void deleteSite(long siteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularSiteService.deleteSite(siteId);
	}

	@Override
	public AngularSiteService getWrappedService() {
		return _angularSiteService;
	}

	@Override
	public void setWrappedService(AngularSiteService angularSiteService) {
		_angularSiteService = angularSiteService;
	}

	private AngularSiteService _angularSiteService;
}
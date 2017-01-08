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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.List;
import java.util.Locale;
import java.util.Map;

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
	public AngularSiteService getWrappedService() {
		return _angularSiteService;
	}

	@Override
	public void setWrappedService(AngularSiteService angularSiteService) {
		_angularSiteService = angularSiteService;
	}

	@Override
	public List<Group> getActiveSites(long companyId) throws PortalException {
		return _angularSiteService.getActiveSites(companyId);
	}

	@Override
	public List<Group> getInactiveSites(long companyId) throws PortalException {
		return _angularSiteService.getInactiveSites(companyId);
	}

	@Override
	public List<Group> getInstanceSites(long companyId) throws PortalException {
		return _angularSiteService.getInstanceSites(companyId);
	}

	@Override
	public Group createSite(long parenSiteId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {
		return _angularSiteService.createSite(parenSiteId, liveGroupId, nameMap, descriptionMap, type, manualMembership, membershipRestriction, friendlyURL, site, inheritContent, active);
	}

	@Override
	public Group updateSite(long siteId, long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {
		return _angularSiteService.updateSite(siteId, parentGroupId, liveGroupId, nameMap, descriptionMap, type, manualMembership, membershipRestriction, friendlyURL, site, inheritContent, active);
	}

	@Override
	public void deleteSite(long siteId) throws PortalException {
		_angularSiteService.deleteSite(siteId);
	}

	private AngularSiteService _angularSiteService;
}
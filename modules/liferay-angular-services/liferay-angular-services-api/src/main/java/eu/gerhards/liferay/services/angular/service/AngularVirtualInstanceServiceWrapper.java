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
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.List;

/**
 * Provides a wrapper for {@link AngularVirtualInstanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstanceService
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceServiceWrapper
	implements AngularVirtualInstanceService,
		ServiceWrapper<AngularVirtualInstanceService> {
	public AngularVirtualInstanceServiceWrapper(
		AngularVirtualInstanceService angularVirtualInstanceService) {
		_angularVirtualInstanceService = angularVirtualInstanceService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularVirtualInstanceService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularVirtualInstanceService getWrappedService() {
		return _angularVirtualInstanceService;
	}

	@Override
	public void setWrappedService(
		AngularVirtualInstanceService angularVirtualInstanceService) {
		_angularVirtualInstanceService = angularVirtualInstanceService;
	}

	@Override
	public List<Company> getAvailableInstances() throws PortalException {
		return _angularVirtualInstanceService.getAvailableInstances();
	}

	@Override
	public Company createVirtualInstance(String webId, String virtualHostname, String mx, boolean system, int maxUsers, boolean active) throws PortalException {
		return _angularVirtualInstanceService.createVirtualInstance(webId, virtualHostname, mx, system, maxUsers, active);
	}

	@Override
	public Company updateVirtualInstance(long companyId, String virtualHostname, String mx, int maxUsers, boolean active) throws PortalException {
		return _angularVirtualInstanceService.updateVirtualInstance(companyId, virtualHostname, mx, maxUsers, active);
	}

	@Override
	public Company updateVirtualInstanceExtended(long companyId, String virtualHostname, String mx, String homeUrl, boolean logo, byte[] logoBytes, String name, String legalName, String legalId, String legalType, String sicCode, String tickerSymbol, String industry, String type, String size) throws PortalException {
		return _angularVirtualInstanceService.updateVirtualInstanceExtended(companyId, virtualHostname, mx, homeUrl, logo, logoBytes, name, legalName, legalId, legalType, sicCode, tickerSymbol, industry, type, size);
	}

	@Override
	public void deleteVirtualInstance(long companyId) throws PortalException {
		_angularVirtualInstanceService.deleteVirtualInstance(companyId);
	}

	@Override
	public Company updateLogo(long companyId, byte[] bytes) throws PortalException {
		return _angularVirtualInstanceService.updateLogo(companyId, bytes);
	}

	@Override
	public void deleteCompanyLogo(long companyId) throws PortalException {
		_angularVirtualInstanceService.deleteVirtualInstance(companyId);
	}

	@Override
	public Company getVirtualInstance(long companyId) throws PortalException {
		return _angularVirtualInstanceService.getVirtualInstance(companyId);
	}

	@Override
	public void updateCompanySecurity(long companyId, String authType, boolean autoLogin, boolean sendPassword, boolean strangers, boolean strangesWithMx, boolean strangersVerify, boolean siteLogo) throws PortalException {
		_angularVirtualInstanceService.updateCompanySecurity(companyId, authType, autoLogin, sendPassword, strangers, strangesWithMx, strangersVerify, siteLogo);
	}

	private AngularVirtualInstanceService _angularVirtualInstanceService;
}
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

	@Override
	public com.liferay.portal.kernel.model.Company createVirtualInstance(
		java.lang.String webId, java.lang.String virtualHostname,
		java.lang.String mx, boolean system, int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualInstanceService.createVirtualInstance(webId,
			virtualHostname, mx, system, maxUsers, active);
	}

	@Override
	public com.liferay.portal.kernel.model.Company getVirtualInstance(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualInstanceService.getVirtualInstance(companyId);
	}

	@Override
	public com.liferay.portal.kernel.model.Company updateLogo(long companyId,
		byte[] bytes)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualInstanceService.updateLogo(companyId, bytes);
	}

	@Override
	public com.liferay.portal.kernel.model.Company updateVirtualInstance(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		int maxUsers, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualInstanceService.updateVirtualInstance(companyId,
			virtualHostname, mx, maxUsers, active);
	}

	@Override
	public com.liferay.portal.kernel.model.Company updateVirtualInstanceExtended(
		long companyId, java.lang.String virtualHostname, java.lang.String mx,
		java.lang.String homeUrl, boolean logo, byte[] logoBytes,
		java.lang.String name, java.lang.String legalName,
		java.lang.String legalId, java.lang.String legalType,
		java.lang.String sicCode, java.lang.String tickerSymbol,
		java.lang.String industry, java.lang.String type, java.lang.String size)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualInstanceService.updateVirtualInstanceExtended(companyId,
			virtualHostname, mx, homeUrl, logo, logoBytes, name, legalName,
			legalId, legalType, sicCode, tickerSymbol, industry, type, size);
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
	public java.util.List<com.liferay.portal.kernel.model.Company> getAvailableInstances()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualInstanceService.getAvailableInstances();
	}

	@Override
	public void deleteCompanyLogo(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularVirtualInstanceService.deleteCompanyLogo(companyId);
	}

	@Override
	public void deleteVirtualInstance(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularVirtualInstanceService.deleteVirtualInstance(companyId);
	}

	@Override
	public void updateCompanySecurity(long companyId,
		java.lang.String authType, boolean autoLogin, boolean sendPassword,
		boolean strangers, boolean strangesWithMx, boolean strangersVerify,
		boolean siteLogo)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularVirtualInstanceService.updateCompanySecurity(companyId,
			authType, autoLogin, sendPassword, strangers, strangesWithMx,
			strangersVerify, siteLogo);
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

	private AngularVirtualInstanceService _angularVirtualInstanceService;
}
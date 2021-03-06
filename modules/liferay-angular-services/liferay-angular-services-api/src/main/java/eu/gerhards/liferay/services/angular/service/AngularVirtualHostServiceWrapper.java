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
import com.liferay.portal.kernel.model.VirtualHost;
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AngularVirtualHostService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHostService
 * @generated
 */
@ProviderType
public class AngularVirtualHostServiceWrapper
	implements AngularVirtualHostService,
		ServiceWrapper<AngularVirtualHostService> {
	public AngularVirtualHostServiceWrapper(
		AngularVirtualHostService angularVirtualHostService) {
		_angularVirtualHostService = angularVirtualHostService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularVirtualHostService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularVirtualHostService getWrappedService() {
		return _angularVirtualHostService;
	}

	@Override
	public void setWrappedService(
		AngularVirtualHostService angularVirtualHostService) {
		_angularVirtualHostService = angularVirtualHostService;
	}

	@Override
	public VirtualHost createVirtualHost(long companyId, String virtualHostName) throws PortalException {
		return _angularVirtualHostService.createVirtualHost(companyId, virtualHostName);
	}

	@Override
	public void deleteVirtualHost() throws PortalException {
		_angularVirtualHostService.deleteVirtualHost();
	}

	@Override
	public VirtualHost updateVirtualHost(long companyId, long layoutSetId, String hostname) throws PortalException {
		return _angularVirtualHostService.updateVirtualHost(companyId, layoutSetId, hostname);
	}

	private AngularVirtualHostService _angularVirtualHostService;
}
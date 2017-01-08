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
 * Provides a wrapper for {@link AngularInstanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularInstanceService
 * @generated
 */
@ProviderType
public class AngularInstanceServiceWrapper implements AngularInstanceService,
	ServiceWrapper<AngularInstanceService> {
	public AngularInstanceServiceWrapper(
		AngularInstanceService angularInstanceService) {
		_angularInstanceService = angularInstanceService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularInstanceService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String postTest(java.lang.String string1,
		java.lang.String string2, long number) {
		return _angularInstanceService.postTest(string1, string2, number);
	}

	@Override
	public AngularInstanceService getWrappedService() {
		return _angularInstanceService;
	}

	@Override
	public void setWrappedService(AngularInstanceService angularInstanceService) {
		_angularInstanceService = angularInstanceService;
	}

	private AngularInstanceService _angularInstanceService;
}
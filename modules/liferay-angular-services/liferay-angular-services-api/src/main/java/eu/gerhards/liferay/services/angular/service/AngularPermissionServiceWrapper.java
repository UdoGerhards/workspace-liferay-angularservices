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
 * Provides a wrapper for {@link AngularPermissionService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularPermissionService
 * @generated
 */
@ProviderType
public class AngularPermissionServiceWrapper implements AngularPermissionService,
	ServiceWrapper<AngularPermissionService> {
	public AngularPermissionServiceWrapper(
		AngularPermissionService angularPermissionService) {
		_angularPermissionService = angularPermissionService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularPermissionService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.ResourcePermission> getPermissions(
		long roleId) {
		return _angularPermissionService.getPermissions(roleId);
	}

	@Override
	public java.util.List<java.util.List<com.liferay.portal.kernel.model.ResourcePermission>> getPermissionsForUser(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularPermissionService.getPermissionsForUser(userId);
	}

	@Override
	public java.util.List<java.util.List<com.liferay.portal.kernel.model.ResourcePermission>> getPermissionsForUserPerType(
		long userId, long roleType, long scopeType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularPermissionService.getPermissionsForUserPerType(userId,
			roleType, scopeType);
	}

	@Override
	public AngularPermissionService getWrappedService() {
		return _angularPermissionService;
	}

	@Override
	public void setWrappedService(
		AngularPermissionService angularPermissionService) {
		_angularPermissionService = angularPermissionService;
	}

	private AngularPermissionService _angularPermissionService;
}
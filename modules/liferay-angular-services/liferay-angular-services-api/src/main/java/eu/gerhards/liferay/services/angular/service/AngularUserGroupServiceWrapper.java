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
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AngularUserGroupService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupService
 * @generated
 */
@ProviderType
public class AngularUserGroupServiceWrapper implements AngularUserGroupService,
	ServiceWrapper<AngularUserGroupService> {
	public AngularUserGroupServiceWrapper(
		AngularUserGroupService angularUserGroupService) {
		_angularUserGroupService = angularUserGroupService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularUserGroupService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularUserGroupService getWrappedService() {
		return _angularUserGroupService;
	}

	@Override
	public void setWrappedService(
		AngularUserGroupService angularUserGroupService) {
		_angularUserGroupService = angularUserGroupService;
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.UserGroup> getUserGroupsInCompany(
			long companyId) {
		return _angularUserGroupService.getUserGroupsInCompany(companyId);
	}

	@Override
	public long[] checkUserGroupIds(long userId, long[] userGroupIds) throws PortalException {
		return _angularUserGroupService.checkUserGroupIds(userId, userGroupIds);
	}

	private AngularUserGroupService _angularUserGroupService;
}
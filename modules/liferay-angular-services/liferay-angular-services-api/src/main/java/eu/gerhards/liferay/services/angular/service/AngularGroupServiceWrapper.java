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
 * Provides a wrapper for {@link AngularGroupService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupService
 * @generated
 */
@ProviderType
public class AngularGroupServiceWrapper implements AngularGroupService,
	ServiceWrapper<AngularGroupService> {
	public AngularGroupServiceWrapper(AngularGroupService angularGroupService) {
		_angularGroupService = angularGroupService;
	}

	@Override
	public com.liferay.portal.kernel.model.Group createGroup(
		long parentGroupId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupService.createGroup(parentGroupId, liveGroupId,
			nameMap, descriptionMap, type, manualMembership,
			membershipRestriction, friendlyURL, site, inheritContent, active);
	}

	@Override
	public com.liferay.portal.kernel.model.Group updateGroup(long groupId,
		long parentGroupId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupService.updateGroup(groupId, parentGroupId,
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
		return _angularGroupService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getActiveGroups(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupService.getActiveGroups(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getInactiveGroups(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupService.getInactiveGroups(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getInstanceGroups(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupService.getInstanceGroups(companyId);
	}

	@Override
	public long[] checkGroups(long userId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupService.checkGroups(userId, groupIds);
	}

	@Override
	public void deleteGroup(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularGroupService.deleteGroup(groupId);
	}

	@Override
	public AngularGroupService getWrappedService() {
		return _angularGroupService;
	}

	@Override
	public void setWrappedService(AngularGroupService angularGroupService) {
		_angularGroupService = angularGroupService;
	}

	private AngularGroupService _angularGroupService;
}
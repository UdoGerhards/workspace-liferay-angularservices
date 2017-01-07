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

import java.util.Locale;
import java.util.Map;

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
	public AngularGroupService getWrappedService() {
		return _angularGroupService;
	}

	@Override
	public void setWrappedService(AngularGroupService angularGroupService) {
		_angularGroupService = angularGroupService;
	}

	@Override
    public java.util.List<com.liferay.portal.kernel.model.Group> getActiveGroups(
			long companyId) throws PortalException {
		return _angularGroupService.getActiveGroups(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Group> getInactiveGroups(
			long companyId) throws PortalException {
		return _angularGroupService.getInactiveGroups(companyId);
	}

	@Override
    public java.util.List<com.liferay.portal.kernel.model.Group> getInstanceGroups(
			long companyId) throws PortalException {
		return _angularGroupService.getInstanceGroups(companyId);
	}

	@Override
	public Group createGroup(long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {
		return _angularGroupService.createGroup(parentGroupId, liveGroupId,nameMap,descriptionMap,type,manualMembership,membershipRestriction,friendlyURL,site, inheritContent, active);
	}

	@Override
	public Group updateGroup(long groupId, long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {
		return _angularGroupService.updateGroup(groupId,parentGroupId,liveGroupId,nameMap,descriptionMap,type,manualMembership,membershipRestriction,friendlyURL,site,inheritContent,active);
	}

	@Override
	public void deleteGroup(long groupId) throws PortalException {
		_angularGroupService.deleteGroup(groupId);
	}

	@Override
	public long[] checkGroups(long userId, long[] groupIds) throws PortalException {
		return _angularGroupService.checkGroups(userId, groupIds);
	}

	private AngularGroupService _angularGroupService;
}
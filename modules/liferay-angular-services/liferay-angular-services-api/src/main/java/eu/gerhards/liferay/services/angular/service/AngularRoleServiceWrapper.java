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
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Provides a wrapper for {@link AngularRoleService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularRoleService
 * @generated
 */
@ProviderType
public class AngularRoleServiceWrapper implements AngularRoleService,
	ServiceWrapper<AngularRoleService> {
	public AngularRoleServiceWrapper(AngularRoleService angularRoleService) {
		_angularRoleService = angularRoleService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularRoleService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularRoleService getWrappedService() {
		return _angularRoleService;
	}

	@Override
	public void setWrappedService(AngularRoleService angularRoleService) {
		_angularRoleService = angularRoleService;
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Role> getOrganizationRoles(
			long companyId) {
		return _angularRoleService.getOrganizationRoles(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Role> getRegularRoles(
			long companyId) {
		return _angularRoleService.getRegularRoles(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Role> getRolesInCompany(
			long companyId) {
		return _angularRoleService.getRolesInCompany(companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Role> getSiteRoles(
			long companyId) {
		return _angularRoleService.getSiteRoles(companyId);
	}

	@Override
	public Role createRole(String name, int type, String className, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String subType) throws PortalException {
		return _angularRoleService.createRole(name, type, className, titleMap, descriptionMap, subType);
	}

	@Override
	public Role updateRole(long roleId, String name, int type, String className, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String subType) throws PortalException {
		return _angularRoleService.updateRole(roleId, name, type, className, titleMap, descriptionMap, subType);
	}

	@Override
	public Role deleteRole(long roleId) throws PortalException {
		return _angularRoleService.deleteRole(roleId);
	}

	@Override
	public long[] checkRoles(long userId, long[] roleIds) throws PortalException {
		return _angularRoleService.checkRoles(userId, roleIds);
	}

	@Override
	public List<UserGroupRole> checkUserGroupRoles(long userId, List<UserGroupRole> userGroupRoles) throws PortalException {
		return _angularRoleService.checkUserGroupRoles(userId,userGroupRoles);
	}

	private AngularRoleService _angularRoleService;
}
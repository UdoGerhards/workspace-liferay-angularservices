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
import com.liferay.osgi.util.ServiceTrackerFactory;
import com.liferay.portal.kernel.model.UserGroupRole;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AngularRole. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularRoleServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularRoleService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularRoleServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularRoleServiceImpl
 * @generated
 */
@ProviderType
public class AngularRoleServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularRoleServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Role createRole(java.lang.String name, int type,
		java.lang.String className,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String subType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .createRole(name, type, className, titleMap, descriptionMap,
			subType);
	}

	public static com.liferay.portal.kernel.model.Role deleteRole(long roleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRole(roleId);
	}

	public static com.liferay.portal.kernel.model.Role updateRole(long roleId, java.lang.String name, int type,
		java.lang.String className,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.lang.String subType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateRole(roleId, name, type, className, titleMap,
			descriptionMap, subType);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<UserGroupRole> checkUserGroupRoles(
		long userId, java.util.List<UserGroupRole> userGroupRoles)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().checkUserGroupRoles(userId, userGroupRoles);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Role> getOrganizationRoles(long companyId) {
		return getService().getOrganizationRoles(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Role> getRegularRoles(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRegularRoles(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Role> getRolesInCompany(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRolesInCompany(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Role> getSiteRoles(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSiteRoles(companyId);
	}

	public static long[] checkRoles(long userId, long[] roleIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().checkRoles(userId, roleIds);
	}

	public static AngularRoleService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularRoleService, AngularRoleService> _serviceTracker =
		ServiceTrackerFactory.open(AngularRoleService.class);
}
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
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AngularPermission. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularPermissionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularPermissionService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularPermissionServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularPermissionServiceImpl
 * @generated
 */
@ProviderType
public class AngularPermissionServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularPermissionServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.ResourcePermission> getPermissions(
		long roleId) {
		return getService().getPermissions(roleId);
	}

	public static java.util.List<java.util.List<com.liferay.portal.kernel.model.ResourcePermission>> getPermissionsForUser(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPermissionsForUser(userId);
	}

	public static java.util.List<java.util.List<com.liferay.portal.kernel.model.ResourcePermission>> getPermissionsForUserPerType(
		long userId, long roleType, long scopeType)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getPermissionsForUserPerType(userId, roleType, scopeType);
	}

	public static AngularPermissionService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularPermissionService, AngularPermissionService> _serviceTracker =
		ServiceTrackerFactory.open(AngularPermissionService.class);
}
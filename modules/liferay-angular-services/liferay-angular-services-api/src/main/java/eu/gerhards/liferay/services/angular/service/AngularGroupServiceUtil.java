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
 * Provides the remote service utility for AngularGroup. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularGroupServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularGroupServiceImpl
 * @generated
 */
@ProviderType
public class AngularGroupServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularGroupServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Group createGroup(
		long parentGroupId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .createGroup(parentGroupId, liveGroupId, nameMap,
			descriptionMap, type, manualMembership, membershipRestriction,
			friendlyURL, site, inheritContent, active);
	}

	public static com.liferay.portal.kernel.model.Group updateGroup(
		long groupId, long parentGroupId, long liveGroupId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		int type, boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateGroup(groupId, parentGroupId, liveGroupId, nameMap,
			descriptionMap, type, manualMembership, membershipRestriction,
			friendlyURL, site, inheritContent, active);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.Group> getActiveGroups(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getActiveGroups(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Group> getInactiveGroups(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getInactiveGroups(companyId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.Group> getInstanceGroups(
		long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getInstanceGroups(companyId);
	}

	public static long[] checkGroups(long userId, long[] groupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().checkGroups(userId, groupIds);
	}

	public static void deleteGroup(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteGroup(groupId);
	}

	public static AngularGroupService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularGroupService, AngularGroupService> _serviceTracker =
		ServiceTrackerFactory.open(AngularGroupService.class);
}
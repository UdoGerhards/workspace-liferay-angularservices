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
 * Provides the remote service utility for AngularLayout. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularLayoutServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularLayoutServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularLayoutServiceImpl
 * @generated
 */
@ProviderType
public class AngularLayoutServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularLayoutServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.model.Layout createLayout(
		long userId, long groupId, boolean privateLayout, long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, java.lang.String typeSettings, boolean hidden,
		java.util.Map<java.util.Locale, java.lang.String> friendlyURLMap)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .createLayout(userId, groupId, privateLayout,
			parentLayoutId, nameMap, titleMap, descriptionMap, keywordsMap,
			robotsMap, type, typeSettings, hidden, friendlyURLMap);
	}

	public static com.liferay.portal.kernel.model.Layout getLayoutbyId(
		long layoutId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLayoutbyId(layoutId);
	}

	public static com.liferay.portal.kernel.model.Layout updateFriendlyURL(
		long plid, java.lang.String friendlyURL, java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateFriendlyURL(plid, friendlyURL, languageId);
	}

	public static com.liferay.portal.kernel.model.Layout updateLayout(
		long groupId, boolean privateLayout, long layoutId,
		long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, boolean hidden,
		java.util.Map<java.util.Locale, java.lang.String> friendlyURLMap,
		boolean iconImage, byte[] iconBytes)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateLayout(groupId, privateLayout, layoutId,
			parentLayoutId, nameMap, titleMap, descriptionMap, keywordsMap,
			robotsMap, type, hidden, friendlyURLMap, iconImage, iconBytes);
	}

	public static com.liferay.portal.kernel.model.Layout updateLookAndFeel(
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String themeId, java.lang.String colorSchemeId,
		java.lang.String css) {
		return getService()
				   .updateLookAndFeel(groupId, privateLayout, layoutId,
			themeId, colorSchemeId, css);
	}

	public static com.liferay.portal.kernel.model.Layout updateName(
		long layoutId, java.lang.String name, java.lang.String languageId) {
		return getService().updateName(layoutId, name, languageId);
	}

	public static com.liferay.portal.kernel.model.Layout updatePriority(
		long layoutId, int priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updatePriority(layoutId, priority);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.liferay.portal.kernel.model.Layout> getLayouts(
		long groupId, boolean privateLayout)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLayouts(groupId, privateLayout);
	}

	public static void deleteLayout(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().deleteLayout(groupId);
	}

	public static void setLayouts(long groupId, boolean privateLayout,
		long parentLayoutId, long[] layoutIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService()
			.setLayouts(groupId, privateLayout, parentLayoutId, layoutIds);
	}

	public static AngularLayoutService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularLayoutService, AngularLayoutService> _serviceTracker =
		ServiceTrackerFactory.open(AngularLayoutService.class);
}
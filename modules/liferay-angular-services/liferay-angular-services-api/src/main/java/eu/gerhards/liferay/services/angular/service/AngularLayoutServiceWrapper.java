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
 * Provides a wrapper for {@link AngularLayoutService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutService
 * @generated
 */
@ProviderType
public class AngularLayoutServiceWrapper implements AngularLayoutService,
	ServiceWrapper<AngularLayoutService> {
	public AngularLayoutServiceWrapper(
		AngularLayoutService angularLayoutService) {
		_angularLayoutService = angularLayoutService;
	}

	@Override
	public com.liferay.portal.kernel.model.Layout createLayout(long groupId,
		boolean privateLayout, long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, java.lang.String typeSettings, boolean hidden,
		java.util.Map<java.util.Locale, java.lang.String> friendlyURLMap)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.createLayout(groupId, privateLayout,
			parentLayoutId, nameMap, titleMap, descriptionMap, keywordsMap,
			robotsMap, type, typeSettings, hidden, friendlyURLMap);
	}

	@Override
	public com.liferay.portal.kernel.model.Layout getLayoutbyId(long layoutId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.getLayoutbyId(layoutId);
	}

	@Override
	public com.liferay.portal.kernel.model.Layout updateFriendlyURL(long plid,
		java.lang.String friendlyURL, java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.updateFriendlyURL(plid, friendlyURL,
			languageId);
	}

	@Override
	public com.liferay.portal.kernel.model.Layout updateLayout(long groupId,
		boolean privateLayout, long layoutId, long parentLayoutId,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.util.Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
		java.util.Map<java.util.Locale, java.lang.String> keywordsMap,
		java.util.Map<java.util.Locale, java.lang.String> robotsMap,
		java.lang.String type, boolean hidden,
		java.util.Map<java.util.Locale, java.lang.String> friendlyURLMap,
		boolean iconImage, byte[] iconBytes)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.updateLayout(groupId, privateLayout,
			layoutId, parentLayoutId, nameMap, titleMap, descriptionMap,
			keywordsMap, robotsMap, type, hidden, friendlyURLMap, iconImage,
			iconBytes);
	}

	@Override
	public com.liferay.portal.kernel.model.Layout updateLookAndFeel(
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String themeId, java.lang.String colorSchemeId,
		java.lang.String css)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.updateLookAndFeel(groupId, privateLayout,
			layoutId, themeId, colorSchemeId, css);
	}

	@Override
	public com.liferay.portal.kernel.model.Layout updateName(long layoutId,
		java.lang.String name, java.lang.String languageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.updateName(layoutId, name, languageId);
	}

	@Override
	public com.liferay.portal.kernel.model.Layout updatePriority(long groupId,
		boolean privateLayout, long layoutId, int priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.updatePriority(groupId, privateLayout,
			layoutId, priority);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularLayoutService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.liferay.portal.kernel.model.Layout> getLayouts(
		long groupId, boolean privateLayout)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutService.getLayouts(groupId, privateLayout);
	}

	@Override
	public void deleteLayout(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularLayoutService.deleteLayout(groupId);
	}

	@Override
	public void setLayouts(long groupId, boolean privateLayout,
		long parentLayoutId, long[] layoutIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularLayoutService.setLayouts(groupId, privateLayout,
			parentLayoutId, layoutIds);
	}

	@Override
	public void updatePriorities(long groupId, boolean privateLayout)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularLayoutService.updatePriorities(groupId, privateLayout);
	}

	@Override
	public AngularLayoutService getWrappedService() {
		return _angularLayoutService;
	}

	@Override
	public void setWrappedService(AngularLayoutService angularLayoutService) {
		_angularLayoutService = angularLayoutService;
	}

	private AngularLayoutService _angularLayoutService;
}
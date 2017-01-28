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

package eu.gerhards.liferay.services.angular.service.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularLayoutServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the Layout remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularLayoutService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularLayoutServiceUtil
 */
@ProviderType
public class AngularLayoutServiceImpl extends AngularLayoutServiceBaseImpl {

    public static Log _log = LogFactoryUtil.getLog(AngularLayoutServiceImpl.class);

    @Override
    public Layout getLayoutbyId(long layoutId) throws PortalException {

        _log.info("Getting layout with id "+layoutId);

        _log.debug("    ... security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_LAYOUTS);

        _log.debug("    ... getting layout ...");

        Layout layout = LayoutLocalServiceUtil.getLayout(layoutId);

        return layout;
    }

    @Override
    public List<Layout> getLayouts(long groupId, boolean privateLayout) throws PortalException {

        _log.info("Getting layouts for group with id "+groupId);

        _log.debug("    ... security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_LAYOUTS);

        _log.debug("    ... getting layouts ...");

        java.util.List<com.liferay.portal.kernel.model.Layout> layouts = LayoutLocalServiceUtil.getLayouts(groupId, privateLayout);

        return layouts;
    }

    @Override
    public void setLayouts(long groupId, boolean privateLayout, long parentLayoutId, long[] layoutIds) throws PortalException {

    }

    @Override
    public Layout createLayout(long groupId, boolean privateLayout, long parentLayoutId, Map<Locale, String> nameMap, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, Map<Locale, String> keywordsMap, Map<Locale, String> robotsMap, String type, String typeSettings, boolean hidden, Map<Locale, String> friendlyURLMap) throws PortalException {

        _log.info("Creating layout ... ");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_LAYOUT);

        _log.debug("    ... creating layout ...");

        long userId = this.getGuestOrUserId();

        com.liferay.portal.kernel.service.ServiceContext serviceContext = new com.liferay.portal.kernel.service.ServiceContext();
        serviceContext.setUserId(this.getGuestOrUserId());

        com.liferay.portal.kernel.model.Layout layout = LayoutLocalServiceUtil.addLayout(userId, groupId, privateLayout, parentLayoutId, nameMap, titleMap, descriptionMap, keywordsMap, robotsMap, type, typeSettings, hidden, friendlyURLMap, serviceContext);

        return layout;
    }

    @Override
    public Layout updateLayout(long groupId, boolean privateLayout, long layoutId, long parentLayoutId, Map<Locale, String> nameMap, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, Map<Locale, String> keywordsMap, Map<Locale, String> robotsMap, String type, boolean hidden, Map<Locale, String> friendlyURLMap, boolean iconImage, byte[] iconBytes) throws PortalException {

        _log.info("Updating layout ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_LAYOUT);

        _log.debug("    ... updating ...");

        com.liferay.portal.kernel.service.ServiceContext serviceContext = new com.liferay.portal.kernel.service.ServiceContext();
        serviceContext.setUserId(this.getGuestOrUserId());

        com.liferay.portal.kernel.model.Layout layout = LayoutLocalServiceUtil.updateLayout(groupId, privateLayout, layoutId, parentLayoutId, nameMap, titleMap, descriptionMap, keywordsMap, robotsMap, type, hidden, friendlyURLMap, iconImage, iconBytes, serviceContext);

        return layout;
    }

    @Override
    public Layout updateName(long layoutId, String name, String languageId) throws PortalException {

        _log.info("Updating name of layout with id "+layoutId);

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_LAYOUT);

        _log.debug("    ... updating ...");

        // TODO: Check if plId = layoutID; @see LayoutLocalServiceUtil#updateName
        com.liferay.portal.kernel.model.Layout layout = LayoutLocalServiceUtil.updateName(layoutId, name, languageId);

        return layout;
    }

    @Override
    public Layout updateFriendlyURL(long plid, String friendlyURL, String languageId) throws PortalException {

        _log.info("Updating friendlyUrl of layout with id "+plid);

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_LAYOUT);

        _log.debug("    ... updating ...");

        long userId = this.getGuestOrUserId();

        // TODO: Check if plId = layoutID; @see LayoutLocalServiceUtil#updateName
        com.liferay.portal.kernel.model.Layout layout = LayoutLocalServiceUtil.updateFriendlyURL(userId, plid, friendlyURL, languageId);

        return layout;
    }

    @Override
    public Layout updatePriority(long groupId, boolean privateLayout, long layoutId, int priority) throws PortalException {
        _log.info("Updating priority of layout with id "+layoutId+" within group with id "+groupId);

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_LAYOUT);

        _log.debug("    ... updating ...");

        com.liferay.portal.kernel.model.Layout layout = LayoutLocalServiceUtil.updatePriority(groupId, privateLayout, layoutId, priority);

        return layout;
    }

    @Override
    public void deleteLayout(long groupId) throws PortalException {

    }

    @Override
    public Layout updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, String themeId, String colorSchemeId, String css) throws PortalException {
        _log.info("Updating look and feel of layout with id "+layoutId+" within group with id "+groupId);

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_LAYOUT);

        _log.debug("    ... updating ...");

        com.liferay.portal.kernel.model.Layout layout = LayoutLocalServiceUtil.updateLookAndFeel(groupId, privateLayout, layoutId, themeId, colorSchemeId, css);

        return layout;
    }

    @Override
    public void updatePriorities(long groupId, boolean privateLayout) throws PortalException {

        _log.info("Updating group priorities of group with id "+groupId);

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_COMMUNITY);

        _log.debug("    ... updating ...");

        LayoutLocalServiceUtil.updatePriorities(groupId, privateLayout);
    }

    /*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularLayoutServiceUtil} to access the Layout remote service.
	 */
}
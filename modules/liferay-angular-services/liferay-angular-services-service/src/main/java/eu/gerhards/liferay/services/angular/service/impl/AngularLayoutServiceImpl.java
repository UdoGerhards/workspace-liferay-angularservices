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
import com.liferay.portal.kernel.model.Layout;
import eu.gerhards.liferay.services.angular.service.base.AngularLayoutServiceBaseImpl;

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
    @Override
    public Layout getLayoutbyId(long layoutId) throws PortalException {
        return null;
    }

    @Override
    public List<Layout> getLayouts(long groupId, boolean privateLayout) throws PortalException {
        return null;
    }

    @Override
    public void setLayouts(long groupId, boolean privateLayout, long parentLayoutId, long[] layoutIds) throws PortalException {

    }

    @Override
    public Layout createLayout(long userId, long groupId, boolean privateLayout, long parentLayoutId, Map<Locale, String> nameMap, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, Map<Locale, String> keywordsMap, Map<Locale, String> robotsMap, String type, String typeSettings, boolean hidden, Map<Locale, String> friendlyURLMap) throws PortalException {
        return null;
    }

    @Override
    public Layout updateLayout(long groupId, boolean privateLayout, long layoutId, long parentLayoutId, Map<Locale, String> nameMap, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, Map<Locale, String> keywordsMap, Map<Locale, String> robotsMap, String type, boolean hidden, Map<Locale, String> friendlyURLMap, boolean iconImage, byte[] iconBytes) throws PortalException {
        return null;
    }

    @Override
    public Layout updateName(long layoutId, String name, String languageId) {
        return null;
    }

    @Override
    public Layout updateFriendlyURL(long plid, String friendlyURL, String languageId) throws PortalException {
        return null;
    }

    @Override
    public Layout updatePriority(long layoutId, int priority) throws PortalException {
        return null;
    }

    @Override
    public void deleteLayout(long groupId) throws PortalException {

    }

    @Override
    public Layout updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, String themeId, String colorSchemeId, String css) {
        return null;
    }

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularLayoutServiceUtil} to access the Layout remote service.
	 */
}
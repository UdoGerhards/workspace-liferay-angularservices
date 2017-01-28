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

package eu.gerhards.liferay.services.angular.service.http;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import eu.gerhards.liferay.services.angular.service.AngularLayoutServiceUtil;

import java.rmi.RemoteException;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * {@link AngularLayoutServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularLayoutSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularLayout}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularLayoutSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularLayoutSoap
 * @see AngularLayoutServiceUtil
 * @generated
 */
@ProviderType
public class AngularLayoutServiceSoap {
	public static com.liferay.portal.kernel.model.Layout getLayoutbyId(
		long layoutId) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.getLayoutbyId(layoutId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.LayoutSoap[] getLayouts(
		long groupId, boolean privateLayout) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Layout> returnValue = AngularLayoutServiceUtil.getLayouts(groupId,
					privateLayout);

			return com.liferay.portal.kernel.model.LayoutSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void setLayouts(long groupId, boolean privateLayout,
		long parentLayoutId, long[] layoutIds) throws RemoteException {
		try {
			AngularLayoutServiceUtil.setLayouts(groupId, privateLayout,
				parentLayoutId, layoutIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Layout createLayout(
		long userId, long groupId, boolean privateLayout, long parentLayoutId,
		java.lang.String[] nameMapLanguageIds,
		java.lang.String[] nameMapValues,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues,
		java.lang.String[] keywordsMapLanguageIds,
		java.lang.String[] keywordsMapValues,
		java.lang.String[] robotsMapLanguageIds,
		java.lang.String[] robotsMapValues, java.lang.String type,
		java.lang.String typeSettings, boolean hidden,
		java.lang.String[] friendlyURLMapLanguageIds,
		java.lang.String[] friendlyURLMapValues) throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);
			Map<Locale, String> keywordsMap = LocalizationUtil.getLocalizationMap(keywordsMapLanguageIds,
					keywordsMapValues);
			Map<Locale, String> robotsMap = LocalizationUtil.getLocalizationMap(robotsMapLanguageIds,
					robotsMapValues);
			Map<Locale, String> friendlyURLMap = LocalizationUtil.getLocalizationMap(friendlyURLMapLanguageIds,
					friendlyURLMapValues);

			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.createLayout(userId,
					groupId, privateLayout, parentLayoutId, nameMap, titleMap,
					descriptionMap, keywordsMap, robotsMap, type, typeSettings,
					hidden, friendlyURLMap);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Layout updateLayout(
		long groupId, boolean privateLayout, long layoutId,
		long parentLayoutId, java.lang.String[] nameMapLanguageIds,
		java.lang.String[] nameMapValues,
		java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues,
		java.lang.String[] keywordsMapLanguageIds,
		java.lang.String[] keywordsMapValues,
		java.lang.String[] robotsMapLanguageIds,
		java.lang.String[] robotsMapValues, java.lang.String type,
		boolean hidden, java.lang.String[] friendlyURLMapLanguageIds,
		java.lang.String[] friendlyURLMapValues, boolean iconImage,
		byte[] iconBytes) throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);
			Map<Locale, String> keywordsMap = LocalizationUtil.getLocalizationMap(keywordsMapLanguageIds,
					keywordsMapValues);
			Map<Locale, String> robotsMap = LocalizationUtil.getLocalizationMap(robotsMapLanguageIds,
					robotsMapValues);
			Map<Locale, String> friendlyURLMap = LocalizationUtil.getLocalizationMap(friendlyURLMapLanguageIds,
					friendlyURLMapValues);

			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.updateLayout(groupId,
					privateLayout, layoutId, parentLayoutId, nameMap, titleMap,
					descriptionMap, keywordsMap, robotsMap, type, hidden,
					friendlyURLMap, iconImage, iconBytes);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Layout updateName(
		long layoutId, java.lang.String name, java.lang.String languageId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.updateName(layoutId,
					name, languageId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Layout updateFriendlyURL(
		long plid, java.lang.String friendlyURL, java.lang.String languageId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.updateFriendlyURL(plid,
					friendlyURL, languageId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Layout updatePriority(
			long groupId, boolean privateLayout, long layoutId, int priority) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.updatePriority(groupId, privateLayout, layoutId,
					priority);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteLayout(long groupId) throws RemoteException {
		try {
			AngularLayoutServiceUtil.deleteLayout(groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Layout updateLookAndFeel(
		long groupId, boolean privateLayout, long layoutId,
		java.lang.String themeId, java.lang.String colorSchemeId,
		java.lang.String css) throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Layout returnValue = AngularLayoutServiceUtil.updateLookAndFeel(groupId,
					privateLayout, layoutId, themeId, colorSchemeId, css);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularLayoutServiceSoap.class);
}
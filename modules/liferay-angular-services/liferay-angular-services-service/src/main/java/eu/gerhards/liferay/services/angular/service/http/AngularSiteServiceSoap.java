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
import eu.gerhards.liferay.services.angular.service.AngularSiteServiceUtil;

import java.rmi.RemoteException;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * {@link AngularSiteServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularSiteSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularSite}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularSiteSoap}. Methods that SOAP cannot
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
 * @see AngularSiteServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularSiteSoap
 * @see AngularSiteServiceUtil
 * @generated
 */
@ProviderType
public class AngularSiteServiceSoap {
	public static com.liferay.portal.kernel.model.GroupSoap[] getInstanceSites(
		long companyId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Group> returnValue = AngularSiteServiceUtil.getInstanceSites(companyId);

			return com.liferay.portal.kernel.model.GroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.GroupSoap[] getActiveSites(
		long companyId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Group> returnValue = AngularSiteServiceUtil.getActiveSites(companyId);

			return com.liferay.portal.kernel.model.GroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.GroupSoap[] getInactiveSites(
		long companyId) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.kernel.model.Group> returnValue = AngularSiteServiceUtil.getInactiveSites(companyId);

			return com.liferay.portal.kernel.model.GroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Group createSite(
		long parentSiteId, long liveGroupId,
		java.lang.String[] nameMapLanguageIds,
		java.lang.String[] nameMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, int type,
		boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active) throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.portal.kernel.model.Group returnValue = AngularSiteServiceUtil.createSite(parentSiteId,
					liveGroupId, nameMap, descriptionMap, type,
					manualMembership, membershipRestriction, friendlyURL, site,
					inheritContent, active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Group updateSite(
		long siteId, long parentSiteId, long liveGroupId,
		java.lang.String[] nameMapLanguageIds,
		java.lang.String[] nameMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, int type,
		boolean manualMembership, int membershipRestriction,
		java.lang.String friendlyURL, boolean site, boolean inheritContent,
		boolean active) throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.portal.kernel.model.Group returnValue = AngularSiteServiceUtil.updateSite(siteId,
					parentSiteId, liveGroupId, nameMap, descriptionMap, type,
					manualMembership, membershipRestriction, friendlyURL, site,
					inheritContent, active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteSite(long siteId) throws RemoteException {
		try {
			AngularSiteServiceUtil.deleteSite(siteId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularSiteServiceSoap.class);
}
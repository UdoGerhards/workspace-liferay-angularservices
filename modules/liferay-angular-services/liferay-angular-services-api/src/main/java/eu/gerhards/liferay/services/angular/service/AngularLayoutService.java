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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Locale;

/**
 * Provides the remote service interface for AngularLayout. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularLayoutServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularLayoutServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularLayout"}, service = AngularLayoutService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularLayoutService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularLayoutServiceUtil} to access the Layout remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularLayoutServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public com.liferay.portal.kernel.model.Layout getLayoutbyId(long layoutId) throws PortalException;

	public java.util.List<com.liferay.portal.kernel.model.Layout> getLayouts(long groupId, boolean privateLayout) throws PortalException;

	public void setLayouts(long groupId, boolean privateLayout, long parentLayoutId, long[] layoutIds) throws PortalException;

	public com.liferay.portal.kernel.model.Layout createLayout(long userId, long groupId, boolean privateLayout, long parentLayoutId, java.util.Map<Locale,String> nameMap, java.util.Map<Locale,String> titleMap, java.util.Map<Locale,String> descriptionMap, java.util.Map<Locale,String> keywordsMap, java.util.Map<Locale,String> robotsMap, String type, String typeSettings, boolean hidden, java.util.Map<Locale,String> friendlyURLMap) throws PortalException;

	public com.liferay.portal.kernel.model.Layout updateLayout(long groupId, boolean privateLayout, long layoutId, long parentLayoutId, java.util.Map<Locale,String> nameMap, java.util.Map<Locale,String> titleMap, java.util.Map<Locale,String> descriptionMap, java.util.Map<Locale,String> keywordsMap, java.util.Map<Locale,String> robotsMap, String type, boolean hidden, java.util.Map<Locale,String> friendlyURLMap, boolean iconImage, byte[] iconBytes) throws PortalException;

	public com.liferay.portal.kernel.model.Layout updateName(long layoutId, String name, String languageId);

	public com.liferay.portal.kernel.model.Layout updateFriendlyURL(long plid, String friendlyURL, String languageId) throws PortalException;

	public com.liferay.portal.kernel.model.Layout updatePriority(long layoutId, int priority) throws PortalException;

	public void deleteLayout(long groupId) throws PortalException;

	public com.liferay.portal.kernel.model.Layout updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, String themeId, String colorSchemeId, String css);
}
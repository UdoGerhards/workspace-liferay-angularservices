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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Locale;
import java.util.Map;

/**
 * Provides the remote service interface for AngularSite. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularSiteServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularSiteServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularSiteServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularSite"}, service = AngularSiteService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularSiteService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularSiteServiceUtil} to access the Site remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularSiteServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Group> getActiveSites(long companyId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Group> getInactiveSites(long companyId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Group> getInstanceSites(long companyId)
			throws PortalException;

	public Group createSite(long parentSiteId, long liveGroupId,
							 Map<Locale, String> nameMap,
							 Map<Locale, java.lang.String> descriptionMap, int type,
							 boolean manualMembership, int membershipRestriction,
							 java.lang.String friendlyURL, boolean site, boolean inheritContent,
							 boolean active) throws PortalException;

	public Group updateSite(long siteId, long parentSiteId,
							 long liveGroupId, Map<Locale, java.lang.String> nameMap,
							 Map<Locale, java.lang.String> descriptionMap, int type,
							 boolean manualMembership, int membershipRestriction,
							 java.lang.String friendlyURL, boolean site, boolean inheritContent,
							 boolean active) throws PortalException;

	public void deleteSite(long siteId) throws PortalException;

}
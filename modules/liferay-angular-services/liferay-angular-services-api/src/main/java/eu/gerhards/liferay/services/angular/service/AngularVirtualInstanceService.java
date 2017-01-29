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
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for AngularVirtualInstance. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstanceServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularVirtualInstanceServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularVirtualInstance"}, service = AngularVirtualInstanceService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularVirtualInstanceService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularVirtualInstanceServiceUtil} to access the Virtual instance remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Company createVirtualInstance(java.lang.String webId,
		java.lang.String virtualHostname, java.lang.String mx, boolean system,
		int maxUsers, boolean active) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Company getVirtualInstance(long companyId) throws PortalException;

	public Company updateLogo(long companyId, byte[] bytes)
		throws PortalException;

	public Company updateVirtualInstance(long companyId,
		java.lang.String virtualHostname, java.lang.String mx, int maxUsers,
		boolean active) throws PortalException;

	public Company updateVirtualInstanceExtended(long companyId,
		java.lang.String virtualHostname, java.lang.String mx,
		java.lang.String homeUrl, boolean logo, byte[] logoBytes,
		java.lang.String name, java.lang.String legalName,
		java.lang.String legalId, java.lang.String legalType,
		java.lang.String sicCode, java.lang.String tickerSymbol,
		java.lang.String industry, java.lang.String type, java.lang.String size)
		throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Company> getAvailableInstances() throws PortalException;

	public void deleteCompanyLogo(long companyId) throws PortalException;

	public void deleteVirtualInstance(long companyId) throws PortalException;

	public void updateCompanySecurity(long companyId,
		java.lang.String authType, boolean autoLogin, boolean sendPassword,
		boolean strangers, boolean strangesWithMx, boolean strangersVerify,
		boolean siteLogo) throws PortalException;
}
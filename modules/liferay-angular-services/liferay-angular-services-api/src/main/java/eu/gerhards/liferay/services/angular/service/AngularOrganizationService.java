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
import com.liferay.portal.kernel.jsonwebservice.JSONWebServiceMode;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for AngularOrganization. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularOrganizationServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularOrganizationServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularOrganization"}, service = AngularOrganizationService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularOrganizationService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularOrganizationServiceUtil} to access the Organization remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularOrganizationServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Organization getOrganization(long organizationId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Address> getOrganizationAdresses(long organizationId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<EmailAddress> getOrganizationEmailAddresses(long organizationId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Phone> getOrganizationPhones(long organizationId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User> getOrganizationUsers(long organizationId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Website> getOrganizationWebsites(long organizationId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Organization createOrganization(String name, String type, long regionId, long countryId, long statusId, String comment, boolean site, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Organization updateOrganization(long organizationId, String name, String type, long regionId, long countryId, long statusId, String comment, boolean site, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Organization deleteOrganization(long organizationId) throws PortalException;

	/**
	 * Sercurity check for assigned organizations
	 *
	 * @param userId
	 * @param organizationIds
	 * @throws PortalException
	 */
	@JSONWebService(mode= JSONWebServiceMode.IGNORE)
	public long[] checkOrganizations(long userId, long[] organizationIds) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();
}
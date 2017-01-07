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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the remote service interface for AngularGroup. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularGroupServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularGroup"}, service = AngularGroupService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularGroupService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularGroupServiceUtil} to access the Group remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularGroupServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public List<Group> getActiveGroups(long companyId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Group> getInactiveGroups(long companyId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Group> getInstanceGroups(long companyId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Group createGroup(long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Group updateGroup(long groupId, long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active)  throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void deleteGroup(long groupId) throws PortalException;

	@JSONWebService(mode = JSONWebServiceMode.IGNORE)
	public long[] checkGroups(long userId, long[] groupIds) throws PortalException;
}
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

	/**
	 * Method getActiveGroups
	 *
	 * Gets all active groups within a given company identified by companyId.
	 *
	 * @apiNote Needs right "LIST_GROUPS" to be activate in the control panel. @see AngularActionKeys#LIST_GROUPS
	 *
	 * @param companyId
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(method="GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Group> getActiveGroups(long companyId) throws PortalException;

	/**
	 * Method getInactiveGroups
	 *
	 * Gets all inactive groups within a given company identified by companyId.
	 *
	 * @apiNote Needs right "LIST_GROUPS" to be activate in the control panel. @see AngularActionKeys#LIST_GROUPS
	 *
	 * @param companyId
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(method="GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Group> getInactiveGroups(long companyId) throws PortalException;

	/**
	 * Method getInstanceGroups
	 *
	 * Gets all the groups of a company identified by companyId.
	 *
	 * @apiNote Needs right "LIST_GROUPS" to be activate in the control panel. @see AngularActionKeys#LIST_GROUPS
	 *
	 * @param companyId
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(method="GET")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Group> getInstanceGroups(long companyId) throws PortalException;

	/**
	 * Method createGroups
	 *
	 * Creates a new site in the portal.
	 *
	 * @apiNote Needs right "ADD_COMMUNITY" to be activate in the control panel. @see ActionKeys#ADD_COMMUNITY
	 *
	 * @param parentGroupId
	 * @param liveGroupId
	 * @param nameMap
	 * @param descriptionMap
	 * @param type
	 * @param manualMembership
	 * @param membershipRestriction
	 * @param friendlyURL
	 * @param site
	 * @param inheritContent
	 * @param active
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(method="POST")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Group createGroup(long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException;

	/**
	 * Method updateGroup
	 *
	 * Updates a given group
	 *
	 * @apiNote Needs right "UPDATE_COMMUNITY" to be activate in the control panel. @see AAngularActionKeys#UPDATE_COMMUNITY
	 *
	 * @param groupId
	 * @param parentGroupId
	 * @param liveGroupId
	 * @param nameMap
	 * @param descriptionMap
	 * @param type
	 * @param manualMembership
	 * @param membershipRestriction
	 * @param friendlyURL
	 * @param site
	 * @param inheritContent
	 * @param active
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(method="PUT")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Group updateGroup(long groupId, long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active)  throws PortalException;

	/**
	 * Method deleteGroup
	 *
	 * Deletes a group identified by the given groupID
	 *
	 * @apiNote Needs right "DELETE_COMMUNITY" to be activate in the control panel. @see AngularActionKeys.DELETE_COMMUNITY
	 *
	 * @param groupId
	 * @throws PortalException
	 */
	@JSONWebService(method="DELETE")
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void deleteGroup(long groupId) throws PortalException;

	@JSONWebService(mode = JSONWebServiceMode.IGNORE)
	public long[] checkGroups(long userId, long[] groupIds) throws PortalException;
}
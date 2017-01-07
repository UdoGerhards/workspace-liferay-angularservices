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
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.UserGroupRole;
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
 * Provides the remote service interface for AngularRole. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularRoleServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularRoleServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularRoleServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularRole"}, service = AngularRoleService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularRoleService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularRoleServiceUtil} to access the Role remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularRoleServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Method getOrganizationRoles
	 *
	 * Gets the organization roles for a given company
	 *
	 * @param companyId
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Role> getOrganizationRoles(long companyId);

	/**
	 * Method getRegularRoles
	 *
	 * Get the regular roles for a given company
	 *
	 * @param companyId
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Role> getRegularRoles(long companyId);

	/**
	 * Method getRolesInCompany
	 *
	 * Gets all roles in a dedicated company no matter of their type
	 *
	 * @param companyId
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Role> getRolesInCompany(long companyId);

	/**
	 * Method getSiteRoles
	 *
	 * Gets the site roles for a given company
	 *
	 * @param companyId
	 * @return
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Role> getSiteRoles(long companyId);

	/**
	 * Method create Role
	 *
	 * Creates a new role in the system
	 *
	 * @param name
	 * @param type
	 * @param className
	 * @param titleMap
	 * @param descriptionMap
	 * @param subType
	 * @return
	 * @throws PortalException
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Role createRole(String name, int type, String className, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String subType) throws PortalException;

	/**
	 * Method updateRole
	 *
	 * Updates an existing role in the system
	 *
	 * @param roleId
	 * @param name
	 * @param type
	 * @param className
	 * @param titleMap
	 * @param descriptionMap
	 * @param subType
	 * @return
	 * @throws PortalException
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Role updateRole(long roleId, String name, int type, String className, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String subType) throws PortalException;

	/**
	 * Method deleteRole
	 *
	 * Deletes an existing role from the system
	 *
	 * @param roleId
	 * @return
	 * @throws PortalException
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Role deleteRole(long roleId) throws PortalException;

	/**
	 * Method checkRoles
	 *
	 * Checks if given role ids can be modified. If the user ID is given also the roles of this user will be checked.
	 * This method is normally used if you want either to create a new user and assign roles to him or if you want to adapt the given roles of an existing user.
	 *
	 * @param userId
	 * @param roleIds
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(mode=JSONWebServiceMode.IGNORE)
	public long[] checkRoles(long userId, long[] roleIds) throws PortalException;

	/**
	 * Method getUserGroupRoles
	 *
	 * Checks if given role ids can be modified. If the user ID is given also the roles of this user will be checked.
	 * This method is normally used if you want either to create a new user and assign roles to him or if you want to adapt the given roles of an existing user.
	 *
	 * @param userId
	 * @param userGroupRoles
	 * @return
	 * @throws PortalException
	 */
	@JSONWebService(mode=JSONWebServiceMode.IGNORE)
	public List<UserGroupRole> checkUserGroupRoles(long userId, List<UserGroupRole> userGroupRoles) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();
}
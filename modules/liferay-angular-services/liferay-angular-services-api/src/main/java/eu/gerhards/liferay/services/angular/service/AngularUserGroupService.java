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
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for AngularUserGroup. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularUserGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularUserGroupServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularUserGroup"}, service = AngularUserGroupService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularUserGroupService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularUserGroupServiceUtil} to access the User group remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularUserGroupServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasPermission(long userGroupId, java.lang.String actionId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasTeamUserGroups(long teamId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserUserGroups(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isUserGroupMemberOfTeam(long teamId, long userGroupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isUserMemberOfUserGroup(long userId, long userGroupId)
		throws PortalException;

	public UserGroup createUserGroup(long userId, long companyId,
		java.lang.String name, java.lang.String description)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public UserGroup getUserGroup(long userGroupId) throws PortalException;

	public UserGroup updateUserGroup(long companyId, long userGroupId,
		java.lang.String name, java.lang.String description)
		throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<UserGroup> getTeamUserGroups(long teamId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User> getUserGroupUsers(long userGroupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<UserGroup> getUserGroups(long[] userGroupIds)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<UserGroup> getUserGroupsInCompany(long companyId);

	public long[] checkUserGroupIds(long userId, long[] userGroupIds)
		throws PortalException;

	public void assignTeamUserGroup(long teamId, long userGroupId)
		throws PortalException;

	public void assignTeamUserGroups(long teamId, long[] userGroupIds)
		throws PortalException;

	public void assignUserUserGroup(long userId, long userGroupId)
		throws PortalException;

	public void assignUserUserGroups(long userId, long[] userGroupIds)
		throws PortalException;

	public void deleteUserGroup(long userGroupId) throws PortalException;

	public void deleteUserGroups(long[] userGroupIds) throws PortalException;

	public void removeTeamUserGroup(long teamId, long userGroupId)
		throws PortalException;

	public void removeTeamUserGroups(long teamId, long[] userGroupIds)
		throws PortalException;

	public void removeUserUserGroup(long userId, long userGroupId)
		throws PortalException;

	public void removeUserUserGroups(long userId, long[] userGroupIds)
		throws PortalException;
}
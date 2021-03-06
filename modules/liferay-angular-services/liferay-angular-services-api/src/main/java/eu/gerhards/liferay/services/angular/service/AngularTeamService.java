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
import com.liferay.portal.kernel.model.Team;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for AngularTeam. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularTeamServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularTeamServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularTeam"}, service = AngularTeamService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularTeamService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularTeamServiceUtil} to access the Team remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularTeamServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasPermission(long teamId, java.lang.String actionId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserGroupTeam(long userGroupId, long teamId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserGroupTeams(long userGroupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserTeam(long userId, long teamId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasUserTeams(long userId) throws PortalException;

	public Team createTeam(long userId, long groupId, java.lang.String name,
		java.lang.String description) throws PortalException;

	public Team deleteTeam(long teamId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Team getTeam(long teamId) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Team> getTeamsForUserGroup(long userGroupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Team> getUserTeams(long userId) throws PortalException;

	public void assignUserGroupTeam(long userGroupId, long teamId)
		throws PortalException;

	public void assignUserGroupTeams(long userGroupId, List<Team> teams)
		throws PortalException;

	public void assignUserGroupTeams(long userGroupId, long[] teamIds)
		throws PortalException;

	public void assignUserToTeam(long userId, long teamId)
		throws PortalException;

	public void assignUserToTeams(long userId, List<Team> teams)
		throws PortalException;

	public void assignUserToTeams(long userId, long[] teamIds)
		throws PortalException;

	public void deleteUserGroupTeams(long userGroupId, long[] teamIds)
		throws PortalException;

	public void deleteUserTeam(long userId, long teamId)
		throws PortalException;
}
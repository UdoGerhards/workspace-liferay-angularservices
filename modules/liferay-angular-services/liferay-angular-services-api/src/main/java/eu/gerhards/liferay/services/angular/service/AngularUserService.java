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
import com.liferay.announcements.kernel.model.AnnouncementsDelivery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for AngularUser. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserServiceUtil
 * @see eu.gerhards.liferay.services.angular.service.base.AngularUserServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularUserServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(property =  {
	"json.web.service.context.name=angularservices", "json.web.service.context.path=AngularUser"}, service = AngularUserService.class)
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AngularUserService extends BaseService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularUserServiceUtil} to access the User remote service. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularUserServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Address updateUserAddress(long userId, long addressId,
		java.lang.String street1, java.lang.String street2,
		java.lang.String street3, java.lang.String city, java.lang.String zip,
		long regionId, long countryId, long typeId, boolean shipping,
		boolean primary) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Contact getUserContact(long userId) throws PortalException;

	public User addNewUser(java.lang.String screenName,
		java.lang.String emailAddress, long companyId, java.lang.String locale,
		long[] groupIds, long[] organizationIds, long[] roleIds,
		long[] userGroupIds) throws PortalException;

	public User deleteUserByEmail(java.lang.String emailAddress)
		throws PortalException;

	public User deleteUserById(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User getUser(long userId) throws PortalException;

	public User updateUser(long userId, java.lang.String oldPassword,
		java.lang.String newPassword1, java.lang.String newPassword2,
		boolean passwordReset, java.lang.String reminderQueryQuestion,
		java.lang.String reminderQueryAnswer, java.lang.String screenName,
		java.lang.String emailAddress, long facebookId,
		java.lang.String openId, boolean portrait, byte[] portraitBytes,
		java.lang.String languageId, java.lang.String timeZoneId,
		java.lang.String greeting, java.lang.String comments,
		java.lang.String firstName, java.lang.String middleName,
		java.lang.String lastName, long prefixId, long suffixId, boolean male,
		int birthdayMonth, int birthdayDay, int birthdayYear,
		java.lang.String smsSn, java.lang.String facebookSn,
		java.lang.String jabberSn, java.lang.String skypeSn,
		java.lang.String twitterSn, java.lang.String jobTitle, long[] groupIds,
		long[] organizationIds, long[] roleIds,
		java.util.List<UserGroupRole> userGroupRoles, long[] userGroupIds,
		java.util.List<Address> addresses,
		java.util.List<EmailAddress> emailAddresses,
		java.util.List<Phone> phones, java.util.List<Website> websites,
		java.util.List<AnnouncementsDelivery> announcementsDelivers,
		ServiceContext serviceContext) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<User> getCompanyUsers(long companyId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Address> getUserAddress(long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<EmailAddress> getUserEmailAddresses(long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Group> getUserGroups(long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Group> getUserSites(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Organization> getUserOrganizations(long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Phone> getUserPhones(long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Role> getUserRoles(long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<Website> getUserWebsites(long userId)
		throws PortalException;

	public void updateUserEmailAddresses(long userId,
		java.util.List<EmailAddress> emailAddresses) throws PortalException;

	public void updateUserOrganizations(long userId, long[] organizationIds)
		throws PortalException;

	public void updateUserPhones(long userId, long[] phones)
		throws PortalException;

	public void updateUserRoles(long userId, long[] roleIds)
		throws PortalException;

	public void updateUserUserGroups(long userId, long[] userGroupIds)
		throws PortalException;

	public void updateUserWebsites(long userId, java.util.List<Website> website)
		throws PortalException;
}
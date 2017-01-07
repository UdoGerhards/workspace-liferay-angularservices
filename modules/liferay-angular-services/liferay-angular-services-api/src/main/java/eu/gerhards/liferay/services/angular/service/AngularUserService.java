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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Contact getUserContact(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User getUser(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User> getCompanyUsers(long companyId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Address> getUserAddress(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<EmailAddress> getUserEmailAddresses(long userId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Group> getUserGroups(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Organization> getUserOrganizations(long userId)
			throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Phone> getUserPhones(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Role> getUserRoles(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Website> getUserWebsites(long userId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User addNewUser(String screenName, String emailAddress, long companyId, String locale, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void updateUserUserGroups(long userId, long[] userGroupIds) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void updateUserPhones(long userId, long[] phones) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void updateUserWebsites(long userId, List<Website> website) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void updateUserOrganizations(long userId, long[] organizationIds) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void updateUserEmailAddresses(long userId, List<EmailAddress> emailAddresses) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Address updateUserAddress(long userId, long addressId, String street1, String street2, String street3, String city, String zip, long regionId, long countryId, long typeId, boolean shipping, boolean primary) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public void updateUserRoles(long userId, long[] roleIds) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User updateUser(long userId, String oldPassword, String newPassword1,
						   String newPassword2, boolean passwordReset,
						   String reminderQueryQuestion, String reminderQueryAnswer,
						   String screenName, String emailAddress, long facebookId,
						   String openId, boolean portrait, byte[] portraitBytes,
						   String languageId, String timeZoneId, String greeting,
						   String comments, String firstName, String middleName,
						   String lastName, long prefixId, long suffixId, boolean male,
						   int birthdayMonth, int birthdayDay, int birthdayYear, String smsSn,
						   String facebookSn, String jabberSn, String skypeSn,
						   String twitterSn, String jobTitle, long[] groupIds,
						   long[] organizationIds, long[] roleIds,
						   List<UserGroupRole> userGroupRoles, long[] userGroupIds,
						   List<Address> addresses, List<EmailAddress> emailAddresses,
						   List<Phone> phones, List<Website> websites,
						   List<AnnouncementsDelivery> announcementsDelivers,
						   ServiceContext serviceContext) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User deleteUserByEmail(String emailAddress) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public User deleteUserById(long userId) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();


}
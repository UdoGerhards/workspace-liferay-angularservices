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
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.List;

/**
 * Provides a wrapper for {@link AngularUserService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserService
 * @generated
 */
@ProviderType
public class AngularUserServiceWrapper implements AngularUserService,
	ServiceWrapper<AngularUserService> {
	public AngularUserServiceWrapper(AngularUserService angularUserService) {
		_angularUserService = angularUserService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularUserService.getOSGiServiceIdentifier();
	}

	@Override
	public AngularUserService getWrappedService() {
		return _angularUserService;
	}

	@Override
	public void setWrappedService(AngularUserService angularUserService) {
		_angularUserService = angularUserService;
	}

	@Override
	public Contact getUserContact(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserContact(userId);
	}

	@Override
	public User getUser(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUser(userId);
	}

	@Override
	public java.util.List<User> getCompanyUsers(long companyId) {
		return _angularUserService.getCompanyUsers(companyId);
	}

	@Override
	public java.util.List<Address> getUserAddress(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserAddress(userId);
	}

	@Override
	public java.util.List<EmailAddress> getUserEmailAddresses(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserEmailAddresses(userId);
	}

	@Override
	public java.util.List<Group> getUserGroups(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserGroups(userId);
	}

	@Override
	public java.util.List<Organization> getUserOrganizations(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserOrganizations(userId);
	}

	@Override
	public java.util.List<Phone> getUserPhones(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserPhones(userId);
	}

	@Override
	public java.util.List<Role> getUserRoles(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserRoles(userId);
	}

	@Override
	public java.util.List<Website> getUserWebsites(long userId)
			throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserWebsites(userId);
	}

	@Override
	public User updateUser(long userId, String oldPassword, String newPassword1, String newPassword2, boolean passwordReset, String reminderQueryQuestion, String reminderQueryAnswer, String screenName, String emailAddress, long facebookId, String openId, boolean portrait, byte[] portraitBytes, String languageId, String timeZoneId, String greeting, String comments, String firstName, String middleName, String lastName, long prefixId, long suffixId, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String smsSn, String facebookSn, String jabberSn, String skypeSn, String twitterSn, String jobTitle, long[] groupIds, long[] organizationIds, long[] roleIds, List<UserGroupRole> userGroupRoles, long[] userGroupIds, List<Address> addresses, List<EmailAddress> emailAddresses, List<Phone> phones, List<Website> websites, List<AnnouncementsDelivery> announcementsDelivers, ServiceContext serviceContext) throws PortalException {
		return _angularUserService.updateUser(userId,oldPassword,newPassword1,newPassword2,passwordReset,reminderQueryQuestion,reminderQueryAnswer,screenName,emailAddress,facebookId,openId,portrait,portraitBytes,languageId,timeZoneId,greeting,comments,firstName,middleName,lastName,prefixId,suffixId,male,birthdayMonth,birthdayDay,birthdayYear,smsSn,facebookSn,jabberSn,skypeSn, twitterSn,jobTitle,groupIds,organizationIds,roleIds,userGroupRoles,groupIds,addresses,emailAddresses,phones,websites,announcementsDelivers,serviceContext);
	}

	@Override
	public void updateUserUserGroups(long userId, long[] userGroupIds) throws PortalException {
		_angularUserService.updateUserUserGroups(userId, userGroupIds);
	}

	@Override
	public void updateUserPhones(long userId, long[] phones) throws PortalException {
		_angularUserService.updateUserPhones(userId, phones);
	}

	@Override
	public void updateUserWebsites(long userId, List<Website> website) throws PortalException {
		_angularUserService.updateUserWebsites(userId, website);
	}

	@Override
	public void updateUserOrganizations(long userId, long[] organizationIds) throws PortalException {
		_angularUserService.updateUserOrganizations(userId, organizationIds);
	}

	@Override
	public void updateUserEmailAddresses(long userId, List<EmailAddress> emailAddresses) throws PortalException {
		_angularUserService.updateUserEmailAddresses(userId, emailAddresses);
	}

	@Override
	public Address updateUserAddress(long userId, long addressId, String street1, String street2, String street3, String city, String zip, long regionId, long countryId, long typeId, boolean shipping, boolean primary) throws PortalException {
		return _angularUserService.updateUserAddress(userId, addressId, street1, street2, street3 , city , zip, regionId , countryId , typeId , shipping , primary);
	}

	@Override
	public void updateUserRoles(long userId, long[] roleIds) throws PortalException {
		_angularUserService.updateUserRoles(userId, roleIds);
	}

	@Override
	public User addNewUser(String screenName, String emailAddress, long companyId, String locale, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds) throws PortalException {
		return _angularUserService.addNewUser(null, null, 0, "en_EN", null, null, null, null);
	}

	@Override
	public User deleteUserByEmail(String emailAddress) throws PortalException {
		return _angularUserService.deleteUserByEmail(emailAddress);
	}

	@Override
	public User deleteUserById(long userId) throws PortalException {
		return _angularUserService.deleteUserById(userId);
	}

	private AngularUserService _angularUserService;
}
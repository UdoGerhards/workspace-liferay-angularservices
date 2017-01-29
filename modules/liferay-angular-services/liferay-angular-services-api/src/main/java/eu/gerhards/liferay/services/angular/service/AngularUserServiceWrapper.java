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
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

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

	@Override
	public Address updateUserAddress(long userId, long addressId,
		java.lang.String street1, java.lang.String street2,
		java.lang.String street3, java.lang.String city, java.lang.String zip,
		long regionId, long countryId, long typeId, boolean shipping,
		boolean primary)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.updateUserAddress(userId, addressId,
			street1, street2, street3, city, zip, regionId, countryId, typeId,
			shipping, primary);
	}

	@Override
	public Contact getUserContact(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserContact(userId);
	}

	@Override
	public User addNewUser(java.lang.String screenName,
		java.lang.String emailAddress, long companyId, java.lang.String locale,
		long[] groupIds, long[] organizationIds, long[] roleIds,
		long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.addNewUser(screenName, emailAddress,
			companyId, locale, groupIds, organizationIds, roleIds, userGroupIds);
	}

	@Override
	public User deleteUserByEmail(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.deleteUserByEmail(emailAddress);
	}

	@Override
	public User deleteUserById(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.deleteUserById(userId);
	}

	@Override
	public User getUser(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUser(userId);
	}

	@Override
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
						   java.util.List<com.liferay.announcements.kernel.model.AnnouncementsDelivery> announcementsDelivers,
						   ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.updateUser(userId, oldPassword,
			newPassword1, newPassword2, passwordReset, reminderQueryQuestion,
			reminderQueryAnswer, screenName, emailAddress, facebookId, openId,
			portrait, portraitBytes, languageId, timeZoneId, greeting,
			comments, firstName, middleName, lastName, prefixId, suffixId,
			male, birthdayMonth, birthdayDay, birthdayYear, smsSn, facebookSn,
			jabberSn, skypeSn, twitterSn, jobTitle, groupIds, organizationIds,
			roleIds, userGroupRoles, userGroupIds, addresses, emailAddresses,
			phones, websites, announcementsDelivers, serviceContext);
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
	public java.util.List<User> getCompanyUsers(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
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
	public java.util.List<Group> getUserSites(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserSites(userId);
	}

	@Override
	public java.util.List<Website> getUserWebsites(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserService.getUserWebsites(userId);
	}

	@Override
	public void updateUserEmailAddresses(long userId,
		java.util.List<EmailAddress> emailAddresses)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserService.updateUserEmailAddresses(userId, emailAddresses);
	}

	@Override
	public void updateUserOrganizations(long userId, long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserService.updateUserOrganizations(userId, organizationIds);
	}

	@Override
	public void updateUserPhones(long userId, long[] phones)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserService.updateUserPhones(userId, phones);
	}

	@Override
	public void updateUserRoles(long userId, long[] roleIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserService.updateUserRoles(userId, roleIds);
	}

	@Override
	public void updateUserUserGroups(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserService.updateUserUserGroups(userId, userGroupIds);
	}

	@Override
	public void updateUserWebsites(long userId, java.util.List<Website> website)
		throws com.liferay.portal.kernel.exception.PortalException {
		_angularUserService.updateUserWebsites(userId, website);
	}

	@Override
	public AngularUserService getWrappedService() {
		return _angularUserService;
	}

	@Override
	public void setWrappedService(AngularUserService angularUserService) {
		_angularUserService = angularUserService;
	}

	private AngularUserService _angularUserService;
}
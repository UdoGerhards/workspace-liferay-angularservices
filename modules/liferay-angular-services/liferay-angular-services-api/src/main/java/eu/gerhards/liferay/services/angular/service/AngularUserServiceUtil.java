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
import com.liferay.osgi.util.ServiceTrackerFactory;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AngularUser. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularUserServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularUserServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularUserServiceImpl
 * @generated
 */
@ProviderType
public class AngularUserServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularUserServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static Address updateUserAddress(long userId, long addressId,
		java.lang.String street1, java.lang.String street2,
		java.lang.String street3, java.lang.String city, java.lang.String zip,
		long regionId, long countryId, long typeId, boolean shipping,
		boolean primary)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateUserAddress(userId, addressId, street1, street2,
			street3, city, zip, regionId, countryId, typeId, shipping, primary);
	}

	public static Contact getUserContact(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserContact(userId);
	}

	public static User addNewUser(java.lang.String screenName,
		java.lang.String emailAddress, long companyId, java.lang.String locale,
		long[] groupIds, long[] organizationIds, long[] roleIds,
		long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addNewUser(screenName, emailAddress, companyId, locale,
			groupIds, organizationIds, roleIds, userGroupIds);
	}

	public static User deleteUserByEmail(java.lang.String emailAddress)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteUserByEmail(emailAddress);
	}

	public static User deleteUserById(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteUserById(userId);
	}

	public static User getUser(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUser(userId);
	}

	public static User updateUser(long userId, java.lang.String oldPassword,
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
		return getService()
				   .updateUser(userId, oldPassword, newPassword1, newPassword2,
			passwordReset, reminderQueryQuestion, reminderQueryAnswer,
			screenName, emailAddress, facebookId, openId, portrait,
			portraitBytes, languageId, timeZoneId, greeting, comments,
			firstName, middleName, lastName, prefixId, suffixId, male,
			birthdayMonth, birthdayDay, birthdayYear, smsSn, facebookSn,
			jabberSn, skypeSn, twitterSn, jobTitle, groupIds, organizationIds,
			roleIds, userGroupRoles, userGroupIds, addresses, emailAddresses,
			phones, websites, announcementsDelivers, serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<User> getCompanyUsers(long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCompanyUsers(companyId);
	}

	public static java.util.List<Address> getUserAddress(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserAddress(userId);
	}

	public static java.util.List<EmailAddress> getUserEmailAddresses(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserEmailAddresses(userId);
	}

	public static java.util.List<Group> getUserGroups(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserGroups(userId);
	}

	public static java.util.List<Organization> getUserOrganizations(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserOrganizations(userId);
	}

	public static java.util.List<Phone> getUserPhones(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserPhones(userId);
	}

	public static java.util.List<Role> getUserRoles(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserRoles(userId);
	}

	public static java.util.List<Website> getUserWebsites(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserWebsites(userId);
	}

	public static void updateUserEmailAddresses(long userId,
		java.util.List<EmailAddress> emailAddresses)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserEmailAddresses(userId, emailAddresses);
	}

	public static void updateUserOrganizations(long userId,
		long[] organizationIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserOrganizations(userId, organizationIds);
	}

	public static void updateUserPhones(long userId, long[] phones)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserPhones(userId, phones);
	}

	public static void updateUserRoles(long userId, long[] roleIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserRoles(userId, roleIds);
	}

	public static void updateUserUserGroups(long userId, long[] userGroupIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserUserGroups(userId, userGroupIds);
	}

	public static void updateUserWebsites(long userId,
		java.util.List<Website> website)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserWebsites(userId, website);
	}

	public static AngularUserService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularUserService, AngularUserService> _serviceTracker =
		ServiceTrackerFactory.open(AngularUserService.class);
}
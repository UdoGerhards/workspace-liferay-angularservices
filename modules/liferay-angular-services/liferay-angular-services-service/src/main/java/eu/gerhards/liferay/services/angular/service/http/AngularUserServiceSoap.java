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

package eu.gerhards.liferay.services.angular.service.http;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.*;
import eu.gerhards.liferay.services.angular.service.AngularUserServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link AngularUserServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularUserSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularUser}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularUserSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularUserSoap
 * @see AngularUserServiceUtil
 * @generated
 */
@ProviderType
public class AngularUserServiceSoap {
	public static User getUser(long userId) throws RemoteException {
		try {
			User returnValue = AngularUserServiceUtil.getUser(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static AddressSoap[] getUserAddress(long userId)
		throws RemoteException {
		try {
			java.util.List<Address> returnValue = AngularUserServiceUtil.getUserAddress(userId);

			return AddressSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static EmailAddressSoap[] getUserEmailAddresses(long userId)
		throws RemoteException {
		try {
			java.util.List<EmailAddress> returnValue = AngularUserServiceUtil.getUserEmailAddresses(userId);

			return EmailAddressSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static PhoneSoap[] getUserPhones(long userId)
		throws RemoteException {
		try {
			java.util.List<Phone> returnValue = AngularUserServiceUtil.getUserPhones(userId);

			return PhoneSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static WebsiteSoap[] getUserWebsites(long userId)
		throws RemoteException {
		try {
			java.util.List<Website> returnValue = AngularUserServiceUtil.getUserWebsites(userId);

			return WebsiteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Contact getUserContact(long userId) throws RemoteException {
		try {
			Contact returnValue = AngularUserServiceUtil.getUserContact(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static OrganizationSoap[] getUserOrganizations(long userId)
		throws RemoteException {
		try {
			java.util.List<Organization> returnValue = AngularUserServiceUtil.getUserOrganizations(userId);

			return OrganizationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static GroupSoap[] getUserGroups(long userId)
		throws RemoteException {
		try {
			java.util.List<Group> returnValue = AngularUserServiceUtil.getUserGroups(userId);

			return GroupSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static RoleSoap[] getUserRoles(long userId)
		throws RemoteException {
		try {
			java.util.List<Role> returnValue = AngularUserServiceUtil.getUserRoles(userId);

			return RoleSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static UserSoap[] getCompanyUsers(long companyId)
		throws RemoteException {
		try {
			java.util.List<User> returnValue = AngularUserServiceUtil.getCompanyUsers(companyId);

			return UserSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateUserOrganizations(long userId,
		long[] organizationIds) throws RemoteException {
		try {
			AngularUserServiceUtil.updateUserOrganizations(userId,
				organizationIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateUserPhones(long userId, long[] phones)
		throws RemoteException {
		try {
			AngularUserServiceUtil.updateUserPhones(userId, phones);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateUserWebsites(long userId,
		java.util.List<Website> website) throws RemoteException {
		try {
			AngularUserServiceUtil.updateUserWebsites(userId, website);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateUserEmailAddresses(long userId,
		java.util.List<EmailAddress> emailAddresses) throws RemoteException {
		try {
			AngularUserServiceUtil.updateUserEmailAddresses(userId,
				emailAddresses);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Address updateUserAddress(long userId, long addressId,
		java.lang.String street1, java.lang.String street2,
		java.lang.String street3, java.lang.String city, java.lang.String zip,
		long regionId, long countryId, long typeId, boolean shipping,
		boolean primary) throws RemoteException {
		try {
			Address returnValue = AngularUserServiceUtil.updateUserAddress(userId,
					addressId, street1, street2, street3, city, zip, regionId,
					countryId, typeId, shipping, primary);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateUserUserGroups(long userId, long[] userGroupIds)
		throws RemoteException {
		try {
			AngularUserServiceUtil.updateUserUserGroups(userId, userGroupIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void updateUserRoles(long userId, long[] roleIds)
		throws RemoteException {
		try {
			AngularUserServiceUtil.updateUserRoles(userId, roleIds);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static User addNewUser(java.lang.String screenName,
		java.lang.String emailAddress, long companyId, java.lang.String locale,
		long[] groupIds, long[] organizationIds, long[] roleIds,
		long[] userGroupIds) throws RemoteException {
		try {
			User returnValue = AngularUserServiceUtil.addNewUser(screenName,
					emailAddress, companyId, locale, groupIds, organizationIds,
					roleIds, userGroupIds);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
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
		com.liferay.portal.kernel.service.ServiceContext serviceContext) throws RemoteException {
		try {
			User returnValue = AngularUserServiceUtil.updateUser(userId,
					oldPassword, newPassword1, newPassword2, passwordReset,
					reminderQueryQuestion, reminderQueryAnswer, screenName,
					emailAddress, facebookId, openId, portrait, portraitBytes,
					languageId, timeZoneId, greeting, comments, firstName,
					middleName, lastName, prefixId, suffixId, male,
					birthdayMonth, birthdayDay, birthdayYear, smsSn,
					facebookSn, jabberSn, skypeSn, twitterSn, jobTitle,
					groupIds, organizationIds, roleIds, userGroupRoles,
					userGroupIds, addresses, emailAddresses, phones, websites,
					announcementsDelivers, serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static User deleteUserByEmail(java.lang.String emailAddress)
		throws RemoteException {
		try {
			User returnValue = AngularUserServiceUtil.deleteUserByEmail(emailAddress);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static User deleteUserById(long userId) throws RemoteException {
		try {
			User returnValue = AngularUserServiceUtil.deleteUserById(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularUserServiceSoap.class);
}
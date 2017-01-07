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

package eu.gerhards.liferay.services.angular.service.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.announcements.kernel.model.AnnouncementsDelivery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.exception.UserEmailAddressException;
import com.liferay.portal.kernel.exception.UserFieldException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.membershippolicy.OrganizationMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.RoleMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.SiteMembershipPolicyUtil;
import com.liferay.portal.kernel.security.membershippolicy.UserGroupMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserGroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;
import com.liferay.portal.kernel.transaction.TransactionCommitCallbackUtil;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.kernel.workflow.WorkflowThreadLocal;
import com.liferay.users.admin.kernel.util.UsersAdminUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularUserServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.ServicePermissionUtil;
import eu.gerhards.liferay.services.angular.service.util.ServiceUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.concurrent.Callable;

/**
 * The implementation of the User remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularUserService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularUserServiceUtil
 */
@ProviderType
public class AngularUserServiceImpl extends AngularUserServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularUserServiceUtil} to access the User remote service.
	 */

    public static Log _log = LogFactoryUtil.getLog(AngularUserServiceImpl.class);

    public static final String INVISIBLE_PLACEHOLDER = "-";

    @Override
    public User getUser(long userId) throws PortalException {

        _log.info("getting user with id: "+String.valueOf(userId));

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);

        _log.debug("    getting information");

        User user = UserLocalServiceUtil.getUser(userId);
        Contact userContact = ContactLocalServiceUtil.getContact(user.getContactId());

        List<Role> userRoles = RoleLocalServiceUtil.getUserRoles(user.getUserId());
        List<Group> userGroups = GroupLocalServiceUtil.getUserGroups(user.getUserId());
        List<Organization> userOrganizations = OrganizationLocalServiceUtil.getUserOrganizations(user.getUserId());
        List<UserGroup> userUserGroups = UserGroupLocalServiceUtil.getUserUserGroups(user.getUserId());


        return user;
    }

    @Override
    public List<Address> getUserAddress(long userId) throws PortalException {

        _log.info("getting addresses for user with id: "+String.valueOf(userId));

        _log.debug("    security check ...");

        //PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);

        _log.debug("    getting information");

        User user = UserLocalServiceUtil.getUser(userId);

        List<Address> addresses = new ArrayList<>();
        if (user != null) {
            addresses = user.getAddresses();
        }

        return addresses;
    }

    @Override
    public List<EmailAddress> getUserEmailAddresses(long userId) throws PortalException {

        _log.info("getting email addresses for user with id: "+String.valueOf(userId));

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW_USER);

        _log.debug("    getting information");


        User user = UserLocalServiceUtil.getUser(userId);

        List<EmailAddress> emailAddresses = new ArrayList<>();

        if (user != null) {
            emailAddresses = user.getEmailAddresses();
        }

        return emailAddresses;
    }

    @Override
    public List<Phone> getUserPhones(long userId) throws PortalException {

        _log.info("getting phones for user with id: "+String.valueOf(userId));

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW_USER);

        _log.debug("    getting information");

        User user = UserLocalServiceUtil.getUser(userId);
        List<Phone> phones = new ArrayList<>();

        if (user != null) {
            phones = user.getPhones();
        }
        return phones;
    }

    @Override
    public List<Website> getUserWebsites(long userId) throws PortalException {

        _log.info("getting websites for user with id: "+String.valueOf(userId));

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW_USER);

        _log.debug("    getting information");

        User user = UserLocalServiceUtil.getUser(userId);
        List<Website> websites = new ArrayList<>();

        if (user != null) {
            websites = user.getWebsites();
        }

        return websites;
    }

    @Override
    public void updateUserPhones(long userId, long[] phones) throws PortalException {

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        User user = UserLocalServiceUtil.getUserById(userId);

        //this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, null, null, null);

        //this.updateUserPhones(user.getContactId(), phones);
    }

    @Override
    public void updateUserWebsites(long userId, List<Website> website) throws PortalException {

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        User user = UserLocalServiceUtil.getUserById(userId);

        this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, null, null, null);

        this.updateUsrWebsites(user.getContactId(), website);
    }

    @Override
    public void updateUserEmailAddresses(long userId, List<EmailAddress> emailAddresses) throws PortalException {

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        User user = UserLocalServiceUtil.getUserById(userId);

        this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, null, null, null);

        this.updateUserEmailAddress(user.getContactId(), emailAddresses);
    }

    @Override
    public Address updateUserAddress(long userId, long addressId, String street1, String street2, String street3, String city, String zip, long regionId, long countryId, long typeId, boolean shipping, boolean primary) throws PortalException {

        _log.info("Saving user addresses ...");
        _log.debug("    "+String.valueOf(street1));

        _log.debug("   security check ... ");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_USER);

        //PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW_USER);

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        _log.debug("   saving information ... ");

        User user = UserLocalServiceUtil.getUserById(userId);

        this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, null, null, null);

        Address addressToUpdate = AddressLocalServiceUtil.getAddress(addressId);

        List<Address> addresses = new ArrayList<Address>();
        addresses.add(addressToUpdate);

        addressToUpdate.setStreet1(street1);
        addressToUpdate.setStreet2(street2);
        addressToUpdate.setStreet3(street3);
        addressToUpdate.setZip(zip);
        addressToUpdate.setCity(city);
        addressToUpdate.setRegionId(regionId);
        addressToUpdate.setCountryId(countryId);
        addressToUpdate.setTypeId(typeId);
        addressToUpdate.setMailing(shipping);
        addressToUpdate.setPrimary(primary);

        return AddressLocalServiceUtil.updateAddress(addressToUpdate);
    }

    @Override
    public void updateUserUserGroups(long userId, long[] userGroupIds) throws PortalException {
        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        User user = UserLocalServiceUtil.getUserById(userId);

        this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, null, userGroupIds, null);

        // User group membership policy

        long[] oldUserGroupIds = user.getUserGroupIds();

        List<Long> addUserGroupIds = new ArrayList<>();
        List<Long> removeUserGroupIds = Collections.emptyList();

        if (userGroupIds != null) {
            removeUserGroupIds = ListUtil.toList(oldUserGroupIds);

            userGroupIds = angularUserGroupService.checkUserGroupIds(userId, userGroupIds);

            for (long userGroupId : userGroupIds) {
                if (ArrayUtil.contains(oldUserGroupIds, userGroupId)) {
                    removeUserGroupIds.remove(userGroupId);
                }
                else {
                    addUserGroupIds.add(userGroupId);
                }
            }

            UserGroupLocalServiceUtil.addUserUserGroups(user.getUserId(), userGroupIds);

            if (!addUserGroupIds.isEmpty() || !removeUserGroupIds.isEmpty()) {
                UserGroupMembershipPolicyUtil.checkMembership(
                        new long[] {userId}, ArrayUtil.toLongArray(addUserGroupIds),
                        ArrayUtil.toLongArray(removeUserGroupIds));
            }
        }
    }

    @Override
    public void updateUserRoles(long userId, long[] roleIds) throws PortalException {

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        User user = UserLocalServiceUtil.getUserById(userId);

        this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, roleIds, null, null);

        long[] oldRoleIds = user.getRoleIds();

        List<Long> addRoleIds = new ArrayList<>();
        List<Long> removeRoleIds = Collections.emptyList();

        if (roleIds != null) {
            removeRoleIds = ListUtil.toList(oldRoleIds);

            roleIds = angularRoleService.checkRoles(userId, roleIds);

            for (long roleId : roleIds) {
                if (ArrayUtil.contains(oldRoleIds, roleId)) {
                    removeRoleIds.remove(roleId);
                }
                else {
                    addRoleIds.add(roleId);
                }
            }

            RoleLocalServiceUtil.addUserRoles(user.getUserId(), ArrayUtil.toLongArray(addRoleIds));

            if (!addRoleIds.isEmpty() || !removeRoleIds.isEmpty()) {
                RoleMembershipPolicyUtil.checkRoles(
                        new long[] {userId}, ArrayUtil.toLongArray(addRoleIds),
                        ArrayUtil.toLongArray(removeRoleIds));
            }
        }

        long[] newRoleIds = ArrayUtil.toLongArray(addRoleIds);


        if (!addRoleIds.isEmpty() || !removeRoleIds.isEmpty()) {
            RoleMembershipPolicyUtil.propagateRoles(
                    new long[] {user.getUserId()},
                    ArrayUtil.toLongArray(addRoleIds),
                    ArrayUtil.toLongArray(removeRoleIds));
        }
    }

    @Override
    public User addNewUser(String screenName, String emailAddress, long companyId, String locale, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds) throws PortalException {
        User newUser = null;
        long creatorId=0;

        _log.info("Adding new user ...");

        try {

            try {
                creatorId = this.getGuestOrUserId();
            } catch (PrincipalException pe) {
                if (_log.isWarnEnabled()) {
                    _log.warn("Unable to get current user ID", pe);
                }
            }

            boolean autoScreenName = false;

            if (StringUtils.isEmpty(screenName)) {
                _log.warn("No screen name given! Switching to auto screen name!");
                autoScreenName = true;
                screenName = "";
            }

            if (StringUtils.isEmpty(emailAddress)) {
                _log.warn("No email address given!");
                throw new PortalException("A email address is needed for new users!");
            }

            this.validateEmail(emailAddress, null);

            User existingUser = UserLocalServiceUtil.fetchUserByEmailAddress(companyId, emailAddress);

            if (existingUser == null) {

                ServiceContext serviceContext = new ServiceContext();

                this.checkAddUserPermission(creatorId, companyId, emailAddress, groupIds, organizationIds, roleIds, userGroupIds, serviceContext);

                // Null safe actions
                if (groupIds == null) {
                    groupIds = new long[0];
                }

                if (organizationIds == null) {
                    organizationIds = new long[0];
                }

                if (roleIds == null) {
                    roleIds = new long[0];
                }

                if (userGroupIds == null) {
                    userGroupIds = new long[0];
                }

                _log.info("Creating new user with email address: "+emailAddress);

                boolean autoPassword = true;
                String password1 = "";
                String password2 = "";
                long facebookId = 0;
                String openId = "";
                Locale loc = ServiceUtils.getLocaleFromString(locale);
                String firstName = INVISIBLE_PLACEHOLDER;
                String middleName = "";
                String lastName = INVISIBLE_PLACEHOLDER;
                int prefixId = 0;
                int suffixId = 0;
                boolean male = false;

                int birthdayMonth = 1;
                int birthdayDay = 1;
                int birthdayYear = 1970;
                String jobTitle = "";

                boolean sendEmail = true;

                boolean workflowEnabled = WorkflowThreadLocal.isEnabled();

                try {

                    newUser = UserLocalServiceUtil.addUserWithWorkflow(creatorId,
                            companyId,
                            autoPassword,
                            password1,
                            password2,
                            autoScreenName,
                            screenName,
                            emailAddress,
                            facebookId,
                            openId,
                            loc,
                            firstName,
                            middleName,
                            lastName,
                            prefixId,
                            suffixId,
                            male,
                            birthdayMonth,
                            birthdayDay,
                            birthdayYear,
                            jobTitle,
                            groupIds,
                            organizationIds,
                            roleIds,
                            userGroupIds,
                            sendEmail,
                            null);

                    _log.debug("New user record: "+newUser.toString());

                } finally {
                    WorkflowThreadLocal.setEnabled(workflowEnabled);
                }

            } else {
                _log.error("User cannot be created! Found already the following account: "+existingUser.toString());
                throw new PortalException("Fatal! User already exists");
            }
            // Send validation mail

        } catch (PortalException pe) {
            _log.error(pe);
            throw pe;
        }

        return newUser;
    }

    @Override
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
                           ServiceContext serviceContext) throws PortalException {

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_USER);

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        if (StringUtils.isEmpty(emailAddress)) {
            throw new PortalException("A email address is needed for new users!");
        }

        // Null safe actions
        if (groupIds == null) {
            groupIds = new long[0];
        }

        if (organizationIds == null) {
            organizationIds = new long[0];
        }

        if (roleIds == null) {
            roleIds = new long[0];
        }

        if (userGroupRoles==null) {
            userGroupRoles = new ArrayList<UserGroupRole>();
        }

        if (userGroupIds == null) {
            userGroupIds = new long[0];
        }

        if (addresses == null) {
            addresses = new ArrayList<Address>();
        }

        if (emailAddresses == null) {
            emailAddresses = new ArrayList<EmailAddress>();
        }

        if (phones == null) {
            phones = new ArrayList<Phone>();
        }

        if (websites == null) {
            websites = new ArrayList<Website>();
        }

        if (announcementsDelivers==null) {
            announcementsDelivers = new ArrayList<AnnouncementsDelivery>();
        }


        User userToUpdate = UserLocalServiceUtil.getUserById(userId);

        if (StringUtils.isEmpty(screenName)) {
            screenName = userToUpdate.getScreenName();
        }

        this.checkUpdateUserPermission(creatorId, userId, userToUpdate.getCompanyId(), groupIds, organizationIds, roleIds, userGroupIds, serviceContext);

        // Update contact parts
        this.updateUserAddresses(userToUpdate.getContactId(),addresses);
        this.updateUserEmailAddress(userToUpdate.getContactId(), emailAddresses);
        this.updateUserPhones(userToUpdate.getContactId(), phones);
        this.updateUsrWebsites(userToUpdate.getContactId(), websites);
        this.updateAnnouncementsDeliveries(userToUpdate.getContactId(), announcementsDelivers);


        if (creatorId == userId) {
            emailAddress = StringUtil.toLowerCase(emailAddress.trim());

            if (!StringUtil.equalsIgnoreCase(
                    emailAddress, userToUpdate.getEmailAddress())) {

                validateEmail(emailAddress, userToUpdate);
            }
        }

        validateUpdatePermission(
                userToUpdate, screenName, emailAddress, firstName, middleName, lastName,
                prefixId, suffixId, birthdayMonth, birthdayDay, birthdayYear, male,
                jobTitle);



        // Group membership policy

        long[] oldGroupIds = userToUpdate.getGroupIds();

        List<Long> addGroupIds = new ArrayList<>();
        List<Long> removeGroupIds = Collections.emptyList();

        if (groupIds != null) {
            removeGroupIds = ListUtil.toList(oldGroupIds);

            groupIds = angularGroupService.checkGroups(userId, groupIds);

            for (long groupId : groupIds) {
                if (ArrayUtil.contains(oldGroupIds, groupId)) {
                    removeGroupIds.remove(groupId);
                }
                else {
                    addGroupIds.add(groupId);
                }
            }

            if (!addGroupIds.isEmpty() || !removeGroupIds.isEmpty()) {
                SiteMembershipPolicyUtil.checkMembership(
                        new long[] {userId}, ArrayUtil.toLongArray(addGroupIds),
                        ArrayUtil.toLongArray(removeGroupIds));
            }
        }

        // Organization membership policy

        long[] oldOrganizationIds = userToUpdate.getOrganizationIds();

        List<Long> addOrganizationIds = new ArrayList<>();
        List<Long> removeOrganizationIds = Collections.emptyList();

        if (organizationIds != null) {
            removeOrganizationIds = ListUtil.toList(oldOrganizationIds);

            organizationIds = angularOrganizationService.checkOrganizations(userId, organizationIds);

            for (long organizationId : organizationIds) {
                if (ArrayUtil.contains(oldOrganizationIds, organizationId)) {
                    removeOrganizationIds.remove(organizationId);
                }
                else {
                    addOrganizationIds.add(organizationId);
                }
            }

            if (!addOrganizationIds.isEmpty() ||
                    !removeOrganizationIds.isEmpty()) {

                OrganizationMembershipPolicyUtil.checkMembership(
                        new long[] {userId},
                        ArrayUtil.toLongArray(addOrganizationIds),
                        ArrayUtil.toLongArray(removeOrganizationIds));
            }
        }

        // Role membership policy

        long[] oldRoleIds = userToUpdate.getRoleIds();

        List<Long> addRoleIds = new ArrayList<>();
        List<Long> removeRoleIds = Collections.emptyList();

        if (roleIds != null) {
            removeRoleIds = ListUtil.toList(oldRoleIds);

            roleIds = angularRoleService.checkRoles(userId, roleIds);

            for (long roleId : roleIds) {
                if (ArrayUtil.contains(oldRoleIds, roleId)) {
                    removeRoleIds.remove(roleId);
                }
                else {
                    addRoleIds.add(roleId);
                }
            }

            if (!addRoleIds.isEmpty() || !removeRoleIds.isEmpty()) {
                RoleMembershipPolicyUtil.checkRoles(
                        new long[] {userId}, ArrayUtil.toLongArray(addRoleIds),
                        ArrayUtil.toLongArray(removeRoleIds));
            }
        }

        List<UserGroupRole> oldOrganizationUserGroupRoles = new ArrayList<>();
        List<UserGroupRole> oldSiteUserGroupRoles = new ArrayList<>();

        List<UserGroupRole> oldUserGroupRoles =
                userGroupRolePersistence.findByUserId(userId);

        for (UserGroupRole oldUserGroupRole : oldUserGroupRoles) {
            Role role = oldUserGroupRole.getRole();

            if (role.getType() == RoleConstants.TYPE_ORGANIZATION) {
                oldOrganizationUserGroupRoles.add(oldUserGroupRole);
            }
            else if (role.getType() == RoleConstants.TYPE_SITE) {
                oldSiteUserGroupRoles.add(oldUserGroupRole);
            }
        }

        List<UserGroupRole> addOrganizationUserGroupRoles = new ArrayList<>();
        List<UserGroupRole> removeOrganizationUserGroupRoles =
                Collections.emptyList();
        List<UserGroupRole> addSiteUserGroupRoles = new ArrayList<>();
        List<UserGroupRole> removeSiteUserGroupRoles = Collections.emptyList();

        if (userGroupRoles != null) {
            userGroupRoles = angularRoleService.checkUserGroupRoles(userId, userGroupRoles);

            removeOrganizationUserGroupRoles = ListUtil.copy(
                    oldOrganizationUserGroupRoles);
            removeSiteUserGroupRoles = ListUtil.copy(oldSiteUserGroupRoles);

            for (UserGroupRole userGroupRole : userGroupRoles) {
                Role role = userGroupRole.getRole();

                if (role.getType() == RoleConstants.TYPE_ORGANIZATION) {
                    if (oldOrganizationUserGroupRoles.contains(userGroupRole)) {
                        removeOrganizationUserGroupRoles.remove(userGroupRole);
                    }
                    else {
                        addOrganizationUserGroupRoles.add(userGroupRole);
                    }
                }
                else if (role.getType() == RoleConstants.TYPE_SITE) {
                    if (oldSiteUserGroupRoles.contains(userGroupRole)) {
                        removeSiteUserGroupRoles.remove(userGroupRole);
                    }
                    else {
                        addSiteUserGroupRoles.add(userGroupRole);
                    }
                }
            }

            if (!addOrganizationUserGroupRoles.isEmpty() ||
                    !removeOrganizationUserGroupRoles.isEmpty()) {

                OrganizationMembershipPolicyUtil.checkRoles(
                        addOrganizationUserGroupRoles,
                        removeOrganizationUserGroupRoles);
            }

            if (!addSiteUserGroupRoles.isEmpty() ||
                    !removeSiteUserGroupRoles.isEmpty()) {

                SiteMembershipPolicyUtil.checkRoles(
                        addSiteUserGroupRoles, removeSiteUserGroupRoles);
            }
        }

        // User group membership policy

        long[] oldUserGroupIds = userToUpdate.getUserGroupIds();

        List<Long> addUserGroupIds = new ArrayList<>();
        List<Long> removeUserGroupIds = Collections.emptyList();

        if (userGroupIds != null) {
            removeUserGroupIds = ListUtil.toList(oldUserGroupIds);

            userGroupIds = angularUserGroupService.checkUserGroupIds(userId, userGroupIds);

            for (long userGroupId : userGroupIds) {
                if (ArrayUtil.contains(oldUserGroupIds, userGroupId)) {
                    removeUserGroupIds.remove(userGroupId);
                }
                else {
                    addUserGroupIds.add(userGroupId);
                }
            }

            if (!addUserGroupIds.isEmpty() || !removeUserGroupIds.isEmpty()) {
                UserGroupMembershipPolicyUtil.checkMembership(
                        new long[] {userId}, ArrayUtil.toLongArray(addUserGroupIds),
                        ArrayUtil.toLongArray(removeUserGroupIds));
            }
        }

        userToUpdate = userLocalService.updateUser(
                userId, oldPassword, newPassword1, newPassword2, passwordReset,
                reminderQueryQuestion, reminderQueryAnswer, screenName,
                emailAddress, facebookId, openId, portrait, portraitBytes,
                languageId, timeZoneId, greeting, comments, firstName, middleName,
                lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay,
                birthdayYear, smsSn, facebookSn, jabberSn, skypeSn, twitterSn,
                jobTitle, groupIds, organizationIds, roleIds, userGroupRoles,
                userGroupIds, serviceContext);

        if (!addGroupIds.isEmpty() || !removeGroupIds.isEmpty()) {
            SiteMembershipPolicyUtil.propagateMembership(
                    new long[] {userToUpdate.getUserId()},
                    ArrayUtil.toLongArray(addGroupIds),
                    ArrayUtil.toLongArray(removeGroupIds));
        }

        if (!addOrganizationIds.isEmpty() || !removeOrganizationIds.isEmpty()) {
            OrganizationMembershipPolicyUtil.propagateMembership(
                    new long[] {userToUpdate.getUserId()},
                    ArrayUtil.toLongArray(addOrganizationIds),
                    ArrayUtil.toLongArray(removeOrganizationIds));
        }

        if (!addRoleIds.isEmpty() || !removeRoleIds.isEmpty()) {
            RoleMembershipPolicyUtil.propagateRoles(
                    new long[] {userToUpdate.getUserId()},
                    ArrayUtil.toLongArray(addRoleIds),
                    ArrayUtil.toLongArray(removeRoleIds));
        }

        if (!addSiteUserGroupRoles.isEmpty() ||
                !removeSiteUserGroupRoles.isEmpty()) {

            SiteMembershipPolicyUtil.propagateRoles(
                    addSiteUserGroupRoles, removeSiteUserGroupRoles);
        }

        if (!addOrganizationUserGroupRoles.isEmpty() ||
                !removeOrganizationUserGroupRoles.isEmpty()) {

            OrganizationMembershipPolicyUtil.propagateRoles(
                    addOrganizationUserGroupRoles,
                    removeOrganizationUserGroupRoles);
        }

        if (!addUserGroupIds.isEmpty() || !removeUserGroupIds.isEmpty()) {
            UserGroupMembershipPolicyUtil.propagateMembership(
                    new long[] {userToUpdate.getUserId()},
                    ArrayUtil.toLongArray(addUserGroupIds),
                    ArrayUtil.toLongArray(removeUserGroupIds));
        }


        return userToUpdate;
    }

    @Override
    public User deleteUserByEmail(String emailAddress) throws PortalException {

        _log.info("Deleteing user by email address ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.DELETE_USER);

        User user = getGuestOrUser();
        User existingUser = UserLocalServiceUtil.fetchUserByEmailAddress(user.getCompanyId(), emailAddress);

        return this.deleteUser(user, existingUser);
    }

    @Override
    public User deleteUserById(long userId) throws PortalException {
        _log.info("Deleteing user by id ...");
        User user = getGuestOrUser();
        User existingUser = UserLocalServiceUtil.getUserById(user.getCompanyId(), userId);

        return this.deleteUser(user, existingUser);
    }

    @Override
    public void updateUserOrganizations(long userId, long[] organizationIds) throws PortalException {

        long creatorId=0;

        try {
            creatorId = this.getUserId();
        }
        catch (PrincipalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to get current user ID", pe);
            }
        }

        User user = UserLocalServiceUtil.getUserById(userId);

        this.checkUpdateUserPermission(creatorId, userId, user.getCompanyId(), null, null, null, null, null);

        // Organization membership policy

        long[] oldOrganizationIds = user.getOrganizationIds();

        List<Long> addOrganizationIds = new ArrayList<>();
        List<Long> removeOrganizationIds = Collections.emptyList();

        if (organizationIds != null) {
            removeOrganizationIds = ListUtil.toList(oldOrganizationIds);

            organizationIds = angularOrganizationService.checkOrganizations(userId, organizationIds);

            for (long organizationId : organizationIds) {
                if (ArrayUtil.contains(oldOrganizationIds, organizationId)) {
                    removeOrganizationIds.remove(organizationId);
                }
                else {
                    addOrganizationIds.add(organizationId);
                }
            }

            organizationLocalService.addUserOrganizations(user.getUserId(), organizationIds);

            UserLocalServiceUtil.updateOrganizations(user.getUserId(), organizationIds, null);

            if (!addOrganizationIds.isEmpty() ||
                    !removeOrganizationIds.isEmpty()) {

                OrganizationMembershipPolicyUtil.checkMembership(
                        new long[] {userId},
                        ArrayUtil.toLongArray(addOrganizationIds),
                        ArrayUtil.toLongArray(removeOrganizationIds));
            }
        }

    }

    @Override
    public Contact getUserContact(long userId) throws PortalException {
        User user = UserLocalServiceUtil.getUser(userId);
        Contact contact = null;

        if (user != null) {
            contact = user.fetchContact();
        }

        return contact;
    }

    @Override
    public List<Organization> getUserOrganizations(long userId) throws PortalException {

        User user = UserLocalServiceUtil.getUser(userId);
        List<Organization> organizations = new ArrayList<>();

        if (user != null) {
            organizations = user.getOrganizations();
        }

        return organizations;
    }

    @Override
    public List<Group> getUserGroups(long userId) throws PortalException {

        User user = UserLocalServiceUtil.getUser(userId);
        List<Group> groups = new ArrayList<>();

        if (user != null) {
            groups = user.getGroups();
        }

        return groups;
    }

    @Override
    public List<Role> getUserRoles(long userId) throws PortalException {

        User user = UserLocalServiceUtil.getUser(userId);
        List<Role> userRoles = new ArrayList<>();

        if (user != null) {
            userRoles = user.getRoles();
        }

        return userRoles;
    }

    @Override
    public List<User> getCompanyUsers(long companyId) {
        int count = UserLocalServiceUtil.getCompanyUsersCount(companyId);
        List<User> users = new ArrayList<>();

        if (count > 0) {
            users = UserLocalServiceUtil.getCompanyUsers(companyId, 0, count-1);
        }

        return users;
    }

    protected void updateUserAddresses(long contactId, List<Address> addresses) throws PortalException {

        UsersAdminUtil.updateAddresses(
                Contact.class.getName(), contactId, addresses);
    }

    protected void updateUserPhones(long contactId, List<Phone> phones) throws PortalException {
        if (phones == null) {
            phones = new ArrayList<>();
        }
        UsersAdminUtil.updatePhones(
                Contact.class.getName(), contactId, phones);
    }

    protected void updateUserEmailAddress(long contactId, List<EmailAddress> emailAddresses) throws PortalException {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<>();
        }
        UsersAdminUtil.updateEmailAddresses(
                Contact.class.getName(), contactId, emailAddresses);
    }

    protected void updateUsrWebsites(long contactId, List<Website> websites) throws PortalException {
        if (websites == null) {
            websites = new ArrayList<>();
        }
        UsersAdminUtil.updateWebsites(
                Contact.class.getName(), contactId, websites);
    }

    protected void updateAnnouncementsDeliveries(
            long userId, List<AnnouncementsDelivery> announcementsDeliveries)
            throws PortalException {

        if (announcementsDeliveries != null) {
            for (AnnouncementsDelivery announcementsDelivery :
                    announcementsDeliveries) {

                announcementsDeliveryService.updateDelivery(
                        userId, announcementsDelivery.getType(),
                        announcementsDelivery.getEmail(),
                        announcementsDelivery.getSms(),
                        announcementsDelivery.getWebsite());
            }
        }
    }

    protected void validateEmail(String emailAddress, User user) throws PortalException {

        if (user != null && !user.hasCompanyMx() && user.hasCompanyMx(emailAddress)) {
            Company company = companyPersistence.findByPrimaryKey(
                    user.getCompanyId());

            if (!company.isStrangersWithMx()) {
                throw new UserEmailAddressException.MustNotUseCompanyMx(
                        emailAddress);
            }
        }
    }

    protected void checkDeleteUserPermission(long deleteUserId, long companyId, long userId, ServiceContext serviceContext) throws PortalException{

        Company company = companyPersistence.findByPrimaryKey(companyId);

        boolean anonymousUser = ParamUtil.getBoolean(
                serviceContext, "anonymousUser");

        long defaultUserId = userLocalService.getDefaultUserId(companyId);

        if (((deleteUserId != 0) && (deleteUserId != defaultUserId)) ||
                (!company.isStrangers() && !anonymousUser)) {

            PermissionChecker permissionChecker = getPermissionChecker();

            // Check if user has an according group added with assign members

            User creator = this.getUser(deleteUserId);

            long[] creatorUserGroupIds = creator.getGroupIds();
            boolean hasGroupRight = false;

            // Either group needs right ADD_USER
            if (creatorUserGroupIds != null && creatorUserGroupIds.length > 0) {
                int index = 0;
                while(!hasGroupRight && index < creatorUserGroupIds.length) {
                    hasGroupRight = UserGroupPermissionUtil.contains(getPermissionChecker(), creatorUserGroupIds[index++], ActionKeys.DELETE_USER);
                }
            }

            // or the user itself
            if (!hasGroupRight && !PortalPermissionUtil.contains(
                    permissionChecker, ActionKeys.DELETE_USER)) {

                throw new PrincipalException.MustHavePermission(
                        permissionChecker, Organization.class.getName(), 0,
                        ActionKeys.UPDATE_USER, ActionKeys.ASSIGN_MEMBERS);
            }

        }

    }

    protected void checkUpdateUserPermission(long updateUserId, long userId, long companyId, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, ServiceContext serviceContext) throws PortalException {

        Company company = companyPersistence.findByPrimaryKey(companyId);

        // Adding user must be member of everything he adds

        long[] userIds = new long[]{updateUserId};

        // Check if creator / updater is also part in the groups
        ServicePermissionUtil.checkMembership(userIds, groupIds, organizationIds, roleIds, userGroupIds);

        if (groupIds != null && groupIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(),ActionKeys.ADD_USER);
            angularGroupService.checkGroups(userId, groupIds);
        }

        if (organizationIds != null && organizationIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_ORGANIZATION);
            angularOrganizationService.checkOrganizations(userId, organizationIds);
        }

        if (roleIds != null && roleIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_ROLE);
            angularRoleService.checkRoles(userId, roleIds);
        }

        if (userGroupIds != null && userGroupIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_USER_GROUP);
            angularUserGroupService.checkUserGroupIds(userId, userGroupIds);
        }

        if (serviceContext == null) {
            serviceContext = new ServiceContext();
        }

        boolean anonymousUser = ParamUtil.getBoolean(
                serviceContext, "anonymousUser");

        long defaultUserId = userLocalService.getDefaultUserId(companyId);

        if (((updateUserId != 0) && (updateUserId != defaultUserId)) ||
                (!company.isStrangers() && !anonymousUser)) {

            UserPermissionUtil.check(getPermissionChecker(), updateUserId, ActionKeys.UPDATE_USER);

            UserPermissionUtil.check(
                    getPermissionChecker(), userId, organizationIds, ActionKeys.UPDATE);
        }
    }

    protected void validateUpdatePermission(
            User user, String screenName, String emailAddress, String firstName,
            String middleName, String lastName, long prefixId, long suffixId,
            int birthdayMonth, int birthdayDay, int birthdayYear, boolean male,
            String jobTitle)
            throws PortalException {

        List<String> fields = new ArrayList<>();

        Contact contact = user.getContact();

        Calendar birthday = CalendarFactoryUtil.getCalendar();

        birthday.setTime(contact.getBirthday());

        if ((birthdayMonth != birthday.get(Calendar.MONTH)) ||
                (birthdayDay != birthday.get(Calendar.DAY_OF_MONTH)) ||
                (birthdayYear != birthday.get(Calendar.YEAR))) {

            fields.add("birthday");
        }

        if (!StringUtil.equalsIgnoreCase(
                emailAddress, user.getEmailAddress())) {

            fields.add("emailAddress");
        }

        if (!StringUtil.equalsIgnoreCase(firstName, user.getFirstName())) {
            fields.add("firstName");
        }

        if (male != contact.getMale()) {
            fields.add("gender");
        }

        if (!StringUtil.equalsIgnoreCase(jobTitle, user.getJobTitle())) {
            fields.add("jobTitle");
        }

        if (!StringUtil.equalsIgnoreCase(lastName, user.getLastName())) {
            fields.add("lastName");
        }

        if (!StringUtil.equalsIgnoreCase(middleName, user.getMiddleName())) {
            fields.add("middleName");
        }

        if (prefixId != contact.getPrefixId()) {
            fields.add("prefix");
        }

        if (!StringUtil.equalsIgnoreCase(screenName, user.getScreenName())) {
            fields.add("screenName");
        }

        if (suffixId != contact.getSuffixId()) {
            fields.add("suffix");
        }

        UserFieldException ufe = new UserFieldException();

        for (String field : fields) {
            if (!UsersAdminUtil.hasUpdateFieldPermission(
                    getPermissionChecker(), getUser(), user, field)) {

                ufe.addField(field);
            }
        }

        if (ufe.hasFields()) {
            throw ufe;
        }
    }


    protected void checkAddUserPermission(
            long creatorUserId, long companyId, String emailAddress,
            long[] groupIds, long[] organizationIds, long[] roleIds,
            long[] userGroupIds, ServiceContext serviceContext)
            throws PortalException {

        Company company = companyPersistence.findByPrimaryKey(companyId);

        // Check if user has an according right assigned with add user permission; Either he owns the right itself, by his roles or by his user roles
        User creator = this.getGuestOrUser();

        long[] userIds = new long[]{creatorUserId};

        // Adding user must be member of everything he adds
        ServicePermissionUtil.checkMembership(userIds, groupIds, organizationIds, roleIds, userGroupIds);

        if (groupIds != null && groupIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_TO_PAGE);
            angularGroupService.checkGroups(0, groupIds);
        }

        if (organizationIds != null && organizationIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_ORGANIZATION);
            angularOrganizationService.checkOrganizations(0, organizationIds);
        }

        if (roleIds != null && roleIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_ROLE);
            angularRoleService.checkRoles(0, roleIds);
        }

        if (userGroupIds != null && userGroupIds.length > 0) {
            PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_USER_GROUP);
            angularUserGroupService.checkUserGroupIds(0, userGroupIds);
        }

        boolean anonymousUser = ParamUtil.getBoolean(
                serviceContext, "anonymousUser");

        long defaultUserId = userLocalService.getDefaultUserId(companyId);

        if (((creatorUserId != 0) && (creatorUserId != defaultUserId)) ||
                (!company.isStrangers() && !anonymousUser)) {
            ServicePermissionUtil.checkAllPersonalPermissions(creator, ActionKeys.ADD_USER, companyId, getPermissionChecker(), User.class.getName());
        }

        if ((creatorUserId == 0) || (creatorUserId == defaultUserId)) {
            if (!company.isStrangersWithMx() &&
                    company.hasCompanyMx(emailAddress)) {

                throw new UserEmailAddressException.MustNotUseCompanyMx(
                        emailAddress);
            }
        }
    }

    protected void updateOrganizations(
            long userId, long[] newOrganizationIds, boolean indexingEnabled)
            throws PortalException {

        if (newOrganizationIds == null) {
            return;
        }

        long[] oldOrganizationIds = UserLocalServiceUtil.getOrganizationPrimaryKeys(userId);

        for (long oldOrganizationId : oldOrganizationIds) {
            if (!ArrayUtil.contains(newOrganizationIds, oldOrganizationId)) {
                unsetOrganizationUsers(oldOrganizationId, new long[] {userId});
            }
        }

        for (long newOrganizationId : newOrganizationIds) {
            if (!ArrayUtil.contains(oldOrganizationIds, newOrganizationId)) {
                addOrganizationUsers(newOrganizationId, new long[] {userId});
            }
        }

        if (indexingEnabled) {
            reindex(userId);
        }
    }


    /**
     * Adds the user to the organization.
     *
     * @param organizationId the primary key of the organization
     * @param user the user
     */
    protected void addOrganizationUser(long organizationId, User user) {
        organizationPersistence.addUser(organizationId, user);

        try {
            reindex(user);
        }
        catch (SearchException se) {
            throw new SystemException(se);
        }
    }

    /**
     * Adds the users to the organization.
     *
     * @param organizationId the primary key of the organization
     * @param users the users
     */
    protected void addOrganizationUsers(long organizationId, List<User> users)
            throws PortalException {

        organizationPersistence.addUsers(organizationId, users);

        reindex(users);
    }

    /**
     * Adds the users to the organization.
     *
     * @param organizationId the primary key of the organization
     * @param userIds the primary keys of the users
     */
    protected void addOrganizationUsers(long organizationId, long[] userIds)
            throws PortalException {



        organizationPersistence.addUsers(organizationId, userIds);

        reindex(userIds);
    }

    /**
     * Removes the users from the organization.
     *
     * @param organizationId the primary key of the organization
     * @param userIds the primary keys of the users
     */
    protected void unsetOrganizationUsers(
            long organizationId, final long[] userIds)
            throws PortalException {

        Organization organization = organizationPersistence.findByPrimaryKey(
                organizationId);

        final Group group = organization.getGroup();

        userGroupRoleLocalService.deleteUserGroupRoles(
                userIds, group.getGroupId());

        organizationPersistence.removeUsers(organizationId, userIds);

        reindex(userIds);

        Callable<Void> callable = new Callable<Void>() {

            @Override
            public Void call() throws Exception {
                Message message = new Message();

                message.put("groupId", group.getGroupId());
                message.put("userIds", userIds);

                MessageBusUtil.sendMessage(
                        DestinationNames.SUBSCRIPTION_CLEAN_UP, message);

                return null;
            }

        };

        TransactionCommitCallbackUtil.registerCallback(callable);
    }

    protected void reindex(final List<User> users) throws SearchException {
        Indexer<User> indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                User.class);

        try {
            indexer.reindex(users);
        }
        catch (SearchException se) {
            throw new SystemException(se);
        }
    }


    protected void reindex(long[] userIds) throws SearchException {
        Indexer<User> indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                User.class);

        List<User> users = new ArrayList<>(userIds.length);

        for (Long userId : userIds) {
            User user = userLocalService.fetchUser(userId);

            users.add(user);
        }

        indexer.reindex(users);
    }

    protected void reindex(final User user) throws SearchException {
        Indexer<User> indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                User.class);

        indexer.reindex(user);
    }

    protected void reindex(long userId) throws SearchException, PortalException{
        User user = UserLocalServiceUtil.getUserById(userId);
        reindex(user);
    }

    protected User deleteUser(User user, User existingUser) throws PortalException {

        _log.debug("Target user: "+existingUser.toString());
        try {

            // Check if target user is not an omni admin or a company admin
            PermissionChecker deleteUserPermChecker = PermissionCheckerFactoryUtil.create(existingUser);
            if (deleteUserPermChecker != null && !deleteUserPermChecker.isOmniadmin() && !deleteUserPermChecker.isCompanyAdmin()) {
                ServicePermissionUtil.checkAllPersonalPermissions(user, ActionKeys.DELETE, existingUser.getCompanyId(), getPermissionChecker(), User.class.getName());

                boolean workflowEnabled = WorkflowThreadLocal.isEnabled();

                try {

                    User deletedUser = UserLocalServiceUtil.deleteUser(existingUser);
                    return deletedUser;

                } catch(PortalException e) {
                    _log.error("Cannot delete user ... ");
                    _log.error(e);
                    throw e;
                } finally {
                    WorkflowThreadLocal.setEnabled(workflowEnabled);
                }
            } else {
                _log.error("User is omni admin or company admin and cannot be deleted!");
                throw new PortalException();
            }

        } catch (Exception e) {
            throw new PortalException(e);
        }
    }
}
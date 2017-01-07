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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.security.membershippolicy.OrganizationMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.OrganizationPermissionUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.users.admin.kernel.util.UsersAdminUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularOrganizationServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the Organization remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularOrganizationService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularOrganizationServiceUtil
 */
@ProviderType
public class AngularOrganizationServiceImpl
	extends AngularOrganizationServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularOrganizationServiceUtil} to access the Organization remote service.
	 */

	public static Log _log = LogFactoryUtil.getLog(AngularOrganizationServiceImpl.class);

	@Override
	public Organization getOrganization(long organizationId) throws PortalException {

		_log.info("Getting organization information for organizatin with id: "+String.valueOf(organizationId));

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_ORGANIZATIONS);

		_log.debug("    ... getting information");

		Organization organization = OrganizationServiceUtil.getOrganization(organizationId);
		return organization;
	}

	@Override
	public List<User> getOrganizationUsers(long organizationId) throws PortalException {

		_log.info("Getting users for organization id: "+String.valueOf(organizationId));

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_ORGANIZATIONS);
		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_USERS);

		_log.debug("    ... getting information");

		Organization organization = OrganizationServiceUtil.getOrganization(organizationId);
		List<User> organizationUsers = null;

		if (organization != null){

			organizationUsers = UserLocalServiceUtil.getOrganizationUsers(organizationId);

		}

		return organizationUsers;
	}

	@Override
	public List<Address> getOrganizationAdresses(long organizationId) throws PortalException {

		_log.info("Getting organization address for organization id: "+String.valueOf(organizationId));

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_ORGANIZATIONS);

		_log.debug("    ... getting information");

		Organization organization = OrganizationServiceUtil.getOrganization(organizationId);
		List<Address> addresses = null;

		if (organization != null){
			addresses = organization.getAddresses();
		}

		return addresses;
	}

	@Override
	public List<Phone> getOrganizationPhones(long organizationId) throws PortalException {

		_log.info("getting websites for organization id: "+String.valueOf(organizationId));

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.DELETE_COMMUNITY);

		_log.debug("    ... getting information");

		Organization organization = OrganizationServiceUtil.getOrganization(organizationId);
		List<Phone> phones = null;

		if (organization != null){

			long companyId = organization.getCompanyId();
			phones = PhoneLocalServiceUtil.getPhones(companyId, Organization.class.getName(), organization.getOrganizationId());

		}

		return null;
	}

	@Override
	public List<EmailAddress> getOrganizationEmailAddresses(long organizationId) throws PortalException {

		_log.info("Getting email addresses for organization id: "+String.valueOf(organizationId));

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_ORGANIZATIONS);

		_log.debug("    ... getting information");

		Organization organization = OrganizationServiceUtil.getOrganization(organizationId);
		long companyId = organization.getCompanyId();

		List<EmailAddress> emailAddresses = null;

		if (organization != null){
			emailAddresses = EmailAddressLocalServiceUtil.getEmailAddresses(companyId, Organization.class.getName(), organization.getOrganizationId());
		}

		return emailAddresses;
	}

	@Override
	public List<Website> getOrganizationWebsites(long organizationId) throws PortalException {

		_log.info("Getting websites for organization id: "+String.valueOf(organizationId));

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_ORGANIZATIONS);

		_log.debug("    ... getting information");

		Organization organization = OrganizationServiceUtil.getOrganization(organizationId);

		List<Website> organizationWebsites = null;

		if (organization != null){

			long companyId = organization.getCompanyId();
			organizationWebsites = WebsiteLocalServiceUtil.getWebsites(companyId, Organization.class.getName(), organization.getOrganizationId());

		}

		return organizationWebsites;
	}

	@Override
	public Organization createOrganization(String name, String type, long regionId, long countryId, long statusId, String comment, boolean site, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException {

		_log.info("Creating organization ... ");

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_ORGANIZATION);

		_log.debug("    ... saving information ... ");

		User creator = this.getGuestOrUser();

		ServiceContext serviceContext = new ServiceContext();
		boolean indexingEnabled = true;

		if (serviceContext != null) {
			indexingEnabled = serviceContext.isIndexingEnabled();

			serviceContext.setIndexingEnabled(false);
		}

		try {

			Organization organization = OrganizationLocalServiceUtil.addOrganization(creator.getUserId(), OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID, name, type, regionId, countryId, statusId, comment, site, serviceContext);

			_log.debug("        ... organization ...");

			this. updateOrganizationParts(organization, addresses, emailAddresses, phones, websites, orgLabors);

			if (indexingEnabled) {
				Indexer<Organization> indexer =
						IndexerRegistryUtil.nullSafeGetIndexer(Organization.class);

				indexer.reindex(organization);
			}

			OrganizationMembershipPolicyUtil.verifyPolicy(organization);

			return organization;

		}
		finally {
			if (serviceContext != null) {
				serviceContext.setIndexingEnabled(indexingEnabled);
			}
		}
	}

	@Override
	public Organization updateOrganization(long organizationId, String name, String type, long regionId, long countryId, long statusId, String comment, boolean site, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException {

		_log.info("Updating organization ... ");

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_COMMUNITY);

		_log.debug("    ... saving information ... ");

		User creator = this.getGuestOrUser();

		ServiceContext serviceContext = new ServiceContext();
		boolean indexingEnabled = true;

		if (serviceContext != null) {
			indexingEnabled = serviceContext.isIndexingEnabled();

			serviceContext.setIndexingEnabled(false);
		}

		try {

			_log.debug("        ... organization ...");

			serviceContext.setUserId(this.getGuestOrUserId());

			Organization organization = organizationLocalService.updateOrganization(creator.getCompanyId(),organizationId,OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID ,name, type, regionId, countryId, statusId, comment,false, null, site,serviceContext);

			this. updateOrganizationParts(organization, addresses, emailAddresses, phones, websites, orgLabors);

			if (indexingEnabled) {
				Indexer<Organization> indexer =
						IndexerRegistryUtil.nullSafeGetIndexer(Organization.class);

				indexer.reindex(organization);
			}

			OrganizationMembershipPolicyUtil.verifyPolicy(organization);

			return organization;

		}
		finally {
			if (serviceContext != null) {
				serviceContext.setIndexingEnabled(indexingEnabled);
			}
		}
	}

	@Override
	public Organization deleteOrganization(long organizationId) throws PortalException {

		_log.info("Deleteing company with id: "+String.valueOf(organizationId));

		_log.debug("    ... sercurity check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.DELETE_COMMUNITY);

		_log.debug("   ... deleting company ... ");

		return OrganizationLocalServiceUtil.deleteOrganization(organizationId);
	}


	protected Organization updateOrganizationParts(Organization organization, long[] addresses, long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors) throws PortalException {

		_log.info("    Saving organization parts ...");


		// Addresses
		if (addresses != null && addresses.length > 0) {
			List<Address> addressesFromDB = new ArrayList<Address>();
			for (int index = 0; index <addresses.length; index++) {
				Address address = AddressLocalServiceUtil.getAddress(addresses[index]);
				addressesFromDB.add(address);

			}

			_log.debug("        ... addresses ...");


			UsersAdminUtil.updateAddresses(
					Organization.class.getName(), organization.getOrganizationId(),
					addressesFromDB);
		} else {

			List<Address> oldAddresses = organization.getAddresses();
			if (oldAddresses!= null) {
				for (Address address: oldAddresses) {
					AddressLocalServiceUtil.deleteAddress(address);
				}
			}

		}

		// Email addresses

		if (emailAddresses != null && emailAddresses.length > 0) {

			List<EmailAddress> emailAddressesFromDb = new ArrayList<EmailAddress>();
			for (int index = 0; index < emailAddresses.length; index++) {
				EmailAddress emailAddress = EmailAddressLocalServiceUtil.getEmailAddress(emailAddresses[index]);
				emailAddressesFromDb.add(emailAddress);
			}

			_log.debug("        ... email addresses ...");

			UsersAdminUtil.updateEmailAddresses(
					Organization.class.getName(), organization.getOrganizationId(),
					emailAddressesFromDb);

		} else {

			List<EmailAddress> oldEmailAddresses = EmailAddressLocalServiceUtil.getEmailAddresses(organization.getCompanyId(), Organization.class.getName(), organization.getPrimaryKey());

			if (oldEmailAddresses != null) {
				for (EmailAddress emailAddress:oldEmailAddresses) {
					EmailAddressLocalServiceUtil.deleteEmailAddress(emailAddress);
				}
			}

		}

		// Phones
		if (phones != null && phones.length > 0) {
			List<Phone> phonesFromDb = new ArrayList<Phone>();
			for (int index = 0; index < phones.length; index++) {
				Phone phone = PhoneLocalServiceUtil.getPhone(phones[index]);
				phonesFromDb.add(phone);
			}

			_log.debug("        ... phones ...");

			UsersAdminUtil.updatePhones(
					Organization.class.getName(), organization.getOrganizationId(),
					phonesFromDb);

		} else {
			List<Phone> oldPhones = PhoneLocalServiceUtil.getPhones(organization.getCompanyId(), Organization.class.getName(), organization.getPrimaryKey());
			if (oldPhones != null) {
				for(Phone oldPhone:oldPhones) {
					PhoneLocalServiceUtil.deletePhone(oldPhone);
				}
			}
		}

		// Websites
		if (websites != null && websites.length > 0) {
			List<Website> websitesFromDb = new ArrayList<Website>();
			for (int index = 0; index < websites.length; index++) {
				Website website = WebsiteLocalServiceUtil.getWebsite(websites[index]);
				websitesFromDb.add(website);
			}

			_log.debug("        ... websites ...");

			UsersAdminUtil.updateWebsites(
					Organization.class.getName(), organization.getOrganizationId(),
					websitesFromDb);
		} else {
			List<Website> oldWebsites = WebsiteLocalServiceUtil.getWebsites(organization.getCompanyId(), Organization.class.getName(), organization.getPrimaryKey());
			if (oldWebsites != null) {
				for (Website oldWebsite:oldWebsites) {
					WebsiteLocalServiceUtil.deleteWebsite(oldWebsite);
				}
			}
		}

		// Org labors
		if (orgLabors != null && orgLabors.length > 0) {
			List<OrgLabor> orgLaborsFromDC = new ArrayList<OrgLabor>();
			for (int index = 0; index < orgLabors.length; index++) {
				OrgLabor orgLaborFromDB = OrgLaborLocalServiceUtil.getOrgLabor(orgLabors[index]);
				orgLaborsFromDC.add(orgLaborFromDB);
			}

			_log.debug("        ... organization labors ...");

			UsersAdminUtil.updateOrgLabors(
					organization.getOrganizationId(), orgLaborsFromDC);

		} else {
			List<OrgLabor> oldOrgLabors = OrgLaborLocalServiceUtil.getOrgLabors(organization.getOrganizationId());
			if (oldOrgLabors != null) {
				for(OrgLabor oldOrgLabor:oldOrgLabors) {
					OrgLaborLocalServiceUtil.deleteOrgLabor(oldOrgLabor);
				}
			}
		}

		return organization;

	}

	public long[] checkOrganizations(long userId, long[] organizationIds)
			throws PortalException {

		long[] oldOrganizationIds = null;

		PermissionChecker permissionChecker = getPermissionChecker();

		if (userId != CompanyConstants.SYSTEM) {

			// Add back any mandatory organizations or organizations that the
			// administrator does not have the rights to remove and check that
			// he has the permission to add a new organization

			List<Organization> oldOrganizations =
					organizationLocalService.getUserOrganizations(userId);

			oldOrganizationIds = new long[oldOrganizations.size()];

			for (int i = 0; i < oldOrganizations.size(); i++) {
				Organization organization = oldOrganizations.get(i);

				if (!ArrayUtil.contains(
						organizationIds, organization.getOrganizationId()) &&
						(!OrganizationPermissionUtil.contains(
								permissionChecker, organization,
								ActionKeys.ASSIGN_MEMBERS) ||
								OrganizationMembershipPolicyUtil.isMembershipProtected(
										permissionChecker, userId,
										organization.getOrganizationId()) ||
								OrganizationMembershipPolicyUtil.isMembershipRequired(
										userId, organization.getOrganizationId()))) {

					organizationIds = ArrayUtil.append(
							organizationIds, organization.getOrganizationId());
				}

				oldOrganizationIds[i] = organization.getOrganizationId();
			}
		}

		// Check that the administrator has the permission to add a new
		// organization and that the organization membership is allowed

		for (long organizationId : organizationIds) {
			if ((oldOrganizationIds != null) &&
					ArrayUtil.contains(oldOrganizationIds, organizationId)) {

				continue;
			}

			Organization organization =
					organizationPersistence.findByPrimaryKey(organizationId);

			OrganizationPermissionUtil.check(
					permissionChecker, organization, ActionKeys.ASSIGN_MEMBERS);
		}

		return organizationIds;
	}
}
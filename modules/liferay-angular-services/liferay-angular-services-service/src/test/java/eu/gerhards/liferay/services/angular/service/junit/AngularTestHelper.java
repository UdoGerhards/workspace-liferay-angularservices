package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;

import java.util.Date;
import java.util.Locale;

import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by udogerhards on 15.01.17.
 */
public class AngularTestHelper {

    public static com.liferay.portal.kernel.model.User createMockUser(long userId, String lastName, String firstName, String screenName, long companyId) {

        com.liferay.portal.kernel.model.User user = mock(com.liferay.portal.kernel.model.User.class);

        when(user.getUserId()).thenReturn(userId);
        when(user.getContactId()).thenReturn(userId);
        when(user.getCompanyId()).thenReturn(companyId);
        when(user.getLastName()).thenReturn(lastName);
        when(user.getFirstName()).thenReturn(firstName);
        when(user.getScreenName()).thenReturn(screenName);

        return user;
    }

    public static com.liferay.portal.kernel.model.Contact createMockContact(User user, boolean male, Date birthday, String emailAddress, boolean _new) throws PortalException
    {

        com.liferay.portal.kernel.model.Contact contact = mock(com.liferay.portal.kernel.model.Contact.class);

        long contactId = user.getContactId();
        when(contact.getContactId()).thenReturn(contactId);

        String fullName = user.getFullName();
        when(contact.getFullName()).thenReturn(fullName);

        long userId = user.getUserId();
        when(contact.getUserId()).thenReturn(userId);

        long companyId = user.getCompanyId();
        when(contact.getCompanyId()).thenReturn(companyId);

        String screenName = user.getScreenName();
        when(contact.getUserName()).thenReturn(screenName);

        String lastName = user.getLastName();
        when(contact.getLastName()).thenReturn(lastName);

        String firstName = user.getFirstName();
        when(contact.getFirstName()).thenReturn(firstName);

        when(contact.getBirthday()).thenReturn(birthday);
        when(contact.getEmailAddress()).thenReturn(emailAddress);
        when(contact.isNew()).thenReturn(_new);
        when(contact.isMale()).thenReturn(male);
        when(contact.getMale()).thenReturn(male);

        when(user.getContact()).thenReturn(contact);

        return contact;

    }

    public static com.liferay.portal.kernel.model.Address createMockAddress(long userId, long addressId, long typeId, boolean isMailing, boolean isPrimary, String stree1, String stree2, String street3, String zip, String city, Long countryId, Long regionId) {

        com.liferay.portal.kernel.model.Address address = mock(com.liferay.portal.kernel.model.Address.class);

        when(address.getUserId()).thenReturn(userId);
        when(address.getAddressId()).thenReturn(addressId);
        when(address.getTypeId()).thenReturn(typeId);
        when(address.getStreet1()).thenReturn(stree1);
        when(address.getStreet2()).thenReturn(stree2);
        when(address.getStreet3()).thenReturn(street3);
        when(address.getCity()).thenReturn(city);
        when(address.getCountryId()).thenReturn(countryId);
        when(address.getRegionId()).thenReturn(regionId);
        when(address.getUserId()).thenReturn(userId);
        when(address.isMailing()).thenReturn(isMailing);
        when(address.isPrimary()).thenReturn(isPrimary);

        return address;

    }

    public static com.liferay.portal.kernel.model.Website createWebsite(long userId, long websiteId, boolean isPrimary, boolean isNew, long typeId, String url) {

        com.liferay.portal.kernel.model.Website website = mock(com.liferay.portal.kernel.model.Website.class);

        when(website.getUserId()).thenReturn(userId);
        when(website.getWebsiteId()).thenReturn(websiteId);
        when(website.getTypeId()).thenReturn(typeId);
        when(website.getUrl()).thenReturn(url);
        when(website.isPrimary()).thenReturn(isPrimary);
        when(website.isNew()).thenReturn(isNew);

        return website;
    }

    public static com.liferay.portal.kernel.model.EmailAddress createEmailAddress(long userId, long emailId, boolean isPrimary, boolean isNew, long typeId, String emailAddress) {

        com.liferay.portal.kernel.model.EmailAddress eAddress = mock(com.liferay.portal.kernel.model.EmailAddress.class);

        when(eAddress.getUserId()).thenReturn(userId);
        when(eAddress.getEmailAddressId()).thenReturn(emailId);
        when(eAddress.getTypeId()).thenReturn(typeId);
        when(eAddress.getAddress()).thenReturn(emailAddress);
        when(eAddress.isPrimary()).thenReturn(isPrimary);
        when(eAddress.isNew()).thenReturn(isNew);

        return eAddress;
    }

    public static com.liferay.portal.kernel.model.Phone createPhone(long userId, long phoneId, boolean isPrimary, boolean isNew, long typeId, String phoneNumber, String extension) {

        com.liferay.portal.kernel.model.Phone phone = mock(com.liferay.portal.kernel.model.Phone.class);

        when(phone.getUserId()).thenReturn(userId);
        when(phone.getPhoneId()).thenReturn(phoneId);
        when(phone.getTypeId()).thenReturn(typeId);
        when(phone.getNumber()).thenReturn(phoneNumber);
        when(phone.getExtension()).thenReturn(extension);
        when(phone.isPrimary()).thenReturn(isPrimary);
        when(phone.isNew()).thenReturn(isNew);

        return phone;
    }

    public static com.liferay.portal.kernel.model.Role createRole(long roleId, int type, boolean isNew, String name, String title, java.util.Map<Locale, String> titleMap, String description, java.util.Map<Locale,String> descriptionMap) {

        com.liferay.portal.kernel.model.Role role = mock(com.liferay.portal.kernel.model.Role.class);

        when(role.getRoleId()).thenReturn(roleId);
        when(role.isNew()).thenReturn(isNew);
        when(role.getType()).thenReturn(type);
        when(role.getName()).thenReturn(name);
        when(role.getTitle()).thenReturn(title);
        when(role.getTitleMap()).thenReturn(titleMap);

        if (titleMap != null && titleMap.size() > 0 ) {
            titleMap.forEach( (k,v) -> when(role.getTitle(k)).thenReturn(v));
        }

        when(role.getDescription()).thenReturn(description);

        when(role.getDescriptionMap()).thenReturn(descriptionMap);
        if (descriptionMap != null && descriptionMap.size() > 0 ) {
            descriptionMap.forEach( (k,v) -> when(role.getDescription(k)).thenReturn(v));
        }

        return role;
    }

    public static com.liferay.portal.kernel.model.UserGroup createUserGroup(long userGroupId, boolean isNew, String name) {

        com.liferay.portal.kernel.model.UserGroup userGroup = mock(com.liferay.portal.kernel.model.UserGroup.class);

        when(userGroup.getUserId()).thenReturn(userGroupId);
        when(userGroup.getName()).thenReturn(name);
        when(userGroup.isNew()).thenReturn(isNew);

        return userGroup;
    }

    public static com.liferay.portal.kernel.model.Group createGroup(long groupId, int type, boolean isNew, String name, java.util.Map<Locale, String> nameMap, String description, java.util.Map<Locale,String> descriptionMap) {

        com.liferay.portal.kernel.model.Group group = mock(com.liferay.portal.kernel.model.Group.class);

        when(group.getGroupId()).thenReturn(groupId);
        when(group.isNew()).thenReturn(isNew);
        when(group.getType()).thenReturn(type);
        when(group.getName()).thenReturn(name);

        when(group.getNameMap()).thenReturn(nameMap);

        if (nameMap != null && nameMap.size() > 0 ) {
            nameMap.forEach( (k,v) -> when(group.getName(k)).thenReturn(v));
        }

        when(group.getDescription()).thenReturn(description);
        when(group.getDescriptionMap()).thenReturn(descriptionMap);

        if (descriptionMap != null && descriptionMap.size() > 0 ) {
            descriptionMap.forEach( (k,v) -> when(group.getDescription(k)).thenReturn(v));
        }

        return group;
    }

    public static com.liferay.portal.kernel.model.Organization createOrganization(long organizationId, long companyId, String type, boolean isNew, String name) {

        com.liferay.portal.kernel.model.Organization organization = mock(com.liferay.portal.kernel.model.Organization.class);

        when(organization.getOrganizationId()).thenReturn(organizationId);
        when(organization.getCompanyId()).thenReturn(companyId);
        when(organization.getPrimaryKey()).thenReturn(organizationId);
        when(organization.isNew()).thenReturn(isNew);
        when(organization.getType()).thenReturn(type);
        when(organization.getName()).thenReturn(name);

        return organization;
    }

    public static com.liferay.portal.kernel.model.Company createCompany(long companyId, String webId, String virtualHostname, String mx, boolean isSystem, int maxUsers, boolean isActive, boolean isNew, String adminName) throws PortalException {

        com.liferay.portal.kernel.model.User defaultUser = AngularTestHelper.createMockUser(0L, "Company", "DefaultUser", "DefaultUser", companyId);

        com.liferay.portal.kernel.model.Company company = mock(com.liferay.portal.kernel.model.Company.class);

        when(company.getCompanyId()).thenReturn(companyId);
        when(company.getWebId()).thenReturn(webId);
        when(company.getVirtualHostname()).thenReturn(virtualHostname);
        when(company.getMx()).thenReturn(mx);
        when(company.isSystem()).thenReturn(isSystem);
        when(company.isActive()).thenReturn(isActive);
        when(company.getName()).thenReturn(virtualHostname);
        when(company.isNew()).thenReturn(isNew);
        when(company.getAdminName()).thenReturn(adminName);
        when(company.getDefaultUser()).thenReturn(defaultUser);

        return company;
    }
}


package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;
import eu.gerhards.liferay.services.angular.service.impl.AngularOrganizationServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.*;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by udogerhards on 21.01.17.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        UserLocalServiceUtil.class
        ,OrganizationLocalServiceUtil.class
        , OrganizationServiceUtil.class
        , PortalPermissionUtil.class
        , PermissionThreadLocal.class
        , UserPermissionUtil.class
        , ContactLocalServiceUtil.class
        , GroupLocalServiceUtil.class
        , UserGroupLocalServiceUtil.class
        , RoleLocalServiceUtil.class
        , EmailAddressServiceUtil.class
        , EmailAddressLocalServiceUtil.class
        , PhoneServiceUtil.class
        , PhoneLocalServiceUtil.class
        , WebsiteServiceUtil.class
        , WebsiteLocalServiceUtil.class
        , OrgLaborServiceUtil.class
        , OrgLaborLocalServiceUtil.class

})

public class AngularOrganizationServiceTest {

    public static Log _log = LogFactoryUtil.getLog(AngularOrganizationServiceTest.class);

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    protected PermissionChecker _permissionChecker;

    @Mock
    protected AngularOrganizationServiceImpl _serviceMock;

    @InjectMocks
    private AngularOrganizationServiceImpl _service;

    private com.liferay.portal.kernel.model.User mockUser = null;

    @Before
    public void setUp() {

        PowerMockito.mockStatic(UserLocalServiceUtil.class);
        PowerMockito.mockStatic(OrganizationLocalServiceUtil.class);
        PowerMockito.mockStatic(OrganizationServiceUtil.class);
        PowerMockito.mockStatic(PortalPermissionUtil.class);
        PowerMockito.mockStatic(PermissionThreadLocal.class);
        PowerMockito.mockStatic(UserPermissionUtil.class);
        PowerMockito.mockStatic(ContactLocalServiceUtil.class);
        PowerMockito.mockStatic(GroupLocalServiceUtil.class);
        PowerMockito.mockStatic(UserGroupLocalServiceUtil.class);
        PowerMockito.mockStatic(RoleLocalServiceUtil.class);
        PowerMockito.mockStatic(EmailAddressServiceUtil.class);
        PowerMockito.mockStatic(EmailAddressLocalServiceUtil.class);
        PowerMockito.mockStatic(PhoneServiceUtil.class);
        PowerMockito.mockStatic(PhoneLocalServiceUtil.class);
        PowerMockito.mockStatic(WebsiteServiceUtil.class);
        PowerMockito.mockStatic(WebsiteLocalServiceUtil.class);
        PowerMockito.mockStatic(OrgLaborServiceUtil.class);
        PowerMockito.mockStatic(OrgLaborLocalServiceUtil.class);

        // Permission checker
        mockUser = AngularTestHelper.createMockUser(1L,"Doe", "John", "JohnDoe", 123L);
        _permissionChecker.init(mockUser);

        when(PermissionThreadLocal.getPermissionChecker()).thenReturn(_permissionChecker);

    }

    @Test
    public void getOrganizationById() throws PortalException {

        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(2l, 123L, "organization", true, "Test organization");

        when(OrganizationServiceUtil.getOrganization(organization.getOrganizationId())).thenReturn(organization);

        com.liferay.portal.kernel.model.Organization result = _service.getOrganization(organization.getOrganizationId());

        assertNotNull(organization);
        assertEquals(organization.getOrganizationId(), result.getOrganizationId());
    }

    @Test
    public void getOrganizationUsers() throws PortalException {

        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(2l, 123L, "organization", true, "Test organization");

        java.util.List<User> companyUsers = new ArrayList<>();
        companyUsers.add(AngularTestHelper.createMockUser(1L, "Doe", "John", "JohnDoe", 123L));
        companyUsers.add(AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L));
        companyUsers.add(AngularTestHelper.createMockUser(3L, "Doe", "Johnny", "JohnnyDoe", 123L));
        companyUsers.add(AngularTestHelper.createMockUser(4L, "Doe", "Janie", "JanieDoe", 123L));

        when(OrganizationServiceUtil.getOrganization(organization.getOrganizationId())).thenReturn(organization);
        when(UserLocalServiceUtil.getOrganizationUsers(organization.getOrganizationId())).thenReturn(companyUsers);

        java.util.List<com.liferay.portal.kernel.model.User> result = _service.getOrganizationUsers(organization.getOrganizationId());

        assertNotNull(result);
        assertEquals(4, result.size());

    }

    @Test
    public void getOrganizationAddresses() throws PortalException {

        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(2l, 123L, "organization", true, "Test organization");

        com.liferay.portal.kernel.model.Address address1 = AngularTestHelper.createMockAddress(2L, 1L, 1L, true, true, "Vogelherstraße 8", null, null, "90559", "Burthann", 4L, 4L);
        com.liferay.portal.kernel.model.Address address2 = AngularTestHelper.createMockAddress(2L, 1L, 1L, true, true, "Reinerzer Straße 60 ", null, null, "90473", "Nürnberg", 4L, 4L);

        java.util.List<com.liferay.portal.kernel.model.Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);

        when(organization.getAddresses()).thenReturn(addresses);
        when(OrganizationServiceUtil.getOrganization(organization.getOrganizationId())).thenReturn(organization);

        java.util.List<com.liferay.portal.kernel.model.Address> result = _service.getOrganizationAdresses(organization.getOrganizationId());

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void getOrganizationPhones() throws PortalException {

        long organizationId = 2L;
        long companyId = 123L;

        java.util.List<com.liferay.portal.kernel.model.Phone> phones = new ArrayList<>();

        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(organizationId, companyId, "organization", true, "Test organization");

        phones.add(AngularTestHelper.createPhone(organizationId, 1l, true, true, 11011, "+49 911 111111", ""));
        phones.add(AngularTestHelper.createPhone(organizationId, 2l, true, true, 11008, "+49 171 111111", ""));

        when(PhoneLocalServiceUtil.getPhones(companyId, Organization.class.getName(), organizationId)).thenReturn(phones);
        when(OrganizationServiceUtil.getOrganization(organizationId)).thenReturn(organization);


        java.util.List<com.liferay.portal.kernel.model.Phone> result = _service.getOrganizationPhones(organizationId);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void getOrganizationEmailAddresses() throws PortalException {

        long organizationId = 2L;
        long companyId = 123L;

        java.util.List<com.liferay.portal.kernel.model.EmailAddress> emailAddresses = new ArrayList<>();

        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(organizationId, companyId, "organization", true, "Test organization");

        emailAddresses.add(AngularTestHelper.createEmailAddress(1L, 1l, true, true, 12004, "John.Doe@test.com"));
        emailAddresses.add(AngularTestHelper.createEmailAddress(2L, 2l, true, true, 12005, "Jane.Doe@test.com"));

        when(EmailAddressLocalServiceUtil.getEmailAddresses(companyId, Organization.class.getName(), organizationId)).thenReturn(emailAddresses);
        when(OrganizationServiceUtil.getOrganization(organizationId)).thenReturn(organization);

        java.util.List<com.liferay.portal.kernel.model.EmailAddress> result = _service.getOrganizationEmailAddresses(organizationId);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void getOrganizationWebsites() throws PortalException {

        long organizationId = 2L;
        long companyId = 123L;

        java.util.List<com.liferay.portal.kernel.model.Website> websites = new ArrayList<>();

        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(organizationId, companyId, "organization", true, "Test organization");

        websites.add(AngularTestHelper.createWebsite(1L, 1l, true, true, 10013, "www.test.com"));
        websites.add(AngularTestHelper.createWebsite(2L, 2l, true, true, 10013, "blog.test.com"));

        when( WebsiteLocalServiceUtil.getWebsites(companyId, Organization.class.getName(), organizationId)).thenReturn(websites);
        when(OrganizationServiceUtil.getOrganization(organizationId)).thenReturn(organization);

        java.util.List<com.liferay.portal.kernel.model.Website> result = _service.getOrganizationWebsites(organizationId);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void createOrganization() throws PortalException {

        long organizationId = 2L;
        long companyId = 123L;
        String type = "organization";
        boolean isNew = true;
        String name = "Test organization";
        String comment ="Created for junit tests";
        boolean site = false;
        int regionId = 4;
        int countryId = 4;
        int statusId = 1;

        // Mocked result organization
        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(organizationId, companyId, type, isNew, name);
        when(organization.getAddresses()).thenReturn(null);
        when(EmailAddressLocalServiceUtil.getEmailAddresses(organization.getOrganizationId(), com.liferay.portal.kernel.model.Organization.class.getName(), organization.getPrimaryKey())).thenReturn(null);
        when(PhoneLocalServiceUtil.getPhones(organization.getOrganizationId(), com.liferay.portal.kernel.model.Organization.class.getName(), organization.getPrimaryKey())).thenReturn(null);
        when(OrgLaborLocalServiceUtil.getOrgLabors(organization.getOrganizationId())).thenReturn(null);

        ServiceContext serviceContext = new ServiceContext();
        when(_service.getGuestOrUser()).thenReturn(mockUser);
        when(OrganizationLocalServiceUtil.addOrganization(anyLong(), anyLong(), anyString(), anyString(), anyLong(), anyLong(), anyLong(), anyString(), anyBoolean(), any(ServiceContext.class))).thenReturn(organization);

        com.liferay.portal.kernel.model.Organization result = _service.createOrganization(name, type, regionId, countryId, statusId, comment, false, null, null, null, null, null);

        assertNotNull(result);
        assertEquals(organization.getOrganizationId(), result.getOrganizationId());

    }
}

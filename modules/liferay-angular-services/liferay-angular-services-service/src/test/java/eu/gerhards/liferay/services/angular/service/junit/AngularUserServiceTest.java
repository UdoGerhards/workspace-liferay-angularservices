package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.*;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;
import com.liferay.portal.kernel.service.persistence.CompanyPersistence;
import com.liferay.portal.kernel.workflow.WorkflowThreadLocal;
import eu.gerhards.liferay.services.angular.service.impl.AngularUserServiceImpl;
import eu.gerhards.liferay.services.angular.service.util.ServicePermissionUtil;
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

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by udogerhards on 15.01.17.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        UserLocalServiceUtil.class
        , PortalPermissionUtil.class
        , PermissionThreadLocal.class
        , UserPermissionUtil.class
        , ContactLocalServiceUtil.class
        , GroupLocalServiceUtil.class
        , OrganizationLocalServiceUtil.class
        , UserGroupLocalServiceUtil.class
        , RoleLocalServiceUtil.class
        , WorkflowThreadLocal.class
        , ServicePermissionUtil.class

})

public class AngularUserServiceTest  {

    public static Log _log = LogFactoryUtil.getLog(AngularUserServiceTest.class);

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    protected PermissionChecker _permissionChecker;

    @Mock
    protected CompanyPersistence companyPersistence;

    @Mock
    protected UserLocalService userLocalService;

    @Mock
    protected AngularUserServiceImpl _serviceMock;

    @InjectMocks
    private AngularUserServiceImpl _service;

    private com.liferay.portal.kernel.model.User mockUser = null;

    @Before
    public void setUp() {

        PowerMockito.mockStatic(UserLocalServiceUtil.class);
        PowerMockito.mockStatic(PortalPermissionUtil.class);
        PowerMockito.mockStatic(PermissionThreadLocal.class);
        PowerMockito.mockStatic(UserPermissionUtil.class);
        PowerMockito.mockStatic(ContactLocalServiceUtil.class);
        PowerMockito.mockStatic(GroupLocalServiceUtil.class);
        PowerMockito.mockStatic(OrganizationLocalServiceUtil.class);
        PowerMockito.mockStatic(UserGroupLocalServiceUtil.class);
        PowerMockito.mockStatic(RoleLocalServiceUtil.class);
        PowerMockito.mockStatic(WorkflowThreadLocal.class);
        PowerMockito.mockStatic(ServicePermissionUtil.class);

        // Permission checker
        mockUser = AngularTestHelper.createMockUser(1L,"Doe", "John", "JohnDoe", 123L);
        _permissionChecker.init(mockUser);

        when(PermissionThreadLocal.getPermissionChecker()).thenReturn(_permissionChecker);

    }

    @Test
    public void getCompanyUsers() throws PortalException {

        List<com.liferay.portal.kernel.model.User> companyUsers = new ArrayList<com.liferay.portal.kernel.model.User>();

        companyUsers.add(AngularTestHelper.createMockUser(1L, "Doe", "John", "JohnDoe", 123L));
        companyUsers.add(AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L));
        companyUsers.add(AngularTestHelper.createMockUser(3L, "Doe", "Johnny", "JohnnyDoe", 123L));
        companyUsers.add(AngularTestHelper.createMockUser(4L, "Doe", "Janie", "JanieDoe", 123L));

        when(UserLocalServiceUtil.getCompanyUsersCount(123L)).thenReturn(4);
        when(UserLocalServiceUtil.getCompanyUsers(123L, 0, 3)).thenReturn(companyUsers);

        List<com.liferay.portal.kernel.model.User> result = _service.getCompanyUsers(123L);

        assertNotNull(result);
        assertEquals(4, result.size());
        assertEquals(3, result.get(2).getUserId());
    }

    @Test
    public void getUser() throws PortalException {


        _log.info("Get user test");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthday = cal.getTime();

        com.liferay.portal.kernel.model.User user = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.Contact contact = AngularTestHelper.createMockContact(user, false, birthday, "JaneDoe@test.com", false);

        List<com.liferay.portal.kernel.model.Role> roles = new ArrayList<com.liferay.portal.kernel.model.Role>();
        List<com.liferay.portal.kernel.model.Group> groups = new ArrayList<com.liferay.portal.kernel.model.Group>();
        List<com.liferay.portal.kernel.model.UserGroup> userGroups = new ArrayList<com.liferay.portal.kernel.model.UserGroup>();
        List<com.liferay.portal.kernel.model.Organization> organizations = new ArrayList<com.liferay.portal.kernel.model.Organization>();

        _log.info("Model mocks created ... ");

        when(UserLocalServiceUtil.getUser(2l)).thenReturn(user);
        when(ContactLocalServiceUtil.getContact(user.getContactId())).thenReturn(contact);
        when(RoleLocalServiceUtil.getUserRoles(user.getUserId())).thenReturn(roles);
        when(GroupLocalServiceUtil.getUserGroups(user.getUserId())).thenReturn(groups);
        when(OrganizationLocalServiceUtil.getUserOrganizations(user.getUserId())).thenReturn(organizations);
        when(UserGroupLocalServiceUtil.getUserUserGroups(user.getUserId())).thenReturn(userGroups);

        _log.info("Util methods mocked ... ");

        com.liferay.portal.kernel.model.User result =  _service.getUser(2L);

        assertNotNull(result);
        assertEquals(2, user.getUserId());
        assertNotNull(result.getContact());
    }

    @Test
    public void getUserContact() throws PortalException {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthday = cal.getTime();

        com.liferay.portal.kernel.model.User user = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.Contact contact = AngularTestHelper.createMockContact(user, false, birthday, "JaneDoe@test.com", false);

        _log.info("Model mocks created ... ");


        when(user.fetchContact()).thenReturn(contact);
        when(UserLocalServiceUtil.getUser(2)).thenReturn(user);

        _log.info("Util methods mocked ... ");

        com.liferay.portal.kernel.model.Contact result = _service.getUserContact(user.getUserId());

        assertNotNull(result);
        assertEquals(2L, result.getUserId());
        assertEquals(2L, result.getContactId());
    }

    @Test
    public void getUserAddress() throws PortalException {

        com.liferay.portal.kernel.model.User user = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.Address address = AngularTestHelper.createMockAddress(2L, 1L, 1L, true, true, "Vogelherstraße 8", null, null, "90559", "Burthann", 4L, 4L);

        List<Address> addresses = new ArrayList<Address>();
        addresses.add(address);

        _log.info("Model mocks created ... ");

        when(user.getAddresses()).thenReturn(addresses);
        when(UserLocalServiceUtil.getUser(2L)).thenReturn(user);
        //PowerMockito.doReturn(addresses).when(user.getAddresses());

        _log.info("Util methods mocked ... ");

        List<Address> result = _service.getUserAddress(user.getUserId());

        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void getUserEmailAddresses() throws PortalException {

        com.liferay.portal.kernel.model.User user = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.EmailAddress emailAddress = AngularTestHelper.createEmailAddress(2L, 1L, true, true, 1L, "Udo.Gerhards@gerhards.eu");

        List<EmailAddress> emailAddresses = new ArrayList<EmailAddress>();
        emailAddresses.add(emailAddress);

        _log.info("Model mocks created ... ");

        when(user.getEmailAddresses()).thenReturn(emailAddresses);
        when(UserLocalServiceUtil.getUser(2L)).thenReturn(user);

        _log.info("Util methods mocked ... ");

        List<EmailAddress> result = _service.getUserEmailAddresses(user.getUserId());

        assertNotNull(result);
        assertEquals(1, result.size());

    }

    @Test
    public void getUserSites() throws PortalException {
        com.liferay.portal.kernel.model.User user = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.Group group = AngularTestHelper.createGroup(1L, 1, true, "Test user group", null, "Lorem ipsum", null);

        List<Group> groups = new ArrayList<>();
        groups.add(group);

        when(user.getMySiteGroups()).thenReturn(groups);
        when(UserLocalServiceUtil.getUser(user.getUserId())).thenReturn(user);

        _log.info("Util methods mocked ... ");

        List<Group> result = _service.getUserSites(user.getUserId());

        assertNotNull(result);
        assertEquals(1, result.size());
    }


    @Test
    public void getUserOrganizations() throws PortalException {
        com.liferay.portal.kernel.model.User user = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.Organization organization = AngularTestHelper.createOrganization(2l, 123L, "organization", true, "Test organization");

        List<Organization> organizations = new ArrayList<>();
        organizations.add(organization);

        when(user.getOrganizations()).thenReturn(organizations);
        when(UserLocalServiceUtil.getUser(user.getUserId())).thenReturn(user);

        List<Organization> result = _service.getUserOrganizations(user.getUserId());

        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    public void addNewUser() throws PortalException {

        com.liferay.portal.kernel.model.User newUser = AngularTestHelper.createMockUser(2L, "Doe", "Jane", "JaneDoe", 123L);
        com.liferay.portal.kernel.model.Company company = AngularTestHelper.createCompany(1L, "testcompany", "Test company","testcompany.com" ,false ,0 , true, true, "Udo Gerhards");

        String screenName = "testUser";
        String emailAddress = "test@gerhards.eu";
        long companyId = 123L;
        String locale = "de_DE";

        when(WorkflowThreadLocal.isEnabled()).thenReturn(false);

        when(companyPersistence.findByPrimaryKey(123L)).thenReturn(company);
        when(userLocalService.getDefaultUserId(company.getCompanyId())).thenReturn(0L);

        when(UserLocalServiceUtil.fetchUserByEmailAddress(123L, emailAddress)).thenReturn(null);
        when(UserLocalServiceUtil.addUserWithWorkflow(1L,companyId, true, "", "", false, screenName, emailAddress, 0, "", Locale.GERMANY, "-", "", "-",0,0, false, 1, 1,1970, "", new long[0], new long[0], new long[0], new long[0], true, null)).thenReturn(newUser);
        when(_service.getGuestOrUserId()).thenReturn(1L);

        // addNewUser(String screenName, String emailAddress, long companyId, String locale, long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds)
        User user = _service.addNewUser(screenName, emailAddress, companyId, locale, null, null, null, null);

        assertNotNull(user);
        assertEquals(2, user.getUserId());

    }

    @Test
    public void updateUserAddress() throws PortalException {

        long userId = 2l;
        long contactId = 123L;

        java.util.List<com.liferay.portal.kernel.model.Address> addresses = new ArrayList<>();

        addresses.add(AngularTestHelper.createMockAddress(userId, 1L, 10000, true, true, "Hauptstraße 123", "", "" , "12345", "Irgendwo", 4L, 4L));
        addresses.add(AngularTestHelper.createMockAddress(userId, 2L, 10003, true, true, "Andere Straße 123", "", "" , "12345", "Irgendwo", 4L, 4L));


    }


    public void deleteUserByEmail() throws PortalException {
    }


    public void deleteUserById() throws PortalException {
    }


    public void updateUser() throws PortalException {
    }

    public void updateUserEmailAddresses() throws PortalException {
    }


    public void updateUserOrganizations() throws PortalException {
    }


    public void updateUserPhones() throws PortalException {
    }


    public void updateUserRoles() throws PortalException {
    }


    public void updateUserUserGroups() throws PortalException {
    }


    public void updateUserWebsites() throws PortalException {
    }


}

package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleConstants;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.RolePermissionUtil;
import eu.gerhards.liferay.services.angular.service.impl.AngularRoleServiceImpl;
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
import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.*;


/**
 * Created by udogerhards on 13.01.17.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        RoleLocalServiceUtil.class
        , PortalPermissionUtil.class
        , PermissionThreadLocal.class
        , RolePermissionUtil.class
})

public class AngularRoleServiceTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    protected PermissionChecker _permissionChecker;

    @InjectMocks
    private AngularRoleServiceImpl _service;

    private com.liferay.portal.kernel.model.User mockUser = null;

    @Before
    public void setUp() throws PortalException, PrincipalException {

        PowerMockito.mockStatic(RoleLocalServiceUtil.class);
        PowerMockito.mockStatic(PortalPermissionUtil.class);
        PowerMockito.mockStatic(PermissionThreadLocal.class);
        PowerMockito.mockStatic(RolePermissionUtil.class);

        // Permission checker
        mockUser = this.createMockUser(1L,"Doe", "John", 123L);
        _permissionChecker.init(mockUser);

        when(PermissionThreadLocal.getPermissionChecker()).thenReturn(_permissionChecker);

    }

    @Test()
    public void getRolesInCompany() throws PortalException, PrincipalException {

        // Prepare
        List<Role> roleList = new ArrayList<Role>();

        com.liferay.portal.kernel.model.Role role1 = this.createMockedRole(123L, "Mock role1", 0L, RoleConstants.TYPE_REGULAR, null);
        roleList.add(role1);

        com.liferay.portal.kernel.model.Role role2 = this.createMockedRole(123L, "Mock role2", 1L, RoleConstants.TYPE_SITE, null);
        roleList.add(role2);

        when(RoleLocalServiceUtil.getRoles(123L)).thenReturn(roleList);


        // Test
        List<Role> roles = _service.getRolesInCompany(123L);
        Role role = roles.get(0);
        assertEquals(2, roles.size());
    }


    @Test()
    public void getRegularRoles() throws PortalException, PrincipalException {

        // Prepare
        List<Role> roleList = new ArrayList<Role>();

        com.liferay.portal.kernel.model.Role role1 = this.createMockedRole(123L, "Mock role1", 0L, RoleConstants.TYPE_REGULAR, null);
        roleList.add(role1);

        com.liferay.portal.kernel.model.Role role2 = this.createMockedRole(123L, "Mock role2", 1L, RoleConstants.TYPE_SITE, null);
        roleList.add(role2);

        when(RoleLocalServiceUtil.getRoles(123L)).thenReturn(roleList);

        // Test
        List<Role> roles = _service.getRegularRoles(123L);
        Role role = roles.get(0);
        assertEquals(1, roles.size());

    }

    @Test()
    public void getSiteRoles() throws PortalException, PrincipalException {
        // Prepare
        List<Role> roleList = new ArrayList<Role>();

        com.liferay.portal.kernel.model.Role role1 = this.createMockedRole(123L, "Mock role1", 0L, RoleConstants.TYPE_REGULAR, null);
        roleList.add(role1);

        com.liferay.portal.kernel.model.Role role2 = this.createMockedRole(123L, "Mock role2", 1L, RoleConstants.TYPE_SITE, null);
        roleList.add(role2);

        when(RoleLocalServiceUtil.getRoles(123L)).thenReturn(roleList);

        // Test
        List<Role> roles = _service.getSiteRoles(123L);
        Role role = roles.get(0);
        assertEquals(1, roles.size());
    }

    @Test()
    public void createRole() throws PortalException {

        long companyId = 123L;
        long roleId = 123;

        String name = "Test role";
        String className = "om.liferay.portal.kernel.model.Role";

        Map<Locale, String> roleNames = new HashMap<Locale, String>();
        roleNames.put(Locale.GERMANY, "Test Rolle");
        roleNames.put(Locale.ENGLISH, "Test role");

        com.liferay.portal.kernel.model.Role role1 = this.createMockedRole(companyId, name, roleId, RoleConstants.TYPE_REGULAR, className);

        AngularRoleServiceImpl serviceSpy = spy(_service);
        doReturn(1L).when(serviceSpy).getUserId();
        when(RoleLocalServiceUtil.addRole(mockUser.getUserId(), className,0, name, roleNames, null, RoleConstants.TYPE_REGULAR,  null, null)).thenReturn(role1);

        Role result = serviceSpy.createRole(name, RoleConstants.TYPE_REGULAR, className, roleNames, null, null);

        assertEquals(role1.getRoleId(), result.getRoleId());
    }

    @Test()
    public void updateRole() throws PortalException {

        long companyId = 123L;
        long roleId = 123;

        String name = "Test role";
        String className = "om.liferay.portal.kernel.model.Role";

        Map<Locale, String> roleNames = new HashMap<Locale, String>();
        roleNames.put(Locale.GERMANY, "Test Rolle");
        roleNames.put(Locale.ENGLISH, "Test role");

        com.liferay.portal.kernel.model.Role role1 = this.createMockedRole(companyId, name, roleId, RoleConstants.TYPE_REGULAR, className);

        AngularRoleServiceImpl serviceSpy = spy(_service);
        doReturn(1L).when(serviceSpy).getUserId();
        when(RoleLocalServiceUtil.updateRole(role1.getRoleId(), name, roleNames, null, null, null)).thenReturn(role1);

        Role result = serviceSpy.updateRole(role1.getRoleId(), name, RoleConstants.TYPE_REGULAR, className, roleNames, null, null);

        assertEquals(role1.getRoleId(), result.getRoleId());

    }

    @Test()
    public void deleteRole() throws PortalException {

        long companyId = 123L;
        long roleId = 123;

        String name = "Test role";
        String className = "om.liferay.portal.kernel.model.Role";

        Map<Locale, String> roleNames = new HashMap<Locale, String>();
        roleNames.put(Locale.GERMANY, "Test Rolle");
        roleNames.put(Locale.ENGLISH, "Test role");

        com.liferay.portal.kernel.model.Role role1 = this.createMockedRole(companyId, name, roleId, RoleConstants.TYPE_REGULAR, className);

        AngularRoleServiceImpl serviceSpy = spy(_service);
        doReturn(1L).when(serviceSpy).getUserId();

        when(RoleLocalServiceUtil.deleteRole(role1.getRoleId())).thenReturn(role1);
        Role result = serviceSpy.deleteRole(role1.getRoleId());

        assertEquals(role1.getRoleId(), result.getRoleId());

    }

    protected Role createMockedRole(long companyId, String name, long roleId, int type, String className) {

        com.liferay.portal.kernel.model.Role role = mock(Role.class);

        when(role.getCompanyId()).thenReturn(companyId);
        when(role.getName()).thenReturn(name);
        when(role.getRoleId()).thenReturn(roleId);
        when(role.getType()).thenReturn(type);
        when(role.getClassName()).thenReturn(className);

        return role;
    }

    protected com.liferay.portal.kernel.model.User createMockUser(long userId, String lastName, String firstName, long companyId) {

        com.liferay.portal.kernel.model.User user = mock(com.liferay.portal.kernel.model.User.class);

        when(user.getUserId()).thenReturn(userId);
        when(user.getCompanyId()).thenReturn(companyId);
        when(user.getLastName()).thenReturn(lastName);
        when(user.getFirstName()).thenReturn(firstName);

        return user;
    }
}

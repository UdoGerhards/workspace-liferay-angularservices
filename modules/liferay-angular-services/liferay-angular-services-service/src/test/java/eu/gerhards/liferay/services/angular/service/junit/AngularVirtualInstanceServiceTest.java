package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceServiceImpl;
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
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by udogerhards on 22.01.17.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        CompanyLocalServiceUtil.class
        , CompanyServiceUtil.class
        , CompanyLocalService.class
        , UserLocalServiceUtil.class
        , UserServiceUtil.class
        , OrganizationLocalServiceUtil.class
        , OrganizationServiceUtil.class
        , PortalPermissionUtil.class
        , PermissionThreadLocal.class
        , PortalBeanLocatorUtil.class
})
public class AngularVirtualInstanceServiceTest {

    public static Log _log = LogFactoryUtil.getLog(AngularVirtualInstanceServiceTest.class);

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    protected PermissionChecker _permissionChecker;

    @Mock
    protected CompanyLocalService companyLocalService;

    @InjectMocks
    protected AngularVirtualInstanceServiceImpl _service;

    private com.liferay.portal.kernel.model.User mockUser = null;

    @Before
    public void setUp() {
        PowerMockito.mockStatic(CompanyLocalServiceUtil.class);
        PowerMockito.mockStatic(CompanyServiceUtil.class);
        PowerMockito.mockStatic(CompanyLocalService.class);
        PowerMockito.mockStatic(UserLocalServiceUtil.class);
        PowerMockito.mockStatic(UserServiceUtil.class);
        PowerMockito.mockStatic(OrganizationLocalServiceUtil.class);
        PowerMockito.mockStatic(OrganizationServiceUtil.class);
        PowerMockito.mockStatic(PortalPermissionUtil.class);
        PowerMockito.mockStatic(PermissionThreadLocal.class);
        PowerMockito.mockStatic(PortalBeanLocatorUtil.class);

        // Permission checker
        mockUser = AngularTestHelper.createMockUser(1L,"Doe", "John", "JohnDoe", 123L);
        _permissionChecker.init(mockUser);

        when(PermissionThreadLocal.getPermissionChecker()).thenReturn(_permissionChecker);
    }

    @Test
    public void getAvailableInstances() throws PortalException {

        java.util.List<com.liferay.portal.kernel.model.Company> companies = new ArrayList<com.liferay.portal.kernel.model.Company>();

        companies.add(AngularTestHelper.createCompany(1L, "testcompany1", "Test company 1","testcompany1.com" ,false ,0 , true, true, "John Doe"));
        companies.add(AngularTestHelper.createCompany(2L, "testcompany2", "Test company 2","testcompany2.com" ,false ,0 , true, true, "Jane Doe"));

        when(CompanyLocalServiceUtil.getCompanies()).thenReturn(companies);

        java.util.List<com.liferay.portal.kernel.model.Company> result = _service.getAvailableInstances();

        assertNotNull(result);
        assertEquals(2, result.size());

    }

    @Test
    public void createVirtualInstance() throws PortalException {

        String webId = "testcompany";
        String virtualHostName = "Test company";
        String  mx = "testcompany.com";
        boolean isSystem = false;
        int maxUsers = 0;
        boolean isActive = false;

        com.liferay.portal.kernel.model.Company company = AngularTestHelper.createCompany(1L, webId, virtualHostName,mx ,isSystem ,maxUsers , isActive, true, "John Doe");
        when(CompanyLocalServiceUtil.addCompany(webId, virtualHostName, mx, isSystem, maxUsers, isActive)).thenReturn(company);

        com.liferay.portal.kernel.model.Company result = _service.createVirtualInstance(webId, virtualHostName, mx, isSystem, maxUsers, isActive);

        assertNotNull(result);
        assertEquals(1, result.getCompanyId());
    }

    @Test
    public void updateVirtualInstance() throws PortalException {

        long companyId = 1;
        String webId = "testcompany";
        String virtualHostname = "Test company";
        String  mx = "testcompany.com";
        boolean isSystem = false;
        int maxUsers = 0;
        boolean isActive = false;

        com.liferay.portal.kernel.model.Company company = AngularTestHelper.createCompany(1L, webId, virtualHostname,mx ,isSystem ,maxUsers , isActive, true, "John Doe");

        when(CompanyLocalServiceUtil.updateCompany(companyId, virtualHostname, mx, maxUsers, isActive)).thenReturn(company);

        com.liferay.portal.kernel.model.Company result = _service.updateVirtualInstance(companyId, virtualHostname, mx, maxUsers, isActive);

        assertNotNull(result);
        assertEquals(1, result.getCompanyId());

    }

    @Test
    public void updateVirtualInstanceExtended() throws PortalException {

        long companyId = 1;
        String webId = "testcompany";
        boolean isSystem = false;
        int maxUsers = 0;
        boolean isActive = false;

        String  mx = "testcompany.com";
        String virtualHostname = "Test company";
        String homeUrl = "/testcompany";
        boolean logo = false;
        byte[] logoBytes = new byte[0];
        String name = "Test company";
        String legalId = "testcompany";
        String legalName = "Test company";
        String legalType = "Test legal type";
        String sicCode = "testcompany";
        String tickerSymbol = "Liferay - Test company";
        String industry = "Internet";
        String type = "company";
        String size = "0";

        com.liferay.portal.kernel.model.Company company = AngularTestHelper.createCompany(1L, webId, virtualHostname,mx ,isSystem ,maxUsers , isActive, true, "John Doe");

        when(CompanyLocalServiceUtil.updateCompany(companyId, virtualHostname, mx, homeUrl, logo, logoBytes, name, legalName, legalId, legalType, sicCode, tickerSymbol, industry, type, size)).thenReturn(company);

        com.liferay.portal.kernel.model.Company result = _service.updateVirtualInstanceExtended(companyId, virtualHostname, mx, homeUrl, logo, logoBytes, name, legalName, legalId, legalType, sicCode, tickerSymbol, industry, type, size);

        assertNotNull(result);
        assertEquals(1, result.getCompanyId());
    }

    public void deleteVirtualInstance() throws PortalException {

    }

    public void getVirtualInstance() throws PortalException {

    }


}

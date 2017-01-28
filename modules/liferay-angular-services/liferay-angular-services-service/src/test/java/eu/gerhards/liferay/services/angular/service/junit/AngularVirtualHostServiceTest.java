package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.VirtualHost;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.VirtualHostLocalService;
import com.liferay.portal.kernel.service.VirtualHostLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.persistence.VirtualHostPersistence;
import eu.gerhards.liferay.services.angular.service.impl.AngularVirtualHostServiceImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by udogerhards on 28.01.17.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        VirtualHostLocalServiceUtil.class
        , VirtualHostLocalService.class
        , CounterLocalServiceUtil.class
        , CounterLocalService.class
        , PermissionThreadLocal.class
        , PortalPermissionUtil.class

})
public class AngularVirtualHostServiceTest extends AngularServiceTestBase {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    protected PermissionChecker _permissionChecker;

    @Mock
    protected VirtualHostPersistence _virtualHostPersistence;

    @InjectMocks
    private AngularVirtualHostServiceImpl _service;

    private com.liferay.portal.kernel.model.User mockUser = null;

    @Before
    public void setUp() {
        java.util.List<Class> clazzes = new ArrayList<>();

        clazzes.add(VirtualHostLocalServiceUtil.class);
        clazzes.add(VirtualHostLocalService.class);
        clazzes.add(CounterLocalServiceUtil.class);
        clazzes.add(CounterLocalService.class);
        clazzes.add(PortalPermissionUtil.class);
        clazzes.add(PermissionThreadLocal.class);

        this.mockStatic(clazzes);

        // Permission checker
        mockUser = AngularTestHelper.createMockUser(1L,"Doe", "John", "JohnDoe", 123L);
        _permissionChecker.init(mockUser);

        when(PermissionThreadLocal.getPermissionChecker()).thenReturn(_permissionChecker);


    }


    @Test
    public void createVirtualHost() throws PortalException {

        long virtualHostID = 1L;
        long companyId = 123L;
        String virtualHostName = "virtualhost.de";

        VirtualHost vhost = AngularTestHelper.createVirtualHost(virtualHostID,companyId, virtualHostName);

        when(CounterLocalServiceUtil.increment(VirtualHost.class.getName())).thenReturn(virtualHostID);
        when(VirtualHostLocalServiceUtil.createVirtualHost(virtualHostID)).thenReturn(vhost);
        when(VirtualHostLocalServiceUtil.updateVirtualHost(any(VirtualHost.class))).thenReturn(vhost);

        VirtualHost result = _service.createVirtualHost(companyId,virtualHostName);

        assertNotNull(result);
        assertEquals(virtualHostID, result.getVirtualHostId());
        assertEquals(virtualHostName, result.getHostname());
        assertEquals(companyId, result.getCompanyId());

    }

    @Test
    public void updateVirtualHost() throws PortalException {

        long layoutSetId = 1L;
        long companyId = 123L;
        long virtualHostID = 1L;
        String virtualHostName = "virtualhost.de";
        String virtualHostNameUpdated = "testvirtualhost.de";

        VirtualHost vhostUpdated = AngularTestHelper.createVirtualHost(virtualHostID,companyId, virtualHostNameUpdated);

        when(VirtualHostLocalServiceUtil.updateVirtualHost(companyId, layoutSetId, virtualHostNameUpdated)).thenReturn(vhostUpdated);

        VirtualHost result = _service.updateVirtualHost(companyId, layoutSetId, virtualHostNameUpdated);

        assertNotNull(result);
        assertEquals(virtualHostID, result.getVirtualHostId());
        assertEquals(companyId, result.getCompanyId());
        assertEquals(virtualHostNameUpdated, result.getHostname());

    }


}

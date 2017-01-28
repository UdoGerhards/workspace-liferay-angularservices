package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.service.permission.UserPermissionUtil;
import com.liferay.portal.kernel.workflow.WorkflowThreadLocal;
import eu.gerhards.liferay.services.angular.service.impl.AngularLayoutServiceImpl;
import eu.gerhards.liferay.services.angular.service.util.ServicePermissionUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.Arrays;

import static org.powermock.api.mockito.PowerMockito.when;

/**
 * Created by udogerhards on 28.01.17.
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
        , LayoutLocalServiceUtil.class
        , LayoutLocalService.class

})
public class AngularLayoutServiceTest extends AngularServiceTestBase {

    @Mock
    protected PermissionChecker _permissionChecker;

    @InjectMocks
    private AngularLayoutServiceImpl _service;

    @Before
    public void setUp() {

        java.util.List<Class> clazzes = new ArrayList<>(Arrays.asList(new Class[]{
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
            , LayoutLocalServiceUtil.class
            , LayoutLocalService.class
        }));

        this.mockStatic(clazzes);

        // Permission checker
        mockUser = AngularTestHelper.createMockUser(1L,"Doe", "John", "JohnDoe", 123L);
        _permissionChecker.init(mockUser);

        when(PermissionThreadLocal.getPermissionChecker()).thenReturn(_permissionChecker);
    }

    @Test
    public void getLayoutById() throws PortalException {



    }

}

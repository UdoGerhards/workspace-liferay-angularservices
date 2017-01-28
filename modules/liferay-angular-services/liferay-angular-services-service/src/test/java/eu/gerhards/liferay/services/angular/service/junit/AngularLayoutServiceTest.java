package eu.gerhards.liferay.services.angular.service.junit;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Layout;
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
import java.util.HashMap;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.*;
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

        long groupId = 1l;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;
        String name = "testlayout";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        when(LayoutLocalServiceUtil.getLayout(layoutId)).thenReturn(layout);

        Layout result = _service.getLayoutbyId(layoutId);

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());

    }

    @Test
    public void getLayouts() throws PortalException {

        long groupId = 1L;
        long companyId = 123L;
        long parentId = 0;

        java.util.List<com.liferay.portal.kernel.model.Layout> layouts = new ArrayList<>(
                Arrays.asList(new Layout[]{
                        AngularTestHelper.createLayout(groupId, 1L, companyId, parentId, "testlayout1", "/testlayout1", "_blank"),
                        AngularTestHelper.createLayout(groupId, 2L, companyId, parentId, "testlayout2", "/testlayout2", "_blank"),
                        AngularTestHelper.createLayout(groupId, 3L, companyId, parentId, "testlayout3", "/testlayout3", "_blank")
                })

        );

        when(LayoutLocalServiceUtil.getLayouts(groupId, true)).thenReturn(layouts);

        java.util.List<com.liferay.portal.kernel.model.Layout> results = _service.getLayouts(groupId, true);

        assertNotNull(results);
        assertEquals(3, results.size());
    }

    @Test
    public void createLayout() throws PortalException {
        long groupId = 1l;
        boolean privateLayout = true;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;

        java.util.Map<Locale, String> nameMap = new HashMap<Locale, String>();
        nameMap.put(Locale.GERMANY, "Layout1");
        nameMap.put(Locale.UK, "Layout1");

        java.util.Map<Locale, String> titleMap = new HashMap<Locale, String>();
        titleMap.put(Locale.GERMANY, "Layout1");
        titleMap.put(Locale.UK, "Layout1");

        java.util.Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
        descriptionMap.put(Locale.GERMANY, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat");
        descriptionMap.put(Locale.UK,  "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat");

        java.util.Map<Locale, String> keywordsMap = new HashMap<Locale, String>();
        keywordsMap.put(Locale.GERMANY, "Lorem ipsum");
        keywordsMap.put(Locale.UK, "Lorem ipsum");

        java.util.Map<Locale, String> robotsMap = new HashMap<Locale, String>();
        robotsMap.put(Locale.GERMANY, "Lorem ipsum");
        robotsMap.put(Locale.UK, "Lorem ipsum");

        java.util.Map<Locale, String> friendlyUrlMap = new HashMap<Locale, String>();
        friendlyUrlMap.put(Locale.GERMANY, "/testlayout-germany");
        friendlyUrlMap.put(Locale.UK, "/testlayout-english");

        String type = "portlet";
        String typeSettings = "";

        boolean hidden = false;

        String name = "Layout1";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        when(LayoutLocalServiceUtil.addLayout(anyLong(), anyLong(),anyBoolean(),anyLong(),anyMap(),anyMap(),anyMap(),anyMap(),anyMap(),anyString(),anyString(),anyBoolean(),anyMap(), any(ServiceContext.class))).thenReturn(layout);

        // long groupId, boolean privateLayout, long parentLayoutId, Map<Locale, String> nameMap, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, Map<Locale, String> keywordsMap, Map<Locale, String> robotsMap, String type, String typeSettings, boolean hidden, Map<Locale, String> friendlyURLMap
        com.liferay.portal.kernel.model.Layout result = _service.createLayout(groupId, privateLayout, parentId, nameMap, titleMap, descriptionMap, keywordsMap, robotsMap, type, typeSettings, hidden, friendlyUrlMap );

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());

    }

    @Test
    public void updateLayout() throws PortalException {
        long groupId = 1l;
        boolean privateLayout = true;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;

        java.util.Map<Locale, String> nameMap = new HashMap<Locale, String>();
        nameMap.put(Locale.GERMANY, "Layout1");
        nameMap.put(Locale.UK, "Layout1");

        java.util.Map<Locale, String> titleMap = new HashMap<Locale, String>();
        titleMap.put(Locale.GERMANY, "Layout1");
        titleMap.put(Locale.UK, "Layout1");

        java.util.Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
        descriptionMap.put(Locale.GERMANY, "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat");
        descriptionMap.put(Locale.UK,  "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat");

        java.util.Map<Locale, String> keywordsMap = new HashMap<Locale, String>();
        keywordsMap.put(Locale.GERMANY, "Lorem ipsum");
        keywordsMap.put(Locale.UK, "Lorem ipsum");

        java.util.Map<Locale, String> robotsMap = new HashMap<Locale, String>();
        robotsMap.put(Locale.GERMANY, "Lorem ipsum");
        robotsMap.put(Locale.UK, "Lorem ipsum");

        java.util.Map<Locale, String> friendlyUrlMap = new HashMap<Locale, String>();
        friendlyUrlMap.put(Locale.GERMANY, "/testlayout-germany");
        friendlyUrlMap.put(Locale.UK, "/testlayout-english");

        String type = "portlet";
        String typeSettings = "";

        boolean hidden = false;
        boolean image = false;
        byte[] imageByte = new byte[]{};

        String name = "Layout1";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        when(LayoutLocalServiceUtil.updateLayout(anyLong(), anyBoolean(), anyLong(), anyLong(), anyMap(), anyMap(), anyMap(), anyMap(), anyMap(), anyString(), anyBoolean(), anyMap(), anyBoolean(), any(byte[].class), any(ServiceContext.class) )).thenReturn(layout);

        com.liferay.portal.kernel.model.Layout result = _service.updateLayout(groupId, privateLayout, layoutId, parentId, nameMap, titleMap, descriptionMap, keywordsMap, robotsMap, type, hidden, friendlyUrlMap, image, imageByte );

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());


    }

    @Test
    public void updateLayoutName() throws PortalException {
        long groupId = 1l;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;
        String languageId = Locale.GERMAN.toString();

        String name = "Layout1";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        when(LayoutLocalServiceUtil.updateName(layoutId, name, languageId)).thenReturn(layout);

        com.liferay.portal.kernel.model.Layout result = _service.updateName(layoutId, name, languageId);

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());
    }

    @Test
    public void updateFriendlyUrl() throws PortalException {

        long groupId = 1l;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;
        String languageId = Locale.GERMAN.toString();

        String name = "Layout1";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        when(LayoutLocalServiceUtil.updateFriendlyURL(anyLong(), anyLong(), anyString(), anyString())).thenReturn(layout);

        com.liferay.portal.kernel.model.Layout result = _service.updateFriendlyURL(layoutId, friendlyUrl, languageId);

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());

    }

    @Test
    public void updatePriority() throws PortalException {

        long groupId = 1l;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;
        int priority = 1;
        boolean privateLayout = true;

        String name = "Layout1";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        when(LayoutLocalServiceUtil.updatePriority(anyLong(), anyBoolean(), anyLong(), anyInt())).thenReturn(layout);

        com.liferay.portal.kernel.model.Layout result = _service.updatePriority(groupId, privateLayout, layoutId, priority);

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());

    }

    @Test
    public void updateLookAndFeel() throws PortalException {

        long groupId = 1l;
        long layoutId =  1L;
        long companyId = 123L;
        long parentId = 0L;
        int priority = 1;
        boolean privateLayout = true;
        String themeId = "Test team";

        String name = "Layout1";
        String friendlyUrl = "/testlayout";
        String target = "_blank";

        String colorScheme = "colorScheme1";
        String css = "#test{color:#ffffff;background-color:#000000;}";

        com.liferay.portal.kernel.model.Layout layout = AngularTestHelper.createLayout(groupId, layoutId, companyId, parentId, name, friendlyUrl, target);

        // updateLookAndFeel(long groupId, boolean privateLayout, long layoutId, String themeId, String colorSchemeId, String css)
        when(LayoutLocalServiceUtil.updateLookAndFeel(groupId, privateLayout, layoutId, themeId, colorScheme, css )).thenReturn(layout);

        com.liferay.portal.kernel.model.Layout result = _service.updateLookAndFeel(groupId, privateLayout, layoutId, themeId, colorScheme, css);

        assertNotNull(result);
        assertEquals(groupId, result.getGroupId());
        assertEquals(layoutId, result.getLayoutId());
        assertEquals(companyId, result.getCompanyId());

    }
}

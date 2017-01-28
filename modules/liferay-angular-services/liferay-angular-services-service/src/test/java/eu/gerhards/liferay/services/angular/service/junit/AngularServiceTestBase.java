package eu.gerhards.liferay.services.angular.service.junit;

import org.powermock.api.mockito.PowerMockito;

/**
 * Created by udogerhards on 28.01.17.
 */
public class AngularServiceTestBase {

    protected com.liferay.portal.kernel.model.User mockUser = null;

    public void mockStatic(java.util.List<Class> clazzes) {

        for (Class clazz:clazzes) {
            PowerMockito.mockStatic(clazz);
        }

    }

}

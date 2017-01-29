package eu.gerhards.liferay.services.angular.service.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by udogerhards on 28.01.17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AngularInstanceServiceTest.class,
        AngularVirtualHostServiceTest.class,
        AngularLayoutServiceTest.class,
        AngularRoleServiceTest.class,
        AngularOrganizationServiceTest.class,
        AngularUserServiceTest.class
})
public class AngularServiceTestSuite {


}

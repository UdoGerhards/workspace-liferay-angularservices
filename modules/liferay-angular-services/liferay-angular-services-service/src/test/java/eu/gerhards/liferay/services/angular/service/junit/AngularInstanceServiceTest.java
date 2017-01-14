package eu.gerhards.liferay.services.angular.service.junit;

import eu.gerhards.liferay.services.angular.service.AngularInstanceService;
import eu.gerhards.liferay.services.angular.service.impl.AngularInstanceServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by udogerhards on 13.01.17.
 */
public class AngularInstanceServiceTest {

    public AngularInstanceService _service = null;

    @Before
    public void setUp() {
        _service = new AngularInstanceServiceImpl();

    }

    @Test
    public void postTest() {
        String result = _service.postTest("test", "test", 123);

        assertEquals("test123test", result);
    }
}

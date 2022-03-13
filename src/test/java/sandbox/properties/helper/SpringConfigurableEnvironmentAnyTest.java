package sandbox.properties.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.ActiveProfiles;

/**
 * Configurable Environment Tests
 * https://stackoverflow.com/questions/23506471/access-all-environment-properties-as-a-map-or-properties-object
 */
@SpringBootTest
@ActiveProfiles("any")
public class SpringConfigurableEnvironmentAnyTest {


    @Autowired
    private ConfigurableEnvironment springEnv;

    @Test
    public void testProperties() {
        SpringConfigurableEnvironment properties = new SpringConfigurableEnvironment(springEnv);
        SpringConfigurableEnvironment.PropertyInfo info = properties.get("profile.env");
        assertEquals("any", info.getValue());
        assertEquals(
            "Config resource 'class path resource [application-any.properties]' via location 'optional:classpath:/'",
            info.getSourceList().get(0));
    }
}

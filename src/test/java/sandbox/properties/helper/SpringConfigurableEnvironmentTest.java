package sandbox.properties.helper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import sandbox.properties.helper.SpringConfigurableEnvironment;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Configurable Environment Tests
 * https://stackoverflow.com/questions/23506471/access-all-environment-properties-as-a-map-or-properties-object
 */
@SpringBootTest
public class SpringConfigurableEnvironmentTest {


    @Autowired
    private ConfigurableEnvironment springEnv;

    @Test
    public void testProperties() {
        SpringConfigurableEnvironment properties = new SpringConfigurableEnvironment(springEnv);
        SpringConfigurableEnvironment.PropertyInfo keyInfo = properties.get("key");
        assertEquals("value", keyInfo.getValue());
        assertEquals("default", properties.get("profile.env").getValue());
        assertEquals(
            "Config resource 'class path resource [application.properties]' via location 'optional:classpath:/'",
            properties.getSource("profile.env").get(0));
    }
}

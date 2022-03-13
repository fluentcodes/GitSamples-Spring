package sandbox.configurations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PropertySourceConfigurationBeanTest {

    @Autowired
    private PropertySourceConfiguration configuration;

    @Test
    public void testFooPropertiesKey() {
        assertEquals("value", configuration.getFooPropertiesKey());
    }
}

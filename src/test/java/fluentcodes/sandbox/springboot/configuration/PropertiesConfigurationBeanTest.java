package fluentcodes.sandbox.springboot.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PropertiesConfigurationBeanTest {

    @Autowired
    private PropertiesConfiguration configuration;

    @Test
    public void testFooPropertiesKey() {
        assertEquals("value", configuration.getFooPropertiesKey());
    }
}

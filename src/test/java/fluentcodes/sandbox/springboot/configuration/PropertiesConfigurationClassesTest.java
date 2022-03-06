package fluentcodes.sandbox.springboot.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = PropertiesConfiguration.class)
public class PropertiesConfigurationClassesTest {

    @Value("${foo.properties.key:x}")
    private String fooPropertiesKey;

    @Value("${key}")
    private String key;

    @Test
    public void testKey() {
        assertEquals("foo", key);
    }


    @Test
    public void testFooPropertiesKey() {
        assertEquals("value", fooPropertiesKey);
    }
}

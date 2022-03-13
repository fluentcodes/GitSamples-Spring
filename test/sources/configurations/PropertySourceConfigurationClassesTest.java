package sources.configurations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = PropertySourceConfiguration.class)
public class PropertySourceConfigurationClassesTest {

    @Value("${key}")
    private String key;
    @Test
    public void testKey() {
        assertEquals("value", key);
    }

    @Value("${foo.properties.key:x}")
    private String fooPropertiesKey;
    @Test
    public void testFooPropertiesKey() {
        assertEquals("value", fooPropertiesKey);
    }
}

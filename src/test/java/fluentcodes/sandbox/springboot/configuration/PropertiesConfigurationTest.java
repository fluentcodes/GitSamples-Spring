package fluentcodes.sandbox.springboot.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource("classpath:foo.properties")
public class PropertiesConfigurationTest {

    @Value("${key}")
    private String fooKey;

    @Value("${foo.properties.key}")
    private String fooPropertiesKey;

    @Test
    public void testFooKey() {
        assertEquals("value", fooKey);
    }

    @Test
    public void testFooPropertiesKey() {
        assertEquals("value", fooPropertiesKey);
    }
}

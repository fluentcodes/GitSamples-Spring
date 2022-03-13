package sources.properties.activeProfiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://www.baeldung.com/spring-test-property-source
@SpringBootTest()
@TestPropertySource(locations = "classpath:application-test.properties")
public class WithLocationTest {

    @Value("${profile.env}")
    private String profile;

    @Test
    public void testProfile() {
        assertEquals("test", profile);
    }

    // from application.springboot.properties
    @Value("${key}")
    private String key;

    @Test
    public void testKey() {
        assertEquals("value", key);
    }
}

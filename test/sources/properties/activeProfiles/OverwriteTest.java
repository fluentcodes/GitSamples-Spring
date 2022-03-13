package sources.properties.activeProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest()
@ActiveProfiles("overwrite")
public class OverwriteTest {

    @Value("${profile.env}")
    private String profile;

    /**
     * application-overwrite.springboot.properties in src/main/resources (value=prod) will be overwritten by src/test/resources (value=test)
     */
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

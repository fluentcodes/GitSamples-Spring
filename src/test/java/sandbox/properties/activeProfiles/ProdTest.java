package sandbox.properties.activeProfiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
@ActiveProfiles("prod")
public class ProdTest {

    @Value("${profile.env}")
    private String profile;
    @Test
    public void testProfile() {
        assertEquals("prod", profile);
    }

    // from application.properties
    @Value("${key}")
    private String key;
    @Test
    public void testKey() {
        assertEquals("value", key);
    }
}

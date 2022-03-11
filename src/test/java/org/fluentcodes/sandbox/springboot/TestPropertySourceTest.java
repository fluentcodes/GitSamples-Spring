package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://www.baeldung.com/spring-test-property-source
@SpringBootTest()
@TestPropertySource(locations = "/application-test.properties")
public class TestPropertySourceTest {

    @Value("${profile.env}")
    private String profile;
    @Test
    public void testProfile() {
        assertEquals("test", profile);
    }

    // from application.properties
    @Value("${key}")
    private String key;
    @Test
    public void testKey() {
        assertEquals("value", key);
    }
}

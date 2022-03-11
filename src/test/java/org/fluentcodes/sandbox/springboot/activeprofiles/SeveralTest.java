package org.fluentcodes.sandbox.springboot.activeprofiles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Using several profiles
 * https://stackoverflow.com/questions/38133808/spring-multiple-profiles-active
 *
 */
@SpringBootTest()
@ActiveProfiles({"prod", "any"})
public class SeveralTest {

    @Value("${profile.env}")
    private String profile;
    @Test
    public void testProfile() {
        assertEquals("any", profile);
    }

    // from application.properties
    @Value("${key}")
    private String key;
    @Test
    public void testKey() {
        assertEquals("value", key);
    }
}

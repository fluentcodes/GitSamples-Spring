package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://github.com/spring-projects/spring-boot/issues/19788
@SpringBootTest()
@ActiveProfiles("test")
public class TestActiveProfileTest {

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

package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(properties = "spring.profiles.active=test")
public class TestPropertiesProfileTest {

    @Value("${profile.env}")
    private String profile;

    @Test
    public void testProfile() {
        assertEquals("test", profile);
    }
}

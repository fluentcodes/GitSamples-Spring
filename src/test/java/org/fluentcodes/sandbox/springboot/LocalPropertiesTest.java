package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {"testKey=value"})
public class LocalPropertiesTest {
    @Value("${testKey}")
    private String testKey;

    @Test
    public void testTestKey() {
        assertEquals("value", testKey);
    }

}

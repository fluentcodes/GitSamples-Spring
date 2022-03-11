package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;


// https://www.baeldung.com/spring-tests-override-properties
// Not really working?!
@SpringBootTest()
@ContextConfiguration(
        initializers = PropertyInitializer.class,
        classes = Start.class)
public class PropertyInitializerTest {
    /**@Autowired
    PropertyInitializer initializer;

    @Value("${profile}")
    private String profile;

    @Test
    public void testProfile() {
        assertEquals(PropertyInitializer.ENV, profile);
    }

    // from application.properties
    @Value("${key}")
    private String key;
    @Test
    public void testKey() {
        assertEquals("value", key);
    }*/
}

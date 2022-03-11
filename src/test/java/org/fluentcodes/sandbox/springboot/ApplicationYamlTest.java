package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
public class ApplicationYamlTest {
    @Value("${yaml.key}")
    private String yamlKey;

    @Value("${key}")
    private String key;

    /*
    key from yaml file will not be overwritten
     */
    @Test
    public void testKey() {
        assertEquals("value", key);
    }

    @Test
    public void testYamlKey() {
        assertEquals("yaml", yamlKey);
    }
}

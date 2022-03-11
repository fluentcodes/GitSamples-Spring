package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Environment Tests
 * https://stackoverflow.com/questions/23506471/access-all-environment-properties-as-a-map-or-properties-object
 */
@SpringBootTest
public class SpringEnvironmentTest {


    @Autowired
    private Environment springEnv;

    @Test
    public void testEnv() {
        Properties properties = new Properties();
        MutablePropertySources sources = ((AbstractEnvironment) springEnv).getPropertySources();
        StreamSupport.stream(sources.spliterator(), false)
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
                .flatMap(Arrays::<String>stream)
                .forEach(propName -> properties.setProperty(propName, springEnv.getProperty(propName)));
        assertEquals("value", properties.getProperty("key"));
    }

    @Test
    public void notWorking() {
        Map<String, Object> properties = new HashMap();
        for(Iterator it = ((AbstractEnvironment) springEnv).getPropertySources().iterator(); it.hasNext(); ) {
            PropertySources propertySource = (PropertySources) it.next();
            if (propertySource instanceof EnumerablePropertySource) {
                properties.putAll(((MapPropertySource) propertySource).getSource());
            }
        }
        assertEquals("value", properties.get("key"));
    }

}

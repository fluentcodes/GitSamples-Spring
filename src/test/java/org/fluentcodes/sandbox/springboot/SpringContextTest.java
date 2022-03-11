package org.fluentcodes.sandbox.springboot;

import org.fluentcodes.sandbox.springboot.configuration.PrefixConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;
import java.util.Properties;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SpringContextTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testPrefixBean() {
        PrefixConfiguration prefixBean = (PrefixConfiguration)context.getBean("prefix");
        assertEquals("value1", prefixBean.getKey1());
    }
}

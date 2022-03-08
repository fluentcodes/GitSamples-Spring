package org.fluentcodes.sandbox.springboot.configuration;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// https://www.baeldung.com/spring-bean-names
@ExtendWith(SpringExtension.class)
public class SpringContextExtensionTest {
    public static final String PACKAGE = "org.fluentcodes.sandbox.springboot.configuration";
    private AnnotationConfigApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext();
        context.scan(PACKAGE);
        context.refresh();
    }

    @Test
    void existsOtherExampleBean() {
        assertEquals(ExampleBean.class, context.getBean("otherExampleBean").getClass());
    }
}

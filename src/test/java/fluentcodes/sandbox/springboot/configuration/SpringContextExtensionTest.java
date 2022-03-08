package fluentcodes.sandbox.springboot.configuration;


import fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.baeldung.com/spring-bean-names
@ExtendWith(SpringExtension.class)
public class SpringContextExtensionTest {
    private AnnotationConfigApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext();
        context.scan("fluentcodes.sandbox.springboot.configuration");
        context.refresh();
    }

    @Test
    void existsOtherExampleBean() {
        assertEquals(ExampleBean.class, context.getBean("otherExampleBean").getClass());
    }
}

package fluentcodes.sandbox.springboot.configuration;

import fluentcodes.sandbox.springboot.Start;
import fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeanContextTest {

    // TODO https://www.logicbig.com/tutorials/spring-framework/spring-core/inject-bean-by-name.html
    @Test
    public void testBeanContext() {
        try {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Start.class);
            ExampleBean bean = context.getBean(ExampleBean.class);
            assertEquals("", bean.getName());
        }
        catch (BeanCreationException e) {
            System.out.println("Later...");
        }
    }
}

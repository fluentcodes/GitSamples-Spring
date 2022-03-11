package org.fluentcodes.sandbox.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * This could be useful to have encapsulated bean with profile dependent values.
 * https://medium.com/javarevisited/spring-value-overview-e1ee69cc52c3
 * https://dzone.com/articles/spring-sweets-using-value
 * https://stackoverflow.com/questions/34061251/how-to-use-value-in-a-constructor
 *
 */
@SpringBootTest()
// activate this make the test fail ;-)
//@ActiveProfiles("prod")
public class ExampleBeanTest {

    @Autowired
    private ExampleBean bean;

    @Test
    public void testInjectedBean() {
        assertEquals("default", bean.getName());
    }
}

package org.fluentcodes.sandbox.springboot.configuration;

import org.fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.fluentcodes.sandbox.springboot.testitems.InterfaceBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test for {@link BeanConfig}
 */
@SpringBootTest
public class BeanConfigTest {

    //https://stackoverflow.com/questions/23348061/how-to-define-value-as-optional
    @Autowired(required = false)
    List<String> notABean;

    @Test
    public void testNotABean() {
        assertNull(notABean);
    }

    @Qualifier("interfaceBeanDefault")
    @Autowired
    InterfaceBean interfaceBeanDefault;

    @Test
    public void testInterfaceBeanDefault() {
        assertEquals("default", interfaceBeanDefault.getName());
    }

    @Qualifier("interfaceBeanValue")
    @Autowired
    InterfaceBean interfaceBeanValue;

    @Test
    public void testInterfaceBeanValue() {
        assertEquals("SpringBootBean", interfaceBeanValue.getName());
    }

    @Autowired
    ExampleBean exampleBean;

    @Test
    public void testExampleBean() {
        assertEquals("exampleBean", exampleBean.getName());
    }

    @Qualifier("otherExampleBean")
    @Autowired
    ExampleBean otherExampleBean;

    @Test
    public void testOtherExampleBean() {
        assertEquals("otherExampleBean", otherExampleBean.getName());
    }

    @Qualifier("getExampleBean")
    @Autowired
    ExampleBean getExampleBean;

    @Test
    public void testGetExampleBean() {
        assertEquals("getExampleBean", getExampleBean.getName());
    }

    @Qualifier("qualifierExampleBean")
    @Autowired
    ExampleBean qualifierExampleBean;

    @Test
    public void testQualifierExampleBean() {
        assertEquals("qualifierExampleBean", qualifierExampleBean.getName());
    }

}

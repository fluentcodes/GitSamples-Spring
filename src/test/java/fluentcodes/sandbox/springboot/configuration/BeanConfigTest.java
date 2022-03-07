package fluentcodes.sandbox.springboot.configuration;

import fluentcodes.sandbox.springboot.testitems.AppName;
import fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BeanConfigTest {

    @Autowired
    AppName appName;

    @Autowired
    ExampleBean exampleBean;

    @Qualifier("otherExampleBean")
    @Autowired
    ExampleBean otherExampleBean;

    @Qualifier("getExampleBean")
    @Autowired
    ExampleBean getExampleBean;

    @Qualifier("qualifierExampleBean")
    @Autowired
    ExampleBean qualifierExampleBean;

    @Test
    public void testAppName() {
        assertEquals("SpringBootBean", appName.getName());
    }

    @Test
    public void testExampleBean() {
        assertEquals("exampleBean", exampleBean.getName());
    }

    @Test
    public void testOtherExampleBean() {
        assertEquals("otherExampleBean", otherExampleBean.getName());
    }

    @Test
    public void testGetExampleBean() {
        assertEquals("getExampleBean", getExampleBean.getName());
    }

    @Test
    public void testQualifierExampleBean() {
        assertEquals("qualifierExampleBean", qualifierExampleBean.getName());
    }
}

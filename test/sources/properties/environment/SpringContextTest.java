package sources.properties.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SpringContextTest {

    @Autowired
    private ApplicationContext context;

    /*@Ignore("Strange will investigate later")
    @Test
    public void testPrefixBean() {
        PrefixConfiguration prefixBean = (PrefixConfiguration) context.getBean("prefix");
        assertEquals("value1", prefixBean.getKey1());
    }*/
}

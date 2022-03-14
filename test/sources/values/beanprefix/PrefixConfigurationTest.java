package sources.values.beanprefix;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

// springboot.values from application.yaml
@SpringBootTest
public class PrefixConfigurationTest {

    @Autowired
    private PrefixConfiguration byClass;

    @Test
    public void testByClass() {
        assertEquals("value1", byClass.getKey1());
        assertEquals("value2", byClass.getKey2());
    }

    @Autowired
    @Qualifier("prefix")
    private PrefixConfiguration namedBean;

    @Test
    public void testNamed() {
        assertEquals("value1", namedBean.getKey1());
        assertEquals("value2", namedBean.getKey2());
    }


}

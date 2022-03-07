package fluentcodes.sandbox.springboot.configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link FooBeanConfig}
 */
@SpringBootTest
public class FooBeanConfigTest {

    @Autowired
    private FooBeanConfig myBean;

    @Test
    public void testKey1() {
        assertEquals("value1", myBean.getKey1());
    }

    @Test
    public void testKey2() {
        assertEquals("value2", myBean.getKey2());
    }
}

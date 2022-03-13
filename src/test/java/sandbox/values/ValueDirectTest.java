package sandbox.values;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//https://www.yawintutor.com/value-annotation-in-spring-boot/
// https://www.baeldung.com/spring-value-annotation
@SpringBootTest()
public class ValueDirectTest {

    @Value("string value")
    private String string;
    @Test
    public void testString() {
        assertEquals("string value", string);
    }

    @Value("true")
    private boolean booleanValue;
    @Test
    public void testBoolean() {
        assertEquals(true, booleanValue);
    }
}

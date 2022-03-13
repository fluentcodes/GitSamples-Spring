package sandbox.misc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest()
public class RandomPropertiesTest {
    @Value("${number}")
    private int number;

    @Test
    public void testTestKey() {
        assertNotNull(number);
    }

}

package fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class StartTest {

    @Test
    public void checkContextLoad() {
        assertEquals(1, 1);
    }
}

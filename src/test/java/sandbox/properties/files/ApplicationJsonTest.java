package sandbox.properties.files;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
public class ApplicationJsonTest {

    @Value("${json.key:notReaded}")
    private String jsonKey;
    @Test
    public void testKey() {
        assertEquals("notReaded", jsonKey);
    }
}

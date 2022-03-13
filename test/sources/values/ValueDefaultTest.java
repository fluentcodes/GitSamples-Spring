package sources.values;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * These Tests show the usage of the default value, where the referencing property key is not found.
 *
 * https://www.baeldung.com/spring-value-annotation
 * https://stackoverflow.com/questions/23348061/how-to-define-value-as-optional
 * https://roufid.com/optional-spring-value/
 */

@SpringBootTest()
public class ValueDefaultTest {

    @Value("${not-existing:default}")
    private String notExistingUseDefault;
    @Test
    public void testNotExisting() {
        assertEquals("default", notExistingUseDefault);
    }

    @Value("${key:default}")
    private String existing;
    @Test
    public void testExisting() {
        assertEquals("value", existing);
    }

    @Value("${not-existing:#{null}}")
    private String defaultNull;
    @Test
    public void testDefaultNull() {
        assertNull(defaultNull);
    }
}

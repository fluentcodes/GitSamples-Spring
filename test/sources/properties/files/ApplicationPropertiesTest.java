package sources.properties.files;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

// https://www.baeldung.com/spring-value-annotation
@SpringBootTest()
public class ApplicationPropertiesTest {

    @Value("${key}")
    private String key;
    @Test
    public void testKey() {
        assertEquals("value", key);
    }

    @Value("${application.key}")
    private String applicationKey;
    @Test
    public void testApplicationKey() {
        assertEquals("value", applicationKey);
    }

    @Value("${otherKey}")
    private String otherKey;
    @Test
    public void testOtherKey() {
        assertEquals("value", otherKey);
    }

    @Value("${listOfValues}")
    private String[] valuesArray;
    @Test
    public void testValuesArray() {
        assertEquals(3, valuesArray.length);
    }

    @Value("#{${valuesMap}}")
    private Map<String, Integer> valuesMap;
    @Test
    public void testValuesMap() {
        assertEquals(3, valuesMap.size());
        assertEquals(1, valuesMap.get("key1"));
    }

    @Value("#{${valuesMap}.key1}")
    private Integer valuesMapKey1;
    @Test
    public void testValuesMapKey1() {
        assertEquals(1, valuesMapKey1);
    }

    @Value("#{${valuesMap}['unknownKey']}")
    private Integer unknownMapKey;
    @Test
    public void testValuesMapUnknownKey() {
        assertNull(unknownMapKey);
    }
}

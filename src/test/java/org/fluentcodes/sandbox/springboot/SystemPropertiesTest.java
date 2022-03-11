package org.fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://zetcode.com/springboot/environment/
@SpringBootTest()
public class SystemPropertiesTest {

    @Value("#{systemProperties}")
    private Map<String, String> systemPropertiesMap;

    @Value("${user.country}")
    private String[] userCountryDirect;

    @Value("#{systemProperties['user.country']}")
    private String userCountry;

    @Test
    public void testUserCountryDirect() {
        assertEquals("DE", userCountryDirect[0]);
    }

    @Test
    public void testUserCountry() {
        assertEquals("DE", userCountry);
    }

    //https://mkyong.com/java/how-to-list-all-system-properties-key-and-value-in-java/
    @Test
    public void getSystemValues() {
        systemPropertiesMap
                .forEach(
                        (k, v) -> System.out.println(k + ":" + v)
                );
    }


}

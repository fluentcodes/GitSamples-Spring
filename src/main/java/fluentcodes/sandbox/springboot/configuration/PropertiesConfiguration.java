package fluentcodes.sandbox.springboot.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:foo.properties")
public class PropertiesConfiguration {
    @Value("${foo.properties.key}")
    private String fooPropertiesKey;

    public String getFooPropertiesKey() {
        return fooPropertiesKey;
    }
}

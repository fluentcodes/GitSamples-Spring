package sources.values.beanprefix;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration()
@Qualifier("prefix")
@ConfigurationProperties(prefix = "my-bean")
public class PrefixConfiguration {
    private String key1;
    private String key2;

    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }
}

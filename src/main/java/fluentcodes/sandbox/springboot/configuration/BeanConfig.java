package fluentcodes.sandbox.springboot.configuration;

import fluentcodes.sandbox.springboot.testitems.AppName;
import fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// https://zetcode.com/springboot/bean/
// https://www.baeldung.com/spring-core-annotations
// https://www.logicbig.com/tutorials/spring-framework/spring-core/inject-bean-by-name.html
@Configuration
public class BeanConfig {
    @org.springframework.context.annotation.Bean
    public AppName getAppName(@Value("${app.name}") String appName) {
        return () -> appName;
    }

    @Bean
    ExampleBean exampleBean() {
        return new ExampleBean("exampleBean");
    }

    @Bean(name="otherExampleBean")
    ExampleBean otherExampleBean() {
        return new ExampleBean("otherExampleBean");
    }

    @Bean("getExampleBean")
    ExampleBean getExampleBean() {
        return new ExampleBean("getExampleBean");
    }

    @Qualifier("qualifierExampleBean")
    @Bean
    ExampleBean qualifierExampleBean() {
        return new ExampleBean("qualifierExampleBean");
    }
}

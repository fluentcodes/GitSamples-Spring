package org.fluentcodes.sandbox.springboot.configuration;

import org.fluentcodes.sandbox.springboot.testitems.InterfaceBean;
import org.fluentcodes.sandbox.springboot.testitems.ExampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// https://zetcode.com/springboot/bean/
// https://www.baeldung.com/spring-core-annotations
// https://www.logicbig.com/tutorials/spring-framework/spring-core/inject-bean-by-name.html
@Configuration
public class BeanConfig {

    @Bean(name="interfaceBeanDefault")
    public InterfaceBean interfaceBean() {
        return () -> "default";
    }

    @Bean(name="interfaceBeanValue")
    public InterfaceBean getInterfaceBean(@Value("${app.name}") String name) {
        return () -> name;
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

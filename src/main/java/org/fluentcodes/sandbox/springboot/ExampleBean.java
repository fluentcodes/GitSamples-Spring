package org.fluentcodes.sandbox.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Example constructor with default property value
 */
@Component
public class ExampleBean {
    private String name;

    public ExampleBean(@Value("${profile.env}") final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

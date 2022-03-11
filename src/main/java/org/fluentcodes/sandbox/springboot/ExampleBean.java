package org.fluentcodes.sandbox.springboot;

public class ExampleBean {
    private String name;
    public ExampleBean() {

    }
    public ExampleBean(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

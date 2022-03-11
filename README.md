# Topic Branch - Java Springboot Properties

A lot of magic is behind the properties of spring boot.

## Helper
* [SpringConfigurableEnvironment](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/main/java/org/fluentcodes/sandbox/springboot/SpringConfigurableEnvironment.java): Show all loaded properties in the environment as map including related sources
  * [SpringConfigurableEnvironmentTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/SpringConfigurableEnvironmentTest.java): Associated test.
  * [SpringConfigurableEnvironmentAnyTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/SpringConfigurableEnvironmentAnyTest.java): Associated test with profile 'any'.


## Tests
* [ValueDirectTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/ValueDirectTest.java): Direct setting of values
* [ValueDefault](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/ValueDefaultTest.java): Using a default value
* [ApplicationPropertiesTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/ApplicationPropertiesTest.java): application.properties with different value types
* [SystemPropertiesTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/SystemPropertiesTest.java): Usage of system properties
* [EnvironmentPropertiesTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/EnvironmentPropertiesTest.java): Usage of environment properties
* [LocalPropertiesTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/LocalPropertiesTest.java): Set local properties via annotations
* [ApplicationYamlTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/ApplicationYamlTest.java): application.yaml value test
* [ApplicationJsonTest](https://github.com/fluentcodes/sandbox/blob/java-springboot-properties/src/test/java/org/fluentcodes/sandbox/springboot/ApplicationJsonTest.java): application.json will not be loaded...


## Related Topic Branches
* [java-springboot-objects](https://github.com/fluentcodes/sandbox/tree/java-springboot-objects)
* [java-springboot-emptyparent](https://github.com/fluentcodes/sandbox/tree/java-springboot-emptyparent)
* [java-springboot-helloworld](https://github.com/fluentcodes/sandbox/tree/javaspring-boot-helloworld)
* [java-springboot-jpa](https://github.com/fluentcodes/sandbox/tree/java-springboot-jpa)
* [java-springboot-jpa-rest](https://github.com/fluentcodes/sandbox/tree/java-springboot-jpa-rest)
* [java-springboot-mongodb](https://github.com/fluentcodes/sandbox/tree/java-springboot-mongodb)

## Links
* https://dev.to/habeebcycle/spring-value-annotation-tricks-1a80
* https://www.baeldung.com/spring-value-annotation
* https://www.yawintutor.com/value-annotation-in-spring-boot/
* https://www.baeldung.com/spring-tests-override-properties
* https://www.baeldung.com/spring-test-property-source
* https://docs.spring.io/spring-boot/docs/current/reference/html/features.html
* https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties.core
* https://www.baeldung.com/properties-with-spring
* https://www.dev-insider.de/spring-anwendungen-per-properties-konfigurieren-a-1013023/
* https://www.dev-insider.de/arbeiten-mit-mehreren-systemumgebungen-a-1013795/
* https://www.tutorialspoint.com/spring_boot/spring_boot_application_properties.htm
* https://www.baeldung.com/spring-boot-json-properties
* https://stackoverflow.com/questions/39723465/using-spring-application-json-for-application-properties-file-in-spring-boot
* https://github.com/spring-projects/spring-boot/issues/4027: Using JSON instead of Properties

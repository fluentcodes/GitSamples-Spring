# Topic Branch - Java Springboot Properties

A lot of magic is behind the properties of spring boot.

## Helper
* [SpringConfigurableEnvironment](src/test/java/sandbox/properties/helper/SpringConfigurableEnvironment.java): Show all loaded properties in the environment as map including related sources
  * [SpringConfigurableEnvironmentTest](src/test/java/sandbox/properties/helper/SpringConfigurableEnvironmentTest.java): Associated test.
  * [SpringConfigurableEnvironmentAnyTest](src/test/java/sandbox/properties/helper/SpringConfigurableEnvironmentAnyTest.java): Associated test with profile 'any'.


## Topics
* [configurations](src/test/java/sandbox/configurations): How to set configuration
* [misc](src/test/java/sandbox/configurations): stuff to test or initialized
* properties
  * [activeProfiles](properties/activeProfiles): Usage of profiles
  * [environment](properties/environment): Using the context to access loaded properties.
  * [files](properties/files): Set properties from different file sources.
  * [helper](properties/helper): Some tooling.
  * [system](properties/system): properties from system
* [values](src/test/java/sandbox/values): How to set values in a manage environment



## Related Topic Branches
* [java-springboot-objects](../../tree/java-springboot-objects)
* [java-springboot-emptyparent](../../tree/java-springboot-emptyparent)
* [java-springboot-helloworld](../../tree/javaspring-boot-helloworld)
* [java-springboot-jpa](../../tree/java-springboot-jpa)
* [java-springboot-jpa-rest](../../tree/java-springboot-jpa-rest)
* [java-springboot-mongodb](../../tree/java-springboot-mongodb)

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

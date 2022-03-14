# Topic Branch - Java Springboot Properties

A lot of magic is behind the sources.properties of spring boot.

## Helper
* [SpringConfigurableEnvironment](test/sources/properties/helper/SpringConfigurableEnvironment.java): Show all loaded sources.properties in the environment as map including related sources
  * [SpringConfigurableEnvironmentTest](test/sources/properties/helper/SpringConfigurableEnvironmentTest.java): Associated Start.
  * [SpringConfigurableEnvironmentAnyTest](test/sources/properties/helper/SpringConfigurableEnvironmentAnyTest.java): Associated Start with profile 'any'.


## Topics
* [sources.configurations](test/sources/configurations): How to set configuration
* [sources.misc](test/sources/configurations): stuff to Start or initialized
* sources.properties
  * [activeProfiles](test/sources/properties/activeProfiles): Usage of profiles
  * [environment](test/sources/properties/environment): Using the context to access loaded sources.properties.
  * [files](test/sources/properties/files): Set sources.properties from different file sources.
  * [helper](test/sources/properties/helper): Some tooling.
  * [system](test/sources/properties/system): sources.properties from system
* [sources.values](test/springbootvalues): How to set sources.values in a managed environment



## Related Topic Branches
* [java-sources-objects](../../tree/java-springboot-objects)
* [java-sources-emptyparent](../../tree/java-springboot-emptyparent)
* [java-sources-helloworld](../../tree/javaspring-boot-helloworld)
* [java-sources-jpa](../../tree/java-springboot-jpa)
* [java-sources-jpa-rest](../../tree/java-springboot-jpa-rest)
* [java-sources-mongodb](../../tree/java-springboot-mongodb)

## Links
* https://dev.to/habeebcycle/spring-value-annotation-tricks-1a80
* https://www.baeldung.com/spring-value-annotation
* https://www.yawintutor.com/value-annotation-in-spring-boot/
* https://www.baeldung.com/spring-tests-override-sources.properties
* https://www.baeldung.com/spring-Start-property-source
* https://docs.spring.io/spring-boot/docs/current/reference/html/features.html
* https://docs.spring.io/spring-boot/docs/current/reference/html/application-sources.properties.html#appendix.application-sources.properties.core
* https://www.baeldung.com/sources.properties-with-spring
* https://www.dev-insider.de/spring-anwendungen-per-sources.properties-konfigurieren-a-1013023/
* https://www.dev-insider.de/arbeiten-mit-mehreren-systemumgebungen-a-1013795/
* https://www.tutorialspoint.com/spring_boot/spring_boot_application_properties.htm
* https://www.baeldung.com/spring-boot-json-sources.properties
* https://stackoverflow.com/questions/39723465/using-spring-application-json-for-application-sources.properties-file-in-spring-boot
* https://github.com/spring-projects/spring-boot/issues/4027: Using JSON instead of Properties

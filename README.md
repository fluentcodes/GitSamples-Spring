# Topic Branch: Springboot Web Direct
Just an springboot web application with direct dependencies in the 
[pom.xml](pom.xml).

A spring boot application using [direct dependencies](pom.xml) instead of
parent dependencies as in [java-springboot-web-parent](../../tree/java-springboot-web-parent)

The only relevant dependency used for a working web application is

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<version>2.6.4</version>
		</dependency>

## Summary
There are no relevant differences in size or starting speed between the two options.

## Endpoints
### Controller
* [RestController](main/sources/RestController.java)
  * /welcome/NAME
  * /welcome/get/NAME
  * /welcome (post)
  * /welcome/post

### Static
* [index.html](resources-main/static/index.html)

## Start
It starts with [Start](main/sources/Start.java) within overall half a minute, but this is dependent of the environment: 

2022-03-17 05:23:41.440  INFO 99132 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-03-17 05:23:41.447  INFO 99132 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-03-17 05:23:41.447  INFO 99132 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.36]
2022-03-17 05:23:41.492  INFO 99132 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-03-17 05:23:41.493  INFO 99132 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 493 ms
## Size
The size of java-springboot-web-parent-0.0.1.jar in target 

    mvn clean install

with more than 16 MB is slightly smaller than [java-springboot-web-parent](../../tree/java-springboot-web-parent). 

## Dependencies
When executing 
   
    mvn dependency:tree

the following is shown: 

    org.fluentcodes.sandbox:java-springboot-web-direct:jar:0.0.1
    +- org.springframework.boot:spring-boot-starter-web:jar:2.6.4:compile
    |  +- org.springframework.boot:spring-boot-starter:jar:2.6.4:compile
    |  |  +- org.springframework.boot:spring-boot:jar:2.6.4:compile
    |  |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.6.4:compile
    |  |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.6.4:compile
    |  |  |  +- ch.qos.logback:logback-classic:jar:1.2.10:compile
    |  |  |  |  \- ch.qos.logback:logback-core:jar:1.2.10:compile
    |  |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.17.1:compile
    |  |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
    |  |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.36:compile
    |  |  +- jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile
    |  |  \- org.yaml:snakeyaml:jar:1.29:compile
    |  +- org.springframework.boot:spring-boot-starter-json:jar:2.6.4:compile
    |  |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.13.1:compile
    |  |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.13.1:compile
    |  |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.13.1:compile
    |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.13.1:compile
    |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.13.1:compile
    |  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.13.1:compile
    |  +- org.springframework.boot:spring-boot-starter-tomcat:jar:2.6.4:compile
    |  |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.58:compile
    |  |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:9.0.58:compile
    |  |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.58:compile
    |  +- org.springframework:spring-web:jar:5.3.16:compile
    |  |  \- org.springframework:spring-beans:jar:5.3.16:compile
    |  \- org.springframework:spring-webmvc:jar:5.3.16:compile
    |     +- org.springframework:spring-aop:jar:5.3.16:compile
    |     +- org.springframework:spring-context:jar:5.3.16:compile
    |     \- org.springframework:spring-expression:jar:5.3.16:compile
    \- org.springframework.boot:spring-boot-starter-test:jar:2.6.4:test
       +- org.springframework.boot:spring-boot-test:jar:2.6.4:test
       +- org.springframework.boot:spring-boot-test-autoconfigure:jar:2.6.4:test
       +- com.jayway.jsonpath:json-path:jar:2.6.0:test
       |  +- net.minidev:json-smart:jar:2.4.7:test
       |  |  \- net.minidev:accessors-smart:jar:2.4.7:test
       |  |     \- org.ow2.asm:asm:jar:9.1:test
       |  \- org.slf4j:slf4j-api:jar:1.7.30:compile
       +- jakarta.xml.bind:jakarta.xml.bind-api:jar:2.3.3:test
       |  \- jakarta.activation:jakarta.activation-api:jar:1.2.2:test
       +- org.assertj:assertj-core:jar:3.21.0:test
       +- org.hamcrest:hamcrest:jar:2.2:test
       +- org.junit.jupiter:junit-jupiter:jar:5.8.2:test
       |  +- org.junit.jupiter:junit-jupiter-api:jar:5.8.2:test
       |  |  +- org.opentest4j:opentest4j:jar:1.2.0:test
       |  |  +- org.junit.platform:junit-platform-commons:jar:1.8.2:test
       |  |  \- org.apiguardian:apiguardian-api:jar:1.1.2:test
       |  +- org.junit.jupiter:junit-jupiter-params:jar:5.8.2:test
       |  \- org.junit.jupiter:junit-jupiter-engine:jar:5.8.2:test
       |     \- org.junit.platform:junit-platform-engine:jar:1.8.2:test
       +- org.mockito:mockito-core:jar:4.0.0:test
       |  +- net.bytebuddy:byte-buddy:jar:1.11.19:test
       |  +- net.bytebuddy:byte-buddy-agent:jar:1.11.19:test
       |  \- org.objenesis:objenesis:jar:3.2:test
       +- org.mockito:mockito-junit-jupiter:jar:4.0.0:test
       +- org.skyscreamer:jsonassert:jar:1.5.0:test
       |  \- com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test
       +- org.springframework:spring-core:jar:5.3.16:compile
       |  \- org.springframework:spring-jcl:jar:5.3.16:compile
       +- org.springframework:spring-test:jar:5.3.16:test
       \- org.xmlunit:xmlunit-core:jar:2.8.4:test

## Related Topic Branches
* [java-springboot-empty-direct](../../tree/java-springboot-empty-direct)
* [java-springboot-web-parent](../../tree/java-springboot-web-parent)
* [java-springboot-jpa](../../tree/java-springboot-jpa)
* [java-springboot-jpa-rest](../../tree/java-springboot-jpa-rest)
* [java-springboot-mongodb](../../tree/java-springboot-mongodb)


## Links
* https://www.baeldung.com/spring-mvc-static-resources
* https://stackoverflow.com/questions/3342908/how-to-get-a-dependency-tree-for-an-artifact
* https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties.server
* https://stackoverflow.com/questions/3855127/find-and-kill-process-locking-port-3000-on-mac
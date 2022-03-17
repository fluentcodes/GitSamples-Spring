# Topic Branch: Springboot Web Direct
Just an springboot web application with direct dependencies in the 
[pom.xml](pom.xml).

A spring boot application using [direct dependencies](pom.xml) 
using jetty instead of tomcat as default in [java-springboot-web-direct](../../tree/java-springboot-web-direct)

The only relevant dependency used for a working web application is

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<version>2.6.4</version>
			<exclusions>
				<exclusion>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-tomcat</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jetty</artifactId>
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
One could start it via maven:

    mvn spring-boot:run

It starts with [Start](main/sources/Start.java) within overall half a minute, but this is dependent of the environment: 

    2022-03-17 06:02:33.461  INFO 183 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]
    2022-03-17 06:02:33.526  INFO 183 --- [           main] o.e.j.s.h.ContextHandler.application     : Initializing Spring DispatcherServlet 'dispatcherServlet'
    2022-03-17 06:02:33.526  INFO 183 --- [           main] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
    2022-03-17 06:02:33.526  INFO 183 --- [           main] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
    2022-03-17 06:02:33.545  INFO 183 --- [           main] o.e.jetty.server.AbstractConnector       : Started ServerConnector@7eb01b12{HTTP/1.1, (http/1.1)}{0.0.0.0:8080}
    2022-03-17 06:02:33.546  INFO 183 --- [           main] o.s.b.web.embedded.jetty.JettyWebServer  : Jetty started on port(s) 8080 (http/1.1) with context path '/'
    2022-03-17 06:02:33.552  INFO 183 --- [           main] sources.Start                            : Started Start in 21.074 seconds (JVM running for 21.31)

## Size
The size of java-springboot-web-parent-0.0.1.jar in target 

    mvn clean install

with more than 17 MB is slightly smaller than [java-springboot-web-direct](../../tree/java-springboot-web-direct). 

## Dependencies
When executing 
   
    mvn dependency:tree

the following is shown: 

    org.fluentcodes.sandbox:java-springboot-web-jetty:jar:0.0.1
    +- org.springframework.boot:spring-boot-starter-web:jar:2.6.4:compile
    |  +- org.springframework.boot:spring-boot-starter:jar:2.6.4:compile
    |  |  +- org.springframework.boot:spring-boot:jar:2.6.4:compile
    |  |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.6.4:compile
    |  |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.6.4:compile
    |  |  |  +- ch.qos.logback:logback-classic:jar:1.2.10:compile
    |  |  |  |  +- ch.qos.logback:logback-core:jar:1.2.10:compile
    |  |  |  |  \- org.slf4j:slf4j-api:jar:1.7.32:compile
    |  |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.17.1:compile
    |  |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
    |  |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.36:compile
    |  |  +- jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile
    |  |  +- org.springframework:spring-core:jar:5.3.16:compile
    |  |  |  \- org.springframework:spring-jcl:jar:5.3.16:compile
    |  |  \- org.yaml:snakeyaml:jar:1.29:compile
    |  +- org.springframework.boot:spring-boot-starter-json:jar:2.6.4:compile
    |  |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.13.1:compile
    |  |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.13.1:compile
    |  |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.13.1:compile
    |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.13.1:compile
    |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.13.1:compile
    |  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.13.1:compile
    |  +- org.springframework:spring-web:jar:5.3.16:compile
    |  |  \- org.springframework:spring-beans:jar:5.3.16:compile
    |  \- org.springframework:spring-webmvc:jar:5.3.16:compile
    |     +- org.springframework:spring-aop:jar:5.3.16:compile
    |     +- org.springframework:spring-context:jar:5.3.16:compile
    |     \- org.springframework:spring-expression:jar:5.3.16:compile
    \- org.springframework.boot:spring-boot-starter-jetty:jar:2.6.4:compile
       +- jakarta.servlet:jakarta.servlet-api:jar:4.0.4:compile
       +- jakarta.websocket:jakarta.websocket-api:jar:1.1.2:compile
       +- org.apache.tomcat.embed:tomcat-embed-el:jar:9.0.58:compile
       +- org.eclipse.jetty:jetty-servlets:jar:9.4.45.v20220203:compile
       |  +- org.eclipse.jetty:jetty-continuation:jar:9.4.45.v20220203:compile
       |  +- org.eclipse.jetty:jetty-http:jar:9.4.45.v20220203:compile
       |  +- org.eclipse.jetty:jetty-util:jar:9.4.45.v20220203:compile
       |  \- org.eclipse.jetty:jetty-io:jar:9.4.45.v20220203:compile
       +- org.eclipse.jetty:jetty-webapp:jar:9.4.45.v20220203:compile
       |  +- org.eclipse.jetty:jetty-xml:jar:9.4.45.v20220203:compile
       |  \- org.eclipse.jetty:jetty-servlet:jar:9.4.45.v20220203:compile
       |     +- org.eclipse.jetty:jetty-security:jar:9.4.45.v20220203:compile
       |     |  \- org.eclipse.jetty:jetty-server:jar:9.4.45.v20220203:compile
       |     \- org.eclipse.jetty:jetty-util-ajax:jar:9.4.45.v20220203:compile
       +- org.eclipse.jetty.websocket:websocket-server:jar:9.4.45.v20220203:compile
       |  +- org.eclipse.jetty.websocket:websocket-common:jar:9.4.45.v20220203:compile
       |  |  \- org.eclipse.jetty.websocket:websocket-api:jar:9.4.45.v20220203:compile
       |  +- org.eclipse.jetty.websocket:websocket-client:jar:9.4.45.v20220203:compile
       |  |  \- org.eclipse.jetty:jetty-client:jar:9.4.45.v20220203:compile
       |  \- org.eclipse.jetty.websocket:websocket-servlet:jar:9.4.45.v20220203:compile
       \- org.eclipse.jetty.websocket:javax-websocket-server-impl:jar:9.4.45.v20220203:compile
          +- org.eclipse.jetty:jetty-annotations:jar:9.4.45.v20220203:compile
          |  +- org.eclipse.jetty:jetty-plus:jar:9.4.45.v20220203:compile
          |  +- org.ow2.asm:asm:jar:9.2:compile
          |  \- org.ow2.asm:asm-commons:jar:9.2:compile
          |     +- org.ow2.asm:asm-tree:jar:9.2:compile
          |     \- org.ow2.asm:asm-analysis:jar:9.2:compile
          \- org.eclipse.jetty.websocket:javax-websocket-client-impl:jar:9.4.45.v20220203:compile


## Related Topic Branches
* [java-springboot-web-direct](../../tree/java-springboot-web-direct)

## Links
* https://howtodoinjava.com/spring-boot/configure-jetty-server/
* https://www.baeldung.com/spring-boot-run-maven-vs-executable-jar: Interesting investigate later in a topic branch...
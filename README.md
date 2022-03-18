# Topic Branch: Springboot Empty Direkt

In [Start.java](main/sources/Start.java) contains just a spring boot main class with a @PostConstruct method. 

     @SpringBootApplication
     public class Start {
         public static void main(String[] args) {
             SpringApplication.run(Start.class, args);
         }

        @PostConstruct
        public void init() {
            System.out.println("Init Something");
        }
     }

When calling 

    java -jar target/java-springboot-empty-direct-0.0.1.jar

will has the following output and stops automatically afterward

    2022-03-18 09:25:15.115  INFO 11144 --- [           main] sources.Start                            : Starting Start using Java 17.0.1 on MacBook-Air-von-Werner.local with PID 11144 (/Users/werner/dev/sandbox/target/classes started by werner in /Users/werner/dev/sandbox)
    2022-03-18 09:25:15.117  INFO 11144 --- [           main] sources.Start                            : No active profile set, falling back to 1 default profile: "default"
    Init Something
    2022-03-18 09:25:15.369  INFO 11144 --- [           main] sources.Start                            : Started Start in 5.475 seconds (JVM running for 5.811)

    Process finished with exit code 0


## Build
Build with 

     mvn clean install 

create a java-springboot-empty-direct-0.0.1.jar file in target. It's size is around 8 MB.
 
## Run
Run it with

    mvn spring-boot:run

## Dependency Tree

Running 
    mvn dependency:tree

has the following result for the spring-boot-starter:

    +- org.springframework.boot:spring-boot-starter:jar:2.6.4:compile
    |  +- org.springframework.boot:spring-boot:jar:2.6.4:compile
    |  |  \- org.springframework:spring-context:jar:5.3.16:compile
    |  |     +- org.springframework:spring-aop:jar:5.3.16:compile
    |  |     +- org.springframework:spring-beans:jar:5.3.16:compile
    |  |     \- org.springframework:spring-expression:jar:5.3.16:compile
    |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.6.4:compile
    |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.6.4:compile
    |  |  +- ch.qos.logback:logback-classic:jar:1.2.10:compile
    |  |  |  \- ch.qos.logback:logback-core:jar:1.2.10:compile
    |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.17.1:compile
    |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.17.1:compile
    |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.36:compile
    |  +- jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile
    |  +- org.springframework:spring-core:jar:5.3.16:compile
    |  |  \- org.springframework:spring-jcl:jar:5.3.16:compile
    |  \- org.yaml:snakeyaml:jar:1.29:compile

## Related Topic Branches
* [java-springboot-CommandLineRunner](../../tree/java-springboot-CommandLineRunner)
* [java-springboot-web-direct](../../tree/java-springboot-web-direct)
* [java-springboot-empty-parent](../../tree/java-springboot-empty-parent)


### Links
* https://spring.io/guides/gs/spring-boot/
* https://github.com/spring-projects/spring-boot/tree/main
* https://github.com/spring-projects/spring-boot/tree/main/spring-boot-samples
* [spring initializr](https://start.spring.io/)

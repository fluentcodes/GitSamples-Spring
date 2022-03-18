# Topic Branch: Springboot CommandLineRunner 

In [Start.java](main/sources/Start.java) is just a spring boot main implementing a 
CommandLineRunner interface. 

The method run implements the interface method:
    
    @SpringBootApplication
    public class Start implements CommandLineRunner {
        public static void main(String[] args) {
            SpringApplication.run(Start.class, args);
        }
        @Override
        public void run(String... args)  {
            System.out.println("Hello world from Command Line Runner");
            Stream<String> argStream = Arrays.stream(args);
            argStream.forEach(arg -> System.out.println(arg));
        }
    }

This just prints out the input values. When calling 

    java -jar target/java-springboot-CommandLineRunner-0.0.1.jar a b c d

will has the following output:   

    2022-03-18 09:58:51.750  INFO 11619 --- [           main] sources.Start                            : Starting Start using Java 11.0.13 on MacBook-Air-von-Werner.local with PID 11619 (/Users/werner/dev/sandbox/target/java-springboot-CommandLineRunner-0.0.1.jar started by werner in /Users/werner/dev/sandbox)
    2022-03-18 09:58:51.752  INFO 11619 --- [           main] sources.Start                            : No active profile set, falling back to 1 default profile: "default"
    2022-03-18 09:58:52.002  INFO 11619 --- [           main] sources.Start                            : Started Start in 5.478 seconds (JVM running for 5.724)
    Hello world from Command Line Runner
    a
    b
    c
    d


## Build
Build with 

     mvn clean install 

create a java-springboot-CommandLineRunner.jar file in target. It's size is around 8 MB.
 
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
* [java-springboot-empty-direct](../../tree/java-springboot-empty-direct)

### Links
* https://www.tutorialspoint.com/spring_boot/spring_boot_runners.htm
* https://spring.io/guides/gs/spring-boot/
* https://github.com/spring-projects/spring-boot/tree/main
* https://github.com/spring-projects/spring-boot/tree/main/spring-boot-samples
* [spring initializr](https://start.spring.io/)
* https://mkyong.com/java8/java-how-to-convert-array-to-stream/

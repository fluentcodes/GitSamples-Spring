# Topic Branch - Java Springboot GraphQL

It runs out of the box 

## Sample Calls
The server interface can be verified with curl:

### Query

    curl \
    --request POST 'localhost:8081/graphql' \
    --header 'Content-Type: application/json' \
    --data-raw '{"query":"query {\n    recentPosts(count: 2, offset: 0) {\n        id\n        title\n        author {\n            id\n            posts {\n                id\n            }\n        }\n    }\n}"}'

### Mutation:
    curl \
    --request POST 'localhost:8081/graphql' \
    --header 'Content-Type: application/json' \
    --data-raw '{"query":"mutation {\n    writePost(title: \"New Title\", author: \"Author2\", text: \"New Text\") {\n        id\n        category\n        author {\n            id\n            name\n        }\n    }\n}"}'

## Tests
* [FooBeanConfigTest](https://github.com/fluentcodes/sandbox/blob/master/src/test/java/org/fluentcodes/sandbox/springboot/configuration/FooBeanConfigTest.java): Bean initialized by foo.properties via PropertySource

## Related Topic Branches
* [java-springboot-properties](https://github.com/fluentcodes/sandbox/tree/java-springboot-empty)
* [java-springboot-objects](https://github.com/fluentcodes/sandbox/tree/java-springboot-empty)
* [java-springboot-helloworld](https://github.com/fluentcodes/sandbox/tree/javaspring-boot-helloworld)
* [java-springboot-jpa](https://github.com/fluentcodes/sandbox/tree/java-springboot-jpa)
* [java-springboot-jpa-rest](https://github.com/fluentcodes/sandbox/tree/java-springboot-jpa-rest)
* [java-springboot-mongodb](https://github.com/fluentcodes/sandbox/tree/java-springboot-mongodb)


## Links
* https://github.com/spring-projects/spring-graphql
* https://github.com/graphql-java-kickstart/graphql-spring-boot
* https://www.graphql-java-kickstart.com/spring-boot/
* https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-libraries/src/main/java/com/baeldung/graphql
* https://www.baeldung.com/spring-graphql

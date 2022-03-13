package sandbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {
    @Value("${otherKey}")
    private String otherKey;

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
        System.out.println("Hello world");
    }
}

package sources;
import java.util.Arrays;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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


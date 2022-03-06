package fluentcodes.sandbox.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

// https://stackoverflow.com/questions/14617181/java-spring-how-to-use-value-annotation-to-inject-an-environment-property
@SpringBootTest()
public class EnvironmentPropertiesTest {

    //@Value("#{environment}")
    private Map<String, String> environmentMap;

    @Value("#{environment.JAVA_HOME}")
    private String javaHome;

    @Value("${notExist:#{environment.JAVA_HOME}}")
    private String javaHomeDefault;

    @Value("${JAVA_HOME:notExist}")
    private String javaHomeDirect;

    @Test
    public void testJavaHome() {
        assertEquals("/Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home", javaHome);
    }

    @Test
    public void testJavaHomeDirect() {
        assertEquals("/Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home", javaHomeDirect);
    }

    @Test
    public void testJavaHomeDefault() {
        assertEquals("/Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home", javaHomeDefault);
    }

    //https://mkyong.com/java/java-how-to-display-all-environment-variable/
    @Test
    public void getEnvValues() {
        System.getenv()
                .forEach(
                        (k, v) -> System.out.println(k + ":" + v)
                );
    }



}

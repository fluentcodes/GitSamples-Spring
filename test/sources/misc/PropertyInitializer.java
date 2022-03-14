package sources.misc;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.support.TestPropertySourceUtils;

public class PropertyInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    static final String ENV = "initializer";

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
                configurableApplicationContext, "profile.env=" + ENV);

        TestPropertySourceUtils.addPropertiesFilesToEnvironment(
                configurableApplicationContext, "application-env.springboot.properties");
    }
}

package sources.properties.helper;

import org.springframework.core.env.CompositePropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.PropertySource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Configurable Environment Tests
 * https://stackoverflow.com/questions/23506471/access-all-environment-properties-as-a-map-or-properties-object
 */

public class SpringConfigurableEnvironment {
    private Map<String, PropertyInfo> properties;

    public SpringConfigurableEnvironment(ConfigurableEnvironment springEnv) {
        properties = new TreeMap<>();
        springEnv.getPropertySources().forEach(ps -> addPropertySource(ps));
    }

    public PropertyInfo get(final String key) {
        return properties.get(key);
    }

    public Object getValue(final String key) {
        return properties.get(key).value;
    }

    public List<String> getSource(final String key) {
        return properties.get(key).sourceList;
    }

    public Set<String> getKeys() {
        return properties.keySet();
    }

    private void addPropertySource(PropertySource<?> propertySource) {
        if (propertySource instanceof CompositePropertySource) {
            CompositePropertySource cps = (CompositePropertySource) propertySource;
            cps.getPropertySources().forEach(ps -> addPropertySource(ps));
        } else if (propertySource instanceof EnumerablePropertySource<?>) {
            add((EnumerablePropertySource<?>) propertySource);
        } else {
            // few others like JndiPropertySource or StubPropertySource
            System.out.println("Given PropertySource is instanceof " + propertySource.getClass().getName()
                    + " and cannot be iterated");
        }
    }

    private void add(EnumerablePropertySource<?> source) {
        for (String name : source.getPropertyNames()) {
            if (properties.containsKey(name)) {
                properties.get(name).add(source.getName());
                return;
            }
            properties.put(name, new PropertyInfo(source.getProperty(name), source.getName()));
        }
    }

    public static class PropertyInfo {
        private Object value;
        private List<String> sourceList;

        PropertyInfo(final Object value, final String sourceList) {
            this.sourceList = new ArrayList<>();
            this.sourceList.add(sourceList);
            this.value = value;
        }

        void add(final String source) {
            if (this.sourceList.contains(source)) {
                return;
            }
            this.sourceList.add(source);
        }
        @Override
        public String toString() {
            if (value == null) {
                return "null: " + sourceList;
            }
            return value.toString() + ": " + sourceList;
        }

        public Object getValue() {
            return value;
        }

        public List<String> getSourceList() {
            return sourceList;
        }
    }



}

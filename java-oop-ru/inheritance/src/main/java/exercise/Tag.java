package exercise;

import java.util.stream.Collectors;
import java.util.Map;

public abstract class Tag {
    private String name;
    private Map<String, String> attributes;

    public Tag(final String name, final Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String toString() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }
}

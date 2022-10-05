package exercise;

import java.util.stream.Collectors;
import java.util.Map;

public abstract class Tag {
    private String name;
    private Map<String, String> attributes;

    Tag (final String name, final Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<" + getName());

        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            stringBuilder.append(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }

        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}


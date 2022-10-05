package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PairedTag extends Tag {
    private String body;
    private List<Tag> singleTags;
    PairedTag(final String name, final Map<String, String> attributes,
              final String body, final List<Tag> singleTags) {
        super(name, attributes);
        this.body = body;
        this.singleTags = singleTags;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(body);

        for (Tag tag : singleTags) {
            stringBuilder.append(tag.toString());
        }

        stringBuilder.append("</" + super.getName() + ">");
        return stringBuilder.toString();
    }
}

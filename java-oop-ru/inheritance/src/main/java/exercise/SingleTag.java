package exercise;

import java.util.Map;

final class SingleTag extends Tag {
    public SingleTag(final String name, final Map<String, String> attributes) {
        super(name, attributes);
    }

    public String toString() {
        return "<" + getName() + " " +
    }

//    Tag img = new SingleTag("img", Map.of("class", "v-10", "id", "wop"));
//    img.toString(); // "<img class="v-10" id="wop">
}

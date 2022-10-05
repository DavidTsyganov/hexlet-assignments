package exercise;

import java.util.Map;

public class SingleTag extends Tag {

    public static void main(String[] args) {
        SingleTag tag = new SingleTag("img", Map.of("class", "v-10", "id", "wop"));
        System.out.println(tag.toString());
    }

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }


}

package exercise;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static Map<String, String> genDiff(final Map<String, Object> dict1,
                                                   final Map<String, Object> dict2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(dict1.keySet());
        keys.addAll(dict2.keySet());

        for (String key : keys) {
            if (!dict1.containsKey(key)) {
                result.put(key, "added");
            } else if (!dict2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (dict1.get(key).equals(dict2.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        return result;
    }
}
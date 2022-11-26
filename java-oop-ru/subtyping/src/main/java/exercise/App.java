package exercise;

import java.util.*;
import java.util.Map.Entry;

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        for (Map.Entry<String, String> item : storage.toMap().entrySet()) {
            String key = item.getKey();
            String value = item.getValue();
            storage.unset(key);
            storage.set(value, key);
        }
    }
}


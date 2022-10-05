package exercise;

import java.awt.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));
        System.out.println(storage);

        storage.set("key", "20");
        storage.set("key1", "40");
        storage.set("key2", "60");
        System.out.println(storage);

        storage.unset("key2");
        System.out.println(storage);

        System.out.println(storage.get("key", "default"));

        System.out.println(storage.toMap());

    }

    public static KeyValueStorage swapKeyValue(KeyValueStorage storage) {
        return storage.toMap()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, ));


    }
}

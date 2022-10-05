package exercise;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> map = new HashMap<>();

    public InMemoryKV (Map<String, String> map) {
        this.map.putAll(map);
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return map;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

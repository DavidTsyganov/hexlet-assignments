package exercise;

import java.util.HashMap;
import java.util.Map;

public class FileKV implements KeyValueStorage {
    private String pathFile;

    public FileKV(String path, Map<String, String> storage) {
        pathFile = path;
        writeFile(storage);
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> store = readFile();
        store.put(key, value);
        writeFile(store);
    }

    @Override
    public void unset(String key) {
        Map<String, String> storage = readFile();
        storage.remove(key);
        writeFile(storage);
    }

    @Override
    public String get(String key, String defaultValue) {
        return readFile().getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(readFile());
    }

    private Map<String, String> readFile() {
        String json = Utils.readFile(pathFile);
        return Utils.unserialize(json);
    }

    private void writeFile(Map<String, String> storage) {
        String json = Utils.serialize(storage);
        Utils.writeFile(pathFile, json);
    }
}

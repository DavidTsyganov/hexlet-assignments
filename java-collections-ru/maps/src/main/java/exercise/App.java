package exercise;

import java.util.*;

public class App {
    public static List<String> convertStringToArrayList(String sentence) {
        List<String> words = Arrays.asList(sentence.split(" "));
        List<String> result = new ArrayList<>();
        result.addAll(words);
        return result;
    }

    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.length() == 0 || sentence == null) {
            return Collections.emptyMap();
        }

        List<String> words = convertStringToArrayList(sentence);
        Map<String, Integer> dictionary = new HashMap<>();

        words.forEach(word -> dictionary.merge(word, 1, (oldValue, one) -> oldValue + one));

        return dictionary;
    }

    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            stringBuilder.append("  " + entry.getKey() + ": " + entry.getValue() + "\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

//END

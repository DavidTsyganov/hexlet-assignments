package exercise;

import java.util.*;
import java.util.Map.Entry;

public class App {

    public static List findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map book : books) {
            if (checkBook(book, where)) {
                result.add(book);
            }
        }
        return result;
    }

    public static boolean checkBook(Map<String, String> book, Map<String, String> pattern) {
        Set<Entry<String, String>> bookSet = book.entrySet();
            if (bookSet.containsAll(pattern.entrySet())) {
                return true;
            }
        return false;
    }
}

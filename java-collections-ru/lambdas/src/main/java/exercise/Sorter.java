package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorter {
    public static List<Map<String, String>> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .flatMap(Stream::of)
                .toList();
    }
}

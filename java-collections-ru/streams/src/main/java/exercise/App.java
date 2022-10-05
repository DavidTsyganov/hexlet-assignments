package exercise;

import java.util.List;
import java.util.Arrays;

public class App{
    private static final List<String> FREE_DOMAINS = Arrays.asList("gmail.com", "yandex.ru", "hotmail.com");

    public static long getCountOfFreeEmails(List<String> emailsList) {
        return emailsList.stream()
                .map (str -> str.substring(str.indexOf("@") + 1))
                .filter(str -> FREE_DOMAINS.contains(str))
                .count();
    }
}

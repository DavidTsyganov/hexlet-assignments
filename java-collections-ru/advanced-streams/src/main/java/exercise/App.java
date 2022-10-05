package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

final class App {

    public static String getForwardedVariables(String config) {
        return Arrays.stream(config.split("\n"))
                .filter(string -> string.startsWith("environment"))
                .map(string -> string.replaceAll("environment=\"", ""))
                .map(string -> string.replaceAll("\"", ""))
                .flatMap(string -> Stream.of(string.split(",")))
                .filter(string -> string.startsWith("X_FORWARDED_"))
                .map(string -> string.replaceAll(("X_FORWARDED_"), ""))
                .collect(Collectors.joining(","));
    }
}

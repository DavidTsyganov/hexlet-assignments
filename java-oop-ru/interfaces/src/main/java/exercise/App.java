package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static List<String> buildAppartmentsList(List<Home> listOfHomes, long n) {
        List<String> result = new ArrayList<>();
        result = listOfHomes.stream().sorted((a, b) -> {
            return a.compareTo(b);
        }).limit(n).map(Home::toString).collect(Collectors.toList());
        return result;
    }
}

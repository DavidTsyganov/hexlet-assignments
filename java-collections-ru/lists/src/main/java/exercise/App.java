package exercise;

import java.util.*;

public class App {
    public static boolean scrabble(String letters, String word) {
        List<Character> listOfLetters = convertToCharArrayList(letters);
        List<Character> wordAsList = convertToCharArrayList(word);

        for (int i = 0; i < wordAsList.size(); i++) {
            if (listOfLetters.remove(wordAsList.get(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static List<Character> convertToCharArrayList(String word) {
        char[] charArray = word.toLowerCase().toCharArray();
        List<Character> asList = new ArrayList<>();

        for (char c : charArray) {
            asList.add(c);
        }

        return asList;
    }
}

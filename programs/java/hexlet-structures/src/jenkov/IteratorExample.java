package jenkov;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hannah");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().equals("Jane")) {
                iterator.remove();

            }
            System.out.println(iterator.next());
        }

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n");

        Set<String> set = new HashSet<>();
        set.add("Jane");
        set.add("Heidi");
        set.add("Hannah");

        Iterator<String> iterator2 = set.iterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}

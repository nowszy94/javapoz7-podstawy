package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {

    }



    private static void arrayListExample() {
        List<String> names = new ArrayList<>();
        names.add("Szymon");
        names.add("Szymon");
        names.add("Szymon");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String value : names) {
            System.out.println(value);
        }
    }

    private static <T> void showArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

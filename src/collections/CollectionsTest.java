package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        showList(Arrays.asList("Jan", "Anna", "Szymon", "Karolina"));
    }

    private static void showList(List<String> list) {
        for (String value : list) {
            if (value.length() > 5) {
                System.out.println(value);
            }
        }

//        for (int i = 0; i < list.size(); i++) {
//            String value = list.get(i);
//            if (value.length() > 5) {
//                System.out.println(value);
//            }
//        }
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

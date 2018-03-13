package collections;

import oop.User;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
//        Set<String> test = new HashSet<>();
////        showList(Arrays.asList("Jan", "Anna", "Szymon", "Szymon", "Karolina"));
////        Random random = new Random();
////        Set<Integer> uniqueNumbers = new HashSet<>();
////        while (uniqueNumbers.size() < 10) {
////            uniqueNumbers.add(random.nextInt(10));
////        }
////        System.out.println(uniqueNumbers.size());
////        uniqueNumbers.add(50);
////        System.out.println(uniqueNumbers.size());
////        for (Integer uniqueNumber : uniqueNumbers) {
////            System.out.println(uniqueNumber);
////        }

        Set<User> users = new HashSet<>();
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Szymon", "Nowak"));
        users.add(new User("Jan", "Kowalski"));
        users.remove(new User("Szymon", "Nowak"));
        System.out.println(users.size());

        User user = new User("Jan", "Kowalski");
        User user2 = new User("Jan", "Kowalski");
        System.out.println(user == user2);
        System.out.println(user.equals(user2));

        Map<String, User> map = new TreeMap<>();
        map.put("494894984", new User("Anna", "Wisniewska"));
        map.put("123456789", new User("Szymon", "Nowak"));
        map.put("153456789", new User("Szymon", "Nowak"));
        map.put("183456789", new User("Szymon", "Nowak"));
        map.put("23456789", new User("Szymon", "Nowak"));
        map.put("2356", new User("Jan", "Kowalski"));
        User remove = map.remove("2356");
        User user1 = map.get("123456789");

        Set<Map.Entry<String, User>> entries = map.entrySet();
        for (Map.Entry<String, User> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

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

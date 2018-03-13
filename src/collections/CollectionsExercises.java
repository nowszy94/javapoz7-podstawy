package collections;

import oop.User;
import oop.bookstore.Author;
import oop.bookstore.Book;

import java.util.*;

public class CollectionsExercises {
    public static void main(String[] args) {
        uniqueNumbersFromUser();
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(4);
//        list.add(7);
//        list.add(1);
//        list.add(10);
//        randomUnique(list);
//
//        Iterator<Integer> iterator = list.iterator();
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        //pobieramy od usera n liczb, wyswietlic tylko unikalne
//        Set<String> elements = new HashSet<>();
//        Iterator<String> iterator1 = elements.iterator();
        //utworzyc mape Pesel(String) -> User
        //utworzyc mape Autor -> lista ksiazek
        //utworzyc liste liczb (random) oraz wyswietlic liczby podzielne przez 2
        //utworzyc liste liczb (random) oraz wyswietlic tylko elementy na parzystych indeksach
        //na podstawie LinkedList, utworzyc kolejke fifo -> osobna klasa MyFifoQueue
    }

    public static void bookstore() {
        Map<Author, List<Book>> bookstore = new HashMap<>();
        bookstore.put(new Author("Adam Mickiewicz"),
                Arrays.asList(
                        new Book("Dziady 3", 1800),
                        new Book("Dziady 4", 1802))
        );
        bookstore.put(new Author("Henryk Sienkiewicz"),
                Arrays.asList(new Book("Quo Vadix", 1900),
                        new Book("Krzyzacy", 1902)));

        Set<Map.Entry<Author, List<Book>>> bookstoreSet = bookstore.entrySet();
        for (Map.Entry<Author, List<Book>> authorListEntry : bookstoreSet) {
            List<Book> books = authorListEntry.getValue();
            for (Book book : books) {
                if (book.getReleaseYear() > 1801) {
                    System.out.println(book);
                }
            }
        }
    }

    //utworzyc mape Pesel(String) -> User
    public static void usersDatabase() {
        Map<String, User> usersDatabase = new HashMap<>();
        usersDatabase.put("123456789", new User("Szymon", "Nowak"));
        usersDatabase.put("56789543", new User("Jan", "Kowalski"));
        usersDatabase.put("asdf939232", new User("Karolina", "Wisniewska"));
        Set<Map.Entry<String, User>> entries = usersDatabase.entrySet();
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> next = iterator.next();
            System.out.println(next.getKey() + ": " + next.getValue());
        }

        for (Map.Entry<String, User> next : entries) {
            System.out.println(next.getKey() + ": " + next.getValue());

        }
    }

    public static void uniqueNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int nextValue = scanner.nextInt();
            set.add(nextValue);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void randomUnique(List<Integer> numbers) {
        List<Integer> tmpList = new ArrayList<>(numbers);
        Random random = new Random();
        for (int i = 0; i < numbers.size(); i++) {
            int index = random.nextInt(tmpList.size());
            System.out.println(tmpList.remove(index));
        }
    }
}

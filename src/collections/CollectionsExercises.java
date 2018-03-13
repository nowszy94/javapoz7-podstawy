package collections;

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

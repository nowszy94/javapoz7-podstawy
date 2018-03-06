package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomApplication {
    private static void randomExample() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
//            ThreadLocalRandom.current().nextInt();
            System.out.println(random.nextInt(10) + 10);
        }
    }

    public static void main(String[] args) {
        //nowa tablica n elemntowa zlozona z loswych liczb
        //nowa tablica o wielkosci zdefiniowanej prze usera elemntowa zlozona z loswych liczb
                //z zakresu podanego prze usera
        //suma loswych elementow
        //metoda symulujaca rzut kostka do gry (zwraca wartosc)

//        int[] array = randomArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + ". " + array[i]);
//        }
//        randomArrayFromUser();
        randomArrayOfEvenNumbers();
    }

    public static void randomArrayOfEvenNumbers() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = (random.nextInt(5) + 1) * 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void randomArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify size");
        int size = scanner.nextInt();
        System.out.println("Specify bound");
        int bound = scanner.nextInt();
        System.out.println("Specify offset");
        int offset = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(bound) + offset;
            array[i] = number;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    //wygenerowac 10 losowych liczb parzystych z zakresu 0 - 10 włącznie (zadanie domowe) - metoda

    public static void sum() {
        //TODO: napisac jeszcze raz genreowanie liczb
        int[] array = randomArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
    }

    public static int[] randomArray() {
        int n = 10;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 5;
        }
        return array;
    }
}

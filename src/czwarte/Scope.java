package czwarte;

import java.util.Arrays;
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        String[] names = {"Jan", "Anna", "Marek"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //1. zdefiniowac tablice z kilkoma liczbami. obliczyc sume
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        //2. zdefiniowac tablice z kilkoma liczbami. obliczyc srednia
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println(sum / array.length);
        //3. zdefiniowac tablice z kilkoma liczbami. wyswietlic max i min
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        //4. zdefiniowac tablice z kilkoma liczbami.
        //   zliczamy ilosc elementow do wystapienia liczby ujemnej
        int[] arrayWithValue = {1, 4, 6};
        int counter = 0;
        while (counter < arrayWithValue.length && arrayWithValue[counter] >= 0) {
            counter++;
        }
        System.out.println("counter of positvie numbers =" + counter);

        //5. podwoic wartosci w tablicy
        int[] arrayToBeDoubled = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arrayToBeDoubled.length; i++) {
            arrayToBeDoubled[i] *= 2;
        }
        System.out.println(Arrays.toString(arrayToBeDoubled));

        //6. utworzyli tablice n elementowa z kolejnych liczb (np 4 1,2,3,4)
        int n = 10;
        int[] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(newArray));
        //7. utworzyc tablice n elementowa tylko z parzystych liczb (np 4 2,4,6,8)
        int[] arrayOfEvenNumbers = new int[n];
        for (int i = 0; i < arrayOfEvenNumbers.length; i++) {
            arrayOfEvenNumbers[i] = (i+1)*2;
        }
        System.out.println(Arrays.toString(arrayOfEvenNumbers));
        //8. zapytac usera o rozmiar i utworzyc tablice z liczbami (np 5 5,4,3,2,1)
        int size = 5;
        int[] descendingNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            descendingNumbers[i] = descendingNumbers.length - i;
        }
        System.out.println(Arrays.toString(descendingNumbers));
        //9. zapytac usera o rozmiar, umozliwic mu wstawianie elementow i obliczyc srednia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size of array");
        int sizeOfUserArray = scanner.nextInt();
        int[] userArray = new int[sizeOfUserArray];
        int sumOfUserArray = 0;
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Insert next value");
            userArray[i] = scanner.nextInt();
            sumOfUserArray += userArray[i];
        }
        System.out.println("Avg = " + ((double)sumOfUserArray / userArray.length));
        //10. mamy posortowana tablice rosnaco. ile jest elmentow mniejszych od liczby
        int searchingNumber = 6;
        int[] sortedArray = {1,3,5,6,7,8,9};
        int counterForSearching = 0;
        while (counterForSearching < sortedArray.length && sortedArray[counterForSearching] != searchingNumber){
            counterForSearching++;
        }
        System.out.println("We have " + counterForSearching + " numbers smaller than " + searchingNumber);

        // kodowanie i odkodowywanie szyfru cezara
        // tablica liczb. definiujemy liczbe. tworzymy 2 tablice z elmeentami odpowiednio mniejszymi i wiekszymi
    }

    private static void variables() {
        String message = "Hello World";
        char[] messageAsCharArray = message.toCharArray();
        int length = messageAsCharArray.length;
        System.out.println(messageAsCharArray[0]);
        System.out.println(messageAsCharArray[1]);
        System.out.println(messageAsCharArray[2]);
        System.out.println(messageAsCharArray[3]);

        long[] arrayLong = {1, 23, 4, 5, 100000000000000L};
        char[] charArray = {'a', 'b'};
        String[] names = {"Jan", "Anna"};
        System.out.println(names[0]);

        int[] array = {1, 2, 3, 4, 5, 6};
        int size = 10;
        int[] emptyArray = new int[10];
        int[] emptyArray2 = new int[size];
        emptyArray[0] = 2;
        array[6] = 3;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        int number = 21;
        int multiplier = 1;
        int binaryCode = 0;
        while (number != 0) {
            int bit = number % 2;
            binaryCode += bit * multiplier;
            multiplier *= 10;
            number /= 2;
        }
        System.out.println("binaryCode = " + binaryCode);

        char character = 'a' + 3;
        System.out.println(character);
        System.out.println((int) character);
        char a = (char) 97;
        System.out.println('c' + 1);

        for (int i = 0; i <= 122 - 97; i += 2) {
            System.out.print((char) (a + i));
        }
        System.out.println();

        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i);
        }
        System.out.println();
        for (char i = 'a'; i <= 122; i++) {
            System.out.print(i);
        }

        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] ints = new int[l];
    }

    private static void scope() {
        int number = 1500000000;
        System.out.println(number + number);
        System.out.println("MAX_VALUE = " + (Integer.MAX_VALUE + 1));
        System.out.println("MIN_VALUE = " + (Integer.MIN_VALUE - 1));

        long bigNumber = 3000000_000L;
        System.out.println(bigNumber);
        System.out.println("MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("MAX_VALUE = " + Long.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
    }
}

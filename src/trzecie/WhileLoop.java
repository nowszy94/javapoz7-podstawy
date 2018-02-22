package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // zad 1 wczytujemy liczby tak dlugo, az nie bedzie ona podzielna przez 15
//        int number = 1;
//        while(number % 15 != 0) {
//            number = scanner.nextInt();
//        }
//        System.out.println("Number = " + number);

        // zad 2 wczytujemy liczby tak dlugo, az ktos nie poda 0. Wyswietlamy sume podanych elementow
        boolean result = true;
        int sum = 0;
        while (result) {
            int value = scanner.nextInt();
            sum += value;
//            if (value == 0) {
//                result = false;
//            }
            result = value != 0;
        }
        System.out.println("Sum =" + sum);
    }

    private static void whileExample(Scanner scanner) {
        int sum = 10;
        int tmp = 0;
        int i = 0;
        while (tmp < sum) {
            int value = scanner.nextInt();
            i++;
            tmp += value;
        }
        System.out.println("Inserted " + i + " numbers.");
    }
}

package trzecie;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        // zad 1
        //wczytac liczbe n
        //zapytac n razy o liczbe
        //podzielna przez 2 to poinformowac
        //podzielna przez 3 to poinformowac
        //podzielna przez 6 to poinformowac
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insert next number");
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                System.out.println("Value is divisible by 6");
            } else if (number % 3 == 0) {
                System.out.println("Value is divisible by 3");
            } else if (number % 2 == 0) {
                System.out.println("Value is divisible by 2");
            } else {
                System.out.println("Value is not divisible by 6, 3 or 2");
            }
        }

        // zad 2
        // zdefiniowac liczbe n
        // pobieracie n liczb
        // sprawdzacie czy podana liczba jest wieksza od poprzedniej wprowadzonej
        System.out.println();
        System.out.println("Zadanie 2");
        int previousValue = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Insert next value to compare");
            int value = scanner.nextInt();
            if (value > previousValue) {
                System.out.println("New value is bigger than previous one");
            } else if (value == previousValue) {
                System.out.println("Value is equal to previous one");
            } else {
                System.out.println("New value is smaller than previous one");
            }
            previousValue = value;
        }

        // zad 3
        // obliczyc sume n parzystych liczb nie podzielnych przez 3 (np. n = 10 to obliczyc 0 + 2 + 4  + 8
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
//                sum = sum + i;
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);

        // zad *
        // obliczyc silnie dla n
        int factorial = 1;
        for (int i = 1; i < n; i++) {
//            factorial = factorial * i;
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

package czwarte;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        //napisac petle ktora odwraca liczbe np. 12345 -> 54321, 1200 -> 21
        System.out.println("zad1");
        int number = 1201;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber *= 10;
            reversedNumber += digit;
            number /= 10;
        }
        System.out.println("ReversedNumber = " + reversedNumber);
        //wczytujemy n liczb, i sumujemy wszystkie cyfry 123, 456 -> 1+2+3+4+5+6 = 21
        System.out.println();
        System.out.println("zad2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Insert number");
            int value = scanner.nextInt();
            // sumowanie cyfr
            while (value != 0) {
                int digit = value % 10;
                sum += digit;
                value /= 10;
            }
        }
        System.out.println("Sum = " + sum);
        //pozbyc sie wszystkich 0 z liczby np. 120002 -> 221
        System.out.println();
        System.out.println("zad3");
        int numberWithZeros = 102030405;
        int numberWithoutZeros = 0;
        int multiplier = 1;
        while (numberWithZeros != 0) {
            int digit = numberWithZeros % 10;
            if (digit != 0) {
                numberWithoutZeros += digit * multiplier;
                multiplier *= 10;
            }
            numberWithZeros /= 10;
        }
        System.out.println("NumberWithoutZeros = " + numberWithoutZeros);
    }
}

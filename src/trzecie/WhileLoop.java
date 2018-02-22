package trzecie;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        podajemy liczby tak dlugo az nie zostanie podane 0. wypisujemy najwieksza liczbe
        int value = 1;
        int maxValue = 0;
        while (value != 0) {
            value = scanner.nextInt();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("MaxValue = " + maxValue);

//        sprawdzanie ilosci cyfr podanej liczby
        System.out.println("Zadanie 2");
        System.out.println("Insert number: ");
        int n = scanner.nextInt();
        int numberOfDigits = 0;
        if (n == 0) {
            numberOfDigits++;
        }
        while (n != 0) {
            numberOfDigits++;
//            n = n / 10;
            n /= 10;
        }
        System.out.println("Number of digits = " + numberOfDigits);

//        suma cyfr liczby
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits = " + sum);

//        program liczacy ilosc podanej cyfry w liczbie
        System.out.println("Zadanie 4");
        System.out.println("Insert number");
        int anotherNumber = scanner.nextInt();
        System.out.println("Insert number to search for");
        int searchForNumber = scanner.nextInt();
        int counter = 0;
        while (anotherNumber != 0) {
            int nextNumber = anotherNumber % 10;
            if (nextNumber == searchForNumber) {
                counter++;
            }
            anotherNumber /= 10;
        }
        System.out.println("Found " + counter + " numbers " + searchForNumber);

//        wypisac dzielnik liczby
        int numberToGetDividers = scanner.nextInt();
        for (int i = 1; i <= numberToGetDividers / 2; i++) {
            if (numberToGetDividers % i == 0) {
                System.out.println("Divider: " + i);
            }
        }
        System.out.println("For number " + numberToGetDividers);

//        sprawdzic czy liczba jest pierwsza
        int primaryNumberCandidate = scanner.nextInt();
        int i = 2;
        boolean isPrimary = true;
//        while (isPrimary && i <= primaryNumberCandidate / 2 ) {
        while (isPrimary && i <= Math.sqrt(primaryNumberCandidate) ) {
            if (primaryNumberCandidate % i == 0) {
                isPrimary = false;
            }
            i++;
        }
        if (isPrimary) {
            System.out.println("Number is primary");
        } else {
            System.out.println("Number is not primary");
        }

//        menu
        int option = 1;
        while (option != 0) {
            System.out.println("1. New");
            System.out.println("2. Load");
            System.out.println("3. About");
            System.out.println("0. Quit");
            option = scanner.nextInt();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }

        // wyliczyc srednia podanych liczb
        // "dupochron" - podac liczbe parzysta wieksza od 10
        // binarna reprezentacja liczby
    }

    private static void whileLoopExercises(Scanner scanner) {
        // zad 1 wczytujemy liczby tak dlugo, az nie bedzie ona podzielna przez 15
        int number = 1;
        while(number % 15 != 0) {
            number = scanner.nextInt();
        }
        System.out.println("Number = " + number);

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

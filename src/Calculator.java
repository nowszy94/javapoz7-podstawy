import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner reader = new Scanner(System.in);
        //int someValue = reader.nextInt();
        //System.out.println(someValue);
        //1. pobrac liczby
        System.out.println("Insert first value");
        int firstValue = reader.nextInt();
        System.out.println("Insert second value");
        int secondValue = reader.nextInt();

        //2. wykonac dzialnia
        int addResult = firstValue + secondValue;
        int subtractResult = firstValue - secondValue;
        int multiplyResult = firstValue * secondValue;
        double divideResult = 0;
        if (secondValue != 0) {
            divideResult = (double) firstValue / secondValue;
        }
        //3. wyswietlic wyniki
        System.out.println("add = " + addResult);
        System.out.println("subtract = " + subtractResult);
        System.out.println("multiply = " + multiplyResult);
        if (secondValue != 0) {
            System.out.println("divide = " + divideResult);
        }

        //4. ladne wyswietlenie wynikow
        // 5 + 8 = 13
        // 5 - 8 = -3
        // 5 * 8 = 40
        // 5 / 8 = 0.625

        System.out.println(firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println(firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println(firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        if (secondValue != 0) {
            System.out.println(firstValue + " / " + secondValue + " = " + ((double) firstValue / secondValue));
        }

        // 5. wyswietlic informacje o liczbach
        // czy liczby sa rowne          firstValue == secondValue
        // czy liczby sa rozne          firstValue != secondValue
        // wyswietlic wieksza liczbe    firstValue >= secondValue -> firstValue
        // wyswietlic wieksza liczbe    firstValue <= secondValue -> firstValue
        // czy jest dzielenie z reszta
        // wyswietlic parzyste liczby

        if (firstValue == secondValue) {
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are not equal");
        }

        if (firstValue > secondValue) {
            System.out.println("First value is bigger than second");
        } else if (firstValue < secondValue) {
            System.out.println("Second value is bigger than first one");
        } else {
            System.out.println("Value's are equal");
        }

        if (firstValue < secondValue) {
            System.out.println("Second value is bigger than first one");
        }

        if (firstValue % secondValue != 0) {
            System.out.println("Liczby podzielne z reszta");
        } else {
            System.out.println("Liczby podzielne bez reszty");
        }

        if (firstValue % 2 == 0) {
            System.out.println("First value is even");
        } else {
            System.out.println("First value is odd");
        }

        if (secondValue % 2 == 0)
            System.out.println("Second value is even");
        else
            System.out.println("Second value is odd");
    }
}

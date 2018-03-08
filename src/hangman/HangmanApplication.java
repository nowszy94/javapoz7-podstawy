package hangman;

import oop.Address;
import oop.User;

import java.util.Random;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("1. Start");
            System.out.println("2. Wyniki");
            System.out.println("0. Koniec");
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    showHighscores(scanner);
                    break;
            }

        } while (answer != 0);
    }

    private static void startGame(Scanner scanner) {
        String[] secretWords = {"Ala ma kota", "krzeslo", "warszawa"};
        Random random = new Random();
        int messageIndex = random.nextInt(secretWords.length);
        boolean resultOfGame = game(scanner, secretWords[messageIndex]);
        if (resultOfGame) {
            System.out.println("You won!");
        } else {
            System.out.println("You loose");
        }
    }

    private static boolean game(Scanner scanner, String text) {
        char[] progressArray = generateProgressArray(text);
        System.out.println("Try to find out");
        int attempts = 5;
        do {
            System.out.println("Attempts left: " + attempts);
            System.out.println(String.valueOf(progressArray));
            char c = scanner.nextLine().charAt(0);
            boolean insertResult = tryToInsertLetter(c, progressArray, text);
            if (!insertResult) {
                attempts--;
            }
        } while(attempts > 0 && !isFinished(progressArray, text));
        return attempts > 0;
    }

    private static boolean isFinished(char[] progressArray, String text) {
        return String.valueOf(progressArray).equals(text);
    }

    private static boolean tryToInsertLetter(char c, char[] progressArray, String text) {
        boolean result = text.contains(String.valueOf(c));
        if (result) {
            fillWithLetter(c, progressArray, text);
        }
        return result;
    }

    private static void fillWithLetter(char letter, char[] progressArray, String text) {
        for (int i = 0; i < text.length(); i++) {
            progressArray[i] = (capitalize(text.charAt(i)) == capitalize(letter)) ? text.charAt(i) : progressArray[i];
        }
    }

    private static char capitalize(char c) {
        return (isSmallLetter(c) ? (char)(c - 32) : c);
    }

    private static boolean isSmallLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    private static char[] generateProgressArray(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = isLetter(array[i]) ? '_' : array[i];
        }
        return array;
    }

    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static void showHighscores(Scanner scanner) {
        System.out.println("Tutaj bedzie wyswietlanie wynikow");
    }
}

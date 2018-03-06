package moreless;

import java.util.Random;
import java.util.Scanner;

public class MoreLessApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("1. Start");
            System.out.println("2. Zasady");
            System.out.println("3. Bot");
            System.out.println("0. Koniec");
            answer = scanner.nextInt();
            scanner.nextLine();
            switch(answer) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    showRules(scanner);
                    break;
                case 3:
                    measureDummyBot();
                    measureAnotherBot();
                    break;
            }
        } while(answer != 0);
    }

    private static void measureAnotherBot() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += anotherBot(generateGameNumber());
        }
        System.out.println("Another bot statistics: " + (sum/1000));
    }

    private static void measureDummyBot() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += dummyBot(generateGameNumber());
        }
        System.out.println("Dummy bot statistics: " + (sum/1000));
    }


    private static void startGame(Scanner scanner) {
        System.out.println("Press any key to continue");
        scanner.nextLine();
        int secretNumber = generateGameNumber();
        int counter = 0;
        int userNumber;
        do {
            System.out.println("Insert next number");
            userNumber = scanner.nextInt();
            scanner.nextLine();
            counter++;
            gameStep(userNumber, secretNumber);
        } while(userNumber != secretNumber);
        System.out.println("Game is finished! Result: " + counter);
    }

    private static int anotherBot(int secretNumber) {
        int number;
        int counter = 0;
        do {
            number = counter;
            counter++;
        } while(compare(number, secretNumber) != 0);
        return counter;
    }

    private static int dummyBot(int secretNumber) {
        int number;
        int counter = 0;
        Random random = new Random();
        do {
            number = random.nextInt(101);
            counter++;
        } while(compare(number, secretNumber) != 0);
        return counter;
    }

    private static void gameStep(int number, int secretNumber) {
        if (compare(number, secretNumber) == -1) {
            System.out.println("Number is to small");
        } else if (compare(number, secretNumber) == 1) {
            System.out.println("Number is to big");
        }
    }

    public static int compare(int number, int secretNumber) {
//        return Integer.compare(number, secretNumber);
        return number < secretNumber ? -1 : (number > secretNumber ? 1 : 0);
    }

    private static int generateGameNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private static void showRules(Scanner scanner) {
        System.out.println("Tutaj bedzie wyswietlanie zasad");
    }
}

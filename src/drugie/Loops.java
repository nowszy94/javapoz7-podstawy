package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i += 3) {
            int number = scanner.nextInt();
            if (number >= 5 && number <= 20) {
                System.out.println((i + 1) + ". Pow(" + number + ") = " + (number * number));
            } else {
                System.out.println("Number not supported. Upgrade to full version");
            }
        }
        System.out.println("End of program");
    }
}

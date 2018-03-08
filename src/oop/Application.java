package oop;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = createUser(scanner);
        System.out.println(user.firstName);

        Address address = new Address();
        address.setCity("Poznan");
        address.street = "Polwiejska";
        address.number = 20;
        address.postalCode = "60-371";
//        address.show();
        user.address = address;


        Address blabla = new Address("asdfas", "asdf", "ASdfasd",1);
        blabla.city = "Poznan";

        user.introduceYourself();
    }

    public static User createUser(Scanner scanner) {
        User user = new User();
        System.out.println("Insert firstName");
        user.firstName = scanner.nextLine();

        System.out.println("Insert lastName");
        user.lastName = scanner.nextLine();

        System.out.println("Insert phoneNumber");
        user.phoneNumber = scanner.nextLine();

        System.out.println("Insert email");
        user.email = scanner.nextLine();

        return user;
    }
}

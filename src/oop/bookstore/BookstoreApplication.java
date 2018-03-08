package oop.bookstore;

import java.util.Scanner;

public class BookstoreApplication {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        Author[] authors = new Author[5];
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("1. Authors");
            System.out.println("2. Books");
            System.out.println("0. Exit");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    authorsList(scanner, authors);
                    break;
                case 2:
                    booksList(scanner, books);
                    break;
            }
        } while(answer != 0);
    }

    private static void authorsList(Scanner scanner, Author[] authors) {
        list(authors);
        scanner.nextLine();
    }

    private static void booksList(Scanner scanner, Book[] books) {
        list(books);
        scanner.nextLine();
    }

    private static void list(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

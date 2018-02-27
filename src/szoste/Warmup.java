package szoste;

import java.util.Arrays;

public class Warmup {
    public static void main(String[] args) {
        String[] names = {"Jan", "Anna", "Mateusz", "Amelia", "Agnieszka"};
        System.out.println("Women's names = " + womenNamesCounter(names));
        System.out.println("Number of a in Anna = " + lettersCounter("AnnaA", 'A'));
        System.out.println("Number od a in " + Arrays.toString(names) + " = " + lettersCounter(names, 'a'));
    }

    public static int lettersCounter(String[] messages, char c) {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            counter += lettersCounter(messages[i], c);
        }
        return counter;
    }

    public static int lettersCounter(String text, char c) {
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
        for (int i = chars.length - 1; i >= 0; i--) {
            if (capitalize(chars[i]) == capitalizedChar) {
                counter++;
            }
        }
        return counter;
    }

    public static char capitalize(char c) {
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;

//        if (c >= 'a' && c <= 'z') {
//            return (char) (c - 32);
//        } else {
//            return c;
//        }
    }

    public static int womenNamesCounter(String[] names) {
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
//            if (names[i].endsWith("a")) {
//                counter++;
//            }
            if (endsWith(names[i], "a")) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean endsWith(String text, String searchingValue) {
        boolean result = false;
        if (searchingValue.length() <= text.length()) {
            int i = searchingValue.length() - 1;
            char[] textAsCharArray = text.toCharArray();
            char[] searchValueAsCharArray = searchingValue.toCharArray();

            int aLength = textAsCharArray.length;
            int bLength = searchValueAsCharArray.length;
            while (i >= 0 && searchValueAsCharArray[i] == textAsCharArray[aLength + i - bLength]) {
                i--;
            }
            result = i == -1;

        }
        return result;
    }
}

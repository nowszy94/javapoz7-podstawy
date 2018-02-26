package czwarte;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int offset = 1;
        String message = "Ala ma kotza ZA";
        String codedMessage = code(offset, message);
        String decodedMessage = decode(offset, codedMessage);

        System.out.println("Secret   = " + message);
        System.out.println("Codded   = " + codedMessage);
        System.out.println("Decodded = " + decodedMessage);
    }

    private static void splitArray() {
        // tablica liczb. definiujemy liczby. tworzymy 2 tablice z elmeentami odpowiednio mniejszymi i wiekszymi
        int[] numbers = {10,20,30,40,60,70,80};
        int searchingNumber = 40;

        int i = 0;
        while (i < numbers.length && numbers[i] != searchingNumber) {
            i++;
        }
        if (i < numbers.length) {
            int[] smallerNumbersArray = new int[i + 1];
            int[] biggerNumbersArray = new int[numbers.length - (i + 1)];

            for (int j = 0; j < smallerNumbersArray.length; j++) {
                smallerNumbersArray[j] = numbers[j];
            }
            for (int j = 0; j < biggerNumbersArray.length; j++) {
                biggerNumbersArray[j] = numbers[j + i + 1];
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(smallerNumbersArray));
            System.out.println(Arrays.toString(biggerNumbersArray));

        } else {
            System.out.println("Number " + searchingNumber + " not found.");
        }
    }

    private static String code(int offset, String secretMessage) {
        char[] chars = secretMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == 32)
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                if (((chars[i] + offset) > 'Z' && (chars[i] + offset) < 'a') || ((chars[i] + offset) > 'z')) {
                    chars[i] = (char) (chars[i] - 26 + offset);
                } else {
                    chars[i] += offset;
                }
            }
        }
        return String.valueOf(chars);
    }

    public static String decode(int offset, String codedMessage) {
        //odkodowywanie
        char[] chars = codedMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == 32)
            if ((chars[i] >= 'a' && chars[i] <= 'z') ||
                    (chars[i] >= 'A' && chars[i] <= 'Z')) {
                if (chars[i] == 'a' || chars[i] == 'A') {
                    chars[i] = (char) (chars[i] + 26 - offset);
                } else {
                    chars[i] -= offset;
                }
            }
        }
        return String.valueOf(chars);
    }
}

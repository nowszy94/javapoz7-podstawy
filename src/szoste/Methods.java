package szoste;

public class Methods {
    //silnia (factorial) -> long
    //zliczanie liczb podzielnych przez 2, ale nie podzielnych przez 3
    //zamiana jednego znaku na drugi w danym stringu
    //sprawdzenie czy string jest liczba
    //czy text jest palindromem np. kajak -> true, anna -> true, abc -> false
    //split -> 123;abc;dd -> ["123", "abc", "dd"]
    //         dd.aa.cc -> ["dd", "aa", "cc"]
    //fibonacci
    //sprawdzanie nawiasow w stringu
    //metoda do porownania 2 stringow ktore sa liczbami
    //metoda wyswietlajaca sume liczb pierwszych w danej liczbie (1,2,3,5,7,11) np.
    //              liczba 29 = 11 + 11 + 7
    //              liczba 31 = 11 + 11 + 7 + 2
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Factorial of 6 = " + factorial(6));
        System.out.println("Divisible by 2 and not by 3 = " + countDivisibleBy2AndNotBy3(array));
        System.out.println("Switched text = " + switchChars("ala ma kota", 'a', 'b'));
        System.out.println("\"123\" is number = " + isNumber("123"));
        System.out.println("\"2a3\" is number = " + isNumber("2a3"));
        System.out.println("\"anna\" is palindrome = " + isPalindrome("anna"));
        System.out.println("\"1Kajak1\" is palindrome = " + isPalindrome("1Kajak1"));
        System.out.println("\"abcdefgh\" is palindrome = " + isPalindrome("abcdefgh"));
    }

    //TODO
    //    public static String[] split(String message, char c) {
//        String[] array = new String[Warmup.lettersCounter(message, c)];
//        int start = 0;
////        int end = getNthIndexOf(c, message, 0);
//        return array;
//    }

    public static boolean isPalindrome(String text) {
        char[] chars = text.toCharArray();
        int i = 0;
        while (i < chars.length / 2 && (Warmup.capitalize(chars[i]) == Warmup.capitalize(chars[chars.length - i - 1]))) {
            i++;
        }
        return i == chars.length / 2;
    }

    public static boolean isNumber(String numberCandidate) {
        char[] chars = numberCandidate.toCharArray();
        int i = 0;
        while (i < chars.length && (chars[i] >= '0' && chars[i] <= '9')) {
            i++;
        }
        return i == chars.length;
    }

    public static String switchChars(String text, char from, char to) {
        char[] textAsChars = text.toCharArray();
        for (int i = 0; i < textAsChars.length; i++) {
            if (textAsChars[i] == from) {
                textAsChars[i] = to;
            }
        }
        return String.valueOf(textAsChars);
    }

    public static int countDivisibleBy2AndNotBy3(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                counter++;
            }
//            counter += (array[i] % 2 == 0 && array[i] % 3 != 0) ? 1 : 0;
        }
        return counter;
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

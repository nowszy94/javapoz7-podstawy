package czwarte;

public class CezarCode {
    public static void main(String[] args) {
        String secretMessage = "Ala ma kota";
        int offset = 1;
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
        String coddedMessage = String.valueOf(chars);

        //odkodowywanie
        int offsetDecode = 1;

        char[] charsOfCoddedMessage = coddedMessage.toCharArray();
        for (int i = 0; i < charsOfCoddedMessage.length; i++) {
//            if (charsOfCoddedMessage[i] == 32)
            if ((charsOfCoddedMessage[i] >= 'a' && charsOfCoddedMessage[i] <= 'z') ||
                    (charsOfCoddedMessage[i] >= 'A' && charsOfCoddedMessage[i] <= 'Z')) {
                if (charsOfCoddedMessage[i] == 'a' || charsOfCoddedMessage[i] == 'A') {
                    charsOfCoddedMessage[i] = (char) (charsOfCoddedMessage[i] - 26 + offsetDecode);
                } else {
                    charsOfCoddedMessage[i] -= offsetDecode;
                }
            }
        }
        System.out.println("Codded   = " + coddedMessage);
        System.out.println("Expected = " + secretMessage);
        System.out.println("Actual   = " + String.valueOf(charsOfCoddedMessage));
        System.out.println("Correct = " + (coddedMessage.equals(String.valueOf(charsOfCoddedMessage))));
    }

}

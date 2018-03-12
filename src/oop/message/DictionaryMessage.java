package oop.message;

import java.util.Random;

public class DictionaryMessage implements Message {
    private String[] dictionary;
    private Random random;

    public DictionaryMessage() {
        this(new String[]{"Adam", "Ewa", "Jan"});
    }

    public DictionaryMessage(String[] dictionary) {
        this.dictionary = dictionary;
        this.random = new Random();
    }

    @Override
    public String getMessage() {
        return getRandomMessage();
    }

    private String getRandomMessage() {
        int index = random.nextInt(dictionary.length);
        return dictionary[index];
    }

    public void setDictionary(String[] dictionary) {
        this.dictionary = dictionary;
    }
}

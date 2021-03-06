package oop.message;

import java.util.Random;

public class RandomMessage implements Message {

    private int bound;
    private int offset;
    private Random random;

    public RandomMessage(int bound, int offset) {
        this.bound = bound;
        this.offset = offset;
        this.random = new Random();
    }

    @Override
    public String getMessage() {
        return String.valueOf(random.nextInt(bound) + offset);
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

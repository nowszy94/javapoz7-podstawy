package oop.shapes;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int field() {
        return a * a;
    }

    public int circuit() {
        return 4 * a;
    }

    public double diagonal() {
        return Math.sqrt(2) * a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

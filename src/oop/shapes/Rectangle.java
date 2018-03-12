package oop.shapes;

public class Rectangle implements Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    public int field() {
        return a * b;
    }

    public int circuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public double diagonal() {
        return Math.sqrt(a * a + b * b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void printAllSides() {

    }
}

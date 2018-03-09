package oop.shapes;

public interface Shape {

    public static final String NAME_OF_SOMETHING = "monsters";

    static void test() {
        System.out.println("test");
    }

    String getName();
    int field();
    int circuit();
    double diagonal();
}

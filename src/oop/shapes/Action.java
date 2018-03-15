package oop.shapes;

public interface Action {
    void test();

    default void test(int as) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        array[3] = null;
    }
}

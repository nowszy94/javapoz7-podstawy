package oop.shapes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShapesApplication {
    public static void main(String[] args) {
//        Square square = new Square(4);
//        Square square2 = new Square(8);
//        Square square3 = new Square(2);
//        Square[] squares = {square, square2, square3};
//        Rectangle[] rectangles = {new Rectangle(3, 4), new Rectangle(5, 2), new Rectangle(6, 2)};
//        showSquares(squares);
//        showRectangles(rectangles);

        Arrays.asList("Szymon", "Jan", "Anna")
                .stream()
                .filter(e -> e.startsWith("S"))
                .forEach(s -> System.out.println(s));

        Shape[] shapes = {new Square(4), new Rectangle(2, 3), new Diamond()};
        Square[] squares = {new Square(4), new Square(8), new Square(2)};
        showShapes(shapes);
        showShapes(squares);

        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 2);
        map.put("abce", 3);
        map.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }

    private static void showShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Name = " + shapes[i].getName());
            System.out.println("Field = " + shapes[i].field());
            System.out.println("Circuit = " + shapes[i].circuit());
            System.out.println("Diagonal = " + shapes[i].diagonal());
            System.out.println(shapes[i]);
        }
    }
}

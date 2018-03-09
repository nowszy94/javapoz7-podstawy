package oop.shapes;

public class ShapesApplication {
    public static void main(String[] args) {
//        Square square = new Square(4);
//        Square square2 = new Square(8);
//        Square square3 = new Square(2);
//        Square[] squares = {square, square2, square3};
//        Rectangle[] rectangles = {new Rectangle(3, 4), new Rectangle(5, 2), new Rectangle(6, 2)};
//        showSquares(squares);
//        showRectangles(rectangles);

        Shape[] shapes = {new Square(4), new Rectangle(2, 3), new Diamond()};
        Square[] squares = {new Square(4), new Square(8), new Square(2)};
        showShapes(shapes);
        showShapes(squares);
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

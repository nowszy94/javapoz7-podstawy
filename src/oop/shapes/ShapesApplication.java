package oop.shapes;

public class ShapesApplication {
    public static void main(String[] args) {
        Square square = new Square(4);
        Square square2 = new Square(8);
        Square square3 = new Square(2);
        Square[] squares = {square, square2, square3};
//        Square[] squares = {new Square(4), new Square(8), new Square(2)};
        showSquares(squares);
    }

    private static void showSquares(Square[] squares) {
        for (int i = 0; i < squares.length; i++) {
            showSquare(squares[i]);
        }
    }

    private static void showSquare(Square square) {
        System.out.println("Field = " + square.field());
        System.out.println("Circuit = " + square.circuit());
        System.out.println("Diagonal = " + square.diagonal());
    }
}

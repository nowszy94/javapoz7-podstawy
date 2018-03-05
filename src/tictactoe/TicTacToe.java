package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            TicTacToeViews.menuView();
            answer = scanner.nextInt();
            switch(answer) {
                case 1:
                    startGame(scanner);
                    break;
            }
        } while(answer != 0);
    }

    public static void startGame(Scanner scanner) {
        boolean result = true;
        char cross = 'X';
        char circle = 'O';
        char currentSign = cross;
        char[] board = "123456789".toCharArray();
        int i = 0;
        do {
            TicTacToeViews.boardView(board);
            int position = askForPosition(scanner, board);
            mark(currentSign, board, position);
            currentSign = currentSign == 'X' ? circle : cross;
            i++;
        } while (i < 9 && !gameFinished(board));
        System.out.println("End of game");
    }

    private static boolean gameFinished(char[] board) {
        //TODO wrzucic tutaj i i sprawdzic czy jest remis
        //        return isFirstDiagonalEqual(board) ||
//                isSecondDiagonalEqual(board) ||
//                isAnyVerticalEqual(board) ||
//                isAnyHorizontalEqual(board);
        return false;
    }

    private static void mark(char currentSign, char[] board, int position) {
        board[position] = currentSign;
    }

    public static int askForPosition(Scanner scanner, char[] board) {
        int position;
        do {
            position = scanner.nextInt();
            if (!isValidPosition(position, board)) {
                System.out.println("Invalid value. Try again");
            }
        } while(!isValidPosition(position, board));
        return position - 1;
    }

    private static boolean isValidPosition(int position, char[] board) {
        return (position >= 1 && position <= 9) && board[position - 1] != 'X' && board[position - 1] != 'O';
    }
}

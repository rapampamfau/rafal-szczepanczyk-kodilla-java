package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuBoard.BOARD_SIZE;

public class SudokuSolver {

    public static boolean isNumberInRow(SudokuElement[][] board, int number, int row) {
        for (int y = 0 ; y < BOARD_SIZE; y++) {
            if (board[row][y].getValue() == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInColumn(SudokuElement[][] board, int number, int column) {
        for (int x = 0 ; x < BOARD_SIZE; x++) {
            if (board[x][column].getValue() == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNumberInBox(SudokuElement[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int x = localBoxRow; x < localBoxRow + 3; x++) {
            for (int y = localBoxColumn; y < localBoxColumn + 3; y++) {
                if (board[x][y].getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValidPlacement(SudokuElement[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    public static boolean solveBoard(SudokuElement[][] board) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (board[row][column].getValue() == SudokuElement.EMPTY) {
                    for (int numberToTry = 1; numberToTry <= BOARD_SIZE; numberToTry++) {
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            board[row][column].setValue(numberToTry);

                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][column].setValue(SudokuElement.EMPTY);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}

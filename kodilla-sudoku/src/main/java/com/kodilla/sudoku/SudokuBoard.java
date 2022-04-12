package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SudokuBoard {

    public static final int BOARD_SIZE = 9;
    private List<SudokuRow> boardRow = new ArrayList<>();
    public static SudokuElement[][] readyBoard = new SudokuElement[BOARD_SIZE][BOARD_SIZE];
    Random randomGenerator = new Random();
    private int randomNumber = randomGenerator.nextInt(9) +1;

    public  SudokuElement[][] createEmptyBoard() {
        for (int x = 0; x < BOARD_SIZE; x++) {
            boardRow.add(new SudokuRow());
            for (int y = 0; y < BOARD_SIZE; y++) {
                SudokuElement element = new SudokuElement(SudokuElement.EMPTY, x, y);
                boardRow.get(x).getRow().add(element);
                readyBoard[x][y] = element;
            }
        }
        return readyBoard;
    }

    @Override
    public String toString() {
        String result = "-------------------------------------\n";
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (readyBoard[row][col].getValue() == SudokuElement.EMPTY) {
                        result += "| " + readyBoard[row][col] + " ";
                } else {
                    result += "| " + readyBoard[row][col].getValue() + " ";
                }
            }
            if (row % 3 == 2) {
                if (row == 8) {
                    result += "| " + "\n-------------------------------------\n";
                } else {
                    result += "| " + "\n|-----------|-----------|-----------|\n";
                }
            } else {
                result += "| " + "\n|---|---|---|---|---|---|---|---|---|\n";
            }
        }
        return result;
    }
}

package com.kodilla.sudoku;

import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;
    private int value;
    private int x;
    private int y;

    public SudokuElement(int value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String sudokuElement;
        if (value == EMPTY) {
            sudokuElement = " ";
        } else {
            sudokuElement = Integer.toString(value);
        }
        return sudokuElement;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

package com.kodilla.sudoku;

public class SudokuApp {

    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            //gameprocess
            gameFinished = theGame.resolveSudoku();
        }
    }
}

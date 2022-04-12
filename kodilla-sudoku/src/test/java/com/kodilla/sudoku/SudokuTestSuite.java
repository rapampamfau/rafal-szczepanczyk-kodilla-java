package com.kodilla.sudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SudokuTestSuite {

    @Test
    void testBoard() {
        //given
        SudokuBoard board = new SudokuBoard();
        board.createEmptyBoard();
        System.out.println(board);
    }

    @Test
    void testSolvedSudoku() {
        //given
        SudokuGame theGame = new SudokuGame();
        SudokuBoard board = new SudokuBoard();
        board.createEmptyBoard();

        //when
        boolean result = theGame.resolveSudoku();

        //then
        System.out.println(result);
        System.out.println(board);
    }
}

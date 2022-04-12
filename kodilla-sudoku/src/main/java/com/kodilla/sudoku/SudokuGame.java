package com.kodilla.sudoku;

import java.util.Scanner;

import static com.kodilla.sudoku.SudokuBoard.readyBoard;

public class SudokuGame {

    Scanner scan = new Scanner(System.in);
    private String input;

    public void process() {
        showInstructions();

    }

    public void showInstructions() {
        System.out.println("                --- Welcome to sudoku ---\n" +
                "To enter a number into a cell: first enter row number,\n" +
                "then the column number, " +
                "and finally the number you want to put.\n" +
                "For example: 8,2,4\n" +
                "If you want to see resolved sudoku then type SUDOKU");
    }

    public void exitOrNewGame() {
        System.out.println("Press 'x' to end the game or 'n' to start new game");
        input = scan.next();
        if (input.equals("x")) {
            System.out.println("See you nex time :)");
            //end game
        } else if (input.equals("n")) {
            //start new game
        }
    }

    public boolean startNewGame() {
        System.out.println("Are you sure you want to quit current game?"
                + "\nPress 'y' - yes"
                + "\nPress 'n' - no");

        input = scan.next();
        boolean result = false;
        if (input.equals("y")) {
            result = true;
            System.out.println("Starting new game...");
            //start new game
        } else if (input.equals("n")) {
            result = false;
            //continue present game
        }
        return result;
    }

    public boolean endGame() {
        System.out.println("Are you sure you want to quit the game?"
                + "\nPress 'y' - yes"
                + "\nPress 'n' - no");

        input = scan.next();
        boolean result = false;
        if (input.equals("y")) {
            result = true;
            System.out.println("See you next time :)");
            //stop the game
        } else if (input.equals("n")) {
            result = false;
            //continue present game
        }
        return result;
    }

    public boolean resolveSudoku() {
        if (SudokuSolver.solveBoard(readyBoard)) {
            System.out.println("Solved");
            return true;
        } else {
            System.out.println("Unsolved");
        }
        return false;
    }
}

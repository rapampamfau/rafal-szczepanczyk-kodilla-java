package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Rps {

    Random randomGenerator = new Random();
    Scanner scan = new Scanner(System.in);
    private String input;
    private String playerName;
    private String playerMove;
    private String computerMove;
    private int playerCount;
    private int computerCount;
    private int roundsToWin;

    public String askPlayerName() {
        System.out.println("What is your name?");
        return playerName = scan.next();
    }

    public int askRounds() {
        System.out.println("How many winnings do you want to play up to?");
        return roundsToWin = scan.nextInt();
    }

    public void showInstructions() {
        System.out.println("Press 1 - rock"
                + "\nPress 2 - paper"
                + "\nPress 3 - scissors"
                + "\nPress 'x' to quit the game"
                + "\nPress 'n' to start new game");
    }

    public void gameProcess() {
        askPlayerName();
        askRounds();
        showInstructions();
        while (getRoundsToWin() > playerCount && getRoundsToWin() > computerCount) {
            roundProcess();
        }
        System.out.println(); //space
        resultOfGame();
        exitOrNewGame();
    }

    public void roundProcess() {
        System.out.println("Please make move");
        if (playerMoves()) {
            computerMoves();
            resultOfRound();
        }
    }

    public boolean playerMoves() {
        input = scan.next();
        boolean result = true;
        if (input.equals("n")) {
            if (startNewGame()) {
                setPlayerCount(0);
                setComputerCount(0);
                gameProcess();
                //start new game
            } else {
                result = false;
                roundProcess();
            }

        } else if (input.equals("x")) {
            if (endGame()) {
                System.exit(0);
                //stop the game
            } else {
                result = false;
                roundProcess();
            }

        } else if (input.equals("1")) {
            playerMove = "rock";

        } else if (input.equals("2")) {
            playerMove = "paper";

        } else if (input.equals("3")) {
            playerMove = "scissors";

        }

        if (input.equals("1") || input.equals("2") || input.equals("3"))
        System.out.println(playerName + " makes move with: " + playerMove);
        return result;
    }

    public String computerMoves() {
        int n = randomGenerator.nextInt(100);
        if (n > 66) {
            computerMove = "rock";
        }
        if (n > 33) {
            computerMove = "paper";
        }
        if (n < 33) {
            computerMove = "scissors";
        }
        System.out.println("Computer makes move with: " + computerMove);
        return computerMove;
    }

    public void resultOfRound() {
        if (getPlayerMove().equals(getComputerMove())) {
            System.out.println("Draw!");
        } else if ((getPlayerMove().equals("rock") && getComputerMove().equals("scissors"))
                || (getPlayerMove().equals("scissors") && getComputerMove().equals("paper"))
                || (getPlayerMove().equals("paper") && getComputerMove().equals("rock"))) {
            System.out.println(playerName + " won this round!");
            playerCount++;
        } else {
            System.out.println("Computer won this round!");
            computerCount++;
        }
        System.out.println("Computer: " + computerCount
                + "\n" + playerName + ": " + playerCount);
    }

    public void resultOfGame() {
        System.out.println("Game result"
                + "\n" + playerName + ": " + playerCount
                + "\nComputer: " + computerCount);
        if (roundsToWin == playerCount) {
            System.out.println(playerName + " won the game!");
        } else if (roundsToWin == computerCount) {
            System.out.println("Computer won the game!");
        }
    }

    public void exitOrNewGame() {
        System.out.println("Press 'x' to end the game or 'n' to start new game");
        input = scan.next();
        if (input.equals("x")) {
            System.out.println("See you nex time :)");
            //end game
        } else if (input.equals("n")) {
            setPlayerCount(0);
            setComputerCount(0);
            gameProcess();
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

    //Getters
    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerMove() {
        return playerMove;
    }

    public String getComputerMove() {
        return computerMove;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public int getComputerCount() {
        return computerCount;
    }

    public int getRoundsToWin() {
        return roundsToWin;
    }

    //Setters
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public void setComputerCount(int computerCount) {
        this.computerCount = computerCount;
    }
}

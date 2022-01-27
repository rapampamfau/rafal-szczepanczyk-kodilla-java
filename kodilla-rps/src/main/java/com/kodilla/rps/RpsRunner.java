package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Rps game = new Rps();
        boolean end = false;

        while (!end) {
            game.gameProcess();
            end = true;
        }
    }
}

package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Hello world", (someString) -> "ABC" + someString + "ABC" );
        poemBeautifier.beautify("Hello world",(someString) -> someString.toUpperCase());
        poemBeautifier.beautify("Hello world", (someString) -> someString.replace("l","m"));
        poemBeautifier.beautify("Hello world", (someString) -> someString.substring(0, 6));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

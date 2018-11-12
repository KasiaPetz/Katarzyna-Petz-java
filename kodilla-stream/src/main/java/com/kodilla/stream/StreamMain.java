package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Na górze róże", (text) -> "ABC " + text);
        poemBeautifier.beautify("Na górze róże", (text) -> text + " ABC");
        poemBeautifier.beautify("Na górze róże", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Na górze róże", (text) -> text + " " + text);
        poemBeautifier.beautify("Na górze róże", (text) -> String.valueOf(text.length()));
        poemBeautifier.beautify("Na górze róże", (text) -> "Text " + "\""  + text + "\"" + " has length of" + " " + text.length() );

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

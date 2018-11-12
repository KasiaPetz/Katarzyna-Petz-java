package com.kodilla.stream.iterate;

import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        // wywołanie metody statycznej iterate(Integer seed, UnaryOperator f) - tworzy strumień obiektów Integer o wart poczatkowej seed
        //drugi obiekt f jest lmbda jako arg wejsciowy dostaje aktualna wartosc obj w strumieniu a ma zwrócic kolejna
        Stream.iterate(1, n -> n + 1)
        // limit( long maxSize) ogranicza wielkosc strumienia do max size - operacja filtrujaca
                .limit(max)
        // filter(Predicate predicate) - operacja filtrująca
                .filter(n -> n % 2 == 0)
        //  po 2 krotnym przefiltrowaniu forEach(Consumer action) - opieracja terminalna zamykajaca strumień
        // dla kazdego obiektu w strumieniuwykonuje lambde typem jest void ale mozna wyswietlic
        // Sustem.out :: println- metoda ma byc wykonana na kazdym obiekcie w strumieniu - operacja terminalna
                .forEach(System.out::println);
    }
}

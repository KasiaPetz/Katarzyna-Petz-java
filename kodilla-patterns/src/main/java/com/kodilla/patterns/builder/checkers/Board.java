package com.kodilla.patterns.builder.checkers;

public class Board {
    //zdefiniowanie okreslajace wielkosc planszy 10x10
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    Figure[][] board = new Figure [10][];

    //inicjuje pusta plansze
    public Board() {
        for ( int n = 0; n < 10; n++) {
            board[n] = new Figure[10];
        }
    }
    //pobera pione z pola
    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    //przypisuje pionek do danego miejsca na planszy
    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    //yswietla plansze wraz z figurami
    public String toString() {
        String result = "";
        for(int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for(int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if(board[n][k] == null) {
                    result += "  ";
                } else {
                    result += (board[n][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[n][k]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}

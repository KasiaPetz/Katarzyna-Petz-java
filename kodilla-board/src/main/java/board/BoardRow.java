package board;

import java.util.LinkedList;
import java.util.List;

public class BoardRow {
    private List<Figure> rowList;  // obstawiam Linked

    public BoardRow() {
        rowList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            rowList.add(new None());
        }
    }

    public List<Figure> getRowList() {
        return rowList;
    }

    @Override
    public String toString() {
        //Wyswietl wiersz na podstawie listy figur

        return "- - - - - - - - - -";
    }
}



package board;

import java.util.LinkedList;
import java.util.List;

public class Board {

    private List<BoardRow> rows;

    public Board() {
        rows = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            rows.add(new BoardRow());
        }
    }

    public Figure getFigure(int row, int col) {
        BoardRow boardRow = rows.get(row);
        List<Figure> figuryZWiersza =  boardRow.getRowList();
        return figuryZWiersza.get(col);
    }

    @Override
    public String toString() {
        String result = "";

        for(BoardRow boardRow : rows) {
            String rowRepresentation = boardRow.toString() + " \n";
            result += rowRepresentation;
        }

        return result;
    }


    // 1 2 3
    // 4 5 6
    // 7 8 9

}

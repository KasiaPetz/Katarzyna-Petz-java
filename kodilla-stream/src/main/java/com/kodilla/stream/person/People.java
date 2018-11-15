package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList() {
        // final zabezpiecza przed np przypisaniu innej listy do zmiennej - zapobieg mutowalnosci
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");
        // zwracamu nie liste przechowywana w zmiennej theList ale tworzymy nowa liste przez new - zapobiega mutowaniu
        // jesli nastapi operacja modyfikacji to na kopi a nie na samym obiekcie
        return new ArrayList<String>(theList);
    }
}

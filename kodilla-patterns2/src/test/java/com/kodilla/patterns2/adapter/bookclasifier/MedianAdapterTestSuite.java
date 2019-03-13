package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("Author1", "Title1", 2010, "123"));
        booksSet.add(new Book("Author2", "Title2", 2008, "124"));
        booksSet.add(new Book("Author3", "Title3", 2018, "125"));
        booksSet.add(new Book("Author4", "Title4", 2002, "126"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(booksSet);

        //Then
        assertEquals(2010, median);
    }
}
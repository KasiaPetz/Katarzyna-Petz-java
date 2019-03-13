package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    public void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("Author1", "Title1", 2010, "123");
        Book book2 = new Book("Author2", "Title2", 2008, "124");
        Book book3 = new Book("Author3", "Title3", 2018, "125");
        Book book4 = new Book("Author4", "Title4", 2002, "126");
    }

}
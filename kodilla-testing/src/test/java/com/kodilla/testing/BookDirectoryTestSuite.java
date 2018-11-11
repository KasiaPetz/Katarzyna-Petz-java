package com.kodilla.testing;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.BookLibrary;
import com.kodilla.testing.library.LibraryDatabase;
import com.kodilla.testing.library.LibraryUser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        // stworzenie mocka
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        // stworzenie obiektu z wstrzyknieciem mocka
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        // stworzenie przykładowej odpowiedzi interfejsu
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        //instruowanie mocka
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        //wywołanie metody
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //stworzenie roznych list obiektów Book ktore edzie zwracał mock
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        // instrukcje dla mock
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testlistBooksInHandsOfZeroBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListZeroBooks = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(resultListZeroBooks);
        LibraryUser libraryUser = new LibraryUser("Marek", "Markowski", "123456789'");

        //When
        List<Book> theListOfZeroBooks = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(0, theListOfZeroBooks.size());
    }

    @Test
    public void testlistBooksInHandsOf1Books() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultList1Book = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(resultList1Book);
        LibraryUser libraryUser = new LibraryUser("Marek", "Markowski", "123456789'");

        //When
        List<Book> theListOf1Book = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, theListOf1Book.size());
    }

    @Test
    public void testlistBooksInHandsOf5Books() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultList5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(resultList5Books);
        LibraryUser libraryUser = new LibraryUser("Marek", "Markowski", "123456789'");

        //When
        List<Book> theListOf20Books = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, theListOf20Books.size());
    }
}

package com.kodilla.patterns.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.rangeClosed(1, 5)
                .forEach(n -> library.getBooks().add(new Book("Title" + n, "Author" + n,
                        LocalDate.of(1950 + (n % 68), (n % 12) + 1 ,(n % 28) +1 ))));

        //shallow clone
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //deep clone
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Second cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);

        //When
        //Then
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());

    }
}

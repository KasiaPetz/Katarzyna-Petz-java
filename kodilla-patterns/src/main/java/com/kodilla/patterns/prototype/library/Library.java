package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.TasksList;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private  String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for(Book book : books) {
            cloneLibrary.books.add(book);
        }
        return cloneLibrary;
    }
}

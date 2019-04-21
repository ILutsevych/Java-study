package com.epam.lesson6.lesson6MVC.comparators;

import com.epam.lesson6.Book;
import com.epam.lesson6.lesson6MVC.model.BookModel;

import java.util.Comparator;

public class AuthorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String author1 = ((BookModel)o1).getAuthor();
        String author2 = ((BookModel)o2).getAuthor();
        return author1.compareTo(author2);
    }
}

package com.epam.lesson6.lesson6MVC.comparators;

import com.epam.lesson6.lesson6MVC.model.BookModel;

import java.util.Comparator;

public class PublisherComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
            String publisher1 = ((BookModel)o1).getPublisher();
            String publisher2 = ((BookModel)o2).getPublisher();
            return publisher1.compareTo(publisher2);
        }
    }


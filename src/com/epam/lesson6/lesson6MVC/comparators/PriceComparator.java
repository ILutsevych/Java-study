package com.epam.lesson6.lesson6MVC.comparators;

import com.epam.lesson6.lesson6MVC.model.BookModel;

import java.util.Comparator;

public class PriceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        BookModel price1 = (BookModel)o1;
        BookModel price2 = (BookModel)o2;
        if (price1.getPrice() > price2.getPrice()) return -1;
        if (price1.getPrice() < price2.getPrice()) return 1;
        return 0;
    }
}

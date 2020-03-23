package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationMedianTest(){
        //Given
        Book book = new Book("John Smith", "Matrix", 2008, "123");
        Book book1 = new Book("Mike Hamil", "Star Wars", 1988, "456");
        Book book3 = new Book("Minie Mike", "Star Wars 2", 2011, "111");
        Set<Book> testSet = new HashSet<>();
        testSet.add(book);
        testSet.add(book1);
        testSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int testNumber = medianAdapter.publicationYearMedian(testSet);
        //Then
        assertEquals(2008, testNumber);
    }

}
package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        for (int x = 1974; x < 2022; x++) {
            Book book = new Book("TestAuthor", "TestTitle", x, "TestSignature");
            bookSet.add(book);
        }
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assertions.assertEquals(1997, median);
    }
}

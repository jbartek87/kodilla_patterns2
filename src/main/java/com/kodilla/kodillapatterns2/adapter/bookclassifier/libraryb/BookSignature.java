package com.kodilla.kodillapatterns2.adapter.bookclassifier.libraryb;

import com.kodilla.kodillapatterns2.adapter.bookclassifier.librarya.Book;

public class BookSignature {
    private final String signature;

    public BookSignature(String signature, Book book) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }
}

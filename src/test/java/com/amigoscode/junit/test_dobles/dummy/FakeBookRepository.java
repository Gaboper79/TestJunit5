package com.amigoscode.junit.test_dobles.dummy;

import com.amigoscode.junit.test_dobles.fake.Book;
import com.amigoscode.junit.test_dobles.fake.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    Map<String, com.amigoscode.junit.test_dobles.fake.Book> bookStore = new HashMap<>();

    @Override
    public void save(com.amigoscode.junit.test_dobles.fake.Book book) {
bookStore.put(book.getId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}

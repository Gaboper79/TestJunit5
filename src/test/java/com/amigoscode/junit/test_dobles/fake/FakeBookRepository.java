package com.amigoscode.junit.test_dobles.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    Map<String, Book> bookStore = new HashMap<>();

    @Override
    public void save(Book book) {
bookStore.put(book.getId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}

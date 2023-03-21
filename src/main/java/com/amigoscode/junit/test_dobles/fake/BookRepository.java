package com.amigoscode.junit.test_dobles.fake;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findAll();
}

package com.amigoscode.junit.test_dobles.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FakeTest {
    @Test
    public void testFake(){
        BookRepository bookRepository=new FakeBookRepository();
        BookService bookService=new BookService(bookRepository);

        bookService.addBook(new Book("1","Testunit5",250, LocalDate.now()));
        bookService.addBook(new Book("2","Testunit6",200, LocalDate.now()));

        assertThat(bookService.findNumberOfBook()).isEqualTo(2);

    }
}

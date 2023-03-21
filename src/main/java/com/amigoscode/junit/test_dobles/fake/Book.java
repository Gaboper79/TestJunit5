package com.amigoscode.junit.test_dobles.fake;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Book {
private String id;
private String title;
private int price;
private LocalDate publishedDate;

}

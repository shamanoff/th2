package com.th2.services;

import com.th2.domain.Book;

import java.util.List;

public interface BookService {
    List<Book> bookList();

    Book getBook(Integer id);
}

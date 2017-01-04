package com.th2.services;

import com.th2.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    private Map<Integer, Book> bookMap;

    public BookServiceImpl(){
        loadBooks();
    }

    @Override
    public List<Book>bookList(){
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book getBook(Integer id){
        return bookMap.get(id);
    }

    private void loadBooks() {

        bookMap = new HashMap<>();

        Book fictionBook = new Book();
        fictionBook.setId(1L);
        fictionBook.setBookName("Pulp Fiction");
        fictionBook.setBookAuthor("Agata");
        bookMap.put(1, fictionBook);

        Book funBook = new Book();
        fictionBook.setId(2L);
        fictionBook.setBookName("Fun Comedy");
        fictionBook.setBookAuthor("Donald");
        bookMap.put(2, funBook);


    }
}

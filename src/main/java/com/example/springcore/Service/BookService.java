package com.example.springcore.Service;

import com.example.springcore.Model.Author;
import com.example.springcore.Model.Book;

import java.util.List;

//interfejs na bookservice
public interface BookService {

    List<Book> getAllBooks();

    List<Book> getAllBooksByAuthor(Author author);

}

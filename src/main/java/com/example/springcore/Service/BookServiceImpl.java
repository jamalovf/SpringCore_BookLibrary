package com.example.springcore.Service;

import com.example.springcore.Exception.BooksNotFoundException;
import com.example.springcore.Model.Author;
import com.example.springcore.Model.Book;
import com.example.springcore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    //kreiranje na bean so pomos na @Autowired
    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //prilicno ednostavno, gotova funkcija gi vraka site knigi od bookRepo bazata
    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    //kreiraj lista i zemi gi site knigi od bazata, iteriraj niz nea i izbrisi gi site knigi so ne soodvestuvaat so dadeniot avtor.
    //posle iteriranje proveri dali listata e prazna i ako e frli custom exception koj printa poraka a ako ne vrati ja posakuvanata lista
    @Override
    public List<Book> getAllBooksByAuthor(Author author) throws NullPointerException {

        List<Book> myBooks = bookRepository.findAll();
        myBooks.removeIf(b-> (!b.getAuthor().equals(author)));
        if(myBooks.isEmpty()){
            throw new BooksNotFoundException("There are no books with this author");
        }
        return myBooks;
    }
}

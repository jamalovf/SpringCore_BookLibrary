package com.example.springcore.Service;

import com.example.springcore.Model.Author;
import com.example.springcore.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;

    //kreiranje na bean so pomos na @Autowire
    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    //vrati lista so site avtori koi gi ima vo bazata
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}

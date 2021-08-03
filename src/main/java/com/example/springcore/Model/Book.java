package com.example.springcore.Model;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
public class Book {

    @NotEmpty(message = "Book Name value cannot be empty")
    private String bookName;

    @NotNull(message = "Every book must have an author, this value cannot be null")
    private Author author;

    @Max(value = 2021, message = "Release year cannot be later than 2021")
    private int releaseYear;

    private int numOfPages;

    @Size(min = 20, max = 100, message = "Book description must be between 20 and 100 characters")
    private String shortDescription;



}

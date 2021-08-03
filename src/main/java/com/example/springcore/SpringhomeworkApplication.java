package com.example.springcore;

import com.example.springcore.Configuration.AuthorConfig;
import com.example.springcore.Model.Author;
import com.example.springcore.Service.AuthorServiceImpl;
import com.example.springcore.Service.BookServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringhomeworkApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context  = SpringApplication.run(SpringhomeworkApplication.class, args);

        //od pristapot na @Autowire
        AuthorServiceImpl authorService  = context.getBean(AuthorServiceImpl.class);
        authorService.getAllAuthors();

        //od pristapot na @Configuration @Bean
        Author author = context.getBean(Author.class);

        //od pristapot na @Autowire
        BookServiceImpl bookService = context.getBean(BookServiceImpl.class);
        bookService.getAllBooks();
        bookService.getAllBooksByAuthor(author);
    }

}

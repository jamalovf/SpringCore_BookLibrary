package com.example.springcore.Configuration;

import com.example.springcore.Model.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthorConfig {


    @Bean
    public Author authorConfig(){
        return new Author();
    }

}

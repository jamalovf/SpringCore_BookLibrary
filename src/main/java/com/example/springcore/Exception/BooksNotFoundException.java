package com.example.springcore.Exception;

public class BooksNotFoundException extends RuntimeException{

    //nas custom-made exception koj se frla dokolku ne se pronajdeni pobaruvanite knigi-> implementacija vo bookservice
    public BooksNotFoundException(String message){
        super(message);
    }
}

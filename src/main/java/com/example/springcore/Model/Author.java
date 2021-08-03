package com.example.springcore.Model;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.Date;


@Setter
@Getter
public class Author {

    @AssertTrue(message = "First Name cannot be null")
    private String firstName;

    @AssertTrue(message = "Last Name cannot be null")
    private String lastName;

    @Size(min=10, max=100, message = "Nationality must be between 5 and 100 characters")
    private String nationality;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 99, message = "Age should not be more than 99")
    private int age;

    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Address should not be empty value")
    private String address;

}

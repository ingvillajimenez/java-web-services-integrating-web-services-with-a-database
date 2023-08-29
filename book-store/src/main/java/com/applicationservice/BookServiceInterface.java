package com.applicationservice;

import java.util.List; // interface List

import jakarta.jws.WebMethod; // @interface WebMethod
import jakarta.jws.WebService; // @interface WebService

import com.applicationentities.Book; // class Book

@WebService
public interface BookServiceInterface {

    @WebMethod
    public List<Book> getAllBooks();

}

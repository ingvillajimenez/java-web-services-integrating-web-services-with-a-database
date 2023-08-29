package com.applicationservice;

import java.util.List; // interface List

import jakarta.jws.WebParam; // @interface WebParam
import jakarta.jws.WebMethod; // @interface WebMethod
import jakarta.jws.WebService; // @interface WebService

import com.applicationentities.Book; // class Book

@WebService
public interface BookServiceInterface {

    @WebMethod
    public List<Book> getAllBooks();

    @WebMethod
    public Book getBookById(@WebParam(name = "book_id") String book_id);
}

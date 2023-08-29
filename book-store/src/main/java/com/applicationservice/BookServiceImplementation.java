package com.applicationservice;

import java.util.List; // interface List

import jakarta.jws.WebService; // @interface WebService

import com.applicationdao.BookDAO; // class BookDAO
import com.applicationentities.Book; // class Book

@WebService(endpointInterface = "com.applicationservice.BookServiceInterface")
public class BookServiceImplementation implements BookServiceInterface {

    @Override
    public List<Book> getAllBooks() {

        return BookDAO.getAllBooks();
    }

}

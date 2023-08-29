package bookclient;

import java.util.List;

public class BookServiceClient {

    public static void main(String[] args) {

        try {

            BookServiceImplementationService bookServiceImplementationService = new BookServiceImplementationService();
            BookServiceInterface bookServiceInterface = bookServiceImplementationService.getBookServiceImplementationPort();

            Book book = bookServiceInterface.getBookById("ISBN102");

            System.out.println("Retrieving single book with ID : " + book.getId());
            System.out.println("Book Name : " + book.getBookTitle());

            // Get all books before add
            System.out.println("\nList of books, before adding a new book..\n");
            List<Book> listBook = bookServiceInterface.getAllBooks();

            for (Book b : listBook) {

                System.out.println("Id : " + b.getId());
                System.out.println("Book Name : " + b.getBookTitle());
                System.out.println("Author Name : " + b.getAuthorName());
                System.out.println("Price : " + b.getBookPrice());

                System.out.println("======================================");
            }

            // add book
            Book newBook = new Book();
            newBook.setId("ISBN111");
            newBook.setBookTitle("The Hunger Games");
            newBook.setAuthorName("Suzanne Collins");
            newBook.setBookPrice((float) 10.0);

            bookServiceInterface.addBook(newBook);

            // Get all books after a book add
            System.out.println("\nList of books, after adding book..\n");
            List<Book> updatedBookList = bookServiceInterface.getAllBooks();

            for (Book b : updatedBookList) {

                System.out.println("Id : " + b.getId());
                System.out.println("Book Name : " + b.getBookTitle());
                System.out.println("Author Name : " + b.getAuthorName());
                System.out.println("Price : " + b.getBookPrice());

                System.out.println("======================================");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
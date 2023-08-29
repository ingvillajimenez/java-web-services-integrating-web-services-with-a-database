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

            // Get all books before delete
            System.out.println("\nList of books, before deleting a new book..\n");
            List<Book> listBook = bookServiceInterface.getAllBooks();

            for (Book b : listBook) {
                System.out.println("Id : " + b.getId());
                System.out.println("Book Name : " + b.getBookTitle());
                System.out.println("Author Name : " + b.getAuthorName());
                System.out.println("Price : " + b.getBookPrice());

                System.out.println("==================================");
            }

            // remove book
            String deleteMsg = bookServiceInterface.removeBook("ISBN104");

            System.out.println("\n#################");
            System.out.println("Delete message: " + deleteMsg);
            System.out.println("###################");

            // Get all books after a book delete
            System.out.println("\nList of books, after deleting a book..\n");
            List<Book> updatedBookList = bookServiceInterface.getAllBooks();

            for (Book b : updatedBookList) {
                System.out.println("Id : " + b.getId());
                System.out.println("Book Name : " + b.getBookTitle());
                System.out.println("Author Name : " + b.getAuthorName());
                System.out.println("Price : " + b.getBookPrice());

                System.out.println("==================================");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
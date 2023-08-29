package bookclient;

import java.util.List;

public class BookServiceClient {

    public static void main(String[] args) {

        try {

            BookServiceImplementationService bookServiceImplementationService = new BookServiceImplementationService();
            BookServiceInterface bookServiceInterface = bookServiceImplementationService.getBookServiceImplementationPort();

            Book book = bookServiceInterface.getBookById("ISBN111");

            System.out.println("Retrieving single book with ID : " + book.getId());
            System.out.println("Book Name : " + book.getBookTitle());
            System.out.println("Author Name : " + book.getAuthorName());
            System.out.println("Price : " + book.getBookPrice());

            System.out.println("=====================================");

            // update book
            book.setBookTitle("The Hunger Games: The Ballad of Songbirds and Snakes");
            book.setBookPrice((float) 25.0);

            String updateMsg = bookServiceInterface.updateBook(book);

            System.out.println("\n########################");
            System.out.println("Update message: " + updateMsg);
            System.out.println("########################");

            book = bookServiceInterface.getBookById("ISBN111");

            System.out.println("\nID of retrieved book : " + book.getId());
            System.out.println("Book Name : " + book.getBookTitle());
            System.out.println("Author Name : " + book.getAuthorName());
            System.out.println("Price : " + book.getBookPrice());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
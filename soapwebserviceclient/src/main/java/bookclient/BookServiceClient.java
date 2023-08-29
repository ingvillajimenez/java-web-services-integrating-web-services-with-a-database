package bookclient;

import java.util.List;

public class BookServiceClient {

    public static void main(String[] args) {

        try {

            BookServiceImplementationService bookServiceImplementationService = new BookServiceImplementationService();
            BookServiceInterface bookServiceInterface = bookServiceImplementationService.getBookServiceImplementationPort();

            List<Book> listBook = bookServiceInterface.getAllBooks();

            for (Book b : listBook) {

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


package bookclient;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bookclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllBooksResponse_QNAME = new QName("http://applicationservice.com/", "getAllBooksResponse");
    private final static QName _GetBookById_QNAME = new QName("http://applicationservice.com/", "getBookById");
    private final static QName _GetAllBooks_QNAME = new QName("http://applicationservice.com/", "getAllBooks");
    private final static QName _GetBookByIdResponse_QNAME = new QName("http://applicationservice.com/", "getBookByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bookclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link GetBookByIdResponse }
     * 
     */
    public GetBookByIdResponse createGetBookByIdResponse() {
        return new GetBookByIdResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link GetBookById }
     * 
     */
    public GetBookById createGetBookById() {
        return new GetBookById();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getBookById")
    public JAXBElement<GetBookById> createGetBookById(GetBookById value) {
        return new JAXBElement<GetBookById>(_GetBookById_QNAME, GetBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applicationservice.com/", name = "getBookByIdResponse")
    public JAXBElement<GetBookByIdResponse> createGetBookByIdResponse(GetBookByIdResponse value) {
        return new JAXBElement<GetBookByIdResponse>(_GetBookByIdResponse_QNAME, GetBookByIdResponse.class, null, value);
    }

}

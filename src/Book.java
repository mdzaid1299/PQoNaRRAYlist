
public class Book {
    private String bookName;
    private String author;
    private long isbn;
    private double price;
    public Book(){
        bookName = "";
        author = "";
        isbn = 0;
        price = 0.0;
    }

    public Book(String bookName, String author, long isbn, double price) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}
/*
 *Create a List of 10 Book objects, where Book is a user defined or custom class.
 * Book class contains following field String bookName,
 *  String author, long isbn, & double price.
 *  Book class must be properly encapsulated and must implement data hiding.
 *  Book class contains parameterized constructors and no-argument constructor.
 *  Book class must override String toString() of Object class to represent Book object as string while printing.
 * Kindly sort the list of book by price.
 */
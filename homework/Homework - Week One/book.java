/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
    * Zero parameter constructor calls the 3-parameter constructor with default values
    * when this object is constructed
    */
    public Book()
    {
        this("n/a", "n/a",0);
    }

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
}
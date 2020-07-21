import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("The Last Wish", "Andrzej Sapkowski", "Fantasy");

    }
    @Test
    public void libraryStartsEmpty(){assertEquals(0, library.checkStock());}

    @Test
    public void addBookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.checkStock());
    }
}

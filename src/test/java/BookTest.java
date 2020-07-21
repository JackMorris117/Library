import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        this.book = new Book("The Last Wish", "Andrzej Sapkowski", "Fantasy");
    }


}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book lotr;


    @Before
    public void before() {
        lotr = new Book("lotr", "Fiction");

    }
    @Test
    public void getBookName() {
        assertEquals("lotr", lotr.getName());
    }

    @Test
    public void getBookGenre() {
        assertEquals("Fiction", lotr.getGenre());
    }
}

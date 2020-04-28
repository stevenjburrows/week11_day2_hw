import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library Armadale;
    private Book lotr;
    private Book dune;
    private Book eg;
    private Book nineteen;

    @Before
    public void before() {
        Armadale = new Library("Armadale", 3);
        lotr = new Book("lotr", "Fiction");
        dune = new Book("Dune", "Sci-Fi");
        eg = new Book("Enders Game", "Sci-Fi");
        nineteen = new Book("1984", "Sci-Fi");


    }

    @Test
    public void getName() {
        assertEquals("Armadale", Armadale.getName());
    }

    @Test
    public void getCapacity() {
        assertEquals(3, Armadale.getCapacity());
    }


    @Test
    public void checkBookCount() {
        assertEquals(0, Armadale.getBookCount());
    }

    @Test
    public void addBook() {
        Armadale.AddBook(nineteen);
        assertEquals(1, Armadale.getBookCount());
    }

    @Test
    public void cantAddBook () {
        Armadale.AddBook(nineteen);
        Armadale.AddBook(lotr);
        Armadale.AddBook(eg);
        Armadale.AddBook(dune);
        assertEquals(3, Armadale.getBookCount());

    }

}

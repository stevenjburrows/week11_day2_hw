import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower steven;
    private Library armadale;
    private Book lotr;
    private Book dune;
    private Book eg;
    private Book nineteen;

    @Before
    public void before() {
        steven = new Borrower();
        armadale = new Library("Armadale", 3);
        lotr = new Book("lotr", "Fiction");
        dune = new Book("Dune", "Sci-Fi");
        eg = new Book("Enders Game", "Sci-Fi");
        nineteen = new Book("1984", "Sci-Fi");
        armadale.AddBook(eg);
        armadale.AddBook(dune);

    }

    @Test
    public void checkBorrowedBooksCount() {
        assertEquals(0, steven.checkBookCount());
    }

    @Test
    public void borrowBook() {
        steven.borrowBook(armadale);
        assertEquals(1, steven.checkBookCount());
    }


}

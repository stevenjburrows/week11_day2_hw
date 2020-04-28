import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }


    public int checkBookCount() {
        return borrowedBooks.size();
    }


    public void borrowBook(Library library) {
        if (library.getBookCount() > 0) {
            Book book = library.removeBook();
            borrowedBooks.add(book);
        }
    }
}

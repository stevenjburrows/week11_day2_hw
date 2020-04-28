import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }


    public int checkBookCount() {
        return borrowedBooks.size();
    }


    public void borrowBook(Library library, Book book) {
        if (library.containsBook(book)) {
            library.removeBook(book);
            borrowedBooks.add(book);
        }
    }
}

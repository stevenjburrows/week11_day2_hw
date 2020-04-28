import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private String name;
    private int capacity;

    public Library(String name, int capacity) {
        this.books = new ArrayList<Book>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookCount() {
        return books.size();
    }

    public void AddBook(Book book) {
        if(books.size() < capacity){
            books.add(book);
        }
    }
}

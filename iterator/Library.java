package iterator;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books2) {
        this.books = books2;
    }

    public Iterator<Book> iterator(){
        return new BookIterator(books);
    }
}

package iterator;

import java.util.List;

public class BookIterator implements Iterator<Book> {
    List<Book> books;
    int idx = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return idx < books.size();
    }

    @Override
    public Book next() {
        Book temp = books.get(idx);
        idx++;
        return temp;
    }

}

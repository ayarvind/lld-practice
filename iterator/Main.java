package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(210, "The Alchemist"));
        books.add(new Book(240, "Everything is fuked up"));
        books.add(new Book(250, "Subtle Art of not giving fuck"));
        Library library = new Library(books);
        Iterator<Book> itr = library.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

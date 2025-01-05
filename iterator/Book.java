package iterator;

public class Book {
    int price;
    String name;

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Book{name='%s', price=%d}", name, price);
    }
}

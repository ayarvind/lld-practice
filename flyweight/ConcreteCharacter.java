package flyweight;

public class ConcreteCharacter implements Character {
    private final String symbol;

    public ConcreteCharacter(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public void display() {
        System.out.print(symbol);
    }

    

}

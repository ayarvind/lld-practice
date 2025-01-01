package decorator_pattern;

public class ExtraCheese extends TopingDecorator {
    BasePizza pizza;
    
    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public int cost() {
        return pizza.cost() + 49;
    }
    
}

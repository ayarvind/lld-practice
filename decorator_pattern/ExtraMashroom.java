package decorator_pattern;

public class ExtraMashroom  extends TopingDecorator {
    BasePizza basePizza;
    public ExtraMashroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
    
}

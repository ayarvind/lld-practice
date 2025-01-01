package decorator_pattern;
public class Main {
    public static void main(String[] args){
        // i want extra cheese vegdeletie pizza
        BasePizza pizza = new VegDelite();
        System.out.println("Base pizza cost: " + pizza.cost());
        pizza = new ExtraCheese(pizza);
        System.out.println("Extra cheese pizza cost: " + pizza.cost());
        pizza = new ExtraMashroom(pizza);
        System.out.println("Extra cheese and extra mashroom pizza cost: " + pizza.cost());
        pizza = new Margheti();
        System.out.println("Margheti pizza cost: " + pizza.cost());
        pizza = new ExtraCheese(pizza);
        System.out.println("Margheti with extra cheese pizza cost: " + pizza.cost());
        pizza = new ExtraMashroom(pizza);
        System.out.println("Margheti with extra cheese and extra mashroom pizza cost: " + pizza.cost());
        
    }
}

// Abstract Template Class
abstract class Beverage {
    // Template method: Defines the skeleton of the algorithm
    public final void prepareRecipe() {
        boilWater();        // Concrete step
        brew();             // Abstract step
        pourInCup();        // Concrete step
        addCondiments();    // Abstract step
    }

    // Concrete methods (same for all subclasses)
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract methods (to be implemented by subclasses)
    protected abstract void brew();
    protected abstract void addCondiments();
}

// Concrete Class 1: Tea
class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon...");
    }
}

// Concrete Class 2: Coffee
class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}

// Main Class to Test
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("Making tea:");
        tea.prepareRecipe();

        Beverage coffee = new Coffee();
        System.out.println("\nMaking coffee:");
        coffee.prepareRecipe();
    }
}

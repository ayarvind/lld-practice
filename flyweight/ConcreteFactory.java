package flyweight;

import java.util.HashMap;

public class ConcreteFactory {
    private final HashMap<String, Character> shared;

    public ConcreteFactory() {
        shared = new HashMap<>();
    }

    Character getCharacter(String symbol) {
        if (!shared.containsKey(symbol)) {
            shared.put(symbol, new ConcreteCharacter(symbol));
        }
        return shared.get(symbol);

    }
}

package flyweight;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory fc = new ConcreteFactory();
        Character A = fc.getCharacter("A");
        Character r = fc.getCharacter("r");
        Character v = fc.getCharacter("v");
        Character i = fc.getCharacter("i");
        Character n = fc.getCharacter("n");
        Character d = fc.getCharacter("d");
        A.display();
        r.display();
        v.display();
        i.display();
        n.display();
        d.display();

        

    }
}

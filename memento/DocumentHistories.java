package memento;

import java.util.Stack;

public class DocumentHistories {
    private Stack<Document.Memento> histories = new Stack<>();
    
    public void save(Document document) {
        histories.push(document.save());
    }

    public Document.Memento undo() {
        if (!histories.isEmpty()) {
            return histories.pop(); // Return the most recent state
        }
        return null; // If no history, return null
    }
}

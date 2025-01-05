package memento;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        DocumentHistories histories = new DocumentHistories();

        doc.setText("Hello, I am Arvind");
        histories.save(doc);
        doc.setText("Arvind Yadav");
        histories.save(doc);

        System.out.println("Before undo: " + doc.getText());
        // Undo to previous state
        doc.restore(histories.undo()); 
        System.out.println("After undo: " + doc.getText());

        // Undo again
        doc.restore(histories.undo()); // Restore the earlier state
        System.out.println("After second undo: " + doc.getText());

        // Undo when no states are left
        doc.restore(histories.undo());
        System.out.println("After third undo: " + doc.getText());
    }
}

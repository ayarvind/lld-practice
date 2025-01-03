package proxy_design_pattern;

public class Main {
    public static void main(String[] args){
        Database db = new EmployeeProxy();
        System.out.println("Welcome");
        db.create(1, "Hello");
        db.get(1);
        db.delete(1);
    }
}

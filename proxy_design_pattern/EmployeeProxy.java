package proxy_design_pattern;

public class EmployeeProxy  implements Database{
    final Database db  = new Employee();
    @Override
    public void delete(int key) {
        System.out.println("Deleting the item");
        db.delete(key);
        System.out.println("Item deleted");
    }

    @Override
    public void get(int key) {
       System.out.println("Getting the data for you, only for you.");
       db.get(key);

    }
    @Override
    public void create(int key, String data){
        System.out.println("Adding a new data");
        db.create(key, data);
        System.out.println("Added a new data");

    }

}

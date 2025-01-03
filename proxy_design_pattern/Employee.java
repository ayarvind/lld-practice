package proxy_design_pattern;

import java.util.HashMap;

public class Employee implements Database{
    final HashMap<Integer,String> mp =  new HashMap<>();
    @Override
    public void create(int key, String data){
        mp.put(key, data);
    }
    @Override
    public void get(int key){
        System.out.println(mp.get(key));
    }
    @Override
    public void delete(int key){
        mp.remove(key);
    }
}

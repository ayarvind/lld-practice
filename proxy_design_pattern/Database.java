package proxy_design_pattern;

public interface Database {
    void create(int key, String data);
    void delete(int key);
    void get(int key);
    
} 

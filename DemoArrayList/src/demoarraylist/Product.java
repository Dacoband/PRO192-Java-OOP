
package demoarraylist;

import java.util.ArrayList;
import java.util.*;
public class Product {
    private int id;
    private String Name;

    public Product(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id 
                          + ", Name=" + Name + '}';
    }
    
    
}

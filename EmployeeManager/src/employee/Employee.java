
package employee;
import general.IAction;
import general.User;
public class Employee extends User implements IAction{
    private String name;

    public Employee(String name, String id, String Password) {
        this.name = name;
        this.id = id;
        this.Password = Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public void login() {
        System.out.printf("Employee logged in by name: %s and Password: %s\n",name,Password);
        
    }

    @Override
    public void ShowInfo() {
        System.out.format("id: %s ,name: %s\n",id,name);
    }
    
    
}


package customer;
import general.IAction;
import general.User;
      
public class Customer extends User implements IAction{
    private String email;
    public Customer(String id, String Password, String name){
        this.id=id;
        this.Password= Password;
        this.email = name;       
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    public void login(){
        System.out.printf("Customer logged in by email: %s and Password: %s \n",email,Password);
    }
            

    @Override
    public void ShowInfo(){
           System.out.format("id: %s ,email: %s\n",id,email); 
    }
    
    
}

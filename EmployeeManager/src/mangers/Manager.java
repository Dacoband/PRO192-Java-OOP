
package mangers;
import general.IAction;
import general.User;
import java.util.ArrayList;
public class Manager {
    ArrayList<IAction> userList = new ArrayList<>();
    public void addUserToList(IAction user){
        userList.add(user);
    }
    public void printList(){
        for(var u : userList){
            u.ShowInfo();
        }
    }
    public void showLoginStatus(){
        for(var u : userList){
            if(u instanceof User){
                ((User) u).login();
            }
        }
    }
}

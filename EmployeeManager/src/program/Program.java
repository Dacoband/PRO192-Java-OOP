
package program;
import customer.Customer;
import employee.Employee;
import mangers.Manager;

public class Program {
    public static void main(String[] args) {
        Manager admin = new Manager();
        Employee tom = new Employee("Tom","123","Emp001");
        admin.addUserToList(tom);
        Customer david = new Customer("456","Cus001","david@gmail.com");
        admin.addUserToList(david);
        System.out.println("*****User list*****");
        admin.printList();
        System.out.println("*****Login info*****");
        admin.showLoginStatus();
                
    }
}

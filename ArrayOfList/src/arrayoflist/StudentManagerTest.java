
package arrayoflist;
import java.util.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;


public class StudentManagerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        String ID, FullName, Address, Phone;
        Date DoB = null;
        StudentManager stdManager = new StudentManager();

        do {
            System.out.println("Select a function !");
            System.out.println("1. Add new a student: ");
            System.out.println("2. View student list: ");
            System.out.println("3. Find a student by ID: ");
            System.out.println("4. Update a student: ");
            System.out.println("5. Exit");
            System.out.print("Select:  ");
            choice = sc.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.println("Enter ID: ");
                    ID= sc.next();
                    //FullName
                    System.out.println("FullName: ");
                    FullName =sc.next();
                    //DoB
                    System.out.println("DoB(dd/MM/yyyy)");
                    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                    try{
                        DoB = f.parse(sc.next());
                    } catch(Exception ex){
                        ex.printStackTrace();                   
                    }
                    // Nhap dia chi
                    System.out.println("Address: ");
                    Address = sc.next();
                    // nhập phone
                    System.out.println("Phone: ");
                    Phone = sc.next();
                    // tạo đối tượng student mới
                    Student newStudent= new Student(ID, FullName, DoB, Phone, Address);
                    // thêm vào danh sách StudentList
                    stdManager.addStudent(newStudent);
                    break;
                case 2:
                    stdManager.printStudentList();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again.");
}                   break;
        } while (true);
    }
}

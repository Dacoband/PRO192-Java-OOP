
package Views;

import java.util.Scanner;
public class DevMenu {
    private static boolean validateAccountId(String id) {
        // Kiểm tra định dạng Id
        return id.matches("^A\\d{3}$");
    }

    private static boolean validatePassword(String password) {
        // Kiểm tra định dạng mật khẩu
        return password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");
    }
    public static void main(String[] args) {
        String id;
        String password;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter id AXXX: ");
        id = sc.nextLine();
        System.out.println("Enter password: ");
        password = sc.nextLine();
        System.out.println("Successfully login.");
        System.out.println("USER MENU: ");
        System.out.println("1-Update Profile");
        System.out.println("2-View Flower List");
        System.out.println("3-Add Flower ");
        System.out.println("4-Modify Flower");
        System.out.println("5-Remove Flower");
        System.out.println("6-View Sorted Orders");
        System.out.println("7-Remove Order");
        System.out.println("8-Quit");
        System.out.println("Enter your choice:");
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                    // Update Profile logic
                    break;
                case 2:
                    // View Flower List logic
                    break;
                case 3:
                    // Add Flower logic
                    System.out.println("Enter the flower ID: ");
                    String flowerId = sc.nextLine();
                    System.out.println("Enter the flower name: ");
                    String flowerName = sc.nextLine();
                    System.out.println("Enter the flower unit price: ");
                    double flowerUnitPrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter the flower import date: ");
                    String importDate = sc.nextLine();
                    
                    if (isValidFlowerId(flowerId)) {
                        if (isValidPassword(password)) {
                            Flower flower = new Flower(flowerId, flowerName, flowerUnitPrice, importDate);
                            // Add the flower to the pet store or perform the desired operation
                            // ...
                        } else {
                            System.out.println("Invalid password. Password must contain at least a character, a digit, and a special character, and the minimum length should be greater or equal to 8.");
                        }
                    } else {
                        System.out.println("Invalid flower ID. ID must start with 'A' followed by exactly 3 digits.");
                    }
                    break;
                case 4:
                    // Modify Flower 
                    break;
                case 5:
                    // Remove Flower 
                    break;
                case 6:
                    // View Sorted Orders 
                    break;
                case 7:
                    // Remove Order 
                    break;
                case 8:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.util.Scanner;
public class UserMenu {
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
        System.out.println("3-Add Flower to Cart");
        System.out.println("4-View Order");
        System.out.println("5-Cancel Order");
        System.out.println("6-Quit");
        System.out.println("Enter your choice:");
        int choice =Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                
                break;
            
        }
    }
}

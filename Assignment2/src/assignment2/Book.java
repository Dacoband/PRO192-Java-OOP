
package assignment2;
import java.util.ArrayList;
import java.util.Scanner;


public class Book {
    
        private String Code;  
	private String Title; 
	private int Quantity;
	private float unitPrice; 

    public Book() {
    }

    public Book(String Code, String Title, int Quantity, float unitPrice) {
        this.Code = Code;
        this.Title = Title;
        this.Quantity = Quantity;
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    
   
    public void inputBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Code: ");
        this.Code= sc.nextLine();
        System.out.println("Title: ");
        this.Title= sc.nextLine();
        System.out.println("Quantity: ");
        this.Quantity = sc.nextInt();
        System.out.println("Unit Price: ");
        this.unitPrice = sc.nextFloat();
    }
   public void showInfor(){
        String str = String.format("%-5s|%-30s|%6.2f|%4d", Code, Title, unitPrice, Quantity);
        System.out.println(str);
    }


   
   
    
    
    
    
}

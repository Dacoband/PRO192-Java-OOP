
import java.util.Scanner;
public class InputOutputDemo {
    public static void main(String[] args) {
        int a[]; // array of integers
        int n; // number of element of the array
        int i ; // variable for traversing the array 
        Scanner sc= new Scanner(System.in); // Object for the keyboard
        System.out.println("Enter number of element: ");
        n = Integer.parseInt(sc.nextLine());
        a = new int[n]; // men.allocating for elements of the array
        for ( i = 0; i < n; i++) {
            System.out.println("Enter the " + (i+1) + "/" + n + "element: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Entered values: ");
        for ( i = 0; i < n; i++) 
            System.out.format("%5d", a[i]);
        int S = 0;
        for  (int x: a) S+=x;
        System.out.println("\nSUm of values: "+ S);
    }
    
}

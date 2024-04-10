
package learning.Tu_Hoc;
import java.util.Scanner;
public class Giai_Pt_Bac_1_an {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double a = Double.valueOf(sc.next());
        double b = Double.valueOf(sc.next());
        process(a,b);
    }

    private static void process(double a, double b) {
        if(a == 0){
            if(b != 0 ){
                System.out.println("NO");
                return;
            }
            if(b == 0) {
                System.out.println("INF");
                return;
            }
            return;
        }
        double x = -b /a;
        System.out.printf("X= %.2f \n", x);
    }
    
}

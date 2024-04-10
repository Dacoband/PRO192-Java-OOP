package learning.Tu_Hoc;
import java.util.Scanner;
public class Chu_vi_Dien_tich_HCN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập chiều dài= " );
            int d = sc.nextInt();
        System.out.println("Nhập chiều rộng= " );
            int r = sc.nextInt() ;
        System.out.println("Chu vi hình chữ nhật = " + (d+r)*2 );
        System.out.println("Diện tích hình chữ nhật = " + d * r);
    }
    
}

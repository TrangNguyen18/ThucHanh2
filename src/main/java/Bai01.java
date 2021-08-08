import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Nhap vao mot so bat ki: " );
        int a = Scan.nextInt();
        if (a == 1) {
            System.out.println("Mot");
        } else if (a == 2) {
            System.out.println("Hai");
        } else if (a == 3) {
            System.out.println("Ba");
        } else if (a == 4) {
            System.out.println("Bon");
        } else if (a == 5) {
            System.out.println("Nam");
        } else if (a == 6) {
            System.out.println("Sau");
        } else if (a == 7) {
            System.out.println("Bay");
        } else if (a == 8) {
            System.out.println("Tam");
        } else if (a == 9) {
            System.out.println("Chin");
        } else {
            System.out.println("Khong doc duoc");
        }
    }
}





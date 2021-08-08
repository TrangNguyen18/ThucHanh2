import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        int t;
        System.out.println("Nhap vao thang :");
        do {
            t = scanner.nextInt();
            if (t < 1 || t > 12) {
                valid = false;
                System.out.println("Nhap sai thang, vui long nhap lai: ");
            }
            else {
                valid = true;
            }
        }
        while (valid == false);
        System.out.println("Nhap vao nam: ");
        int n = scanner.nextInt();
        if ( t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12){
            System.out.println("Thang " + t + " nam " + n + " co 31 ngay");
        }
        else  if (t == 2){
            if ((n%4) == 0) {
                System.out.println("Thang 2 nam " + n + " co 29 ngay");
            }
            else {
                System.out.println("Thang 2 nam " + n + " co 28 ngay");
            }
        }
        else {
            System.out.println("Thang " + t + " nam " + n + " co 30 ngay");
        }
    }

}

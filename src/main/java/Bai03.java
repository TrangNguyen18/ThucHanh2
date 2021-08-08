import java.util.Scanner;

public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac nhat ax + b = 0 ");

        System.out.println("Nhap vao gia tri cua a: ");
        float a = scanner.nextFloat();

        System.out.println("Nhap vao gia tri cua b: ");
        float b = scanner.nextFloat();
        if ( a == 0 && b == 0){
            System.out.println("Phuong trinh co vo so nghiem ");
        }
        else  if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem ");
        }
        else {
            float x = -b/a;
            System.out.println("Phuong trinh co nghiem duy nhat x = " + x);
        }

    }
}

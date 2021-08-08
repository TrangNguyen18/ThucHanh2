import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 4 so nguyen a,b,c va d. Tim min");

        System.out.println("Nhap vao gia tri cua a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap vao gia tri cua b: ");
        int b = scanner.nextInt();

        System.out.println("Nhap vao gia tri cua c: ");
        int c = scanner.nextInt();

        System.out.println("Nhap vao gia tri cua d: ");
        int d = scanner.nextInt();
        int min = Math.min(Math.min((Math.min(a, b)), c), d);
        System.out.println("Gia tri nho nhat la: " + min);
    }
}

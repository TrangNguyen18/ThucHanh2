import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap canh a : ");
        float a = scanner.nextFloat();

        System.out.println("Nhap canh b : ");
        float b = scanner.nextFloat();

        System.out.println("Nhap canh c : ");
        float c = scanner.nextFloat();

        if ((a + b ) > c && (b + c) > a && (a + c) > b ){
            if ( (a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)){
                System.out.println("Tam gia nay la tam gia vuong");
            }
            else if ( a == b && b == c){
                System.out.println("Tam giac nay la tam gia deu ");
            }
            else if ( a == b || b == c || c == a){
                System.out.println("Tam giac nay la tam gia can");
            }
            else if ((a * a > b * b + c * c) || (b*b > a*a + c*c) || (c*c > b*b + a*a)) {
                System.out.println("Tam giac nay la tam giac tu");
            }
            else {
                System.out.println("Tam giac nay la tam gia nhon ");
            }
        }
        else {
            System.out.println("khong phai la tam gia");
        }
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String   str;
        System.out.println("Nhap vao mot chu cai: ");
        str= scanner.next();
        char c = str.charAt(0);
        if (Character.isLowerCase(c)) {
            System.out.println("Chu cai sau khi duoc chuyen sang viet hoa la : ");
            System.out.println(str.toUpperCase(Locale.ROOT));
        }
        else {
            System.out.println("Chu cai sau khi duoc chuyen sang viet thuong la : ");
            System.out.println(str.toLowerCase(Locale.ROOT));
        }

    }
}

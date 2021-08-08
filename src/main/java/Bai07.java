import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        final double unit = 15000;
        final double unit2 = 13500;
        final double unit3 = 11000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so km: ");
        double km = scanner.nextDouble();
        double pri = 0;

        if (km < 2){
            pri= 1 * unit;
        }
        else if (km >= 2 && km < 6){
            pri= km * unit2;
        }
        else if (km >= 6 && km <= 120){
            pri = km * unit3;
        }
        else {
            pri= km * unit3 * 0.9;
        }
        System.out.println("So tien can thanh toan la :" + pri);
    }
}

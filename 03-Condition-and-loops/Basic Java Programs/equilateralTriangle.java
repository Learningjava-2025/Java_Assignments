import java.util.Scanner;
import java.lang.Math;
public class equilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double area = Math.sqrt(3)*a*a /4;
        System.out.format("%.2f",area);
    }
}

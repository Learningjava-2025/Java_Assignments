import java.util.Scanner;
import java.lang.Math;

public class perimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        double perimeter = Math.PI * 2 *p;
        System.out.format("%.2f",perimeter);
    }
}

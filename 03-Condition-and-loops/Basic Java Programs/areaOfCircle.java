import java.util.Scanner;
import java.lang.Math;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = Math.PI *Math.pow(r,2);
        //System.out.println(area);
        System.out.format("%.2f", area); // area of circle



    }
}

import java.util.Scanner;
import java.lang.Math;
public class volumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double vol = 1*((Math.PI)*r*r)*h/3;
        System.out.format("%.2f",vol);

    }

}

import java.util.Scanner;
import java.lang.Math;
public class volumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double vol = 4*((Math.PI)*r*r*r)/3;
        System.out.format("%.2f",vol);

    }

}

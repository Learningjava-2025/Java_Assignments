import java.util.Scanner;
import java.lang.Math;
public class volumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double vol = l*w*h /3;
        System.out.format("%.2f",vol);

    }

}

import java.util.Scanner;
import java.lang.Math;
public class volumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        double vol = b*h;
        System.out.format("%.2f",vol);

    }

}

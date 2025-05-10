import java.util.Scanner;
import java.lang.Math;
public class csa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double sa = 2*(Math.PI)*r*h;
        System.out.format("%.2f",sa);

    }

}

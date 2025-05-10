import java.util.Scanner;

public class isocelous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        double area = (h*b)/2;
        System.out.format("%.2f",area);
    }
}

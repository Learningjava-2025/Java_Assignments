import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        double area = 0.5*h*b;
        System.out.format("%.2f",area);
    }
}

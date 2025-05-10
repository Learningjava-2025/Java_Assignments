import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (num % 2 == 0) {
            System.out.println("" + num + " is EVEN");
        } else {
            System.out.println("" + num + "is ODD");
        }

    }
}
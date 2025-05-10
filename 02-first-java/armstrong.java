
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = sc.nextInt();
        int a_num = sc.nextInt();
        int sum=0;
        while(a_num > 0){

            int rem= a_num %10;
            sum=sum+ rem*rem*rem;
            a_num = a_num/10;

        }
        if(sum == original) {
            System.out.println("It is armstrong number");
        }




    }
}

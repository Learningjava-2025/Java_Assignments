import java.util.Scanner;

public class xNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(true){
            String num = sc.next();
            if(num.equals("x")){
                System.out.println("You have entered x");
                break;
            }
            sum=Integer.parseInt(num)+sum;

        }System.out.println("The sum of numbers till x is: " + sum);
    }
}


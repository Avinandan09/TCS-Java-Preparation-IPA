
import java.util.Scanner;

public class factorial {
    public static int factorial (int num)
    {
        if (num == 0)
        {
            return 1;
        }
        else
        {
            return num * factorial(num-1);
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}

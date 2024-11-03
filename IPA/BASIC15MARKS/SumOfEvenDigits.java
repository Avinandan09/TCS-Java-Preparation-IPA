// Code for sum of even numbers in a numbers
import java.util.*;
public class SumOfEvenDigits {
    public static void main(String[] args) {
        {
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            int sum = 0;
            while(val!=0)
            {
                int n = val%10;
                if(n%2==0)
                {
                    sum+=n;
                }
                val/=10;
            }
            System.out.println("Sum of even digits is: "+sum);
        }
    }
}

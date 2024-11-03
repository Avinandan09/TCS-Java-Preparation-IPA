// Code for sum of even numver in a array
// lets say num = [1,2,3,4,5] sum =  6

import java.util.*;
public class SumOfEvenArray {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length");
            int n = sc.nextInt();
            int[] num = new int[n];
            int sum = 0;
            System.out.println("Enter the elements");
            for (int i=0;i<n;i++)
            {
                num[i] = sc.nextInt();
                if(num[i]%2==0)
                {
                    sum+=num[i];
                }
            }
            System.out.println("Sum of even numbers is "+sum);
        }
    }
}

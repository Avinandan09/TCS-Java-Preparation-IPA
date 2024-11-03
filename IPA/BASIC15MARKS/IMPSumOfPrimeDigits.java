// Code for sum of  prime digits in a num
// Lets say num=2345678910
// prime sum = 2+3+5+7 = 17

import java.util.*;

public class IMPSumOfPrimeDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String sNum = sc.nextLine();
        int sum = 0;
        for (int i=0;i<sNum.length();i++)
        {
            int val = Character.getNumericValue(sNum.charAt(i));
            if (isPrime(val)){
                sum = sum + val;
            }
        }
        if(sum>0){
            System.out.println("The sum opf prime numbers are: "+ sum);
        }
        else{
            System.out.println("No prime numbers in the number");
        }
    }
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
}

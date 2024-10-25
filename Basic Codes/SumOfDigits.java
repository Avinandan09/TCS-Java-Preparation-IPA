
// Sum of digits of a number without using arithmetic operators

public class SumOfDigits {
    public static int sumofdigits(int num)
    {
        if(num == 0) return 0;
        int sum = 0;
        while (num>0)
        {
            sum = sum + num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int num = 1555;
        int sum = sumofdigits(num);
        System.out.println("Sum of digits of " + num + " is " + sum);
    }
}

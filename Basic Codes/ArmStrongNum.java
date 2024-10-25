import java.util.*;
public class ArmStrongNum {
    public static void main(String[] args) {
        System.out.println("Enter the number to check armstrong or not : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        double sum = 0;
        while (num!=0)
        {
            int digit = num %10;
            sum = sum + Math.pow(digit, 3);
            num = num / 10;
        }
        if(sum==original)
        {
            System.out.println(original+ " is an Armstrong number.");
        }
        else{
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

import java.util.*;

public class IntToIntArray {
    public static void main(String[] args )
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int length = Integer.toString(n).length();
        int[] arr1 = new int[length];
        // First process
        for (int i=0;i<length;i++)
        {
            int digit = n%10;
            arr1[i]=digit;
            n=n/10;
        }
        Arrays.sort(arr1);
        System.out.println("Fisrt Process");
        System.out.println("The array is: " + Arrays.toString(arr1));
}
}

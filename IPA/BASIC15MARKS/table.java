// CODE for multiplication table

import java.util.*;

public class table {
    public static void main(String[] args)
    {
        System.out.println("Enter two values: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=1;i<=b;i++)
        {
            System.out.println(a+" x "+i+" = "+ a*i);
        }
    }
}

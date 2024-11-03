// String to collection of array

import java.util.*;

public class StrToCharArray {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        char[] sArray = s.toCharArray();
        System.out.println("Array: ");
        for (char ch : sArray)
        {
            System.out.print(ch + " ");
        }

    }
}

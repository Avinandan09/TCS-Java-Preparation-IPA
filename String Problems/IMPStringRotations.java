// Code for check a string is equal to anthor string in reverse
// Example: String 1 = abcd  String 2 = dcba in reverse (abcd)

import java.util.*;

public class IMPStringRotations {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string: ");
        String s1 = sc.next();
        System.out.println("Enter the second string: ");
        String s2 = sc.next();
        if (s1.length() == s2.length())
        {
            String reverse = new StringBuilder(s2).reverse().toString();
            if (s1.equals(reverse))
            {
                System.out.println("The Strings are equal in reverse ");
            }
            else{
                System.out.println("The string is not equal.");
            }
        }
    }    
}

// Code for Space Count in A string of sentence:

import java.util.*;

public class SpaceCount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        int count = 0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println("Number of spaces in the string is "+count);
        // char[] chArr = s.toCharArray();
        // System.out.println("The array is " + Arrays.toString(chArr));
    }
}

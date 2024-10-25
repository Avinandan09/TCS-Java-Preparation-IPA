// A string will be anangram if both the string is equal after sorting.
// An example : String 1 : "listen" and String 2:"silent"

import java.util.*;

public class StringAnagram {
    public boolean checkAnangram(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }
        String c1 = s1.toLowerCase();
        String c2 = s2.toLowerCase();
        char[] stringArray1 = c1.toCharArray();
        char[] stringArray2 = c2.toCharArray();
        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);
        return Arrays.equals(stringArray1,stringArray2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.next();
        System.out.println("Enter the second string: ");
        String s2 = sc.next();
        
        StringAnagram sa = new StringAnagram();
        if (sa.checkAnangram(s1, s2))// i can also use if(checkAnangram(s1,s2)) 
        {                               // By declaring checkAnangram method static 
                                        //"public static  boolean checkAnangram(String s1, String s2))""
            System.out.println("The strings are anangrams ");
        }
        else
        {
            System.err.println("No the strings are not anangrams");
        }
    }

}

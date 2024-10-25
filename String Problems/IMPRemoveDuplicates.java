
import java.util.HashSet;
import java.util.Scanner;

// Code for remove duplicates in a string..

public class IMPRemoveDuplicates {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string : ");
         String s1 = sc.next();
         HashSet <Character> set = new HashSet<>();
         for (char c : s1.toCharArray())
         {
            set.add(c);
         }
         StringBuilder sb = new StringBuilder();
         for (char ch : set)
         {
            sb.append(ch);
         }
         System.out.println("The String after remove duplicates : " + sb.toString());
     }   
}

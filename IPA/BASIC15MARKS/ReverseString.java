// Code for Reverese a String
import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String s = "";
        for (int i=str.length()-1;i>=0;i--){
            s = s +  str.charAt(i);
        }
        System.out.println("Reversed string: "+s);
    }
}

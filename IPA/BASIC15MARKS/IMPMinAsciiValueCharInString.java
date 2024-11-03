// Code for Min Ascii Value char in  a string
import java.util.*;
public class IMPMinAsciiValueCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();
        char min = s.charAt(0);
        for (int i=1;i<s.length();i++){
            if(s.charAt(i)<min){
                min = s.charAt(i);
            }
        }
        int val = (int) min;
        System.out.println("Min  ASCII char is " + min + " And the value is  " + val);
    }
}

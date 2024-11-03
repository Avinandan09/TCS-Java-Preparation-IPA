// Char to integer conversion:
import java.util.*;
public class CharToInt
{
    public static void main(String[] args){
        // For ASCII Conversion
        
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int val = (int) ch;
        System.out.println("ASCII value of " + ch + " is " + val);
        System.out.println("Enter a value in num : ");
        char charNum = sc.next().charAt(0);
        int  num = Character.getNumericValue(charNum);
        System.out.println("The integer value of " + charNum + " is " + num);

    }
}
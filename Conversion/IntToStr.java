// Integer to String Conversion:

import java.util.*;

public class IntToStr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int i = sc.nextInt();
        String s = Integer.toString(i);
        System.out.println("Integer to String: " + s);
    }
}

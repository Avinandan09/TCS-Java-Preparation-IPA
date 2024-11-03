// String to Integer Conversion:

import java.util.*;

class StrToInt
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        System.out.println("Integer value of the string is: " + i);
    }
}
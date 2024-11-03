// All Included Conversion 
import java.util.*;
public class allIncluded {
    public static void strToInt()
    {
        System.out.println("Enter a string that is a number too: ");
        Scanner sc = new Scanner(System.in);
        String valInStr = sc.next();
        int val = Integer.parseInt(valInStr);
        System.out.println("The integer value of the string is: " + val);
    }
    public static void intTostr()
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String s = Integer.toString(val);
        System.out.println("The string value of the integer is: " + s);
    }
    public static void strTocharArray(){
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chArray = s.toCharArray();
        for (char ch : chArray)
        {
            System.out.print(" " + ch + " ");
        }
    }
    public static void strTostrArray()
    {
        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArray = s.split(" ");
        for (String sh : sArray)
        {
            System.out.print(" " + sh + " ");
        }
    }
    public static void intToArray()
    {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int[] arr = new int[Integer.toString(val).length()];
        for (int i=0;i<arr.length;i++)
        {
            int rem = val%10;
            arr[i]=rem;
            val=val/10;
        }
        Arrays.sort(arr);
        System.out.println("The array is : "+ Arrays.toString(arr));
    }
    public static void charToint()
    {
        System.out.println("Enter a character which is a number: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = Character.getNumericValue(ch);
        System.out.println("The value is :  "+n);
    }
    public static void main(String[] args) {
        System.out.println("Enter: 1 for String to Int");
        System.out.println("Enter: 2 for Int to String");
        System.out.println("Enter: 3 for String to Char Array");
        System.out.println("Enter: 4 for String to String array");
        System.out.println("Enter: 5 for Integer to array");
        System.out.println("Enter: 6 for Char to Int");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1: strToInt();
                    break;
            case 2: intTostr();
                    break;
            case 3: strTocharArray();
                    break;
            case 4: strTostrArray();
                    break;
            case 5: intToArray();
                    break;
            case 6: charToint();
                    break;
            default:
                System.out.println("Invalid choice: ");
        }
    }
}

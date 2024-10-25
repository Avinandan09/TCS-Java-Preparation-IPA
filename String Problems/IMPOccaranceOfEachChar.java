
import java.util.Scanner;

// Count the number of each character in a string.

public class IMPOccaranceOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.next();
        char[] charArray = s1.toCharArray();
        int[] count = new int[256];
        for (char c : charArray)
        {
            count[c]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>0)
            {
                System.out.println((char)i + " occurs " + count[i]);
            }
        }
    }
}

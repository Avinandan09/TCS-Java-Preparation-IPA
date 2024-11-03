// Code for book identifier 
// Here Book ISBN no - 978-0-13-110362-8(input)
// Output:
    // GSI Prefix :978
    // Group Indentifier : 0
    // Publisher code : 13
    // Item number :  110362
    // Check digit : 8

// Note Here We use Split method  to split the string into array of string

import java.util.*;
public class IMPBookIdentifier {
    public static void main (String[] args)
    {
        System.out.println("Enter ISBN no: ");
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
        String[] parts = isbn.split("-");
        int i = 0;
        System.out.println("GSI prefix: " + parts[i]);
        System.out.println("Group identifier: " + parts[i+1]);
        System.out.println("Publisher code: " + parts[i+2]);
        System.out.println("Item number: " + parts[i+3]);
        System.out.println("Check digit: " + parts[i+4]);
    }
}

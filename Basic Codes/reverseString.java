
import java.util.Scanner;

// Code for reverse a string
class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new String: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString(); // String reverse = new StringBuilder( I/p ).reverse().toString();
        System.err.println("Reversed String: " + reverse);
    }
}

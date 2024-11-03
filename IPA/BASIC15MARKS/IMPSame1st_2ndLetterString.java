// Count the number of words in a sentence that start and end with the same letter.
// Input : Anna asked about the Ginseng recipe 
// Output : 2

import  java.util.Scanner;
public class IMPSame1st_2ndLetterString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine().toLowerCase();
        int count = 0;
        String[] sArr = s.split(" ");
        for (int i=0;i<sArr.length;i++)
        {
            String check = sArr[i];
            if (check.length()>1 && check.charAt(0) == check.charAt(check.length()-1)){
                count++;
            }
        }
        System.out.println("The words count ara: " + count);
    }
}

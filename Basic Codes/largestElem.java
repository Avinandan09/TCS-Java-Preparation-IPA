// Code for largest number in array

import java.util.Scanner;
public class largestElem {
    public static int Largest(int[] arr)
    {
        int max = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            continue;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array: ");
        int range = sc.nextInt();
        int[] arr = new int[range];
        for (int i=0;i<range;i++)
        {
            System.out.println("Enter values :");
            arr[i]=sc.nextInt();
        }
        int largest = Largest(arr);
        System.out.println("The largest number in the array is : " + largest);
    }
}

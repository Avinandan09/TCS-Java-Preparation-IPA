import java.util.*;

public class SortArrayString {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();
        String[] arr = new String[range];
        for (int i = 0;i<range;i++)
        {
            System.out.println("Enter the string: ");
            arr[i]=sc.next();
        }
        System.out.println("Before Sorted: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorted: "+Arrays.toString(arr));
    }   
}

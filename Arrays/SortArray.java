import java.util.*;

public class SortArray {
    public static void SortUsingLibrary() {
        System.err.println("Enter range: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[range];
        for (int i=0;i<range;i++)
        {
            System.err.println("Enter value: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    public static void SortWithoutUsingLibraryfn()
    {
        System.err.println("Enter range: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[range];
        for (int i=0;i<range;i++)
        {
            System.err.println("Enter value: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: "+Arrays.toString(arr));
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        System.err.println("After Sorted " + Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        System.out.println("Enter 1 for sort array using library ");
        System.out.println("Enter 2 for sort array without using library ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1)
        {
            SortUsingLibrary();
        }
        else if(num==2)
        {
            SortWithoutUsingLibraryfn();
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}

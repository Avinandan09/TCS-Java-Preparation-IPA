// Sort name by dictionary order 
import java.util.*;
public class IMPSortingName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        String[] sNames = new String[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter name: ");
            sNames[i] = sc.next();
        }
        Arrays.sort(sNames); //This is crazy for help Arrays.sort() Thank you for reducing lines
        System.out.println("After sprted : " + Arrays.toString(sNames));
    }    
}

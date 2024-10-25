
import java.util.HashSet;

// Code for set contains that returns a true or false by checking the elements in the set
// that is available or not



public class setContainsMethod {
    public static void main(String[] args)
    {
        HashSet <Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        System.out.println("Is 50 in the set : " + set1.contains(50));
        System.out.println("Is 90 in the set? : " + set1.contains(90));
    }    
}

// Code for remove elements in set in java
import java.util.*;
public class removeSet {
    public static void main (String[] args )
    {
        HashSet <Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        System.out.println("Original Set: "+set1);
        set1.remove(40);
        System.out.println("Set after removing 40: "+set1);
    }
}

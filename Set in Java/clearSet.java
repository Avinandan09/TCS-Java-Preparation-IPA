// Code for clear method in S`et in Java

import java.util.*;
public class clearSet {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet <>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println("Original Set: " + set1);
        set1.clear();
        System.out.println("Set after calling clear(): " + set1);
    }
}

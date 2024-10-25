// Looping/ Iteration values in set::

import java.util.*;
public class loopInSet {
    public static void main(String[] args) {
        HashSet <Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        for (int val : s1)
        {
            System.out.println("Checking value in HasSet: "+val);
        }
        System.out.println("As i used 'HashSet' for that reason it is not accurate in looping:");
        LinkedHashSet  <Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(20);
        s2.add(30);
        s2.add(40);
        for (int val1 : s2)
        {
            System.out.println("Checking value in LinkedHashSet: "+val1);
        }

    }
    
}

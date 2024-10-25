// Convert set to array:
import java.util.*;
public class setToArray {
    public static void main(String[] args) {
        LinkedHashSet <Integer> s1 =  new LinkedHashSet <>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        System.out.println("Set: " + s1);
        Object[] strArray =  s1.toArray();
        System.out.println("Typeof : " + s1.toArray().getClass() + "and " + s1);
        System.out.println("Typeof  : " + strArray.getClass() + "and " + strArray);

    }    
}

package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Class {
    public static void main(String[] args) {
        //Creating TreeMap of numbers with types.
        TreeSet <Integer> numbers = new TreeSet<Integer>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        numbers.add(6);
        numbers.add(6);
        System.out.println("Treeset " +numbers);
        //Calling Iterator Method
        System.out.println("Treeset Using Iterator :");
        Iterator itr = numbers.iterator();
        //Accessing Element
        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(",");
        }
    }
}

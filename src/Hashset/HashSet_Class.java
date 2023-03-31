package Hashset;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet_Class {
    public static void main(String[] args) {
        // Creating HashSet of Languages
        HashSet<String> language = new HashSet<String>(8, 0.60F);
        language.add("Java");
        language.add("C");
        language.add("Python");
        language.add("Kotlin");
        language.add("Java");
        System.out.println("Languages are :" + language);
        //Accessing Element by using Iterator method
        System.out.println("Display Languages  by using Iterator:");
        Iterator itr = language.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.print(",");
        }
    }
}

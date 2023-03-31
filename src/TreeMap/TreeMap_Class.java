package TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Class {
    public static void main(String[] args) {
        // Creating TreeMap of even numbers
        TreeMap<String,Integer> evennumber = new TreeMap<String,Integer>();
        // Using put()
        evennumber.put("Two",2);
        evennumber.put("Four",4);
        evennumber.put("Eight",8);
        evennumber.put("Six",6);
        //Print
        System.out.println("TreeMap of Even Numbers :"+evennumber);
        //Iterate By using Entry Interface Method
        System.out.println("Display Even numbers using EntrySet method");
        for (Map.Entry entry : evennumber.entrySet()) {
            System.out.println("Keys : " + entry.getKey() + "   " + "Values : " + entry.getValue());
        }
    }
}

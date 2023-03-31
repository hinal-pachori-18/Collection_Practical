package ArrayList;
import java.util.ArrayList;
public class ArrayList_Class {
    public static void main(String[] args) {
        // Creating ArrayList of animals
        ArrayList<String> animals = new ArrayList<String>();
        // Using add() method we add Elements
        animals.add("Cow");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Cow");
        System.out.println("Arraylist are :" +animals);
        //Iterate Using for each loop
        System.out.println("Display Animals Using for Each loop :");
        for (String str:animals) {
            System.out.print(str);
            System.out.print(",");
        }
    }
}

package HashMap;
import java.util.HashMap;
import java.util.Map;
public class HashMap_Class {
    public static void main(String[] args) {
        //Creating HashMap of employees with types.
        HashMap<Integer, String> employee = new HashMap<Integer, String>();
        //using put method to add elements.
        employee.put(101, "Kavish");
        employee.put(102, "Lavish");
        employee.put(103, "Namish");
        employee.put(104, "Avish");
        employee.put(105, "Kavish");
        System.out.println("Employess Details :" + employee);
        //Iterate By using Entry Interface Method
        System.out.println("Display Employees Details by using Iterator:");
        for (Map.Entry entry : employee.entrySet()) {
            System.out.println("Employee Id :" + entry.getKey() + "   " + "Employee Name : " + entry.getValue());
        }
    }
}

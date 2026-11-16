import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeDirectory {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Charlie");

        HashSet<String> departments = new HashSet<>();
        departments.add("HR");
        departments.add("IT");
        departments.add("Finance");

        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");

        Iterator<String> itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(departments);
        System.out.println(employeeMap);
    }
}

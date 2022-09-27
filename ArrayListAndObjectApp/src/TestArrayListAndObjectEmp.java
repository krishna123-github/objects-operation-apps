import java.util.*;
import java.util.Iterator;

/**
 * ArrayList and Object (Collection API Feature)....
 *
 * @author krishna pal
 */
class Employee {

    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "empId=" + empId + "... name=" + name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }
}

public class TestArrayListAndObjectEmp {

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();  // here we creating the object of the  ArrayList class store in empLiast reference..
        // now initialize the Employee value to ArrayList class for creating the list of the all object in empList reference
        Employee e1 = new Employee(5555, "sunny");
        empList.add(e1);                           // first we  create  object thenn we add the object in add() method...
        empList.add(new Employee(1111, "krishna"));  // here  we created the object inside the add() method and pass parameter calling param constructor
        empList.add(new Employee(2222, "raj"));
        empList.add(new Employee(3333, "Ammit"));

        System.out.println("employee count = " + empList.size());   // number of the Object store in ArrayList Object....
        System.out.println(empList);      // it give list of all Objects value , those are in Employee class... 

        System.out.println("-----iterate using for each-----");
        //iterate all employeee
        
        for (Employee e : empList) {   //get out the each object properties one by one according to index in the ArrayList object
            System.out.println(e);  //print each objects value
        }

        System.out.println("-----iterate using iterator object-----");
        Iterator<Employee> it = empList.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            System.out.println(e);
        }
    }
}

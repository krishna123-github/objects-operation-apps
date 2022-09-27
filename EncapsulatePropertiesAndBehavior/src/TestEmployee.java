/**
 * Class encapsulate the properties and methods
 *
 * @author krishna pal
 */
class Employee {

    int empId;
    String name;

    void doTask() {
        System.out.println("Employee name is : " + name + ", whose id  is : " + empId);
    }
}

public class TestEmployee {

    public static void main(String[] args) {
        Employee e1;
        e1 = new Employee();   //loading the class and creating the object...
                            
        e1.name="krishna";  // initialised the properties
        e1.empId=1111;      // initialised the properties
        e1.doTask();        // calling the methods

        Employee e2;
        e2 = new Employee();
        e2.name="raj";      // initialised the properties
        e2.empId=2222;      // initialised the properties
        e2.doTask();        // callling the method

    }

}

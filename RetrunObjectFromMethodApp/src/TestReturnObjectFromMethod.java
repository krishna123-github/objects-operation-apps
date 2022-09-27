/**
 * Return object from the method Calling the param const from the
 * EmployeeService to Employee not by main class...
 *
 * @author krishna pal
 */
class Employee {

    private String name;
    private int empId;

    Employee(String name, int empId) {
        this.empId = empId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

}

class EmployeeServices {

    public Employee findById(Integer empId) {  // /* TODO: Fetch employee record from database for given empId 
        // * and return as Employee object 

        Employee e = new Employee("krishna", 1);
        return e;
    }
}

public class TestReturnObjectFromMethod {

    public static void main(String[] args) {
        EmployeeServices service = new EmployeeServices();
        Employee emp = service.findById(1);          //* Test Returning object from a method

        System.out.println("Employee id = " + emp.getEmpId());
        System.out.println("Employee name = " + emp.getName());
    }
}

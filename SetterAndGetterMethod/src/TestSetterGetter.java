/**
 * use the Setter and Getter methods in the Employee class....
 *
 * @author krishna pal
 */
class Employee {

    public int empId;
    public String name;

    Employee() {
        System.out.println("---default contructor---");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    void  doTask(){
        System.out.println("employee name :: "+name);
        System.out.println("employee id :: "+empId);
    }  
}

public class TestSetterGetter {

    public static void main(String[] args) {
        Employee e1;
        e1 = new Employee();
        e1.setName("krishna");
        e1.setEmpId(111);

        e1.doTask();
        
        
    }

}

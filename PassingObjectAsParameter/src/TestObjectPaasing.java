
/**
 * here we are passing the object of Emmployee  class to EmployeeServices class as a parameter
 * @author krishna pal
 */

class Employee{
    private String name;
    private int empId;
    
    public Employee(String name,int empId){
        this.empId=empId;
        this.name=name;
        
        
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }
    
    void doTask(){
        System.out.println( "name="+name+" id="+empId);
        System.out.println();
    }
    
}

class EmployeeServices{
    EmployeeServices(Employee emp){
        String s=emp.getName();
        int i=emp.getEmpId();
        System.out.println("----save(.)----------");
        System.out.println("----data is recieved from employee-----");
        System.out.println("----emmployee namme---"+s);
        System.out.println("----employee id-------"+i);
        
    }
}
public class TestObjectPaasing {
    public static void main(String[]args){
        Employee emp = new Employee("krishna",1111);
        emp.doTask();
        
        EmployeeServices services=new EmployeeServices(emp);
       //services.doTask();
    }
}

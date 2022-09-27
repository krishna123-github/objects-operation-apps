
/**
 * Test the Array of  object ..paasing the index number  to  the Array reference......
 * @author krishna pal
 */

class Employee {
    int empId ;
    String name;
    
    Employee(int empId, String name){
        this.name=name;
        this.empId=empId;
    }
    
    public void doTask(){
        System.out.println("--Employee name :: "+name);
        System.out.println("--Employee id   :: "+empId);
    }
}
public class TestArrayObject {
    public static void main(String[]args){
        Employee[] emp = new Employee[2];   //we creating the array object...allot number of index in this array object
         emp[0] = new Employee(1111,"krishnas");  // calling the param constructor by the Array Object with index number 0...
         emp[1] = new Employee(3333,"raj");     // calling the param constructor by the Array Object with index number 1...
         
        for(Employee e : emp){  // apply the for loop creating the new object of Employee class that will count the each index of object once and call the doTask method 
            e.doTask();      //
        }
    }
    
}

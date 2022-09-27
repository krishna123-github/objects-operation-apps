 
/**
 * here we represent the objects as a string....
 * @author krishna pal
 */

class Employee{
    int empId;
    String String;

    public Employee(int empId, String String) {
        this.empId = empId;
        this.String = String;
    }

    @Override
    public String toString() {      // if we cannt overrride the toString method..then it will print the hashcode in String form...so compulsary to override...
       // return "Employee{" + "empId=" + empId + ", String=" + String + '}';
        return "{ empId=" + ", String=" + String + "}"; //the will pass same its  is....also prints same its  is..
    }
    

    public int getEmpId() {
        return empId;
    }
    public String getString() {
        return String;
    }
}
    
public class TestObjectString {
    public static void main(String[]args){
        Employee emp1 = new Employee(111,"krishna");
        Employee emp2 = new Employee(222,"raj");
        
        String str = emp1.toString();  // here we Firstly ovderrride the toString() method by the object
        System.out.println(str);       // then we print the object  asa Sring.... 
        
        System.out.println(emp2);      // here  the toString() mmethod  will internally call by JVM ...here we directly print the object..
    }
}

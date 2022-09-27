 
/**
 *  compare two objects 
 * @author krishna pal
*/

class Employee{
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }
    

   /** @Override
    public boolean equals(Object obj) {    //override the object class equals method() ....it will return the boolean type
         Employee employee = (Employee)obj;  // performing the down-cast
         
         if(this.empId==employee.getEmpId()){   // comparing the current enter value to the exixting values
             return true;
         }
         else{
             return false;
         }
    }*/
    }

public class TestCompareTwoObject {
     public static void main(String[]args){
         Employee emp1=new Employee(111,"krishna");
         System.out.println("emp1= "+emp1.hashCode());
         Employee emp2=new Employee(222,"raj");
          System.out.println("emp2= "+emp2.hashCode());
         Employee emp3=new Employee(333,"Amit");
           System.out.println("emp3= "+emp3.hashCode());
            
            boolean compare=emp1==emp2;
            System.out.println("compare the emp1 and emp2 = "+compare);  //  here this will compare the hashcode  of the emp1 & emp2
         boolean status = emp1.equals(emp2);         // equals() method is used to compare the value empId and name that store in object
         System.out.println("first compare the values = "+status);   
         
         System.out.println("second compare the values = "+emp1.equals(emp3));
     }    
}

 
/**
 *   create the constructor in class ... and initialized the values....
 * @author krishna pal
 */

class Employee{
    int empId;
    String name;
    
    Employee(){     // jitni baar object create karege.. hr time default contructor call hoga....
        System.out.println("---object is created using the default consttructor----");
    }
    
    Employee(String name,int empId){
        this.name=name;
        this.empId=empId;
        System.out.println("param cont..."+"Employee name = "+name+"...whose id is = "+empId);
    }
    
    void doTask(){
        System.out.println("doPost method ..."+"Employee name = "+ name +"...whose id is = "+empId);
    }
}

public class TestConstructorEmp {
    public static void main(String[]args){
        Employee e1;
        e1 = new Employee();
        e1.name="krishna";
        e1.empId=1111;
        e1.doTask();
        
        Employee e2 ;
        e2 = new Employee("raj",2222);
        e2.doTask();
        
        Employee e3 = new Employee();
        e3.name="sunny";
        e3.empId=4444;
        e3.doTask();
    }
}

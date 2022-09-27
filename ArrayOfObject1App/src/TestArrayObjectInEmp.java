/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * creating the Array of Object without paasing the index number to the arrary reference...
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

public class TestArrayObjectInEmp {
    public static void main(String[]args){
        Employee[] emp = new Employee[] {  //another type to create Array Objects...here we cant paas the index number  to the object;
        new Employee(1111, "vikram"),      // directly we assign value to the  Array reference...
        new Employee(3333, "raj")  };      // directly we assign value to the  Array reference...
       
        for(Employee e : emp){
            e.doTask();
        }
    }
    
}

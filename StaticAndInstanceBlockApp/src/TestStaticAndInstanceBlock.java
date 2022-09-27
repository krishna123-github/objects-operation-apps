/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krishna pal
 */
class Employee {

    static {
        System.out.println("---static block execute once pr for class---");
    }

    {
        System.out.println("---intance block execute once pr for a object---");
    }

    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "empId:" + empId + ", name:" + name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

}

public class TestStaticAndInstanceBlock {

    public static void main(String[] args) {
        Employee emp1 = new Employee(111, "krishna");
        Employee emp2 = new Employee(222, "raj");

        System.out.println("First employee name and id is = " + emp1);
        System.out.println("Second employee name and id is =" + emp2);
    }

}

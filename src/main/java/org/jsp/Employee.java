package org.jsp;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int edi;
    private String ename;
    private double salary;
    public Employee(int edi,String ename,double salary){
        this.edi=edi;
        this.ename=ename;
        this.salary=salary;
    }

    public void setSalary(double  salary) {
        this.salary = salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEdi(int edi) {
        this.edi = edi;
    }

    @Override
    public String toString() {
        return "" +
                "edi=" + edi +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                "";
    }

    public static void main(String[] args)
    {
        System.out.println("Employee details");
        List<Employee>employees= Arrays.asList(new Employee(101, "krishna", 5000),
                new Employee(102, "Gowri", 6000),
                new Employee(103, "Naga", 5500));
            for(Employee emp :employees){
                System.out.println(emp.toString());

            }

    }
}
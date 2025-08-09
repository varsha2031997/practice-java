//Sort Employees by Salary Descending (Comparator)
//
//Class: Employee (id, name, salary)
//
//Task: Sort by salary in descending order using Comparator.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    String empId;

    String name;
    double salary;


    Example(String empId,String name,double salary)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Example{" +
                "empId='" + empId + '\'' +
                ", name=" + name +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Example> emp = new ArrayList<>();
        emp.add(new Example("Emp123","shwetha thiwari",20000));
        emp.add(new Example("Emp222","kiran",50000));
        emp.add(new Example("Emp234","Arjun",40000));
        emp.add(new Example("Emp212","Varsha",55000));
        emp.add(new Example("Emp244","Kapil",10000));

        Comparator<Example> titleCompare = (o1,o2)->(Double.compare(o2.salary,o1.salary));

        Collections.sort(emp,titleCompare);

       for(Example Emps:emp)
       {
           System.out.println(Emps);
       }

    }
}

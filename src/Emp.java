import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sort Employees by Salary Descending (Comparator)
//
//Class: Employee (id, name, salary)
//
//Task: Sort by salary in descending order using Comparator.
public class Emp
{
    int id;
    String name;
    double salary;

    Emp(int id, String name,double salary)
    {
       this.id=id;
       this.name=name;
       this.salary= salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }




    public static void main(String[] args) {
        List<Emp> emp = new ArrayList<>();
        emp.add(new Emp(1234,"varsha",10000));
        emp.add(new Emp(1234,"Sanrtosh",20000));
        emp.add(new Emp(1234,"gia",30000));
        emp.add(new Emp(1234,"owl",40000));

        Comparator<Emp> empComparator = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
               return Double.compare(o2.salary,o1.salary);
            }
        };

        Collections.sort(emp,empComparator);

        for(Emp emps : emp)
        {
            System.out.println(emps);
        }



    }
}

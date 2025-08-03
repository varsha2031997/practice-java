//Sort List of Students by Name (Comparable)
//
//        Class: Student (name, rollNo, age)
//
//        Task: Sort students alphabetically by name using Comparable.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    String rollno;
    int age;

    Student(String name,String rollno, int age)
    {
        this.name= name;
        this.rollno= rollno;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                ", age=" + age +
                '}';
    }




    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}

class Main
{
    public static void main(String[] args) {

        List<Student> stud = new ArrayList<>();
        stud.add(new Student("varsha","isc124",29));
        stud.add(new Student("Akarsh","isc125",29));
        stud.add(new Student("Akshay","isc126",29));
        stud.add(new Student("win","isc127",29));
        stud.add(new Student("joe","isc128",29));

        Collections.sort(stud);

        for(Student students : stud)
        {
            System.out.println(students);
        }


    }
}

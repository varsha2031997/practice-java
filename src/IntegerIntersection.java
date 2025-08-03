import java.util.ArrayList;
import java.util.List;

//Find the intersection of two ArrayList<Integer>
public class IntegerIntersection {
    public static void main(String[] args) {

        List<Integer> number1 = new ArrayList<>();
        number1.add(12);
        number1.add(13);
        number1.add(14);

        List<Integer> number2 = new ArrayList<>();
        number2.add(12);
        number2.add(13);
        number2.add(14);

       for(Integer num :number1)
       {
           if(number2.contains(num))
           {
               System.out.println(num);
           }
       }


    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lexicographically {

    public static void main(String[] args) {
        List<String> alphas = new ArrayList<String>();
        alphas.add("Raju");
        alphas.add("kalpana");
        alphas.add("kiran");
        alphas.add("Arjun");
        alphas.add("jie");
        alphas.add("tina");

        Collections.sort(alphas, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               int alpalength = Integer.compare(o1.length(),o2.length());

               if(alpalength ==0)
               {

                   if(o1.length()==o2.length())
                   {
                       return o1.compareToIgnoreCase(o2);//alphabitacally same length
                   }
               }
               return alpalength;


            }
        });

        System.out.println(alphas);





    }
}

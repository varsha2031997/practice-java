import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//Remove duplicates from an ArrayList<String>
public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Raju");
        names.add("Athu");
        names.add("Geethu");
        names.add("Raju");
        names.add("Raju");

        HashSet<String> uniquename = new HashSet<>(names);

        for(String name :uniquename)
        {
            System.out.println(name);
        }

    }
}

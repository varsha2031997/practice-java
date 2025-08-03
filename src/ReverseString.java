//Reverse a LinkedList without using Collections.reverse()
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        List<String> reverseString = new LinkedList<>();
        reverseString.add("harbajan");
        reverseString.add("geetha");
        reverseString.add("kusama");
        reverseString.add("harish");

        for(int i=reverseString.size()-1;i>=0;i--)
        {
            System.out.println(reverseString.get(i));
        }

    }
}

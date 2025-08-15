import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class pali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        String result = reverse.equals(str) ? "Pali" : "No pali";
        System.out.println("Result :"+result);



    }
}

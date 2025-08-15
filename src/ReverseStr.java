import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse is :"+reverse);
        int j=0;

        char [] ch = new char[str.length()];
        for(int i = str.length()-1;i>=0;i--)
        {
            ch[j] = str.charAt(i);
            j++;
        }
        String reversed = new String(ch);
        System.out.println("Reversed string :"+reversed);



    }
}

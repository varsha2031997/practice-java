import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

         Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("enter array");
        int a[] = new int[size];
        int [] rev = new int[size];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }



    }
}

import java.util.Scanner;

public class Secondlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array");
        int size = sc.nextInt();
        System.out.println("Enter array :");
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int bignum =0;int secbignum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>bignum)
            {
                secbignum = bignum;
                bignum =a[i];

            }
        }
        System.out.println("Big num "+bignum+"Second big num "+secbignum);
    }
}

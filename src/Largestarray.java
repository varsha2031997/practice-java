import java.util.Scanner;

public class Largestarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
<<<<<<< HEAD
        int[] a = new int[size];
        System.out.println("Enter the value of array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
=======
        int [] a = new int[size];
        System.out.println("Enter the value of array");
        for(int i=0;i<size;i++)
        {
            a[i] =sc.nextInt();
>>>>>>> f2fbbfde58bf9d2c0b75dd56a1c4efe87cf0476d
        }


        int bigNumb = 0;
<<<<<<< HEAD
        for (int i = 0; i < a.length; i++) {
            if (a[i] > bigNumb) {
                bigNumb = a[i];
            }
        }
        System.out.println("Big number:" + bigNumb);

    }
}
=======
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>bigNumb)
            {
                bigNumb = a[i];
            }
        }
        System.out.println("Big number:"+bigNumb);

    }
}
>>>>>>> f2fbbfde58bf9d2c0b75dd56a1c4efe87cf0476d

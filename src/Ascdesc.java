import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Ascdesc {
    public static void main(String[] args) {
        Integer[] a = {4,5,9,2,5,9,10,23,44,32,33,21};

//        Arrays.sort(a);
//        System.out.println("Ascending order :"+Arrays.toString(a));
//
//        Arrays.sort(a, Collections.reverseOrder());
//        System.out.println("Descending order :"+Arrays.toString(a));

        for(int i=0;i< a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }

        }

        System.out.println("Ascending order");
        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]+"");
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] < a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] =temp;
                }
            }
        }

        for(int i=0;i< a.length;i++)
        {
            System.out.println(a[i]+"");
        }




    }
}

import java.util.Arrays;
public class Diff {
    public static void main(String[] args) {
        //single dimensional array
        int [] a = {1,2,3,4};
        System.out.println(Arrays.toString(a));

        //multidimensional
        int [][] a1 ={
                {1,2,3},
                {4,5,6}
        };
        for(int i =0;i<a1.length;i++)
        {
            for(int j=0;j<a1[i].length;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        //jagged
        int [][] a2 = new int[3][];
        a2[0] = new int[]{1, 2};
        a2[1] = new int[]{1,2,3};
        a2[2] = new int[]{1,2,3,4};

    }
}

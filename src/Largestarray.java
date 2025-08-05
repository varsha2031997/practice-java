public class Largestarray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int largestnumber=num[0];
        for(int i=0;i<=num.length-1;i++)
        {
             if(num[i]>num[0])
             {
                 largestnumber =num[i];
             }
        }
        System.out.println("Largest number is:"+largestnumber);

    }
}
//sum of array without using array_sum
//count of consonants and vowels in string
//arrange array in ascending and descending order
//reverse string
//switch value b/w a and b
//exchange key and value
//pattern programmes
//sql queries
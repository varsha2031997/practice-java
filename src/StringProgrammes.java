import static java.util.Collections.reverse;

public class StringProgrammes {
    public static void main(String[] args) {
//        String str = "abcdef";
//        String reversed = new StringBuffer(str).reverse().toString();
//        System.out.println(reversed);

        String str = "abcedgfh";

        String reversed ="";
        for(int i= str.length()-1;i>0;i--)
        {
            reversed += str.charAt(i);

        }

        System.out.println(reversed);



    }
}

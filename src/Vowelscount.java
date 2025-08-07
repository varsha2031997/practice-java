public class Vowelscount {
    public static void main(String[] args) {
          String str = "jhsdvgsvia";
          int vowelscount=0;
          int consonantcount=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);

            if("aeiouAEIOUU".indexOf(ch)!=-1)
            {
                 vowelscount++;
            }else {
                consonantcount++;
            }

        }
        System.out.println("Vowels count :"+vowelscount+"Consonant count :"+consonantcount);



    }
}

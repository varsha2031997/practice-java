import java.util.Arrays;
import java.util.Collections;

public class pract {
    public static void main(String[] args) {
      String str = "abcdefghi";
      int vowelscounyt=0;
      int consonantcount=0;
      for(int i=0;i<str.length();i++)
      {
          char ch = str.charAt(i);
          if("aeiouAEIOU".indexOf(ch)!=-1)
          {
              vowelscounyt++;
          }else {
              consonantcount++;
          }
      }
        System.out.println("Vowels count"+vowelscounyt+"Consonant count"+consonantcount);

    }
}
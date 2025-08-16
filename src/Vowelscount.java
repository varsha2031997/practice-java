import java.util.Scanner;

public class StringVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int vowelsCount=0;int consonantCount = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                if("aeiouAEIOU".contains(String.valueOf(ch)))
                {
                    vowelsCount++;
                }else {
                    consonantCount++;
                }

            }


        }

        System.out.println("Vowels count :"+vowelsCount+"Consonant count : "+consonantCount);

    }
}

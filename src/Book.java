////Class: Book (title, author)
////
////Use case-insensitive comparison for title.
import com.sun.source.tree.BreakTree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Sort Bank Transactions by Amount and Date
//
//Class: Transaction (txnId, amount, txnDate)
//
//Sort: higher amount first; if equal, most recent txn first.
public class Example {
    String title;
    String author;


    Example(String title,String author)
    {
        this.title=title;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Example{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Example> book = new ArrayList<>();
        book.add(new Example("I too had love story","shwetha thiwari"));
        book.add(new Example("Korean diaries","kiran"));
        book.add(new Example("Mangalore days","Arjun"));
        book.add(new Example("kerala stories","Varsha"));
        book.add(new Example("King and queen","Kapil"));

        Comparator<Example> titleCompare = (o1,o2)->(o1.title.compareToIgnoreCase(o2.title));

        Collections.sort(book,titleCompare);

       for(Example books:book)
       {
           System.out.println(books);
       }

    }
}

//Class: Book (title, author)
//
//Use case-insensitive comparison for title.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book {


    String tittle;
    String author;

    Book(String title, String author)
    {
        this.tittle = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("I too had love story","Preethi shenoy"));
        books.add(new Book("Mere mast magan","Sandeep shenoy"));
        books.add(new Book("Kaira","kashil shenoy"));
        books.add(new Book("Crazy place","Atharv shenoy"));

        Comparator<Book> booksComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.tittle.compareToIgnoreCase(o2.tittle);
            }
        };

        Collections.sort(books,booksComparator);

        for(Book bookie : books)
        {
            System.out.println(bookie);
        }




    }
}

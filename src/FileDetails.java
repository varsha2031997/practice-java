//extension alphabetically
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileDetails {
    String fileName;
    int Size;
    String extension;

    FileDetails(String fileName,int Size,String extension)
    {
        this.fileName=fileName;
        this.Size = Size;
        this.extension=extension;
    }

    @Override
    public String toString() {
        return "FileDetails{" +
                "fileName='" + fileName + '\'' +
                ", size=" + Size +
                ", extension='" + extension + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<FileDetails> details = new ArrayList<>();
        details.add(new FileDetails("abcd",100,"pdf"));
        details.add(new FileDetails("java",300,"excel"));
        details.add(new FileDetails("seeds",500,"zip"));
        details.add(new FileDetails("premit",600,"jpg"));
        details.add(new FileDetails("school",700,"jpeg"));

        Comparator<FileDetails> filedetails = new Comparator<FileDetails>() {
            @Override
            public int compare(FileDetails o1, FileDetails o2) {
                return o1.extension.compareTo(o2.extension);
            }
        };

        Collections.sort(details,filedetails);

        for(FileDetails  fileCompareddetails : details)
        {
            System.out.println(fileCompareddetails);
        }




    }
}

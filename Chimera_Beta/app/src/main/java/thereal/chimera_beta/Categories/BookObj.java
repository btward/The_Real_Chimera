package thereal.chimera_beta.Categories;

import android.os.Parcelable;

public class BookObj extends CategoryObj {
    String[] fields = {"Name", "Genre", "Author", "Length", "Date"};
    String name, genre, author, length;

    public BookObj(){
        super();
        type = "book";
    }

    public BookObj(String name1){
        super();
        type = "book";
        name = name1;
    }

    public BookObj(String name1, String genre1, String author1, String length1){
        type = "book";
        name = name1;
        genre = genre1;
        author = author1;
        length = length1;
    }


    @Override
    public String toString(){
        String output = fields[1] + ": " + genre +"\n"+
                fields[2] + ": " + author +"\n"+
                fields[3] + ": " + length;
        return output;
    }
}

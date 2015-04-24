package thereal.chimera_beta.Categories;


import java.lang.reflect.Array;

public class MovieObj extends CategoryObj {
    String[] fields = {"Name", "Genre", "Director", "Screenwriter", "Producer", "Actor",
            "RottenTomatoes", "Oscars", "Date"};
    String name, genre, director, screenwriter, producer, actor, rottenTomatoes, oscars;

    public MovieObj(){
        super();
        type = "movie";
    }

    public MovieObj(String name1){
        super();
        type = "movie";
        name = name1;
    }

    public MovieObj(String name1, String type1){
        super();
        type = "movie";
        name = name1;
    }

    public MovieObj(String name1,String genre1,String director1,String screenwriter1,
                    String producer1,String actor1,String rottenTomatoes1,String oscars1){
        type = "movie";
        name = name1;
        genre = genre1;
        director = director1;
        screenwriter = screenwriter1;
        producer = producer1;
        actor = actor1;
        rottenTomatoes = rottenTomatoes1;
        oscars = oscars1;
    }

    @Override
    public String toString(){
        String output = fields[1] + ": " + genre +"\n"+
                fields[2] + ": " + director +"\n"+
                fields[3] + ": " + screenwriter +"\n"+
                fields[4] + ": " + producer +"\n"+
                fields[5] + ": " + actor +"\n"+
                fields[6] + ": " + rottenTomatoes +"\n"+
                fields[7] + ": " + oscars;
        return output;
    }
}

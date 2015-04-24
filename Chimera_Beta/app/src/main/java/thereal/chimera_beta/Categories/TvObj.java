package thereal.chimera_beta.Categories;

public class TvObj extends CategoryObj {
    String[] fields = {"Name", "Genre", "Director", "Screenwriter", "Showrunner",
            "Length", "RottenTomatoes", "Emmies", "Date"};
    String name, genre, director, screenwriter, showrunner, length, rottenTomatoes, emmies;

    public TvObj(){
        super();
        type = "tv";
    }

    public TvObj(String name1){
        super();
        type = "tv";
        name = name1;
    }

    public TvObj(String name1, String type){
        super();
        type = "tv";
        name = name1;
    }

    public TvObj(String name1,String genre1,String director1,String screenwriter1,
                 String showrunner1,String length1,String rottenTomatoes1,String emmies1){
        type = "tv";
        name = name1;
        genre = genre1;
        director = director1;
        screenwriter = screenwriter1;
        showrunner = showrunner1;
        length = length1;
        rottenTomatoes = rottenTomatoes1;
        emmies = emmies1;
    }

    public String getGenre(){
        return genre;
    }

    public String getDirector(){
        return director;
    }

    @Override
    public String toString(){
        String output = fields[1] + ": " + genre +"\n"+
                fields[2] + ": " + director +"\n"+
                fields[3] + ": " + screenwriter +"\n"+
                fields[4] + ": " + showrunner +"\n"+
                fields[5] + ": " + length +"\n"+
                fields[6] + ": " + rottenTomatoes +"\n"+
                fields[7] + ": " + emmies;
        return output;
    }
}

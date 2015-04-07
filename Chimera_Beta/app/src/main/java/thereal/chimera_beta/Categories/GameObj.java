package thereal.chimera_beta.Categories;


public class GameObj extends CategoryObj {
    String[] fields = {"Name", "Genre", "Developer", "Length", "Metacritic", "Platform"};
    String name, genre, developer, length, metacritic, platform;

    public GameObj(){
        super();
        type = "game";
    }

    public GameObj(String name1,String genre1,String developer1,String length1,
                   String metacritic1,String platform1){
        type = "game";
        name = name1;
        genre = genre1;
        developer = developer1;
        length = length1;
        metacritic = metacritic1;
        platform = platform1;
    }

    @Override
    public String toString(){
        String output = fields[1] + ": " + genre +"\n"+
                fields[2] + ": " + developer +"\n"+
                fields[3] + ": " + length +"\n"+
                fields[4] + ": " + metacritic +"\n"+
                fields[5] + ": " + platform;
        return output;
    }
}

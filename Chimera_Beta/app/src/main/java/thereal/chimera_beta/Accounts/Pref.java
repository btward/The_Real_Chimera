package thereal.chimera_beta.Accounts;


public class Pref {
    public int genre, book, movie, tv, game, creator;
    int zero = genre = book = movie = tv = game = creator = 0;
    public String[] favGanres, favBooks, favMovies, favTV, favGames, favCreator, viewed, liked, disliked;
    public Object[] myTops;

    public Pref(){

    }

    public void setBasicRatings(int g1, int b1, int m1, int t1, int gm1, int c1){
        genre = c1;
        book = b1;
        movie = m1;
        tv = t1;
        game = gm1;
        creator = c1;
    }
}

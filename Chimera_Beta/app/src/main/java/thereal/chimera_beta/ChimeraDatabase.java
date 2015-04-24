package thereal.chimera_beta;

import android.app.Activity;
import android.view.View;

import java.util.ArrayList;

import thereal.chimera_beta.Categories.*;

public class ChimeraDatabase extends SuggestionsActivity{

    ArrayList<BookObj> books;
    ArrayList<MovieObj> movies;
    ArrayList<TvObj> tvs;
    ArrayList<GameObj> games;

    public ChimeraDatabase(){
        books = new ArrayList<BookObj>();
        books.add(new BookObj("Mistborn: The Final Empire", "Fantasy", "Brandon Sanderson", "Medium"));
        books.add(new BookObj("Mistborn: Well of Ascension", "Fantasy", "Brandon Sanderson", "Medium"));
        books.add(new BookObj("Mistborn: Hero of Ages", "Fantasy", "Brandon Sanderson", "Medium"));
        books.add(new BookObj("Mistborn Adventures: Alloy of Law", "Fantasy", "Brandon Sanderson", "Short"));
        books.add(new BookObj("Stormlight Archive: The Way of Kings", "Fantasy", "Brandon Sanderson", "Long"));
        books.add(new BookObj("Stormlight Archive: Words of Radiance", "Fantasy", "Brandon Sanderson", "Long"));
        books.add(new BookObj("Elantris", "Fantasy", "Brandon Sanderson", "Medium"));
        books.add(new BookObj("Warbringer", "Fantasy", "Brandon Sanderson", "Medium"));
        books.add(new BookObj("Ender's Game", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Ender's Shadow", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Ender's Game", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Speaker for the Dead", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Xenocide", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Children of the Mind", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Ender in Exile", "Sci-Fi", "Orson Scott Card", "Short"));
        books.add(new BookObj("Along Came a Spider", "Action", "James Patterson", "Short"));
        books.add(new BookObj("Kiss the Spiders", "Action", "James Patterson", "Short"));
        books.add(new BookObj("Roses are Red", "Action", "James Patterson", "Short"));
        books.add(new BookObj("Violets are Blue", "Action", "James Patterson", "Short"));
        books.add(new BookObj("Four Blind Mice", "Action", "James Patterson", "Short"));
        books.add(new BookObj("And Then There Were None", "Mystery", "Agatha Criste", "Short"));
        books.add(new BookObj("Partners in Crime", "Mystery", "Agatha Criste", "Short"));
        books.add(new BookObj("The ABC Murders", "Mystery", "Agatha Criste", "Short"));
        books.add(new BookObj("Miss (Jane) Marple", "Mystery", "Agatha Criste", "Short"));
        books.add(new BookObj("Murder on the Orient Express", "Mystery", "Agatha Criste", "Short"));


        movies = new ArrayList<MovieObj>();
        movies.add(new MovieObj("Django Unchained", "Action", "Quentin Tarantino", "Quentin Tarantino", "Samuel L. Jackson", "Leonardo DiCaprio", "88", "1"));
        movies.add(new MovieObj("Inglourious Bastards", "Action", "Quentin Tarantino", "Quentin Tarantino", "Samuel L. Jackson", "Leonardo DiCaprio", "93", "0"));
        movies.add(new MovieObj("Resevoir Dogs", "Action", "Quentin Tarantino", "Quentin Tarantino", "Samuel L. Jackson", "Leonardo DiCaprio", "82", "0"));
        movies.add(new MovieObj("Pulp Fiction", "Action", "Quentin Tarantino", "Quentin Tarantino", "Samuel L. Jackson", "Samuel L. Jackson", "97", "2"));
        movies.add(new MovieObj("Kill Bill Volume 1", "Action", "Quentin Tarantino", "Quentin Tarantino", "Lawrence Bender", "Uma Therman", "84", "0"));
        movies.add(new MovieObj("Kill Bill Volume 2", "Action", "Quentin Tarantino", "Quentin Tarantino", "Lawrence Bender", "Uma Therman", "86", "0"));
        movies.add(new MovieObj("Lord of the Rings: The Fellowship of the Rings", "Fantasy", "Peter Jackson", "Peter Jackson", "J.R.R. Tolkien", "Elijah Woods", "94", "0"));
        movies.add(new MovieObj("Lord of the Rings: The Two Towers", "Fantasy", "Peter Jackson", "Peter Jackson", "J.R.R. Tolkien", "Elijah Woods", "90", "0"));
        movies.add(new MovieObj("Lord of the Rings: Return of the King", "Fantasy", "Peter Jackson", "Peter Jackson", "J.R.R. Tolkien", "Elijah Woods", "97", "6"));
        movies.add(new MovieObj("Star Wars - Episode IV: A New Hope", "Sci-Fi", "George Lucas", "George Lucas", "Mark Hamil", "Harrison Ford", "96", "0"));
        movies.add(new MovieObj("Star Wars - Episode V: The Empire Strikes Back", "Sci-Fi", "George Lucas", "George Lucas", "Mark Hamil", "Harrison Ford", "98", "1"));
        movies.add(new MovieObj("Star Wars - Episode VI: Return of the Jedi", "Sci-Fi", "George Lucas", "George Lucas", "Mark Hamil", "Harrison Ford", "92", "2"));
        movies.add(new MovieObj("Indiana Jones: Raiders of the Lost Ark", "Action", "Stephen Spielberg", "George Lucas", "Stephen Spielberg", "Harrison Ford", "93", "0"));
        movies.add(new MovieObj("Indiana Jones: Temple of Doom", "Action", "Stephen Spielberg", "George Lucas", "Stephen Spielberg", "Harrison Ford", "87", "0"));
        movies.add(new MovieObj("Indiana Jones: The Last Crusade", "Action", "Stephen Spielberg", "George Lucas", "Stephen Spielberg", "Harrison Ford", "93", "1"));
        movies.add(new MovieObj("Batman Begins", "Superhero", "Christopher Nolan", "Christopher Nolan", "Christopher Nolan", "Christian Bale", "92", "0"));
        movies.add(new MovieObj("The Dark Knight", "Superhero", "Christopher Nolan", "Christopher Nolan", "Christopher Nolan", "Heath Ledger", "98", "2"));
        movies.add(new MovieObj("The Dark Knight Rises", "Superhero", "Christopher Nolan", "Christopher Nolan", "Christopher Nolan", "Christian Bale", "92", "1"));


        tvs = new ArrayList<TvObj>();
        tvs.add(new TvObj("Buffy the Vampire Slayer", "Fantasy", "David Greenman", "Jane Espenson", "Joss Whedon", "Long", "95", "2"));
        tvs.add(new TvObj("Angel", "Fantasy", "Frank Gorman", "Jane Espenson", "Joss Whedon", "Long", "92", "0"));
        tvs.add(new TvObj("Firefly", "Sci-Fi", "Tim Minear", "Jane Espenson", "Joss Whedon", "Short", "100", "3"));
        tvs.add(new TvObj("Dollhouse", "Sci-Fi", "Christopher Wade", "Tim Minear", "Joss Whedon", "Medium", "82", "0"));
        tvs.add(new TvObj("Shield", "Action", "Jed Whedon", "Marissa Tanecheon", "Joss Whedon", "Medium", "78", "0"));
        tvs.add(new TvObj("Star Trek", "Sci-Fi", "Tim Minear", "Gene Rodenberry", "Gene Roddenberry", "Medium", "88", "0"));
        tvs.add(new TvObj("Star Trek: The Next Generation", "Sci-Fi", "Seth Roth", "Gene Roddenberry", "Gene Roddenberry", "Long", "98", "1"));
        tvs.add(new TvObj("Star Trek: Deep Space Nine", "Sci-Fi", "Douglas Adams", "Gene Roddenberry", "Patrick Stewart", "Long", "92", "0"));
        tvs.add(new TvObj("Babylon 5", "Sci-Fi", "Mark Millar", "Jane Espenson", "George Moore", "Medium", "95", "1"));


        games = new ArrayList<GameObj>();
        games.add(new GameObj("Super Mario Bros.", "Platformer", "Nintendo", "Short", "95", "NES"));
        games.add(new GameObj("Super Mario Bros. 2", "Platformer", "Nintendo", "Short", "82", "NES"));
        games.add(new GameObj("Super Mario Bros. 3", "Platformer", "Nintendo", "Short", "97", "NES"));
        games.add(new GameObj("Super Mario World", "Platformer", "Nintendo", "Short", "98", "SNES"));
        games.add(new GameObj("Super Mario 64", "Platformer", "Nintendo", "Short", "94", "N64"));
        games.add(new GameObj("Super Mario Sunshine", "Platformer", "Nintendo", "Medium", "88", "GCN"));
        games.add(new GameObj("Super Mario Galaxy", "Platformer", "Nintendo", "Long", "99", "Wii"));
        games.add(new GameObj("Super Mario Galaxy 2", "Platformer", "Nintendo", "Long", "93", "Wii"));
        games.add(new GameObj("The Legend of Zelda", "Action", "Nintendo", "Medium", "87", "NES"));
        games.add(new GameObj("Zelda II: The Adventure of Link", "Action", "Nintendo", "Medium", "72", "NES"));
        games.add(new GameObj("The Legend of Zelda: Link to the Past", "Action", "Nintendo", "Medium", "93", "SNES"));
        games.add(new GameObj("The Legend of Zelda: Ocarina of Time", "Action", "Nintendo", "Medium", "87", "N64"));
        games.add(new GameObj("The Legend of Zelda: The Wind Waker", "Action", "Nintendo", "Long", "93", "GCN"));
    }


    //Performs the general query when the Movie icon is selected.
    public ArrayList queryMovieDatabase() {
        ArrayList Recommendation = new ArrayList();
        int[] scores = new int[movies.size()];
        String GenrePref = " "; //MainActivity.user001.prefs.favGenres[0]; //Retrieve genre preference from the account
        String CreatorPref = " "; //MainActivity.user001.prefs.favCreator[0]; //Retrieve Creator favorites from preferences
        int curRecommends = 0;
        int maxRecommends = 10;
        for (int i = 0; i < movies.size(); i++) {
            if ((movies.get(i)).getGenre().equalsIgnoreCase(GenrePref)) {
                scores[i]++;
            }
            if ((movies.get(i)).getDirector().equalsIgnoreCase(CreatorPref)) {
                scores[i] += 1;
            }
        }

        for (int i = 3;i > 0; i--){
            for (int j = 0; j < movies.size(); j++) {
                if (scores[j] == i) {
                    Recommendation.add(movies.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }
        }

        return (Recommendation);
    }

    //Performs the general query when the TV icon is selected.
    public ArrayList queryTVDatabase() {
        ArrayList Recommendation = new ArrayList();
        int[] scores = new int[tvs.size()];
        String GenrePref = " "; //MainActivity.user001.prefs.favGenres[0];//Retrieve genre preference from the account
        String CreatorPref = " "; //MainActivity.user001.prefs.favCreator[0];//Retrieve Creator favorites from preferences
        int curRecommends = 0;
        int maxRecommends = 10;
        for (int i = 0; i < tvs.size(); i++) {
            if ((tvs.get(i)).getGenre().equalsIgnoreCase(GenrePref)) {
                scores[i]++;
            }
            if ((tvs.get(i)).getDirector().equalsIgnoreCase(CreatorPref)) {
                scores[i] += 1;
            }
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < tvs.size(); j++) {
                if (scores[j] == i) {
                    Recommendation.add(tvs.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }
        }
        return (Recommendation);
    }

    //Performs the general query when the book icon is selected.
    public ArrayList queryBookDatabase() {
        ArrayList Recommendation = new ArrayList();
        int[] scores = new int[books.size()];
        String GenrePref = "Fantasy";//MainActivity.user001.prefs.favGenres[0];//Retrieve genre preference from the account
        String CreatorPref = "Brandon Sanderson"; //MainActivity.user001.prefs.favCreator[0];//Retrieve Creator favorites from preferences
        int curRecommends = 0;
        int maxRecommends = 10;
        for (int i = 0; i < books.size(); i++) {
            if ((books.get(i)).getGenre().equalsIgnoreCase(GenrePref)) {
                scores[i]++;
            }
            if ((books.get(i)).getAuthor().equalsIgnoreCase(CreatorPref)) {
                scores[i] += 1;
            }
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < books.size(); j++) {
                if (scores[j] == i) {
                    Recommendation.add(books.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }
        }
        return (Recommendation);
    }


    //Performs the general query when the Game Icon is selected.
    public ArrayList queryGameDatabase() {
        ArrayList Recommendation = new ArrayList();
        int[] scores = new int[games.size()];
        String GenrePref = " "; //MainActivity.user001.prefs.favGenres[0];//Retrieve genre preference from the account
        String CreatorPref = " "; //MainActivity.user001.prefs.favCreator[0];//Retrieve Creator favorites from preferences
        int curRecommends = 0;
        int maxRecommends = 10;
        for (int i = 0; i < games.size(); i++) {
            if ((games.get(i)).getGenre().equalsIgnoreCase(GenrePref)) {
                scores[i] += 2;
            }
            if ((games.get(i)).getDeveloper().equalsIgnoreCase(CreatorPref)) {
                scores[i] += 1;
            }
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < games.size(); j++) {
                if (scores[j] == i) {
                    Recommendation.add(games.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }
        }
        return (Recommendation);
    }


    //Passes in the string that is taken from the search bar
    /*public ArrayList searchDatabase(String searchterm) {
        ArrayList searchReturn = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            for (int j = 0; j < 8; j++) {
                if (movies.get(i).get(j).equalsIgnoreCase(Searchterm)) {
                    searchReturn.add(movies.get(i));
                }
            }
        }
        for (int i = 0; i < tvs.size(); i++) {
            for (int j = 0; j < 8; j++) {
                if (tvs.get(i).get(j).equalsIgnoreCase(Searchterm)) {
                    searchReturn.add(movies.get(i));
                }
            }
        }
        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < 4; j++) {
                if (books.get(i).get(j).equalsIgnoreCase(Searchterm)) {
                    searchReturn.add(movies.get(i));
                }
            }
        }
        for (int i = 0; i < games.size(); i++) {
            for (int j = 0; j < 6; j++) {
                if (games.get(i).get(j).equalsIgnoreCase(Searchterm)) {
                    searchReturn.add(movies.get(i));
                }
            }
        }
        return (searchReturn);
    }*/


    public ArrayList queryGeneralDatabase() {
        ArrayList Recommendation = new ArrayList();
        int[] moviescores =new int[movies.size()];
        int[] bookscores = new int[books.size()];
        int[] gamescores = new int[games.size()];
        int[] tvscores = new int[tvs.size()];
        String GenrePref = MainActivity.user001.prefs.favGenres[0]; //Retrieve genre preference from the account
        String CreatorPref = MainActivity.user001.prefs.favCreator[0]; //Retrieve Creator favorites from preferences
        int curRecommends = 0;
        int maxRecommends = 10;

        for (int i = 0; i < movies.size(); i++) {
            moviescores[i] += MainActivity.user001.prefs.movie;
            if (movies.get(i).getGenre().equalsIgnoreCase(GenrePref)) {
                moviescores[i] += 2;
            }
            if (movies.get(i).getDirector().equalsIgnoreCase(CreatorPref)) {
                moviescores[i] += 1;
            }

        }
        for (int i = 0; i < tvs.size(); i++) {
            tvscores[i] += MainActivity.user001.prefs.tv;
            if (tvs.get(i).getGenre().equalsIgnoreCase(GenrePref)) {
                tvscores[i] += 2;
            }
            if (tvs.get(i).getDirector().equalsIgnoreCase(CreatorPref)) {
                tvscores[i] += 1;
            }

        }
        for (int i = 0; i < books.size(); i++) {
            bookscores[i] += MainActivity.user001.prefs.book;
            if (books.get(i).getGenre().equalsIgnoreCase(GenrePref)) {
                bookscores[i] += 2;
            }
            if (books.get(i).getAuthor().equalsIgnoreCase(CreatorPref)) {
                bookscores[i] += 1;
            }

        }
        for (int i = 0; i < games.size(); i++) {
            gamescores[i] += MainActivity.user001.prefs.game;
            if (games.get(i).getGenre().equalsIgnoreCase(GenrePref)) {
                gamescores[i] += 2;
            }
            if (games.get(i).getDeveloper().equalsIgnoreCase(CreatorPref)) {
                gamescores[i] += 1;
            }

        }
        for (int i = 13; i > 0; i--) {
            for (int j = 0; j < games.size(); j++) {
                if (gamescores[j] == i) {
                    Recommendation.add(games.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }

            for (int j = 0; j < books.size(); j++) {
                if (bookscores[j] == i) {
                    Recommendation.add(books.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }

            for (int j = 0; j < tvs.size(); j++) {
                if (tvscores[j] == i) {
                    Recommendation.add(tvs.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }
            for (int j = 0; j < movies.size(); j++) {
                if (moviescores[j] == i) {
                    Recommendation.add(movies.get(j));
                    curRecommends++;
                }
                if (curRecommends >= maxRecommends) {
                    return (Recommendation);
                }
            }
        }
        return (Recommendation);
    }
}

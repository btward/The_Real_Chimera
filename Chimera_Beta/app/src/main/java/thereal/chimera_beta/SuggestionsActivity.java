package thereal.chimera_beta;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

import thereal.chimera_beta.Categories.*;


public class SuggestionsActivity extends ActionBarActivity {

    String[] listItems;
    String[] listItems1;
    ArrayList<BookObj> booksArry;
    ArrayList<GameObj> gamesArry = new ArrayList<GameObj>();
    ArrayList<MovieObj> moviesArry = new ArrayList<MovieObj>();
    ArrayList<TvObj> tvArry = new ArrayList<TvObj>();
    ArrayList<CategoryObj> categoryArry = new ArrayList<CategoryObj>();
    ArrayList<CategoryObj> searchArry = new ArrayList<CategoryObj>();
    ListView suggestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);
        Bundle typeS = getIntent().getExtras();
        final String typeSuggestion = typeS.getString("type");
        setTitle(typeSuggestion + " Suggestions");
        suggestions = (ListView) findViewById(R.id.suggestionsList);

        BookObj book1 = new BookObj("The Hobbit", "Fantasy", "J.R.R. Tolkien", "Short");
        BookObj book2 = new BookObj("The Hobbit", "Fantasy", "J.R.R. Tolkien", "Short");
        BookObj book3 = new BookObj("The Hobbit", "Fantasy", "J.R.R. Tolkien", "Short");
        GameObj game1 = new GameObj("Halo: Combat Evolved", "FPS", "Bungie", "Medium", "90","Xbox");
        MovieObj movie1 = new MovieObj("Django Unchained", "Action", "Quentin Tarantino", "Quentin Tarantino", "Leonardo DiCaprio", "", "86", "1");
        TvObj tv1 = new TvObj("Doctor Who", "Sci-fi", "Russel T. Davies", "Stephen Moffat", "Stephen Moffat", "Long", "91", "1");

        final BookObj[] books = {book1, book2, book3};
        final GameObj[] games = {game1};
        final MovieObj[] movies = {movie1};
        final TvObj[] shows = {tv1};
        booksArry = new ArrayList<BookObj>();
        booksArry.add(book1);
        booksArry.add(book2);
        booksArry.add(book3);
        gamesArry.add(game1);
        moviesArry.add(movie1);
        tvArry.add(tv1);
        categoryArry.add(new CategoryObj("Star Wars: Episode V - Revenge of the Sith", "movie"));

        final ArrayList<CategoryObj> cats = new ArrayList<CategoryObj>();
        cats.add(new CategoryObj("Star Wars: Episode V - Revenge of the Sith", "movie"));
        final ArrayList<CategoryObj> twd = new ArrayList<CategoryObj>();
        twd.add(new  CategoryObj("The Walking Dead (Comics)", "book"));

        String[] bookTitles = {"The Hobbit", "It", "The Eye of the World", "The Great Hunt"};
        String[] gameTitles = {"Halo: Combat Evolved", "Bloodborne"};
        String[] movieTitles = {"Django Unchained"};
        String[] tvTitles = {"Doctor Who"};
        final String[] anyTitles = {"Star Wars: Episode V - Revenge of the Sith"};
        final String[] twdTitles = {"The Walking Dead (Comics)"};

        ArrayAdapter<String> adapter = null;
        switch(typeSuggestion){
            case "Book":
                listItems = bookTitles;
                listItems1 = new String[booksArry.size()];
                int i = 0;
                for(BookObj item : booksArry){
                    listItems1[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems1);
                break;

            case "Movie":
                //listItems = movieTitles;
                /*for(MovieObj item : moviesArry){
                    listItems1.add(item.getName());}*/
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;

            case "Game":
                //listItems = gameTitles;
                /*for(GameObj item : gamesArry){
                    listItems1.add(item.getName());}*/
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;

            case "TV":
                //listItems = tvTitles;
                /*for(TvObj item : tvArry){
                    listItems1.add(item.getName());}*/
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;
            case "any":
                //listItems = tvTitles;
                /*for(CategoryObj item : categoryArry){
                    listItems1.add(item.getName());}*/
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;
            case "search":
                //listItems = tvTitles;
                ArrayList<CategoryObj> searchyArry = new ArrayList<CategoryObj>();
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;
        }
        /*
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tvTitles);*/
        if(adapter != null){
            suggestions.setAdapter(adapter);
        }

        suggestions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent newView = new Intent(getApplicationContext(), TitleViewActivity.class);
                switch (typeSuggestion) {
                    case "Book":
                        newView.putExtra("obj", booksArry.toArray()[position].toString());
                        break;
                    case "Movie":
                        newView.putExtra("obj", moviesArry.toArray()[position].toString());
                        break;
                    case "Game":
                        newView.putExtra("obj", gamesArry.toArray()[position].toString());
                        break;
                    case "TV":
                        newView.putExtra("obj", tvArry.toArray()[position].toString());
                        break;
                    case "any":
                        newView.putExtra("obj", categoryArry.toArray()[position].toString());
                        break;
                    case "search":
                        newView.putExtra("obj", searchArry.toArray()[position].toString());
                        break;
                }
                newView.putExtra("title", listItems[position]);
                newView.putExtra("type", typeSuggestion);
                startActivity(newView);
                /*
                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) suggestions.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();*/

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.suggestions_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

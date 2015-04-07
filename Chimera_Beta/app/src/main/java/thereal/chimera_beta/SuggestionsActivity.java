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
import thereal.chimera_beta.Categories.*;


public class SuggestionsActivity extends ActionBarActivity {

    String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);
        Bundle typeS = getIntent().getExtras();
        final String typeSuggestion = typeS.getString("type");
        setTitle(typeSuggestion + " Suggestions");

        final ListView suggestions = (ListView) findViewById(R.id.suggestionsList);
        BookObj book1 = new BookObj("The Hobbit", "Fantasy", "J.R.R. Tolkien", "Short");
        BookObj book2 = new BookObj("It", "Horror", "Stephen King", "Long");
        BookObj book3 = new BookObj("The Great Hunt", "Fantasy", "Robert Jordan", "Long");
        GameObj game1 = new GameObj("Halo: Combat Evolved", "FPS", "Bungie", "Medium", "90","Xbox");
        GameObj game2 = new GameObj("Bloodborne", "RPG", "From Software", "Medium", "93", "PS4");
        MovieObj movie1 = new MovieObj("Interstellar", "Sci-fi", "Christopher Nolan", "Christopher Nolan", "Emma Thomas", "Matthe McConoughey", "72", "0");
        MovieObj movie2 = new MovieObj("The Shining", "Horror", "Stanley Kubrick", "Diane Johnson", "Stanley Kubrick", "Jack Nicholson", "92", "0");
        MovieObj movie3 = new MovieObj("The Dark Knight", "Superhero", "Christopher Nolan", "Jonathon Nolan", "Emma Thomas", "Christian Bale", "94", "2");
        TvObj tv1 = new TvObj("Doctor Who", "Sci-fi", "Russel T. Davies", "Stephen Moffat", "Stephen Moffat", "Long", "91", "1");
        TvObj tv2 = new TvObj("Buffy the Vampire Slayer", "Fantasy", "Joss Whedon", "Jane Espenson", "Joss Whedon", "Long", "100", "0");
        final BookObj[] books = {book1, book2, book3};
        final GameObj[] games = {game1, game2};
        final MovieObj[] movies = {movie1, movie2, movie3};
        final TvObj[] shows = {tv1, tv2};

        String[] bookTitles = {"The Hobbit", "It", "The Eye of the World", "The Great Hunt"};
        String[] gameTitles = {"Halo: Combat Evolved", "Bloodborne"};
        String[] movieTitles = {"Interstellar", "The Shining", "The Dark Knight"};
        String[] tvTitles = {"Doctor Who", "Buffy the Vampire Slayer"};
        ArrayAdapter<String> adapter = null;
        switch(typeSuggestion){
            case "Book":
                listItems = bookTitles;
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, bookTitles);
                break;
            case "Movie":
                listItems = movieTitles;
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, movieTitles);
                break;
            case "Game":
                listItems = gameTitles;
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, gameTitles);
                break;
            case "TV":
                listItems = tvTitles;
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, tvTitles);
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
                        newView.putExtra("obj", books[position].toString());
                        break;
                    case "Movie":
                        newView.putExtra("obj", movies[position].toString());
                        break;
                    case "Game":
                        newView.putExtra("obj", games[position].toString());
                        break;
                    case "TV":
                        newView.putExtra("obj", shows[position].toString());
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

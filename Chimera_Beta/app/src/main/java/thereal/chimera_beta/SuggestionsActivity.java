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

    static String[] listItems;
    String[] listItems1;
    ArrayList<BookObj> booksArry;
    ArrayList<GameObj> gamesArry;
    ArrayList<MovieObj> moviesArry;
    ArrayList<TvObj> tvArry;
    ArrayList<CategoryObj> categoryArry;
    ArrayList<CategoryObj> searchArry;
    ListView suggestions;
    ChimeraDatabase theDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);
        Bundle typeS = getIntent().getExtras();
        final String typeSuggestion = typeS.getString("type");
        setTitle(typeSuggestion + " Suggestions");
        suggestions = (ListView) findViewById(R.id.suggestionsList);
        theDB = new ChimeraDatabase();

        booksArry = new ArrayList<BookObj>();
        gamesArry = new ArrayList<GameObj>();
        moviesArry = new ArrayList<MovieObj>();
        tvArry = new ArrayList<TvObj>();
        categoryArry = new ArrayList<CategoryObj>();
        searchArry = new ArrayList<CategoryObj>();

        ArrayList arryList;
        int i;
        ArrayAdapter<String> adapter = null;
        switch(typeSuggestion){
            case "Book":
                //listItems = bookTitles;
                arryList = theDB.queryBookDatabase();
                listItems = new String[arryList.size()];
                booksArry = arryList;
                i = 0;
                for(CategoryObj item : booksArry){
                    listItems[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;

            case "Movie":
                //listItems = movieTitles;
                arryList = theDB.queryMovieDatabase();
                listItems = new String[arryList.size()];
                moviesArry = arryList;
                i = 0;
                for(CategoryObj item : moviesArry){
                    listItems[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;

            case "Game":
                //listItems = gameTitles;
                arryList = theDB.queryGameDatabase();
                listItems = new String[arryList.size()];
                gamesArry = arryList;
                i = 0;
                for(CategoryObj item : gamesArry){
                    listItems[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;

            case "TV":
                //listItems = tvTitles;
                arryList = theDB.queryTVDatabase();
                listItems = new String[arryList.size()];
                tvArry = arryList;
                i = 0;
                for(CategoryObj item : tvArry){
                    listItems[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;
            case "any":
                //listItems = tvTitles;
                arryList = theDB.queryGeneralDatabase();
                listItems = new String[arryList.size()];
                categoryArry = arryList;
                i = 0;
                for(CategoryObj item : categoryArry){
                    listItems[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;
            case "search":
                //listItems = tvTitles;
                arryList = theDB.queryGeneralDatabase();
                listItems = new String[arryList.size()];
                searchArry = arryList;
                i = 0;
                for(CategoryObj item : searchArry){
                    listItems[i]=item.getName();
                    i++;}
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, listItems);
                break;
        }

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

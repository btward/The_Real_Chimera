package thereal.chimera_beta.Accounts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

import thereal.chimera_beta.HomeActivity;
import thereal.chimera_beta.MainActivity;
import thereal.chimera_beta.R;

public class AccountSetup2 extends ActionBarActivity {

    String[] genreItems = {"Action", "Fantasy", "Comedy", "Sci-Fi", "War", "Drama", "Western",
    "Mystery", "Romance", "Horror", "Superhero", "FPS", "Puzzle"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_setup2);
        final TextView signUpTxt = (TextView) findViewById(R.id.doneBttn);
        final EditText creatorTxt = (EditText) findViewById(R.id.top1Box);
        final EditText movieTxt = (EditText) findViewById(R.id.top2Box);
        final Spinner genreDropdown = (Spinner) findViewById(R.id.categorySpinner);
        ArrayAdapter<String> adapterDD = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genreItems);
        genreDropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.user001.prefs.favGenres[0] = genreItems[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                MainActivity.user001.prefs.favGenres[0] = " ";
            }
        });
        genreDropdown.setAdapter(adapterDD);
        signUpTxt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_account_setup2, menu);
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

package thereal.chimera_beta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import thereal.chimera_beta.Accounts.AccountSetup1;


public class HomeActivity extends ActionBarActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        final Button bookBttn = (Button) findViewById(R.id.bookButton);
        bookBttn.setOnClickListener(this);
        final Button gameBttn = (Button) findViewById(R.id.gameButton);
        gameBttn.setOnClickListener(this);
        final Button tvBttn = (Button) findViewById(R.id.tvButton);
        tvBttn.setOnClickListener(this);
        final Button movieBttn = (Button) findViewById(R.id.movieButton);
        movieBttn.setOnClickListener(this);
        final Button whateverBttn = (Button) findViewById(R.id.whateverButton);
        whateverBttn.setOnClickListener(this);
        final Button searchBttn = (Button) findViewById(R.id.searchButton);
        searchBttn.setOnClickListener(this);
        final Button settingsBttn = (Button) findViewById(R.id.settingsButton);
        settingsBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AccountSetup1.class));
            }
        });

        /*final TextView welcomeTxt = (TextView) findViewById(R.id.helloTxtView);
        welcomeTxt.setText("Hello "+MainActivity.user001.getUserName() + "\n"
                + "Genre rating is: " + String.valueOf(MainActivity.user001.prefs.genre));*/

    }

    public void onClick(View v){
        Button button = (Button) v;
        CharSequence bttnDscrp = button.getContentDescription();
        if((String)bttnDscrp == "Settings")
            startActivity(new Intent(getApplicationContext(), AccountSetup1.class));
        else if((String)bttnDscrp != "Settings"){
            Intent typeItem = new Intent(getApplicationContext(), SuggestionsActivity.class);
            typeItem.putExtra("type", bttnDscrp);
            startActivity(typeItem);}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_main, menu);
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

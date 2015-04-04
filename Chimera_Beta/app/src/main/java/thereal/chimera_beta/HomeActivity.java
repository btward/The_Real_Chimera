package thereal.chimera_beta;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends ActionBarActivity implements View.OnClickListener {

    public Button bookBttn;
    public Button gameBttn;
    public Button tvBttn;
    public Button movieBttn;
    public Button settingsBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

        bookBttn = (Button) findViewById(R.id.bookButton);
        bookBttn.setOnClickListener(this);

        gameBttn = (Button) findViewById(R.id.gameButton);
        gameBttn.setOnClickListener(this);

        tvBttn = (Button) findViewById(R.id.tvButton);
        tvBttn.setOnClickListener(this);

        movieBttn = (Button) findViewById(R.id.movieButton);
        movieBttn.setOnClickListener(this);

        settingsBttn = (Button) findViewById(R.id.settingsButton);
        settingsBttn.setOnClickListener(this);

    }

    public void onClick(View v){
        Button button = (Button) v;
        CharSequence bttnDscrp = button.getContentDescription();
        if(((String)bttnDscrp).equalsIgnoreCase("Settings"))
            startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
        else if(!((String) bttnDscrp).equalsIgnoreCase("Settings")){
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

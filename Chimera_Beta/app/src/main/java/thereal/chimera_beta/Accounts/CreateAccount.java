package thereal.chimera_beta.Accounts;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import thereal.chimera_beta.MainActivity;
import thereal.chimera_beta.R;
import thereal.chimera_beta.SuggestionsActivity;


public class CreateAccount extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        final TextView enterContinueB = (TextView) findViewById(R.id.enterContinueBttn);
        final EditText userN = (EditText) findViewById(R.id.userName);
        final EditText userP = (EditText) findViewById(R.id.userPassword);
        final EditText userE = (EditText) findViewById(R.id.userEmail);
        //MainActivity.user001.name = userN.getText().toString();
        enterContinueB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), AccountSetup1.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_account, menu);
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

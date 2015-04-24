package thereal.chimera_beta.Accounts;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.zip.Inflater;

import thereal.chimera_beta.MainActivity;
import thereal.chimera_beta.R;
import thereal.chimera_beta.SuggestionsActivity;


public class CreateAccount extends ActionBarActivity {

    String myName;
    TextView userN, userP, userE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        final Button enterContinueB = (Button) findViewById(R.id.enterContinueBttn);
        userN = (TextView) this.findViewById(R.id.userName);
        /*userN.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                MainActivity.user001.name = v.getText().toString();
                return false;
            }
        });*/
        userP = (EditText) findViewById(R.id.userPassword);
        /*userP.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                MainActivity.user001.password = v.getText().toString();
                return false;
            }
        });*/
        userE = (EditText) findViewById(R.id.userEmail);
        /*userE.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                MainActivity.user001.email = v.getText().toString();
                return false;
            }
        });*/
        enterContinueB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //myName = userN.getText().toString();
                startActivity(new Intent(getApplicationContext(), AccountSetup1.class));
            }
        });
        /*MainActivity.user001 = new Account(userN.getText().toString(), userP.getText().toString(),
                userE.getText().toString());*/
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

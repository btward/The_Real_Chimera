package thereal.chimera_beta;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import static java.lang.Math.*;
import java.text.DecimalFormat;
import java.util.*;
import thereal.chimera_beta.Categories.*;

import java.sql.*;


//import com.mysql.*;


public class TitleViewActivity extends ActionBarActivity {
    public TextView summaryTxt;
    public TextView nameTxt;
    public ImageView iconImg;
    public RatingBar rating;
    public Button similarBttn;
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    public String info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_view);
        summaryTxt = (TextView) findViewById(R.id.titleSummary);
        nameTxt = (TextView) findViewById(R.id.titleName);
        iconImg = (ImageView) findViewById(R.id.titleIcon);
        rating = (RatingBar) findViewById(R.id.titleRatingBar);
        similarBttn = (Button) findViewById(R.id.titleSimilar);
        Bundle typeT = getIntent().getExtras();
        final String typeTitle = typeT.getString("type");
        final String itemName = typeT.getString("title");
        final String objectItem = typeT.getString("obj");
        summaryTxt.setText(objectItem);
        nameTxt.setText(itemName);
        setTitle(typeTitle);
        rating.setRating((float) (random() * 5.0));
        /*
        switch(typeTitle){
            case "Book":
                break;
            case "Movie":
                break;
            case "Game":
                break;
            case "TV":
                break;
        }*/
        //connectToAndQueryDatabase();
    }

    public Connection connectToAndQueryDatabase() {
        summaryTxt.setText("connecting to database");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String username = "jstanton";
            String password = "11471394";
            String url = "jdbc:mysql://vrbsky-oracle.cs.ua.edu:3306/chimera";
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM movie");
            if(rs == null)
                summaryTxt.setText("You Failed");

            /*
            rs.next();
            String info = rs.getString("Name");
            summaryTxt.setText(info);
            System.out.println(info);
            Log.d("myTag", info);
            setTitle(info);*/

            while (rs.next()) {
                info = rs.getString("Genre");
                summaryTxt.setText("running while");
                System.out.println(info);
                /*
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());
                System.out.println(rs.next());*/
        }
            rs.close();
            stmt.close();
            con.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return  con;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_title_view, menu);
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

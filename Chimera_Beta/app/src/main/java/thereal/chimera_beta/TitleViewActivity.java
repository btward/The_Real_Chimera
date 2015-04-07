package thereal.chimera_beta;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;



import java.sql.*;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/

//import com.mysql.*;
import java.util.jar.Attributes;

/*
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/


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
        summaryTxt.setText("blah blah blah");
        try {
            connectToAndQueryDatabase();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void connectToAndQueryDatabase() throws IllegalAccessException, InstantiationException,
            ClassNotFoundException, SQLException{
        summaryTxt.setText("connecting to database");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String username = "jstanton";
            String password = "11471394";
            String url = "jdbc:mysql://vrbsky-oracle.cs.ua.edu:3306/chimera";
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM movie");
            /*
            rs.next();
            String info = rs.getString("Name");
            summaryTxt.setText(info);
            System.out.println(info);
            Log.d("myTag", info);
            setTitle(info);*/

            while (rs.next()) {
                info = rs.getString(1);
                summaryTxt.setText(info);
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
            if(info == null)
                summaryTxt.setText("You Failed");
        }
        catch (Exception e){
            e.printStackTrace();
        }
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

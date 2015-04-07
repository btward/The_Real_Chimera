package thereal.chimera_beta;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.mysql.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.*;
import java.sql.*;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_view);
        summaryTxt = (TextView) findViewById(R.id.titleSummary);
        try {
            connectToAndQueryDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void connectToAndQueryDatabase() throws SQLException {
        String username = "jstanton";
        String password = "11471394";
        Connection con = DriverManager.getConnection(
                "jdbc:chimera://vrbsky-oracle.cs.ua.edu:3306/",
                username,
                password);

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Movie WHERE Director = Stanley Kubrick");

        while (rs.next()) {
            String info = rs.toString();
            summaryTxt.setText(info);
            System.out.println(info);
            Log.d("myTag", info);
            setTitle(info);
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

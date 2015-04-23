package thereal.chimera_beta.Accounts;

import android.preference.Preference;

import java.util.prefs.Preferences;

public class Account {

    public String name, password, email;
    public Pref prefs;

    public Account(){}

    public Account(String user, String pass){
        name = user;
        password = pass;
    }

    public Account(String user, String pass, String mail){
        name = user;
        password = pass;
        email = mail;
    }

    public void setPrefs(){
        //TBI
    }

    public String getUserName(){
        return name;
    }

    public void setUp(String user, String pass, String mail){
        name = user;
        password = pass;
        email = mail;
    }

}

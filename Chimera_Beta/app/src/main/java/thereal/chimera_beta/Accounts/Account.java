package thereal.chimera_beta.Accounts;

import android.preference.Preference;

import java.util.prefs.Preferences;

public class Account {

    private String userName, password, email;
    public Pref prefs;

    public Account(){}

    public Account(String user, String pass){
        userName = user;
        password = pass;
    }

    public Account(String user, String pass, String mail){
        userName = user;
        password = pass;
        email = mail;
    }

    public void setPrefs(){
        //TBI
    }

    public String getUserName(){
        return userName;
    }

}

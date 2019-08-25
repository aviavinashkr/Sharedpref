package avinash.kumar.sharedpref.Preferences;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.prefs.Preferences;

public class UtilPref  {
    SharedPreferences preferences;
    private String FILE_NAME="FilePref";
    SharedPreferences.Editor editor;
    public UtilPref(Context context) {
        preferences = context.getSharedPreferences(FILE_NAME, context.MODE_PRIVATE);
        editor = preferences.edit();
    }
    public void saveToPrefs(String key,String value){
        editor.putString(key,value);
        editor.commit();
    }

    public String getFromPrefs(String key, String defaultVal){
        return preferences.getString(key,defaultVal);
    }

    public void saveToPrefs(String key,int value){
        editor.putInt(key,value);
        editor.commit();
    }

    public Integer getFromPrefs(String key, int defaultVal){
        return preferences.getInt(key,defaultVal);
    }


}



package avinash.kumar.sharedpref;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import avinash.kumar.sharedpref.Preferences.UtilPref;

public class MainActivity extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new Fragment1());
        loadFragment(new Fragment2());
    }
        public void loadFragment(Fragment fragmentToLoad) {
            FragmentManager manager = getSupportFragmentManager();
            Fragment currentFragment = manager.findFragmentById(R.id.f1);
            FragmentTransaction transaction = manager.beginTransaction();
            if (currentFragment == null) {
                transaction.add(R.id.f1, fragmentToLoad);
                transaction.commit();
            }
            else {
                FragmentTransaction replace;
                replace = transaction.replace(R.id.f1, fragmentToLoad);
                transaction.commit();            }

        }


    }

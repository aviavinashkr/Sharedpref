package avinash.kumar.sharedpref;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import avinash.kumar.sharedpref.Preferences.UtilPref;


public class Fragment1 extends Fragment implements View.OnClickListener {
    private EditText metEmail;
    private EditText metPassword;
    private EditText metConfirmPassword;
    private EditText metAddress;
    private EditText metFirstName;
    private EditText metLastName;
    private EditText metAge;

    private Object view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layoutview = View.inflate(getActivity(), R.layout.fragment_fragment1, null);
        layoutview.findViewById(R.id.save).setOnClickListener(this);
        loadFragment(new Fragment2());
        metEmail = layoutview.findViewById(R.id.email1);
        metPassword = layoutview.findViewById(R.id.pass1);
        metConfirmPassword = layoutview.findViewById(R.id.comfirm_pass1);
        metAddress = layoutview.findViewById(R.id.address1);
        metFirstName = layoutview.findViewById(R.id.first_name1);
        metLastName = layoutview.findViewById(R.id.last_name1);
        metAge = layoutview.findViewById(R.id.age1);
        return layoutview;

    }

    public void loadFragment(Fragment fragmentToLoad) {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Fragment currentFragment = manager.findFragmentById(R.id.f1);
        FragmentTransaction transaction = manager.beginTransaction();
        if (currentFragment == null) {
            transaction.add(R.id.f2, fragmentToLoad);
        } else {
            FragmentTransaction replace;
            replace = transaction.replace(R.id.f2, fragmentToLoad);
        }
        transaction.commit();
    }

    @Override
    public void onClick(View view) {
        UtilPref preference = new UtilPref(getContext().getApplicationContext());
        Toast.makeText(getActivity(),"Successfuly Saved",Toast.LENGTH_SHORT).show();
        String email = metEmail.getText().toString();
        String password = metPassword.getText().toString();
        String confirmPassword = metConfirmPassword.getText().toString();
        String address = metAddress.getText().toString();
        String firstName = metFirstName.getText().toString();
        String lastName = metLastName.getText().toString();
        String age = metAge.getText().toString();
        preference.saveToPrefs("Email",email);
        preference.saveToPrefs("Password",password);
        preference.saveToPrefs("Confirm Password",confirmPassword);
        preference.saveToPrefs("Address",address);
        preference.saveToPrefs("First Name",firstName);
        preference.saveToPrefs("Last Name",lastName);
        preference.saveToPrefs("Age",age);
        ((MainActivity) getActivity()).loadFragment(new Fragment2());

    }

    public void onStartButtonClicked(View v) {

    }
}


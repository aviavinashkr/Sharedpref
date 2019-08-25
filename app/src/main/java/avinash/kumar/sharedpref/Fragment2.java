package avinash.kumar.sharedpref;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import avinash.kumar.sharedpref.Preferences.UtilPref;


public class Fragment2 extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(),R.layout.fragment_fragment2,null);
        view.findViewById(R.id.frag2).setOnClickListener(this);
        UtilPref preference = new UtilPref(getActivity());
        TextView mtvEmail=view.findViewById(R.id.email2);
        // Inflate the layout for this fragment
        String email = preference.getFromPrefs("Email",null);
        mtvEmail.setText(email);
        TextView mtvPassword=view.findViewById(R.id.pass2);
        String password = preference.getFromPrefs("Password",null);
        mtvPassword.setText(password);
        TextView mtvConfirmPassword=view.findViewById(R.id.comfirm_pass2);
        String confirmpassword = preference.getFromPrefs("Confirmm Password",null);
        mtvConfirmPassword.setText(confirmpassword);
        TextView mtvAddress=view.findViewById(R.id.address2);
        String address = preference.getFromPrefs("Address",null);
        mtvAddress.setText(address);
        TextView mtvFirstName=view.findViewById(R.id.first_name2);
        String firstname = preference.getFromPrefs("First Name",null);
        mtvFirstName.setText(firstname);
        TextView mtvLastName=view.findViewById(R.id.last_name2);
        String lastname = preference.getFromPrefs("Last Name",null);
        mtvLastName.setText(lastname);
        TextView mtvAge=view.findViewById(R.id.age2);
        String age = preference.getFromPrefs("Age",null);
        mtvAge.setText(age);
        return view;
    }




    @Override
    public void onClick(View view) {
        ((MainActivity)getActivity()).loadFragment(new Fragment1());

    }
}


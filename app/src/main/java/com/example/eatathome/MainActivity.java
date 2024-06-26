package com.example.eatathome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.example.eatathome.Administrator.Activities.SignInActivityAppAdmin;
import com.example.eatathome.Client.Activities.SignInActivity;
import com.example.eatathome.Rider.Activities.SignInAsRiderActivity;
import com.example.eatathome.Server.Activities.SignInAdminActivity;
import com.example.eatathome.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/NABILA.TTF");
        activityMainBinding.txtSlogan.setTypeface(typeface);
        activityMainBinding.txtLogo.setTypeface(typeface);

        // set on click listener
        activityMainBinding.btnSignIn.setOnClickListener(this);
        activityMainBinding.btnSignInRestaurant.setOnClickListener(this);
        activityMainBinding.btnSignInAdmin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == activityMainBinding.btnSignIn) {
            Intent intent = new Intent(this, SignInActivity.class);
            startActivity(intent);

        } else if (view == activityMainBinding.btnSignInRestaurant) {
            Intent intent = new Intent(this, SignInAdminActivity.class);
            startActivity(intent);

        } else if (view == activityMainBinding.btnSignInAdmin) {
            Intent intent = new Intent(this, SignInActivityAppAdmin.class);
            startActivity(intent);
        }

    }


}
package com.rybarstudios.weightliftingjournal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
    }

    public void login(View view) {
        //TODO: validate user credentials match.

        Intent intent = new Intent(context, UserHomePage.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent(context, RegisterNewUser.class);
        startActivity(intent);
    }
}

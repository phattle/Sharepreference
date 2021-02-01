package com.example.sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    SharedPreferences mSharedPreferences ;
    SharedPreferences.Editor mEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSharedPreferences = getSharedPreferences("AppCache",MODE_PRIVATE);
        String username = mSharedPreferences.getString("username","");
        String password = mSharedPreferences.getString("password","");

        Toast.makeText(this, username+ " " + password, Toast.LENGTH_SHORT).show();
        
//        mEditor = mSharedPreferences.edit();
//        mEditor.putString("username","android");
//        mEditor.putString("password","123456");
//        mEditor.apply();


    }
}
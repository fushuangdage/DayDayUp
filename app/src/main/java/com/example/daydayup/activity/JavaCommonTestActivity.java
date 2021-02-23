package com.example.daydayup.activity;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.example.daydayup.R;

public class JavaCommonTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_common_test);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = null;
                ViewGroup view2 = (ViewGroup) view1;
                Log.d("fs666", "onClick: ");
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        Uri parse = Uri.parse("");
        Uri.Builder builder = parse.buildUpon().clearQuery();
        String s = builder.toString();
        Log.d("fs666", "onCreate: "+s);


//        int bianliang;
//        if(0<=bianliang && bianliang<6){
//
//            bianliang=bianliang-1;
//
//        }else if(5<bianliang && bianliang<11){
//            bianliang=bianliang+1;
//        }else(10<bianliang && bianliang<16){
//            bianliang=bianliang-1;
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        s.replace()
    }
}


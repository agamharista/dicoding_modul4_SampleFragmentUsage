package com.naga_air.studioteam.samplefragmentusage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().
                    add(R.id.frame_container,
                            new FirstFragment(),
                            FirstFragment.class.getSimpleName()).commit();
        }
    }

}
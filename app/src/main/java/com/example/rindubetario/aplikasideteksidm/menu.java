package com.example.rindubetario.aplikasideteksidm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void mPeriksa(View view){
        Intent intent = new Intent(this, periksa.class);
        startActivity(intent);
    }

    public void refData(View view){
        Intent intent = new Intent(this, referensi.class);
        startActivity(intent);
    }

}

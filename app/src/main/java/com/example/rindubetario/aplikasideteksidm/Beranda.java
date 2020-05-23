package com.example.rindubetario.aplikasideteksidm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }

    public void toMenu(View view){
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
}

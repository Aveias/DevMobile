package com.example.aveias.tp1;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Button annuler_button = findViewById(R.id.annuler);
        if (annuler_button != null) {
            annuler_button.setOnClickListener(annulerLayout);
        }
        Button choisir_button = findViewById(R.id.choisir);
        if (choisir_button != null) {
            choisir_button.setOnClickListener(choisirLayout);
        }

    }

    private View.OnClickListener annulerLayout = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    private View.OnClickListener choisirLayout = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}

package com.example.aveias.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button submit_button = findViewById(R.id.button);
        if (submit_button != null) {
            submit_button.setOnClickListener(changeLayout);
        }
    }

    private View.OnClickListener changeLayout = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentDetail = new Intent (Form.this, ViewActivity.class);
            startActivity(intentDetail);
        }

    };

}

package com.example.ritu.hellow_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("stuff");
        t = (TextView) findViewById(R.id.text_id);
        t.setText(data);

    }

}

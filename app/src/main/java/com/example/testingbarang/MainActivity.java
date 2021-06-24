package com.example.testingbarang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testingbarang.R;

public class MainActivity extends AppCompatActivity {
    Button tambahBtn, lihatBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambahBtn = findViewById(R.id.Btntmbh);
        lihatBtn = findViewById(R.id.btnSelect);

        tambahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.testingbarang.TambahData.class);
                startActivity(intent);
            }
        });
        lihatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(com.example.testingbarang.LihatBarang.getActIntent(MainActivity.this));
            }
        });
    }

}
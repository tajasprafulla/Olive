package com.codebase.olive;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewsActivity extends AppCompatActivity {

    private ConstraintLayout containerLay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        containerLay = findViewById(R.id.container);
        containerLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent projectSearch =  new Intent(NewsActivity.this,NewsDetailActivity.class);
                startActivity(projectSearch);
            }
        });
    }
}

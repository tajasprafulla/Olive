package com.codebase.olive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchStageCountryActivity extends AppCompatActivity {

    private Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_stage_country);

        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent projectSearch =  new Intent(SearchStageCountryActivity.this,ProjectSearchActivity.class);
                startActivity(projectSearch);

            }
        });
    }
}

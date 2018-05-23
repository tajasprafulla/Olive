package com.codebase.olive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjectSearchActivity extends AppCompatActivity {

    private GridView gridView;
    private Button btnNext;

    ArrayList<String> projectTypes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_search);

        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ProjectImageAdapter());

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent projectSearch =  new Intent(ProjectSearchActivity.this,DashBoardActivity.class);
                startActivity(projectSearch);
            }
        });

    }

    public class ProjectImageAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return 15;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                final LayoutInflater layoutInflater = LayoutInflater.from(ProjectSearchActivity.this);
                convertView = layoutInflater.inflate(R.layout.item_project_search, null);
            }

            // 3
            final ImageView ivProjectImage = (ImageView)convertView.findViewById(R.id.ivProjectImage);
            final TextView tvProjectName = (TextView)convertView.findViewById(R.id.tvProjectName);

            // 4
            //setting the value froom API
            return convertView;
        }
    }

}

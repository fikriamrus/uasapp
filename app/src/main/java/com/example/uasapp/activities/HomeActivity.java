package com.example.uasapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.uasapp.R;
import com.example.uasapp.utils.BaseActivity;

public class HomeActivity extends BaseActivity {
    private Button profileButton;
    private Button masterButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupViews();
    }

    @Override
    protected void setupViews() {
        profileButton = findViewById(R.id.profileButton);
        masterButton = findViewById(R.id.masterButton);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        masterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this, MasterActivity.class);
                startActivity(intent);
            }


        });


    }
}

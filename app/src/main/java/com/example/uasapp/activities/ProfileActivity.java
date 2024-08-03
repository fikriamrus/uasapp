package com.example.uasapp.activities;

import android.os.Bundle;
import android.widget.TextView;
import com.example.uasapp.R;
import com.example.uasapp.models.User;
import com.example.uasapp.utils.BaseActivity;

public class ProfileActivity extends BaseActivity {
    private TextView nameTextView;
    private TextView phoneTextView;
    private TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupViews();
    }

    @Override
    protected void setupViews() {
        nameTextView = findViewById(R.id.nameTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);

        // Example user
        User user = new User("Fikri Amrullah S.", "085210312350", "fikriamru@gorigori.com");

        nameTextView.setText(user.getName());
        phoneTextView.setText(user.getPhone());
        emailTextView.setText(user.getEmail());
    }
}

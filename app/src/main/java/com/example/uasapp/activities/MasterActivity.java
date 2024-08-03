package com.example.uasapp.activities;

import android.os.Bundle;
import android.widget.TextView;

import com.example.uasapp.R;
import com.example.uasapp.models.User;
import com.example.uasapp.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MasterActivity extends BaseActivity {

    private TextView masterInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        setupViews();
    }

    @Override
    protected void setupViews() {
        masterInfo = findViewById(R.id.masterInfo);

        List<User> userList = getUsers();
        StringBuilder info = new StringBuilder();

        for (User user : userList) {
            info.append("Name: ").append(user.getName()).append("\n")
                    .append("Email: ").append(user.getEmail()).append("\n")
                    .append("Phone: ").append(user.getPhone()).append("\n\n");
        }

        masterInfo.setText(info.toString());
    }

    private List<User> getUsers() {
        // Return a list of dummy users for demonstration
        List<User> users = new ArrayList<>();
        users.add(new User("Fikri", "085210312350", "fikrifikri@gorigori.com"));
        users.add(new User("Amrullah Salam", "085532131235", "amrullahamruf@gorigori.com"));
        users.add(new User("Univ. Siber Asia", "02132525252", "unsia@univsia.com"));
        return users;
    }
}

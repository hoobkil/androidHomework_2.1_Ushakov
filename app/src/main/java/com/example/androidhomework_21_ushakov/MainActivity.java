package com.example.androidhomework_21_ushakov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button subscribeButton;
    private Button clearButton;
    private TextView alertMessage;
    private EditText username;
    private EditText email;
    private String successMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        subscribeButton = findViewById(R.id.subscribeButton);
        clearButton = findViewById(R.id.clearFieldsButton);
        username = findViewById(R.id.enterUsername);
        email = findViewById(R.id.enterEmail);
        alertMessage = findViewById(R.id.alertMessage);
        subscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUserName = username.getText().toString();
                String inputEmail = email.getText().toString();
                successMessage = getString(R.string.successMessage, inputUserName, inputEmail);
                alertMessage.setText(successMessage);
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.getText().clear();
                email.getText().clear();
                alertMessage.setText("");
            }
        });

    }
}

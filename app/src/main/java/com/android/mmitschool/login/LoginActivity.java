package com.android.mmitschool.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.mmitschool.MainActivity;
import com.android.mmitschool.R;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;

    com.google.android.material.textfield.TextInputEditText mailTextID, passwordTextID;

    String mail, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Login");

        mailTextID = findViewById(R.id.mailTextID);
        passwordTextID = findViewById(R.id.passwordTextID);
    }

    public void onButtonClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.signInButtonID:
                getLoginText();
                if (loginDataValide()){
                    login();
                }
        }
    }

    private void getLoginText() {
        mail = mailTextID.getText().toString();
        pass = passwordTextID.getText().toString();
    }

    private boolean loginDataValide() {
        if(mail.isEmpty()){
            Toast.makeText(getApplicationContext(), "Empty Email", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(pass.isEmpty()){
            Toast.makeText(getApplicationContext(), "Empty Pass", Toast.LENGTH_SHORT).show();
            return false;
        }


        return true;
    }

    private void login() {
        if (mail.equals("123")&&pass.equals("123")){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
    }
}
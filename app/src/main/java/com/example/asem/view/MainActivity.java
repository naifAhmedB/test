package com.example.asem.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Message;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asem.R;
import com.example.asem.presenter.Login;
import com.example.asem.share.CheckInternet;
import com.example.asem.share.Messages;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    private EditText name, pass;
    private Button loginBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        loginBt = findViewById(R.id.login);

        Login login = new Login(new com.example.asem.model.repo.Login());

       if (login.pLogin(name.getText().toString().trim(), pass.getText().toString()))
       {
           Toast.makeText(this, "true", Toast.LENGTH_LONG).show();
       }
       else
       {
           Toast.makeText(this, "false", Toast.LENGTH_LONG).show();
       }


        /*CheckInternet checkInternet = new CheckInternet();
        //Toast.makeText(this, R.string.asem, Toast.LENGTH_LONG).show();
        Toast.makeText(this, checkInternet.Internet()+"", Toast.LENGTH_LONG).show();
*/


    }


}

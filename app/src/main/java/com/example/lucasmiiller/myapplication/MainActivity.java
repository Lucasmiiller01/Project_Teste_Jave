package com.example.lucasmiiller.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    public EditText fieldPass;
    public EditText fieldPass2;
    public TextView messageText;
    public Button buttonRegistro;
    public EditText fieldLogin;
    public Button buttonLogin;
    public Button buttonSign;
    public String login = "aipim";
    public String pass = "frito";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button) findViewById(R.id.button3);
        buttonRegistro = (Button) findViewById(R.id.button);
        buttonSign = (Button) findViewById(R.id.button2);
        fieldLogin = (EditText)findViewById(R.id.editText);
        fieldPass = (EditText)findViewById(R.id.editText2);
        fieldPass2 = (EditText)findViewById(R.id.editText3);
        messageText = (TextView) findViewById(R.id.textView2);
    }


    public  void checkPass(View view){

        if(fieldPass.getText().toString().equals(pass) && fieldLogin.getText().toString().equals(login)) {
            messageText.setText("Login Sucesso");
            messageText.setTextColor(getResources().getColor(R.color.Verde));
        }
        else {

            messageText.setText("Tente novamente");
            messageText.setTextColor(getResources().getColor(R.color.Red));
        }

    }
    public void registro(View view){
        if(buttonSign.getText().toString() != "Login") {
            fieldPass2.setVisibility(View.VISIBLE);
            fieldPass.setHint("Confirm password ");
            buttonLogin.setVisibility(View.INVISIBLE);
            buttonRegistro.setVisibility(View.VISIBLE);
            buttonSign.setText("Login");
        }
        else {
            fieldPass2.setVisibility(View.INVISIBLE);
            buttonSign.setText("Sign Up");
            fieldPass.setHint("Password");
            buttonLogin.setVisibility(View.VISIBLE);
            buttonRegistro.setVisibility(View.INVISIBLE);
        }
    }
    public void checkRegistro(View view){

       if(fieldPass.getText().toString().equals(fieldPass2.getText().toString())){
           messageText.setText("Registro foi feito com sucesso");
           messageText.setTextColor(getResources().getColor(R.color.Verde));
       }

        else {
           messageText.setText("As senhas não batem");
           messageText.setTextColor(getResources().getColor(R.color.Red));
       }
    }
}

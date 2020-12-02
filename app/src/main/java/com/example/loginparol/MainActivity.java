package com.example.loginparol;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, onClick {
    TextView reaction, reaction2;
    Button button;
    EditText login, parol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button = findViewById(R.id.button);
        this.parol = findViewById(R.id.parol);
        this.login = findViewById(R.id.login);
        this.reaction = findViewById(R.id.reaction);
        this.reaction2 = findViewById(R.id.reaction2);
        button.setOnClickListener(this);
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    public void onClick(View v) {
        String log = login.getText().toString();
        String par = parol.getText().toString();
        int paroll = Integer.parseInt(par);
        String loginn = String.valueOf(log);
        if((loginn.equals("123457@mail.ru"))&&(paroll == 123457)){
            reaction.setText(R.string.right);
            reaction2.setText(R.string.right2);
        }
        if((!loginn.equals("123457@mail.ru"))||(paroll != 123457)){
            reaction.setText(R.string.wrong1);
            reaction2.setText(R.string.wrong);
        }
    }
}
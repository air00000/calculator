package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v){
        EditText NUM1 = (EditText)findViewById(R.id.Num1);
        EditText NUM2 = (EditText)findViewById(R.id.Num2);
        TextView RES = (TextView)findViewById(R.id.Res);

        int NUM11 = Integer.parseInt(NUM1.getText().toString());
        int NUM22 = Integer.parseInt(NUM2.getText().toString());
        int RESC = NUM11 + NUM22;
        RES.setText(Integer.toString(RESC));
    }
}
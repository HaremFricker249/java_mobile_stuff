package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView AnswerLabel11;
    TextView AnswerLabel12;
    TextView AnswerLabel2;
    TextView AnswerLabel3;
    TextView AnswerLabel4;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    EditText edText2;
    EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        define();
    }

    public void define() {
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button3);
        btn3 = findViewById(R.id.button6);
        btn4 = findViewById(R.id.button9);
        AnswerLabel11 = findViewById(R.id.textView7);
        AnswerLabel12 = findViewById(R.id.textView5);
        AnswerLabel2 = findViewById(R.id.editTextTextMultiLine);
        AnswerLabel3 = findViewById(R.id.textView10);
        AnswerLabel4 = findViewById(R.id.textView13);
        edText = findViewById(R.id.editTextTextPersonName2);
        edText2 = findViewById(R.id.editTextNumber);
    }

    //Task#1
    @SuppressLint("SetTextI18n")
    public void Solve(View view)
    {   AnswerLabel11.setText("");
        AnswerLabel12.setText("");
        int temp = 1;
        String n = edText.getText().toString();
        int num = Integer.parseInt(n);
        int x = edText.length();
        String r = "Да";
        if (x >= 4)
        {
            while (num > 0)
            {
                int t = num % 10;
                if (t % 2 == 1)
                {
                    temp *= t;
                }
                num = num / 10;
                if (t % 3 == 0)
                {
                r = "Нет";

                }
            }
            AnswerLabel12.setText(AnswerLabel12.getText() + r);
            AnswerLabel11.setText(AnswerLabel11.getText() + String.valueOf(temp));
        }
    }

    //Task2
    @SuppressLint("SetTextI18n")
    public void Solve2(View view){
        ((TextView) findViewById(R.id.editTextTextMultiLine)).setText("");
        for (int i=100; i < 750; i++) {
            if ((i / 100) * (i % 10) == 12)
            {
                String s = String.valueOf(i);
                ((TextView) findViewById(R.id.editTextTextMultiLine)).setText(s);
                //System.out.println(s);
            }
            }

    }

//Task3
    @SuppressLint("SetTextI18n")
    public void Solve3(View view){
        ((TextView) findViewById(R.id.textView10)).setText("");
        String SumStr = ((EditText) findViewById(R.id.editTextNumber)).getText().toString();
        int Sum = Integer.parseInt(SumStr);
        for (int i=1; i < 200; i++) {
            if ((i / 100) + ((i / 10)%10) + i % 10 == Sum) {
                //System.out.println(i);
                ((TextView) findViewById(R.id.textView10)).setText(((TextView) findViewById(R.id.textView10)).getText() + ", " + String.valueOf(Sum) );
            }
        }
    }

    //Task4
    @SuppressLint("SetTextI18n")
    public void Solve4(View view){
        ((TextView) findViewById(R.id.textView13)).setText("");
        double x,y;
        x = -10 + Math.random() *30;
        y = -10 + Math.random() *30;
        double F=0;
        if(x<0) {
            F=((Math.abs(x + Math.exp(y)))/(Math.sqrt(Math.abs(x)+5)));
        }
        if(x>=0 && x<=3) {
        F=Math.pow((y+Math.cos(x)), 2) + Math.PI;
        }
        if(x>3){
            F=(Math.abs(Math.log(Math.abs(y)) - Math.log(Math.pow(x, 2))))/(Math.sqrt(x));
        }
        ((TextView) findViewById(R.id.textView13)).setText("x:"+Double.toString(x)+"\n"+"y:"+Double.toString(y)+"\n"+"F(x,y):"+Double.toString(F));
    }

    //GoTo
    public void Next(View view)
    {
        setContentView(R.layout.second_layout);
    }

    public void GoToTask1(View view)
    {
        setContentView(R.layout.activity_main);
    }

    public void GoToTask2(View view)
    {
        setContentView(R.layout.second_layout);
    }

    public void GoToTask3(View view)
    {
        setContentView(R.layout.third_layout);
    }

    public void GoToTask4(View view)
    {
        setContentView(R.layout.fourth_layout);
    }
}
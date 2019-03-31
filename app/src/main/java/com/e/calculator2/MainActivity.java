package com.e.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private Button btnAdd,btnSUbtract,btnMultiply,btnDivide;
    private Button btnCalc;
    EditText etResult;

    boolean addBoolean,subBboolean,mulBboolean,divBboolean;
    float value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
    }



    @Override
    public void onClick(View v) {

    }
}

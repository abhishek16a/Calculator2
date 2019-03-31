package com.e.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0, btnDot;
    private Button btnAdd,btnSubtract,btnMultiply,btnDivide;
    private Button btnCalc;
    EditText etResult;

    boolean addBoolean,subBoolean,mulBoolean,divBoolean;
    float value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnDot=findViewById(R.id.btnDot);
        btnAdd=findViewById(R.id.btnAdd);
        btnSubtract=findViewById(R.id.btnSubtract);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnCalc=findViewById(R.id.btnCalc);
        etResult=findViewById(R.id.etResult);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnCalc.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                etResult.setText(etResult.getText().toString() + "1");
                break;
            case R.id.btn2:
                etResult.setText(etResult.getText().toString() + "2");

            case R.id.btn3:
                etResult.setText(etResult.getText().toString() + "3");
                break;
            case R.id.btn4:
                etResult.setText(etResult.getText().toString() + "4");

            case R.id.btn5:
                etResult.setText(etResult.getText().toString() + "5");
                break;
            case R.id.btn6:
                etResult.setText(etResult.getText().toString() + "6");

            case R.id.btn7:
                etResult.setText(etResult.getText().toString() + "7");
                break;
            case R.id.btn8:
                etResult.setText(etResult.getText().toString() + "8");

            case R.id.btn9:
                etResult.setText(etResult.getText().toString() + "9");
                break;
            case R.id.btn0:
                etResult.setText(etResult.getText().toString() + "0");

            case R.id.btnDot:
                if (etResult.getText().toString().equals("")){
                    String value=etResult.getText().toString();
                    if (value.length() > 0){
                        value= value.substring(0,value.length()-1);
                        etResult.setText(value);
                    }
                }

            case R.id.btnAdd:
               if (etResult==null){
                   etResult.setText("");
               }
               else {
                   value1=Float.parseFloat(etResult.getText().toString());
                   addBoolean=true;
                   etResult.setText("");
               }
                break;
            case R.id.btnSubtract:
                if (etResult==null){
                    etResult.setText("");
                }
                else {
                    value1=Float.parseFloat(etResult.getText().toString());
                    subBoolean=true;
                    etResult.setText("");
                }
                break;

            case R.id.btnMultiply:
                if (etResult==null){
                    etResult.setText("");
                }
                else {
                    value1=Float.parseFloat(etResult.getText().toString());
                    mulBoolean=true;
                    etResult.setText("");
                }
                break;
            case R.id.btnDivide:
                if (etResult==null){
                    etResult.setText("");
                }
                else {
                    value1=Float.parseFloat(etResult.getText().toString());
                    divBoolean=true;
                    etResult.setText("");
                }
                break;

            case R.id.btnCalc:
                value2=Float.parseFloat(etResult.getText().toString());
                if (addBoolean){
                    etResult.setText((value1+value2)+"");
                }
                else if (subBoolean){
                    etResult.setText((value1-value2)+ "");
                }
                else if (mulBoolean){
                    etResult.setText((value1*value2)+ "");
                }
                else if (divBoolean){
                    etResult.setText((value1/value2)+"");
                }
                break;


        }

    }
}

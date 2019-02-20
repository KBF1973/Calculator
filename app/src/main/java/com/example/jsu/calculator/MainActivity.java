package com.example.jsu.calculator;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import java.text.DecimalFormat;
import java.lang.Math;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDecimal, btnDivision, btnMultiplication, btnSubtraction, btnAddition,
            btnClear, btnSquare, btnPercent, btnEquals, btnSigned;

    TextView showValue;
    double inputOne;
    double inputTwo;
    double firstInput;
    double secondInput;
    boolean add, sub, mul, div, dec, sin;
    DecimalFormat decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showValue = findViewById(R.id.inputOutput);
        decimal = new DecimalFormat("#.##########");

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnAddition = findViewById(R.id.btnAddition);
        btnClear = findViewById(R.id.btnClear);
        btnSquare = findViewById(R.id.btnSquare);
        btnPercent = findViewById(R.id.btnPercent);
        btnEquals = findViewById(R.id.btnEquals);
        btnSigned = findViewById(R.id.btnSigned);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnAddition.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnSquare.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnSigned.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view){

        switch(view.getId()){

            case R.id.btn0:
                showValue.append(btn0.getText().toString());
                break;

            case R.id.btn1:
                showValue.append(btn1.getText().toString());
                break;

            case R.id.btn2:
                showValue.append(btn2.getText().toString());
                break;

            case R.id.btn3:
                showValue.append(btn3.getText().toString());
                break;

            case R.id.btn4:
                showValue.append(btn4.getText().toString());
                break;

            case R.id.btn5:
                showValue.append(btn5.getText().toString());
                break;

            case R.id.btn6:
                showValue.append(btn6.getText().toString());
                break;

            case R.id.btn7:
                showValue.append(btn7.getText().toString());
                break;

            case R.id.btn8:
                showValue.append(btn8.getText().toString());
                break;

            case R.id.btn9:
                showValue.append(btn9.getText().toString());
                break;

            case R.id.btnDecimal:
                if(dec) {
                    //do nothing - prohibits additional decimals from being entered
                }
                else{
                    showValue.append(btnDecimal.getText().toString());
                    dec = true;
                }
                break;

            case R.id.btnDivision:
                inputOne = Double.parseDouble(showValue.getText().toString());
                firstInput = inputOne;
                div = true;
                dec = false;
                sin = false;
                showValue.setText("");
                break;

            case R.id.btnMultiplication:
                inputOne = Double.parseDouble(showValue.getText().toString());
                firstInput = inputOne;
                mul = true;
                dec = false;
                sin = false;
                showValue.setText("");
                break;

            case R.id.btnSubtraction:
                inputOne = Double.parseDouble(showValue.getText().toString());
                firstInput = inputOne;
                sub = true;
                dec = false;
                sin = false;
                showValue.setText("");
                break;

            case R.id.btnAddition:
                inputOne = Double.parseDouble(showValue.getText().toString());
                firstInput = inputOne;
                add = true;
                dec = false;
                sin = false;
                showValue.setText("");
                break;

            case R.id.btnClear:
                showValue.setText("");
                dec = false;
                sin = false;
                break;

            case R.id.btnSquare:
                inputOne = Math.sqrt(Double.parseDouble(showValue.getText().toString()));
                showValue.setText(decimal.format(inputOne ));
                dec = false;
                sin = false;
                break;

            case R.id.btnPercent:
                inputOne = Double.parseDouble(showValue.getText().toString());
                double temp = inputOne/100;
                showValue.setText(decimal.format(temp));
                dec = false;
                sin = false;
                break;

            case R.id.btnSigned:

                if(sin){

                }
                else {
                    showValue.append("-");
                    sin = true;
                }
                break;

            case R.id.btnEquals:
                inputTwo = Double.parseDouble(showValue.getText().toString());
                secondInput = inputTwo;

                if(add){
                    double addSolution = (firstInput + secondInput);
                    showValue.setText(decimal.format(addSolution));
                    add = false;
                }

                if(sub){
                    double subSolution = (firstInput - secondInput);
                    showValue.setText(decimal.format(subSolution));
                    sub = false;
                }

                if(mul){
                    double mulSolution = (firstInput * secondInput);
                    showValue.setText(decimal.format(mulSolution));
                    mul = false;
                }

                if(div){
                    double divSolution = (firstInput / secondInput);
                    showValue.setText(decimal.format(divSolution));
                    div = false;

                }

                break;

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
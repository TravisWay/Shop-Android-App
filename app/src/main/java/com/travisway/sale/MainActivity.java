package com.travisway.sale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Empty e = new Empty();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button five = (Button) findViewById(R.id.five);
        Button ten = (Button) findViewById(R.id.ten);
        Button fifteen = (Button) findViewById(R.id.fifteen);
        Button twenty = (Button) findViewById(R.id.twenty);
        Button upc = (Button) findViewById(R.id.upc);
        Button clear = (Button) findViewById(R.id.clear);
        Button custom = (Button) findViewById(R.id.cusPer);

        five.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView display = (TextView) findViewById(R.id.display);
                EditText amount = (EditText) findViewById(R.id.inputPercent);
                boolean emp = e.Emp((EditText) amount);
                if(emp){
                    amount.setText("Required");
                }
                else {
                    double number = Double.parseDouble(amount.getText().toString());
                    Percent p = new Percent();
                    display.setText(p.calcPercent(number, .05) + "");
                }
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView display = (TextView) findViewById(R.id.display);
                EditText amount = (EditText) findViewById(R.id.inputPercent);
                boolean emp = e.Emp((EditText) amount);
                if(emp){
                    amount.setText("Required");
                }
                else {
                    double number = Double.parseDouble(amount.getText().toString());
                    Percent p = new Percent();
                    display.setText(p.calcPercent(number, .10) + "");
                }
            }
        });
        fifteen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView display = (TextView) findViewById(R.id.display);
                EditText amount = (EditText) findViewById(R.id.inputPercent);
                    boolean emp = e.Emp((EditText) amount);
                    if(emp){
                        amount.setText("Required");
                    }
                    else {
                        double number = Double.parseDouble(amount.getText().toString());

                        Percent p = new Percent();
                        display.setText(p.calcPercent(number, .15) + "");
                    }
            }
        });
        twenty.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView display = (TextView) findViewById(R.id.display);
                EditText amount = (EditText) findViewById(R.id.inputPercent);
                boolean emp = e.Emp((EditText) amount);
                if(emp){
                    amount.setText("Required");
                }
                else {
                    double number = Double.parseDouble(amount.getText().toString());
                    Percent p = new Percent();
                    display.setText(p.calcPercent(number, .20) + "");
                }
            }
        });
        upc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextView item1 = (TextView) findViewById(R.id.item1);
                TextView item2 = (TextView) findViewById(R.id.item2);
                EditText units1 = (EditText) findViewById(R.id.unitsone);
                EditText units2 = (EditText) findViewById(R.id.units2);
                EditText price1 = (EditText) findViewById(R.id.price1);
                EditText price2 = (EditText) findViewById(R.id.price2);
                Upc u = new Upc();
                String s = "Buy";
                boolean emp = e.Emp((EditText) units1);
                boolean emp1 = e.Emp((EditText) units2);
                boolean emp2 = e.Emp((EditText) price1);
                boolean emp3 = e.Emp((EditText) price2);
                if (emp) {
                    units1.setText("Required");
                }else if (emp1) {
                    units2.setText("Required");
                }else if (emp2) {
                    price1.setText("Required");
                }else if (emp3) {
                    price2.setText("Required");
                }else {
                    double unitsOne = Double.parseDouble(units1.getText().toString());
                    double unitsTwo = Double.parseDouble(units2.getText().toString());
                    double priceOne = Double.parseDouble(price1.getText().toString());
                    double priceTwo = Double.parseDouble(price2.getText().toString());
                    int winner = u.UnitPriceCalculator(priceOne, priceTwo, unitsOne, unitsTwo);
                    if (winner == 0) {
                        item1.setText(s);
                        item2.setText("");
                    } else if (winner == 1) {
                        item2.setText(s);
                        item1.setText("");
                    } else {
                        item1.setText("Draw");
                        item2.setText("Draw");
                    }
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                EditText units1 = (EditText) findViewById(R.id.unitsone);
                EditText units2 = (EditText) findViewById(R.id.units2);
                EditText price1 = (EditText) findViewById(R.id.price1);
                EditText price2 = (EditText) findViewById(R.id.price2);
                TextView display = (TextView) findViewById(R.id.display);
                EditText amount = (EditText) findViewById(R.id.inputPercent);
                TextView item1 = (TextView) findViewById(R.id.item1);
                TextView item2 = (TextView) findViewById(R.id.item2);
                EditText cusPer = (EditText) findViewById(R.id.customPercent);
                item1.setText("");
                item2.setText("");
                units2.setText("");
                units1.setText("");
                price1.setText("");
                price2.setText("");
                amount.setText("");
                display.setText("");
                cusPer.setText("");
            }
        });

        custom.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText cusPer = (EditText) findViewById(R.id.customPercent);
                TextView display = (TextView) findViewById(R.id.display);
                EditText amount = (EditText) findViewById(R.id.inputPercent);
                boolean emp = e.Emp((EditText) amount);
                boolean emp1 = e.Emp((EditText) cusPer);
                if(emp){
                    amount.setText("Required");
                }
                else if(emp1){
                    cusPer.setText("Required");
                }


                else {
                    double number = Double.parseDouble(amount.getText().toString());
                    double per = Double.parseDouble(cusPer.getText().toString());
                per = per/100;
                Percent p = new Percent();
                display.setText(p.calcPercent(number, per) + "");
            }
        }

        });
    }
}

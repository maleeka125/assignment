package com.example.a2ndlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
public String op;
public float calculate;
public  int no1;
public int no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText value1=findViewById(R.id.value1);
        EditText value2=findViewById(R.id.value2);
        EditText value3=findViewById(R.id.result);
        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        Button btn=findViewById(R.id.calbtn);
        ArrayAdapter<String> array=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Arthematic_op));
        array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(array);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if(position==0)
                {

                    op="+";
                }
                else if(position==1)
                {
                    op="-";
                }
                else if(position==2)
                {
                    op="*";
                }
                else if(position==3) {
                    op = "%";
                }

              // if(op=="+")
              // {
                 //  addition add=new addition();
                 //  add.ab(no1,no2);
               //}
               // if(op=="-")
               // {
                //   subtraction sub=new subtraction();
                //   sub.sub(no1,no2);
             //  }
              //  if(op=="*"){
              //  multiplication mul=new multiplication();
              //  mul.mul(no1,no2);
              //  }
              //  if(op=="/"){
              //   division div=new division();
              //   div.div(no1,no2);
              //  }
       }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1=value1.getText().toString();
                float num1=Float.parseFloat(no1);
                String no2=value2.getText().toString();
                float num2=Float.parseFloat(no2);
                if(op=="+")
                {
                    calculate=num1+num2;
                }
                else if(op=="-")
                {
                    calculate=num1-num2;
                }
                else if(op=="*")
                {
                    calculate=num1*num2;
                }
                else if(op=="%")
                {

                    calculate = num1 %num2;
                }
                value3.setText("Result is:"+calculate);
            }
        });


    }
}
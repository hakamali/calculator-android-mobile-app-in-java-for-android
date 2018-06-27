package com.example.hakim.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtfirst,edtsecond;
    Button btnadd,btnsub,btnmul,btndiv;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtfirst=(EditText)findViewById(R.id.edtfirst);
        edtsecond=(EditText)findViewById(R.id.edtsecond);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        tvresult=(TextView) findViewById(R.id.tvresult);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first=Integer.valueOf(edtfirst.getText().toString());
                second=Integer.valueOf(edtsecond.getText().toString());
                result=first+second;
                tvresult.setText("Your result is = "+result);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first=Integer.valueOf(edtfirst.getText().toString());
                second=Integer.valueOf(edtsecond.getText().toString());
                result=first-second;
                tvresult.setText("Your result is = "+result);

            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first=Integer.valueOf(edtfirst.getText().toString());
                second=Integer.valueOf(edtsecond.getText().toString());
                result=first*second;
                tvresult.setText("Your result is = "+result);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first=Integer.valueOf(edtfirst.getText().toString());
                second=Integer.valueOf(edtsecond.getText().toString());
                result=first/second;
                tvresult.setText("Your result is = "+result);

            }
        });






    }
}

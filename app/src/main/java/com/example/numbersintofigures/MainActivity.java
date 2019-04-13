package com.example.numbersintofigures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private EditText etNum;
    private TextView tvRess;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum=findViewById(R.id.etNum);
        tvRess=findViewById(R.id.tvRess);
        btnCalculate=findViewById(R.id.btnConverter);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num;
                num=Integer.parseInt(etNum.getText().toString());
                NumberConverter converter= new NumberConverter(num);
                tvRess.setText(converter.Check());

            }
        });

    }

}



package com.example.demo1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText n1,n2,r;
        Button add,sub,mul,div,mod;
        n1=(EditText) findViewById(R.id.num1);
        n2=(EditText) findViewById(R.id.num2);
        r=(EditText) findViewById(R.id.res);
        add=(Button) findViewById(R.id.but1);
        sub=(Button) findViewById(R.id.but2);
        mul=(Button) findViewById(R.id.but3);
        div=(Button) findViewById(R.id.but4);
        mod=(Button) findViewById(R.id.but5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                double a=Double.parseDouble(n1.getText().toString());
                double b =Double.parseDouble(n2.getText().toString());
                double c=a+b;
                r.setText(Double.toString(c));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(n1.getText().toString());
                double b =Double.parseDouble(n2.getText().toString());
                double c=a-b;
                r.setText(Double.toString(c));

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(n1.getText().toString());
                double b =Double.parseDouble(n2.getText().toString());
                double c=a*b;
                r.setText(Double.toString(c));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(n1.getText().toString());
                double b =Double.parseDouble(n2.getText().toString());
                double c=a/b;
                r.setText(Double.toString(c));

            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a=Double.parseDouble(n1.getText().toString());
                double b =Double.parseDouble(n2.getText().toString());
                double c=a%b;
                r.setText(Double.toString(c));

            }
        });
    }
}

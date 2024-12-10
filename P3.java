package com.example.curconv;

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
        setContentView(R.layout.activity_main);        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText inr, r;
        Button dollar,yen,pound,euro;
        inr=(EditText) findViewById(R.id.inr);
        r=(EditText) findViewById(R.id.res);
        dollar=(Button) findViewById(R.id.but1);
        yen=(Button) findViewById(R.id.but2);
        pound=(Button) findViewById(R.id.but3);
        euro=(Button) findViewById(R.id.but4);
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                double a=Double.parseDouble(inr.getText().toString());
                double c=0.012*a;
                r.setText(Double.toString(c));
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                double a=Double.parseDouble(inr.getText().toString());
                double c=a*1.73;
                r.setText(Double.toString(c));
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                double a=Double.parseDouble(inr.getText().toString());
                double c=a*0.009;
                r.setText(Double.toString(c));
            }
        });
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                double a=Double.parseDouble(inr.getText().toString());
                double c=a*0.011;
                r.setText(Double.toString(c));
            }
        });
    }
}

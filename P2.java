package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

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
        RadioButton radiobutton1=findViewById(R.id.Option1);
        RadioButton radiobutton2=findViewById(R.id.Option2);
        RadioButton radiobutton3=findViewById(R.id.Option3);
        RadioButton radiobutton4=findViewById(R.id.Option4);

        Button button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                String selectedAns = "no Selection";
                if (radiobutton1.isChecked()){
                    selectedAns=radiobutton1.getText().toString();
                } else if (radiobutton2.isChecked()) {
                    selectedAns = radiobutton2.getText().toString();
                } else if (radiobutton3.isChecked()) {
                    selectedAns = radiobutton3.getText().toString();
                } else if (radiobutton4.isChecked()) {
                    selectedAns = radiobutton4.getText().toString();
                }
                if(selectedAns.equals("javascript object notation")){
                    Toast.makeText(MainActivity.this,"Correct Answer", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this,"Wrong Answer", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
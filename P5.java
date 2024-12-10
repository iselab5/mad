package com.example.myapplication;

import static com.example.myapplication.R.*;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public Button btnNextActivity;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnNextActivity = findViewById(R.id.nxtActButton);
        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                startActivity(intent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

// secondActivity.java
// package com.example.myapplication;

// import android.content.Intent;
// import android.net.Uri;
// import android.os.Bundle;
// import android.view.View;
// import android.widget.Button;

// import androidx.activity.EdgeToEdge;
// import androidx.appcompat.app.AppCompatActivity;
// import androidx.core.graphics.Insets;
// import androidx.core.view.ViewCompat;
// import androidx.core.view.WindowInsetsCompat;

// public class secondActivity extends AppCompatActivity {
//     public Button btnOpenWebpage;
//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         EdgeToEdge.enable(this);
//         setContentView(R.layout.second_main);
//         btnOpenWebpage = findViewById(R.id.openHomePageButton);
//         ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//             Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//             return insets;
//         });
//         btnOpenWebpage.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 Uri webpage = Uri.parse("https://www.android.com/");

//                 Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//                 startActivity(intent);
//             }
//         });
//     }
// }
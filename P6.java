package com.example.a6myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private Button btnFragment1, btnFragment2;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnFragment1 = findViewById(R.id.mainFragment1Button);
        btnFragment2 = findViewById(R.id.mainFragment2Button);
        fragmentManager = getSupportFragmentManager();
        btnFragment1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentOne();

                fragmentManager.beginTransaction().replace(R.id.mainFrameLayout1,fragment).commit();
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new FragmentTwo();

                fragmentManager.beginTransaction().replace(R.id.mainFrameLayout1,fragment).commit();
            }
        });

        if(savedInstanceState == null){
            fragmentManager.beginTransaction().replace(R.id.mainFrameLayout1,new FragmentOne()).commit();
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}


// FragmentOne.java
// package com.example.a6myapplication;

// import android.os.Bundle;
// import android.view.LayoutInflater;
// import android.view.View;
// import android.view.ViewGroup;
// import android.widget.Button;
// import android.widget.TextView;
// import android.widget.Toast;

// import androidx.activity.EdgeToEdge;
// import androidx.appcompat.app.AppCompatActivity;
// import androidx.core.graphics.Insets;
// import androidx.core.view.ViewCompat;
// import androidx.core.view.WindowInsetsCompat;
// import androidx.fragment.app.Fragment;
// import androidx.fragment.app.FragmentManager;

// public class FragmentOne extends Fragment {
//     private Button btnFragmentOne;

//     @Override
//     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//         View view = inflater.inflate(R.layout.activity_fragment_one, container, false);

//         TextView textView = view.findViewById(R.id.fragmentOneTextView);
//         textView.setText("Fragment One");

//         btnFragmentOne = view.findViewById(R.id.fragmentOneButton);

//         btnFragmentOne.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 Toast.makeText(getActivity(), "Fragment One", Toast.LENGTH_SHORT).show();
//             }
//         });
//         return view;
//     }
// }


// FragmentTwo.java
// package com.example.a6myapplication;

// import android.os.Bundle;
// import android.view.LayoutInflater;
// import android.view.View;
// import android.view.ViewGroup;
// import android.widget.Button;
// import android.widget.TextView;
// import android.widget.Toast;

// import androidx.activity.EdgeToEdge;
// import androidx.appcompat.app.AppCompatActivity;
// import androidx.core.graphics.Insets;
// import androidx.core.view.ViewCompat;
// import androidx.core.view.WindowInsetsCompat;
// import androidx.fragment.app.Fragment;

// public class FragmentTwo extends Fragment {
//     private Button btnFragmentTwo;

//     @Override
//     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//         View view = inflater.inflate(R.layout.activity_fragment_two,container, false);

//         TextView textView = view.findViewById(R.id.fragmentTwoTextView);
//         textView.setText("Fragment Two");

//         btnFragmentTwo = view.findViewById(R.id.fragmentTwobutton);

//         btnFragmentTwo.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 Toast.makeText(getActivity(), "Fragment Two", Toast.LENGTH_SHORT).show();
//             }
//         });
//         return view;
//     }
// }
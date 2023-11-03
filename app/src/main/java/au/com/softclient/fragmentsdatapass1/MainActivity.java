package au.com.softclient.fragmentsdatapass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import au.com.softclient.fragmentsdatapass1.fragments.FragmentDisplay;
import au.com.softclient.fragmentsdatapass1.fragments.FragmentEditable;



public class MainActivity extends AppCompatActivity {

    private SharedViewModel viewModel;
    private FragmentEditable fragmentEditable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(SharedViewModel.class);



        if (savedInstanceState == null) {
            fragmentEditable = new FragmentEditable();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragmentEditable)
                    .commit();
        }

        findViewById(R.id.btnFragment1).setOnClickListener(v -> {
            if (fragmentEditable == null) {
                fragmentEditable = new FragmentEditable();
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragmentEditable)
                    .commit();
        });

        findViewById(R.id.btnFragment2).setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new FragmentDisplay())
                    .commit();
        });


        //Act-2
        Button buttonNavigate = findViewById(R.id.at2);
        buttonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the target activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Start the target activity
                startActivity(intent);
            }
        });

        //Act-3
        Button buttonNavigate3 = findViewById(R.id.at3);
        buttonNavigate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the target activity
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);

                // Start the target activity
                startActivity(intent);
            }
        });

        //Act-4
        Button buttonNavigate4 = findViewById(R.id.at4);
        buttonNavigate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the target activity
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);

                // Start the target activity
                startActivity(intent);
            }
        });
    }


}

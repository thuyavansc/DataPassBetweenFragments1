package au.com.softclient.fragmentsdatapass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import au.com.softclient.fragmentsdatapass1.fragments2.Activity2F1Fragment;
import au.com.softclient.fragmentsdatapass1.fragments2.Activity2F2Fragment;

public class MainActivity2 extends AppCompatActivity {
    private FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Check if the fragment is not already added to prevent duplications
        if (savedInstanceState == null) {
            Activity2F1Fragment fragment1 = new Activity2F1Fragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragmentContainer3, fragment1)
                    .commit();
        }

        //fragmentContainer = findViewById(R.id.fragmentContainer2);

        Button button1 = findViewById(R.id.A3F1);
        Button button2 = findViewById(R.id.A3F2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the fragment container with Fragment1
                Activity2F1Fragment fragment1 = new Activity2F1Fragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer3, fragment1)
                        .commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace the fragment container with Fragment2
                Activity2F2Fragment fragment2 = new Activity2F2Fragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer3, fragment2)
                        .commit();
            }
        });

        //Act-2
        Button buttonNavigate = findViewById(R.id.A2_button);
        buttonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the target activity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);

                // Start the target activity
                startActivity(intent);
            }
        });
    }

}
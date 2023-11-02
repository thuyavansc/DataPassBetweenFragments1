package au.com.softclient.fragmentsdatapass1;

import androidx.appcompat.app.AppCompatActivity;

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
    }
}

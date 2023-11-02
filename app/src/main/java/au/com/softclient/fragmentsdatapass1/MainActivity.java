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

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

//public class MainActivity extends AppCompatActivity {
//
//    private SharedViewModel viewModel;
//    private FragmentEditable fragmentEditable;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Create an instance of the SharedViewModel
//        viewModel = new ViewModelProvider(this).get(SharedViewModel.class);
//
//        // Set up the initial fragment (if needed)
//        if (savedInstanceState == null) {
//            fragmentEditable = new FragmentEditable();
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentEditable)
//                    .commit();
//        }
//
//        // Button to switch to Fragment 1
//        findViewById(R.id.btnFragment1).setOnClickListener(v -> {
//            if (fragmentEditable == null) {
//                fragmentEditable = new FragmentEditable();
//            }
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentEditable)
//                    .commit();
//        });
//
//        // Button to switch to Fragment 2
//        findViewById(R.id.btnFragment2).setOnClickListener(v -> {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, new FragmentDisplay())
//                    .commit();
//        });
//    }
//}
//


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

//public class MainActivity extends AppCompatActivity {
//
//    private SharedViewModel viewModel;
//    private FragmentEditable fragmentEditable;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Create an instance of the SharedViewModel
//        viewModel = new ViewModelProvider(this).get(SharedViewModel.class);
//
//        // Set up the initial fragment (if needed)
//        if (savedInstanceState == null) {
//            fragmentEditable = new FragmentEditable();
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentEditable)
//                    .commit();
//        }
//
//        // Button to switch to Fragment 1
//        findViewById(R.id.btnFragment1).setOnClickListener(v -> {
//            if (fragmentEditable == null) {
//                fragmentEditable = new FragmentEditable();
//            }
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentEditable)
//                    .commit();
//        });
//
//        // Button to switch to Fragment 2
//        findViewById(R.id.btnFragment2).setOnClickListener(v -> {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, new FragmentDisplay())
//                    .commit();
//        });
//    }
//}


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

//public class MainActivity extends AppCompatActivity {
//
//    private SharedViewModel viewModel;
//    private FragmentEditable fragmentEditable;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Create an instance of the SharedViewModel
//        viewModel = new ViewModelProvider(this).get(SharedViewModel.class);
//
//        // Set up the initial fragment (if needed)
//        if (savedInstanceState == null) {
//            fragmentEditable = new FragmentEditable();
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentEditable)
//                    .commit();
//        }
//
//        // Button to switch to Fragment 1
//        findViewById(R.id.btnFragment1).setOnClickListener(v -> {
//            if (fragmentEditable == null) {
//                fragmentEditable = new FragmentEditable();
//            }
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, fragmentEditable)
//                    .commit();
//        });
//
//        // Button to switch to Fragment 2
//        findViewById(R.id.btnFragment2).setOnClickListener(v -> {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragmentContainer, new FragmentDisplay())
//                    .commit();
//        });
//    }
//}

/*
public class MainActivity extends AppCompatActivity {

    private SharedViewModel viewModel;
    private FragmentEditable fragmentEditable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a single instance of the SharedViewModel
        viewModel = new ViewModelProvider(this).get(SharedViewModel.class);

        // Set up the initial fragment (if needed)
        if (savedInstanceState == null) {
            fragmentEditable = new FragmentEditable();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragmentEditable)
                    .commit();
        }

        // Button to switch to Fragment 1
        findViewById(R.id.btnFragment1).setOnClickListener(v -> {
            if (fragmentEditable == null) {
                fragmentEditable = new FragmentEditable();
            }
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragmentEditable)
                    .commit();
        });

        // Button to switch to Fragment 2
        findViewById(R.id.btnFragment2).setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, new FragmentDisplay())
                    .commit();
        });
    }
}
*/

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

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

package au.com.softclient.fragmentsdatapass1.fragments;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.EditText;
//
//import au.com.softclient.fragmentsdatapass1.R;
//
///**
// * A simple {@link Fragment} subclass.
// * Use the {@link FragmentEditable#newInstance} factory method to
// * create an instance of this fragment.
// */
//public class FragmentEditable extends Fragment {
//    private EditText editText;
//
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public FragmentEditable() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment FragmentEditable.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static FragmentEditable newInstance(String param1, String param2) {
//        FragmentEditable fragment = new FragmentEditable();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        //return inflater.inflate(R.layout.fragment_editable, container, false);
//        View view = inflater.inflate(R.layout.fragment_editable, container, false);
//
//        editText = view.findViewById(R.id.editText);
//
//        return view;
//    }
//    public String getEnteredText() {
//        return editText.getText().toString();
//    }
//}

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import au.com.softclient.fragmentsdatapass1.R;
import au.com.softclient.fragmentsdatapass1.SharedViewModel;

public class FragmentEditable extends Fragment {

    private EditText editText;
    private SharedViewModel viewModel;
    private FragmentDisplay fragmentDisplay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_editable, container, false);
        editText = view.findViewById(R.id.editText2);
        Button button = view.findViewById(R.id.button2);

        viewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);



        viewModel.getMyText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String text) {
                editText.setText(text);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                viewModel.setMyText(input); // Set the text in the SharedViewModel

                //fragmentDisplay = new FragmentDisplay();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, new FragmentDisplay())
                        .commit();

            }
        });

        return view;
    }
}

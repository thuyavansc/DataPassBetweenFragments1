package au.com.softclient.fragmentsdatapass1.fragments2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import au.com.softclient.fragmentsdatapass1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Activity2F1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
//public class Activity2F1Fragment extends Fragment {
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//    private EditText editText;
//
//    public Activity2F1Fragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment Activity2F1Fragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static Activity2F1Fragment newInstance(String param1, String param2) {
//        Activity2F1Fragment fragment = new Activity2F1Fragment();
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
//        //return inflater.inflate(R.layout.fragment_activity2_f1, container, false);
//
//        View view = inflater.inflate(R.layout.fragment_activity2_f1, container, false);
//        editText = view.findViewById(R.id.editText);
//
//        Button sendButton = view.findViewById(R.id.buttonSend);
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String dataToSend = editText.getText().toString();
//                Bundle bundle = new Bundle();
//                bundle.putString("dataKey", dataToSend);
//
//                Activity2F2Fragment fragment2 = new Activity2F2Fragment();
//                fragment2.setArguments(bundle);
//
//                // Replace Fragment1 with Fragment2
//                requireActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.fragmentContainer2, fragment2)
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });
//
//        return view;
//    }
//}

public class Activity2F1Fragment extends Fragment {
    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity2_f1, container, false);
        editText = view.findViewById(R.id.editText);

        Button sendButton = view.findViewById(R.id.buttonSend);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataToSend = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("dataKey", dataToSend);

                Activity2F2Fragment fragment2 = new Activity2F2Fragment();
                fragment2.setArguments(bundle);

                // Replace Fragment1 with Fragment2
                requireActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer3, fragment2)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
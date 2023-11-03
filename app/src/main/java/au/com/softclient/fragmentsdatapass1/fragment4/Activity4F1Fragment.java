package au.com.softclient.fragmentsdatapass1.fragment4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import au.com.softclient.fragmentsdatapass1.R;
import au.com.softclient.fragmentsdatapass1.fragments3.Activity3F2Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Activity4F1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Activity4F1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Activity4F1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Activity4F1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Activity4F1Fragment newInstance(String param1, String param2) {
        Activity4F1Fragment fragment = new Activity4F1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity4_f1, container, false);
        Button button =  view.findViewById(R.id.buttonSendA4F1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = view.findViewById(R.id.editTextA4F1);
                Bundle result = new Bundle();
                result.putString("dataKey",editText.getText().toString());
                getParentFragmentManager().setFragmentResult("DataFromFragment1",result);
                //editText.setText("");


                requireActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer4, new Activity4F2Fragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_activity4_f1, container, false);
        return view;
    }
}
package au.com.softclient.fragmentsdatapass1.fragment4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import au.com.softclient.fragmentsdatapass1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Activity4F2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Activity4F2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Activity4F2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Activity4F2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Activity4F2Fragment newInstance(String param1, String param2) {
        Activity4F2Fragment fragment = new Activity4F2Fragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_activity4_f2, container, false);

        getParentFragmentManager().setFragmentResultListener("DataFromFragment1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                String data = result.getString("dataKey");
                TextView textView = view.findViewById(R.id.textReceiveA4F2);
                textView.setText(data);
                // Handle the result data here
//                if ("DataFromFragment1".equals(requestKey)) {
//                    // Extract data from the result bundle
//                    //String data = result.getString("key"); // Replace "key" with the actual key used in your result bundle
//
//                    // Process the data as needed
//                }
            }
        });

        return view;
    }
}
package com.zcw.quickframework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zcw.quickframework.R;


public class ProfileFragment extends Fragment {


    private String mFrom;

    static ProfileFragment newInstance(String from) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFrom = getArguments().getString("from");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, null);
        TextView textView = (TextView) view.findViewById(R.id.title_from);
        TextView content = (TextView) view.findViewById(R.id.fragment_content);
        textView.setText(mFrom);
        content.setText("ProfileFragment");
        return view;
    }
}

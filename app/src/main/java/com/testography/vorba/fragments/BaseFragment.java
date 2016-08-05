package com.testography.vorba.fragments;

import android.app.Fragment;
import android.os.Bundle;

import com.testography.vorba.infrastructure.VorbaApplication;

public abstract class BaseFragment extends Fragment {
    protected VorbaApplication application;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (VorbaApplication) getActivity().getApplication();
    }
}

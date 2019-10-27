package com.triplebro.farfetchproject.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.triplebro.farfetchproject.R;

import org.jetbrains.annotations.Nullable;

public class LovesFragment extends Fragment {

    private View fragment_loves;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        fragment_loves = inflater.inflate(R.layout.fragment_loves, null);
        return fragment_loves;
    }
}

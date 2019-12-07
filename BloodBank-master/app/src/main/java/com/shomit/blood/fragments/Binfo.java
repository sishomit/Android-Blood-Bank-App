package com.shomit.blood.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shomit.blood.R;

/***
 Project: BloodBank
 Date: 05/19
 Developer: shomit
 Email: shomitcse@outlook.com
 ***/

public class Binfo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.info, container, false);
        getActivity().setTitle("Information");
        return view;
    }
}

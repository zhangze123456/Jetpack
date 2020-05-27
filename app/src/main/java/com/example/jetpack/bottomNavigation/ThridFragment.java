package com.example.jetpack.bottomNavigation;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpack.R;
import com.example.jetpack.util.PLog;

public class ThridFragment extends Fragment {

    private ThridViewModel mViewModel;

    public static ThridFragment newInstance() {
        return new ThridFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        PLog.i(PLog.ZEZHANG,"oncreat ThridFragment");
        return inflater.inflate(R.layout.thrid_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ThridViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        PLog.i(PLog.ZEZHANG,"onDestroyView ThridFragment");
    }
}

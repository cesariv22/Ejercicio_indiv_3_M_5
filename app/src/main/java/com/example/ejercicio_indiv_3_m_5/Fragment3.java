package com.example.ejercicio_indiv_3_m_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicio_indiv_3_m_5.databinding.Fragment3Binding;

public class Fragment3 extends Fragment {
    Fragment3Binding binding;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= Fragment3Binding.inflate(inflater,container,false);

        binding.btnTryAgain.setOnClickListener(view -> Navigation.findNavController(binding.getRoot()).navigate(R.id.action_fragment3_to_fragment1));
        return binding.getRoot();
    }
}
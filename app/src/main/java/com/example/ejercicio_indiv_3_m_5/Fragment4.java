package com.example.ejercicio_indiv_3_m_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.ejercicio_indiv_3_m_5.databinding.Fragment4Binding;

public class Fragment4 extends Fragment {

    Fragment4Binding binding;


    public Fragment4() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("dato", this, (key, bundle) -> {
            String result = bundle.getString("nombre");
            String msg = getString(R.string.positive_answer1)+" "+result+" "+getString(R.string.positive_answer2);
            binding.textView6.setText(msg);
        });
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= Fragment4Binding.inflate(inflater,container,false);

        binding.btnBack.setOnClickListener(view -> Navigation.findNavController(binding.getRoot())
                .navigate(R.id.action_fragment4_to_fragment1));
        return binding.getRoot();
    }
}
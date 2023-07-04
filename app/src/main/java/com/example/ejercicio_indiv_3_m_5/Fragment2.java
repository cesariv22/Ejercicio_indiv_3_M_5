package com.example.ejercicio_indiv_3_m_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejercicio_indiv_3_m_5.databinding.Fragment2Binding;

public class Fragment2 extends Fragment {
    Fragment2Binding binding;
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String hi = "Hola" + " ";
            mParam1 =  hi+getArguments().getString(ARG_PARAM1) + "!";
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=Fragment2Binding.inflate(inflater,container,false);
        binding.txtSaludo.setText(mParam1);

        binding.btnEnviar.setOnClickListener(view -> {
            if(binding.rbWhatsapp.isChecked()) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_fragment2_to_fragment4);
            } else {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_fragment2_to_fragment32);
            }
        });
        return binding.getRoot();
    }
}

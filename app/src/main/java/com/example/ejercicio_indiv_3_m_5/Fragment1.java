package com.example.ejercicio_indiv_3_m_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ejercicio_indiv_3_m_5.databinding.Fragment1Binding;

public class Fragment1 extends Fragment {
    Fragment1Binding binding;

    public Fragment1 newInstance() {
       Fragment1 fragment1 = new Fragment1();
       return fragment1 ;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(inflater,container,false);

        binding.btnComenzar.setOnClickListener(view -> {
            if(!binding.txtName.getText().toString().isEmpty()){
               addFragment2(binding.txtName.getText().toString());
            } else {
                Toast.makeText(getContext(), "Debes ingresar tu nombre",Toast.LENGTH_LONG).show();
            }
        });
        return binding.getRoot();
    }


    private void addFragment2(String name) {
        Bundle bundle= new Bundle();
        bundle.putString("param1", name);
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_fragment1_to_fragment2,bundle);
    }
}
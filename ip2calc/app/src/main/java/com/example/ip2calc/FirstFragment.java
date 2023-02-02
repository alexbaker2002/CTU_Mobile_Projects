package com.example.ip2calc;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.lang.Math;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.ip2calc.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    // add
        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = getView().findViewById(R.id.editTextNumber);
                MainActivity.num1 = Integer.parseInt(number1.getText().toString());
                EditText number2 = getView().findViewById(R.id.editTextNumber2);
                MainActivity.num2 = Integer.parseInt(number2.getText().toString());

                MainActivity.result = MainActivity.num1 + MainActivity.num2;

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        // subtract
        binding.buttonFirst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = getView().findViewById(R.id.editTextNumber);
                MainActivity.num1 = Integer.parseInt(number1.getText().toString());
                EditText number2 = getView().findViewById(R.id.editTextNumber2);
                MainActivity.num2 = Integer.parseInt(number2.getText().toString());

                MainActivity.result = MainActivity.num1 - MainActivity.num2;
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        //divide
        binding.buttonFirst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = getView().findViewById(R.id.editTextNumber);
                MainActivity.num1 = Integer.parseInt(number1.getText().toString());
                EditText number2 = getView().findViewById(R.id.editTextNumber2);
                MainActivity.num2 = Integer.parseInt(number2.getText().toString());

                MainActivity.result = MainActivity.num1 / MainActivity.num2;
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        //multiply
        binding.buttonFirst4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = getView().findViewById(R.id.editTextNumber);
                MainActivity.num1 = Integer.parseInt(number1.getText().toString());
                EditText number2 = getView().findViewById(R.id.editTextNumber2);
                MainActivity.num2 = Integer.parseInt(number2.getText().toString());

                MainActivity.result = MainActivity.num1 * MainActivity.num2;
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        // modulus
        binding.buttonFirst5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = getView().findViewById(R.id.editTextNumber);
                MainActivity.num1 = Integer.parseInt(number1.getText().toString());
                EditText number2 = getView().findViewById(R.id.editTextNumber2);
                MainActivity.num2 = Integer.parseInt(number2.getText().toString());

                MainActivity.result = MainActivity.num1 % MainActivity.num2;
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        // Exponent
        binding.buttonFirst6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number1 = getView().findViewById(R.id.editTextNumber);
                MainActivity.num1 = Integer.parseInt(number1.getText().toString());
                EditText number2 = getView().findViewById(R.id.editTextNumber2);
                MainActivity.num2 = Integer.parseInt(number2.getText().toString());

                MainActivity.result = (int) Math.pow(MainActivity.num1,MainActivity.num2);
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
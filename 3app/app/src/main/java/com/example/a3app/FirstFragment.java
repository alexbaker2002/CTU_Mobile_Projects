package com.example.a3app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.a3app.databinding.FragmentFirstBinding;
import android.widget.EditText;


import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    public static String firstName;
    public static String lastName;


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

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText fName = getView().findViewById(R.id.editTextTextPersonName);
                firstName = fName.getText().toString();
                EditText lName = getView().findViewById(R.id.editTextTextPersonName2);
                lastName = lName.getText().toString();
                EditText fullName = getView().findViewById(R.id.editTextTextPersonName3);
                fullName.setText(firstName + " " + lastName);



            }
        });
        binding.buttonFirst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText fName = getView().findViewById(R.id.editTextTextPersonName);
                firstName = fName.getText().toString().trim();
                EditText lName = getView().findViewById(R.id.editTextTextPersonName2);
                lastName = lName.getText().toString().trim();
                EditText output = getView().findViewById(R.id.editTextTextPersonName3);
                if(firstName.equals(lastName)){
                    output.setText("Strings are Equal");
                }else{
                    output.setText("Strings are not Equal");
                }


            }
        });
        binding.buttonFirst3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText fName = getView().findViewById(R.id.editTextTextPersonName);
                firstName = fName.getText().toString().trim().toLowerCase();
                EditText lName = getView().findViewById(R.id.editTextTextPersonName2);
                lastName = lName.getText().toString().trim().toLowerCase();
                EditText output = getView().findViewById(R.id.editTextTextPersonName3);
                int count = 0;
                count = count + CountVowels(firstName);
                count = count + CountVowels(lastName);


                if (count > 0) {

                    output.setText(count + " vowels found in both inputs.");
                }else {
                    output.setText("No vowels found in either input.");
                }

            }
        });

    }
    private int CountVowels(String str){
        System.out.println(str);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (char ch: str.toCharArray()) {
            System.out.println(ch);
            if(new String(vowels).indexOf(ch) > -1){
                System.out.println("added 1");
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
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
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
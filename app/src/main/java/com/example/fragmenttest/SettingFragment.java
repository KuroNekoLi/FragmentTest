package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class SettingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_setting,null);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnRatting = view.findViewById(R.id.btn_ratting);
        Button btnAbout = view.findViewById(R.id.btn_about);

        btnRatting.setOnClickListener(v->{
            // 使用 FragmentManager 和 FragmentTransaction 替換 Fragment
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainerView, new RattingFragment());
            fragmentTransaction.addToBackStack(null);  // 如果需要支持返回到上一個 Fragment
            fragmentTransaction.commit();
        });

        btnAbout.setOnClickListener(v->{
            // 使用 FragmentManager 和 FragmentTransaction 替換 Fragment
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentContainerView, new AboutFragment());
            fragmentTransaction.addToBackStack(null);  // 如果需要支持返回到上一個 Fragment
            fragmentTransaction.commit();
        });

//        // Adding custom back pressed action
//        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback(true) {
//            @Override
//            public void handleOnBackPressed() {
//                Toast.makeText(getContext(), "Quit?", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}

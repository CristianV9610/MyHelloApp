package com.example.myhelloapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.example.myhelloapp.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

private FragmentFirstBinding binding;

TextView showCountTextView;

    private void textString(View view) {
        String string = showCountTextView.getText().toString();
        showCountTextView.setText("Hello World!!");
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

      View fragmentFirstLayout = inflater.inflate(R.layout.fragment_first, container, false);
      showCountTextView = fragmentFirstLayout.findViewById(R.id.textview_first);
      return fragmentFirstLayout;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textString(view);
                    }
                });

        view.findViewById(R.id.button_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myLeft = Toast.makeText(getActivity(), "Hello World!!", Toast.LENGTH_SHORT);
                myLeft.show();
            }
        });
    }


@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
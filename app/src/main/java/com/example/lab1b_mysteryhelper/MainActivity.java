package com.example.lab1b_mysteryhelper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.lab1b_mysteryhelper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = (binding.getRoot());
        setContentView(view);


        binding.button.setOnClickListener(new View.OnClickListener() {

            public void onClick (View view){
                String[] outputArray = getResources().getStringArray(R.array.outputArray);
                Random random = new Random();
                int randomIndex = random.nextInt(outputArray.length);
                String randomItem = outputArray[randomIndex];
                binding.outputTextView.setText(randomItem);
            }
        });
    }
}
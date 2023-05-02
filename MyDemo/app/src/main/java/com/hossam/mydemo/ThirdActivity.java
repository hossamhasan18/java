package com.hossam.mydemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hossam.mydemo.databinding.ActivityMainBinding;
import com.hossam.mydemo.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {

    ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.ice.setOnClickListener(new View.OnClickListener() {

            String Std = "Ice Coffee";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Std, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.pepsi.setOnClickListener(new View.OnClickListener() {

            String StR = "pepsi ";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), StR, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.cream.setOnClickListener(new View.OnClickListener() {

            String St = "Ice Cream";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), St, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.mango.setOnClickListener(new View.OnClickListener() {

            String Strr = "Mango";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Strr, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.oreo.setOnClickListener(new View.OnClickListener() {

            String Ster = "Oreo";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Ster, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        binding.car.setOnClickListener(new View.OnClickListener() {

            String Srd = "Checked Cream";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Srd, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.Arg.setOnClickListener(new View.OnClickListener() {

            String Sre = "Checked Argella";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Sre, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {

            String Srs = "congraculation getting order";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Srs, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.brevious.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, ActivityMainBinding.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
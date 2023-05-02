package com.hossam.mydemo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hossam.mydemo.databinding.ActivityMainBinding;
import com.hossam.mydemo.databinding.ActivitySecondBinding;
import com.hossam.mydemo.databinding.ActivityThirdBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Espresso.setOnClickListener(new View.OnClickListener() {

            String Std = "Espresso Coffee";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Std, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.Hot.setOnClickListener(new View.OnClickListener() {

            String StR = "Hot Chocolate";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), StR, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.nescafe.setOnClickListener(new View.OnClickListener() {

            String St = "Nescafe";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), St, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.tea.setOnClickListener(new View.OnClickListener() {

            String Strr = "Tea";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Strr, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.latee.setOnClickListener(new View.OnClickListener() {

            String Ster = "Capuchino Late";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Ster, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.milk.setOnClickListener(new View.OnClickListener() {

            String Srd = "Checked Milk";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Srd, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.Cream.setOnClickListener(new View.OnClickListener() {

            String Sre = "Checked Whipped Cream";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Sre, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.Order.setOnClickListener(new View.OnClickListener() {

            String Srs = "congraculation getting order";

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), Srs, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        binding.Par.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
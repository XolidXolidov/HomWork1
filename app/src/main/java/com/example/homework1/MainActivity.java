package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Cars car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClicks();
    }
    private void initClicks() {
        binding.btnBmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.carImg.setImageResource(R.drawable.bmw);
                car = Cars.BMW;
            }
        });
        binding.btnMers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.carImg.setImageResource(R.drawable.mers);
                car = Cars.MERS;
            }
        });
        binding.btnRollse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.carImg.setImageResource(R.drawable.rollse);
                car = Cars.ROLLSE;
            }
        });
        binding.btnIsBmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car == Cars.BMW) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.btnIsMers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car == Cars.MERS) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.btnIsRollse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (car == Cars.ROLLSE) {
                    Toast.makeText(MainActivity.this, "Правильно!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно))", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String animalName;
                switch (car) {
                    case BMW:
                        animalName = "Bmw";
                        break;
                    case MERS:
                        animalName = "Mers";
                        break;
                    case ROLLSE:
                        animalName = "Rollse";
                        break;
                    default:
                        animalName = "Неизвестно";
                        break;
                }
                intent.putExtra("key", animalName);
                startActivity(intent);
            }
        });
    }
}
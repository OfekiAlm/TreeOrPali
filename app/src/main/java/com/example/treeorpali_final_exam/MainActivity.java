package com.example.treeorpali_final_exam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button GenButton;
ImageView Pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        GenButton.setOnClickListener(this);
    }
    private void init(){
        GenButton = findViewById(R.id.genbtn);
        Pic = findViewById(R.id.pic);
    }

    @Override
    public void onClick(View view) {
        if(GenButton == view){
            Toast.makeText(this, "Generated!",Toast.LENGTH_SHORT);
            Random rnd = new Random();
            int x = rnd.nextInt(10);
            if(x%2==0){
                Pic.setImageResource(R.drawable.pali);
            }
            else{
                Pic.setImageResource(R.drawable.tree);
            }
        }
    }
}
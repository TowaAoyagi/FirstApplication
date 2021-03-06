package com.example.javajanken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView cpu;
    ImageView player;
    TextView result;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpu = findViewById(R.id.cpu);
        player = findViewById(R.id.player);
        result = findViewById(R.id.result);

    }

    public void goo (View v){
        player.setImageResource(R.drawable.goo);
        int random = r.nextInt(3);

        if (random == 0){
            cpu.setImageResource(R.drawable.goo);
            result.setText("引き分け");
        }else if (random == 1){
            cpu.setImageResource(R.drawable.choki);
            result.setText("勝ち");
        }else if (random == 2){
            cpu.setImageResource(R.drawable.paa);
            result.setText("負け");
        }
    }

    public void choki (View v){
        player.setImageResource(R.drawable.choki);
        int random = r.nextInt(3);

        if (random == 0){
            cpu.setImageResource(R.drawable.choki);
            result.setText("引き分け");
        }else if (random == 1){
            cpu.setImageResource(R.drawable.paa);
            result.setText("勝ち");
        }else if (random == 2){
            cpu.setImageResource(R.drawable.goo);
            result.setText("負け");
        }
    }

    public void paa (View v){
        player.setImageResource(R.drawable.paa);
        int random = r.nextInt(3);

        if (random == 0){
            cpu.setImageResource(R.drawable.paa);
            result.setText("引き分け");
        }else if (random == 1){
            cpu.setImageResource(R.drawable.goo);
            result.setText("勝ち");
        }else if (random == 2){
            cpu.setImageResource(R.drawable.choki);
            result.setText("負け");
        }
    }
}

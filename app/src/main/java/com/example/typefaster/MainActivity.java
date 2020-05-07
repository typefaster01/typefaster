package com.example.typefaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity extends AppCompatActivity {
    Button playbutton;
    Button leaderboardButton;
    Button settingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbutton = findViewById(R.id.playButton);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aaa = new Intent(MainActivity.this, GamePlay.class);
                startActivity(aaa);
            }
        });
    }

}

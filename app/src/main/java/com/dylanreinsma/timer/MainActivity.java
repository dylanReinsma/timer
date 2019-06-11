package com.dylanreinsma.timer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.timerSeekBar);
        seekBar.setProgress(0);
    }

    public void timerClick() {
        View timerButton = findViewById(R.id.timerButton);
    }
}

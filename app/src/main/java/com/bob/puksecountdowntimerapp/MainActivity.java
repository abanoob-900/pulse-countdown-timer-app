package com.bob.puksecountdowntimerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gusakov.library.PulseCountDown;
import com.gusakov.library.java.interfaces.OnCountdownCompleted;

public class MainActivity extends AppCompatActivity {

    // creating object of Button and PulseCountDown
    private Button buttonStart;
    private PulseCountDown pulseCountDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialising objects
        buttonStart=(Button)findViewById(R.id.buttonStart);
        pulseCountDown=(PulseCountDown)findViewById(R.id.pulseCountDown);

        // button OnClickListener
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // start countdown and add OnCountdownCompleted
                pulseCountDown.start(new OnCountdownCompleted() {
                    @Override
                    public void completed() {
                        // show simple toast when countdown completed
                        Toast.makeText(MainActivity.this, "Pulse Count Completed :)", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}

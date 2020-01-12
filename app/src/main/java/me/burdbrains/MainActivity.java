package me.burdbrains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button butColor = findViewById(R.id.buttonColor);

        final Button bkgColor = findViewById(R.id.backgroundColor);

        butColor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                butColor.setBackgroundColor((int)(Math.random() * 100));
                bkgColor.setBackgroundColor((int)(Math.random() * 100));
            }
        });

        bkgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                v.setBackgroundColor((int)(Math.random() * 100));
            }
        });

        // This is a test.
    }
}

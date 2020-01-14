package me.burdbrains;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;

    // TODO Top bar changes color (if possible)

public class MainActivity extends AppCompatActivity {

    public int cycleColor(int cInd)
    {
        if (cInd >= 6)
        {
            cInd = 0;
        }
        else
        {
            cInd++;
        }
        return cInd;
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining the colors for the button to change
        int red = Color.parseColor("#FF0000");
        int ora = Color.parseColor("#FF7F00");
        int yel = Color.parseColor("#FFFF00");
        int gre = Color.parseColor("#00FF00");
        int blu = Color.parseColor("#0000FF");
        int ind = Color.parseColor("#4B0082");
        int vio = Color.parseColor("#8F00FF");

        final int[] rainbow = {red, ora, yel, gre, blu, ind, vio};


        // Defining the button variables
        final Button butColor = findViewById(R.id.buttonColor);

        final Button bkgColor = findViewById(R.id.backgroundColor);

        final Button notifcBut = findViewById(R.id.notification);


        // Defining the layout (bkg) so .background functions color can be changed
        final ConstraintLayout appLayout = findViewById(R.id.appLayout);


        // Button1 listener (to change button colors)
        butColor.setOnClickListener(new View.OnClickListener()
        {
            int colorInd = 0;

            @Override
            public void onClick(View v)
            {
                //int ranColor = rainbow[(int)(Math.random() * 7)];

                butColor.setBackgroundColor(rainbow[colorInd]);
                bkgColor.setBackgroundColor(rainbow[colorInd]);
                notifcBut.setBackgroundColor(rainbow[colorInd]);

                colorInd = cycleColor(colorInd);
            }
        });


        // Button2 listener (to change background color)
        bkgColor.setOnClickListener(new View.OnClickListener()
        {
            int colorInd = 0;

            @Override
            public void onClick(View v)
            {
                appLayout.setBackgroundColor(rainbow[colorInd]);

                colorInd = cycleColor(colorInd);
            }
        });


        // Button3 listener (to send a test notification)
        notifcBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Notification notify = new NotificationCompat.Builder;
            }
        });
    }
}

package com.example.ex10;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ToggleButton tb;
    Switch switch1;
     LinearLayout m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tb = (ToggleButton) findViewById(R.id.tb);
        switch1 = (Switch) findViewById(R.id.switch1);
        m = (LinearLayout) findViewById(R.id.m);
    }

    public void click1(View view)
    {
        if (tb.isChecked() && !(switch1.isChecked()) )
        {
            m.setBackgroundColor(Color.RED);
        }
        else if (tb.isChecked() && (switch1.isChecked()) )
        {
            m.setBackgroundColor(Color.BLUE);
        }
        else if (!(tb.isChecked()) && !(switch1.isChecked()) )
        {
            m.setBackgroundColor(Color.GREEN);
        }
        else
        {
            m.setBackgroundColor(Color.YELLOW);
        }
    }
}
package com.quique.reverso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonCalcular = (Button)findViewById(R.id.btnCalcular);
        botonCalcular.setOnClickListener(new BotonClick(this));

    }
}

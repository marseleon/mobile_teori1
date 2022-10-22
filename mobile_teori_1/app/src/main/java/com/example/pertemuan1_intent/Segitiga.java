package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText) findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText) findViewById(R.id.input_tinggi);

        final TextView hasil =
                (TextView) findViewById(R.id.output_hasil);

        final Button luas =
                (Button) findViewById(R.id.btn_luas);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View segluas) {
                double alass = Double.parseDouble(alas.getText().toString());
                double tinggii = Double.parseDouble(tinggi.getText().toString());

                double hasill = 0.5 * alass * tinggii;
                hasil.setText(Double.toString(hasill));
            }
        });
    }
}
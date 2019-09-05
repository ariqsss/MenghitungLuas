package com.hitungluas.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText inputpanjang;
    private EditText inputlebar;
    private TextView hasil;
    private Button hitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    inputpanjang=(EditText)findViewById(R.id.editpanjang);
    inputlebar=(EditText)findViewById(R.id.editlebar);
    hasil=(TextView)findViewById(R.id.hasil);
    hitung=(Button)findViewById(R.id.buttonhitung);

    hitung.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Double panjang=Double.parseDouble(inputpanjang.getText().toString().trim());
            Double lebar=Double.parseDouble(inputlebar.getText().toString().trim());
            Double luas=panjang*lebar;
            hasil.setText(String.format("%.2f", luas));
        }
    });
    }







}

package com.example.windows10.udemy;

import android.app.Activity;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.xml.sax.helpers.ParserFactory;

//import java.util.PrimitiveIterator;

public class MainActivity extends Activity {
    TextView tv1;
    Button arti;
    Button eksi;
    int sayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1=(TextView)findViewById(R.id.tt1);
        Button arti=(Button)findViewById(R.id.arti);
        Button eksi=(Button)findViewById(R.id.eksi);
        sayac=0;

        arti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac++;
                tv1.setText("Sonuc = "+sayac);
            }
        });
        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac--;
                tv1.setText("Sonuc = "+sayac);
            }
        });
    }

}

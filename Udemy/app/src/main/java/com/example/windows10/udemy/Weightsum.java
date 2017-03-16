package com.example.windows10.udemy;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;


public class Weightsum extends Activity {
    EditText et;
    ToggleButton tb;
    Button btn;
    TextView tv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weightsum);
        et = (EditText) findViewById(R.id.et);
        tb = (ToggleButton) findViewById(R.id.tb);
        btn = (Button) findViewById(R.id.btn);
        tv = (TextView) findViewById(R.id.tv);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //BURDA ToogleButton on of durumuna göre text password a çevirme durumu ele alındı
                if (tb.isChecked()) {
                    et.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                } else {
                    et.setInputType(InputType.TYPE_CLASS_TEXT);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String alinan = et.getText().toString();
                if (alinan.equals("sag")) {
                    tv.setGravity(Gravity.RIGHT);

                } else if (alinan.equals("sol")) {
                    tv.setGravity(Gravity.LEFT);        //TXT NİN HİZALANMASI DURUMLARI
                } else if (alinan.equals("orta")) {
                    tv.setGravity(Gravity.CENTER);
                } else if (alinan.equals("bilal")) {
                    Random rast = new Random();
                    tv.setText("bilal");
                    tv.setTextSize(rast.nextInt(80));
                    tv.setTextColor(Color.rgb(rast.nextInt(256), rast.nextInt(256), rast.nextInt(256)));
                    switch (rast.nextInt(4)) {
                        case 1: {
                            tv.setGravity(Gravity.LEFT);
                            break;
                        }
                        case 2: {
                            tv.setGravity(Gravity.RIGHT);
                            break;
                        }
                        case 3: {
                            tv.setGravity(Gravity.CENTER);
                            break;
                        }

                    }

                } else {
                    tv.setText("Geçersiz Değer");
                    tv.setGravity(Gravity.CENTER);
                }


            }
        });


    }

}

package com.example.windows10.udemy;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListeOrnek extends Activity {
    String ulkeler [] = {"Türkiye","Almanya","Japonya","Fransa ","Çin"};
    ListView ulkelerListesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listeornek);

        ulkelerListesi = (ListView)findViewById(R.id.lv);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler);
        ulkelerListesi.setAdapter(adapter);
        ulkelerListesi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder diyalog = new AlertDialog.Builder(ListeOrnek.this);
                diyalog.setMessage(ulkeler[position]);
                diyalog.setCancelable(false);
                diyalog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ListeOrnek.this,"Tamam",Toast.LENGTH_LONG).show();

                    }
                });
                diyalog.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ListeOrnek.this,"Hayır",Toast.LENGTH_SHORT).show();

                    }
                });
                diyalog.create().show();
            }
        });



    }
}

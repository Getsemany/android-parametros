package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contacto> lista;
    private Contacto con;
    private int request;
    private ListView listview;
    private TextView Agrega;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=new ArrayList<>();
        Contacto obj=new Contacto("Alberto","Albertito@gmail.com","@alberto","445236985","12-04-1998");
        Agrega=(TextView)findViewById(R.id.txtAgregar);
        lista.add(obj);
        obj=new Contacto("Roberto","Roberto@gmail.com","@roberto","445236985","12-04-1998");
        lista.add(obj);
        Agrega.setText(lista.size()+"");
        Mostrar();
    }

    public void Siguiente(View view){
            Intent siguiente=new Intent(this,Intent2.class);
            startActivityForResult(siguiente,request);
    }

    public  void Mostrar(){
        listview=(ListView) findViewById(R.id.lstLista);
        ArrayList<String> list=new ArrayList<>();
        for (int i=0;i<lista.size();i++){
        list.add(lista.get(i).message());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listview.setAdapter(adapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            if(resultCode==MainActivity.RESULT_OK){
                con=(Contacto)data.getSerializableExtra("con");
                lista.add(con);
                Agrega.setText(lista.size()+"");
                Mostrar();
            }
    }

}

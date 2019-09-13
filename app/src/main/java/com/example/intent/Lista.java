package com.example.intent;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

public class Lista implements Serializable {
    private ArrayList<Contacto> list;



    public Lista() {

    }

    public void Guardar(Contacto c){
        list.add(c);
    }
    public ArrayList<Contacto> getList(){
        return list;
    }


}

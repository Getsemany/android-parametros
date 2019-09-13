package com.example.intent;

import java.io.Serializable;
import java.util.ArrayList;

public class Contacto implements Serializable {
    private String usuario;
    private String email;
    private String twiter;
    private String telefono;
    private String fecha;
    public  Contacto(String usuario,String email, String twiter,String telefono, String fecha){
        this.usuario=usuario;
        this.email=email;
        this.twiter=twiter;
        this.telefono=telefono;
        this.fecha=fecha;

    }
    public String message(){
        return this.usuario +"\n"+ this.twiter;
    }

}

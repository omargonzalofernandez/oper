package com.example.usuario.operaciones;

import android.widget.EditText;

public class ITEMS {

    private double A,B;


        public ITEMS(double A, double B){

        this.A=A;
        this.B=B;
    }
    public double suma(){

        return  this.A+this.B;
    }

    public double resta(){

        return  this.A-this.B;
    }
    public double multiplicacion(){

        return  this.A*this.B;
    }
    public double division(){

        return  this.A/this.B;
    }
}

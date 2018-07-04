package com.example.usuario.operaciones;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.usuario.operaciones.ITEMS;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText A;
   private EditText B;
   double N1,N2;
    //String N1=A.toString();
   // String N2=B.toString();

    private Button sum,res,mul,div;
    private TextView RESULTADO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponents();
    }

    private void loadComponents() {

        A=findViewById(R.id.editText);
        B=findViewById(R.id.editText2);

        RESULTADO=findViewById(R.id.textView);
        sum=findViewById(R.id.buttonS);
        res=findViewById(R.id.buttonR);
        mul=findViewById(R.id.buttonM);
        div=findViewById(R.id.buttonD);
        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    public void onClick(View v) {
        String n1 = A.getText().toString();
        String n2 = B.getText().toString();
        N1 = Integer.parseInt(n1);
        N2 = Integer.parseInt(n2);
        ITEMS items = new ITEMS(N1, N2);
        double res=0;
        switch (v.getId()){

            case R.id.buttonS:
                res=items.suma();
                break;


            case R.id.buttonR:

                res=items.resta();
                break;


            case R.id.buttonM:

                res=items.multiplicacion();
                break;


            case R.id.buttonD:
                res=items.division();

                break;

        }
        RESULTADO.setText("EL RESULTADO ES: " + res);
    }
}

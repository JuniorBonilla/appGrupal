package com.example.user.appgrupal;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import org.w3c.dom.Text;

import java.io.Serializable;

public class InformacionT extends AppCompatActivity {
    private static final int REQUEST_CALL=1;

    TextView NDocumento;
    TextView NombreE;
    TextView ApellidoE;
    TextView telefono;
    ImageView foto;



    private ImageView Mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_t);
        NDocumento=(TextView)findViewById(R.id.Numero);
        NombreE=(TextView)findViewById(R.id.NombreE);
        ApellidoE=(TextView)findViewById(R.id.ApellidoE);
        telefono=(TextView)findViewById(R.id.Ntelefono);

        foto=(ImageView)findViewById(R.id.foto);
        Bundle Objeto= getIntent().getExtras();
        Entidad user= null;
        if (Objeto!=null){
            user = (Entidad) Objeto.getSerializable("entidad");
            NDocumento.setText(user.getNdocumento().toString());
            NombreE.setText(user.getNombre().toString());
            ApellidoE.setText(user.getApellido().toString());
            String Fotos= user.getNfoto().toString();
            telefono.setText(user.getTelefono().toString());

            // int resId= getResources().getIdentifier("R.drawable."+Fotos,null,null);

            foto.setImageResource(R.drawable.uno);

        }



        Mapa =(ImageView) findViewById(R.id.imgMapa);
        Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Entidad Usuario = ListaUsuario.get(position);
                Intent intent =  new Intent(InformacionT.this, MapsActivity.class);
                startActivity(intent);

            }
        });

        ImageView call = (ImageView)findViewById(R.id.imgLLamar);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hacerllamada();
            }
        });
    }

    private void hacerllamada(){
        Bundle Objeto= getIntent().getExtras();
        Entidad user= null;
        user = (Entidad) Objeto.getSerializable("entidad");
        String numero = user.getTelefono().toString();
        if (numero.trim().length()>0){
            if (ContextCompat.checkSelfPermission(InformacionT.this,Manifest.permission.CALL_PHONE)!=
                    PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(InformacionT.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);

            }else{
                String llamada = "tel:"+numero;
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(llamada)));

            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==REQUEST_CALL){
            if (grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                hacerllamada();

            }else{
                Toast.makeText(this,"Permiso denegado",Toast.LENGTH_SHORT).show();
            }
        }
    }


}



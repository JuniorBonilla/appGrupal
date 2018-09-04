
package com.example.user.appgrupal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intento = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intento);
                finish();

            }
        },4000);

    }
}

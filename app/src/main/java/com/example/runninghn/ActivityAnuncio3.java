package com.example.runninghn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ActivityAnuncio3 extends AppCompatActivity {
    private GestureDetectorCompat mDetector;
    Button buttonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncio3);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());

        buttonIngresar = findViewById(R.id.btn_ingresar);
        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLogin();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, ActivityAnuncio2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void openActivityLogin(){
        Intent intent = new Intent(this, ActivityLogin.class);
        startActivity(intent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityx, float velocityY) {
            if(e1.getX()<e2.getX()){
                openActivity2();
            }
            return true;
        }
    }
}
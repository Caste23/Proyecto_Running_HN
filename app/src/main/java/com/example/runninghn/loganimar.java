package com.example.runninghn;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.icu.number.Scale;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class loganimar extends AppCompatActivity {
    ImageView ima, dos, buttom, logorun;
    TextView textView;
    CharSequence charSequence;
    int index;
    long delay = 200;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);


        ima = findViewById(R.id.ima);
        dos = findViewById(R.id.dos);
        buttom = findViewById(R.id.buttom);
        logorun = findViewById(R.id.logorun);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Para la animacion
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animar);
        ima.setAnimation(animation);

        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(
                dos,
                PropertyValuesHolder.ofFloat("scaleX", 1.2f),
                PropertyValuesHolder.ofFloat("scaleY", 1.2f)
        );
        animator.setDuration(500);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();

    }
}
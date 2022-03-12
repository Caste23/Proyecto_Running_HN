package com.example.runninghn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.runninghn.fragments.Frame_Iniciar;
import com.example.runninghn.fragments.Frame_anuncio;
import com.example.runninghn.fragments.Frame_main;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);


    }
}
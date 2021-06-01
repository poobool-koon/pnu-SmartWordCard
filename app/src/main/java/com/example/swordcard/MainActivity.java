package com.example.swordcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WordModule a = new WordModule(MainActivity.this);
        System.out.println("HELLO");
        a.removeWord("Car");
        System.out.println("Words:"+a.getAllWords());

        System.out.println("test git upload");
        
        //촬영모드
        btn = (Button)findViewById(R.id.OpenCam);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });

        //단어장모드
        Button btn = (Button)findViewById(R.id.OpenList);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WordListActivity.class);
                startActivity(intent);
            }
        });
        
        //퀴즈모드
        btn = (Button)findViewById(R.id.OpenQuiz);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
    }

}
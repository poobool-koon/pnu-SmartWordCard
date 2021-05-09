package com.example.swordcard;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    public Button btn;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_sub);

        btn = (Button)findViewById(R.id.CloseSub);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

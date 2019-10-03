package com.fitriana.tugas2gojek;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fitriana.tugas2gojek.MainActivity;

public class goride extends AppCompatActivity {

    Button btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);

        btnkembali = findViewById(R.id.kembali);

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (goride.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}


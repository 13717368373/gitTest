package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("gitTest","第四次提交的文件内容");

        Log.i("gitTest","liangjinhua");
        Log.i("gitTest","liangjinhua02");
        Log.i("gitTest","提交到分支newBranch02");

    }
}

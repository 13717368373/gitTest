package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("gitTest","第四次提交的文件内容");

        Log.i("gitTest","liangjinhua");
        Log.i("gitTest","liangjinhua02");
        Log.i("gitTest","liangjinhua3333");
        Log.i("gitTest","测试冲突用_wenguang");

        findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    }

    private void showDialog() {
        Dialog dialog = new Dialog(this, R.style.dialog_warn);
        dialog.setContentView(R.layout.layout_delete_dialog);

        dialog.findViewById(R.id.delete_data_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


        dialog.setCancelable(false);
        dialog.show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("gitTest","onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("gitTest","onPause");
    }
}

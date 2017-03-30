package com.example.win.androidanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnAct;
    private Button btnAe;
    private Button btnRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAct = (Button) findViewById(R.id.btn_activity_anim);
        btnAe = (Button) findViewById(R.id.btn_ae_anim);
        btnRec = (Button) findViewById(R.id.btn_recycler_view_anim);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_activity_anim:
                break;
            case R.id.btn_ae_anim:
                break;
            case R.id.btn_recycler_view_anim:
                break;
        }
    }
}

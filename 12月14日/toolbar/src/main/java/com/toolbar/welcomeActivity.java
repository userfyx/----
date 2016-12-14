package com.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class welcomeActivity extends AppCompatActivity {

    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        jump();
    }
    public void jump() {
        timer = new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //跳转
                        startActivity(new Intent(welcomeActivity.this,MainActivity.class));
                        //销毁
                        finish();
                        timer.cancel();
                    }
                });
            }
        };
        timer.schedule(task,3000);
    }
}

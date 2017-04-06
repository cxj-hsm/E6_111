package com.example.cxj.e6_1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by cxj on 2017/4/6.
 */

public class LogActivity2 extends AppCompatActivity{
    private static final String LIFI_TAG = "LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG,"SecondActivity--->onCreate");
        super.onCreate(savedInstanceState);
    }
    protected void onDestroy(){
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG,"SecondActivity --->onDestory");
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG, "SecondActivity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG, "SecondActivity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG, "SecondActivity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG, "SecondActivity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG, "SecondActivity --->onStop");
        super.onStop();
    }

}

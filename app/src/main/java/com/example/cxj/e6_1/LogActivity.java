package com.example.cxj.e6_1;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LogActivity extends AppCompatActivity {
    private Button myButton;
    static final String LIFT_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.v(LogActivity.LIFT_TAG,"FirstAcvity ---> onCreate");
        Button myButon = (Button) findViewById(R.id.myButton);
        myButon.setText("启动第二个Activity");
        myButon.setOnClickListener(new ButtonOnClickListener());
    }
    class ButtonOnClickListener implements OnClickListener{
        @Override
        public void onClick(View v){
                                        Intent intent= new Intent();
                                        intent.setClass(LogActivity.this,LogActivity2.class);
                                        LogActivity.this.startActivity(intent);}
    }
        @Override
        protected void onDestroy(){
            //TODO Auto-generated method stub
            Log.v(LogActivity.LIFT_TAG,"FirstAcvity --->onDestory");
            super.onDestroy();
        }
        @Override
        protected void onPause(){
            //TODO Auto-generated method stub
            Log.v(LogActivity.LIFT_TAG,"FirstAcvity --->onPause");
            super.onPause();
        }
        @Override
         protected void onResume(){
             //TODO Auto-generated method stub
            Log.v(LogActivity.LIFT_TAG,"FirstAcvity --->onResume");
            super.onResume();
    }
        @Override
        protected void onStart(){
            //TODO Auto-generated method stub
            Log.v(LogActivity.LIFT_TAG,"FirstAcvity --->onStart");
            super.onStart();
        }
        @Override
        protected void onStop(){
        //TODO Auto-generated method stub
        Log.v(LogActivity.LIFT_TAG,"FirstAcvity --->onStop");
        super.onStop();
    }

}

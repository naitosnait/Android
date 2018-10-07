package com.naitos.laba3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements OnClickListener {

        final String TAG = "States";
        Button btnActTree;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            btnActTree =(Button) findViewById(R.id.btnActTree);
            btnActTree.setOnClickListener(this);
            Log.d(TAG, "MainActivity2: onCreate()");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(TAG, "MainActivity2: onRestart()");
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(TAG, "MainActivity2: onStart()");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "MainActivity2: onResume()");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "MainActivity2: onPause()");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG, "MainActivity2: onStop()");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "MainActivity2: onDestroy()");
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }

    }

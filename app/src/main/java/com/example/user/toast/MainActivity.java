package com.example.user.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Toast.makeText ( this,"this is my toast onCreate",Toast.LENGTH_SHORT ).show ();
        Toast centerToast = Toast.makeText ( this,"Center Toast",Toast.LENGTH_SHORT );
        centerToast.setGravity ( Gravity.CENTER,0,0 );
        centerToast.show ();
    }
    @Override
    protected void onStart(){
        super.onStart ();

        Toast.makeText ( this,"this is my toast in onStart",Toast.LENGTH_SHORT ).show ();
    }
    @Override
    protected void onResume(){
        super.onResume();

        Toast.makeText ( this,"this is my toast in onResume",Toast.LENGTH_SHORT ).show ();
    }
    @Override
    protected void onPause(){
        super.onPause ();

        Toast.makeText ( this,"this is my toast in onPause",Toast.LENGTH_SHORT ).show ();
    }
    @Override
    protected void onStop(){
        super.onStop ();

        Toast.makeText ( this,"this is my toast in onStop",Toast.LENGTH_SHORT ).show ();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy ();

        Toast.makeText ( this,"this is my toast in onDestroy",Toast.LENGTH_SHORT ).show ();
    }

}

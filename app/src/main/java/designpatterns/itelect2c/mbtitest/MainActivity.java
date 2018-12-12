package designpatterns.itelect2c.mbtitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void startTest(View v ){
        Intent i = null, chooser = null;
        i = new Intent( MainActivity.this, TestActivity.class);
        MainActivity.this.startActivity(i);
    }

}

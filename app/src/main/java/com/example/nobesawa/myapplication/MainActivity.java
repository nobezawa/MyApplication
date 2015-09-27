package com.example.nobesawa.myapplication;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {

    Button moveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.moveButton = (Button) findViewById(R.id.moveButton);
    }

    @Override
    protected void onResume() {
        super.onResume();
        moveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ImageView sakana = (ImageView) findViewById(R.id.sakana);
                PropertyValuesHolder x = PropertyValuesHolder.ofFloat( "translationX", 0f, 150f);
                PropertyValuesHolder y = PropertyValuesHolder.ofFloat("translationY", 0f, 50f);
                ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(sakana, x, y);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

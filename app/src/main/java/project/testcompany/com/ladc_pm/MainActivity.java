package project.testcompany.com.ladc_pm;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crashlytics.android.Crashlytics;

import java.util.Random;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    public void ActivityKerem(View view)
    {
        Intent KeremActivity = new Intent(this,SoundBoardActivity.class);

        startActivity(KeremActivity);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

    }

    View view;
    Random rnd = new Random();
    public void ActivityGursel(View view) {
        view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

    }
}

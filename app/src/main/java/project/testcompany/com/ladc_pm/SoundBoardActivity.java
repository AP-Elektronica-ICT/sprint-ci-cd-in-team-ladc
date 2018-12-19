package project.testcompany.com.ladc_pm;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);


        final MediaPlayer PlayBoxsound= MediaPlayer.create(this, R.raw.roblox_death_sound_1);

        final Button PlaySound = (Button) this.findViewById(R.id.Button_PlaySound);

        PlaySound.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {
               PlayBoxsound.start();
           }
        });

    }
}

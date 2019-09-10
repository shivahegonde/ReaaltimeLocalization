package chandan.prasad.daytwoaudioapplication;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tts);

        //Created relative layout and assigned to layout parent id.

        RelativeLayout relativeLayout = findViewById(R.id.layout_parent);



        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();


    }

    public void play_btn(View view) {
        final Button sound = (Button) view;
        Toast.makeText(this, ""+getPackageName(), Toast.LENGTH_SHORT).show();
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, getResources().getIdentifier((String) sound.getTag(), "raw", getPackageName()));
        mediaPlayer.start();
        if (mediaPlayer.isPlaying()) {
            sound.setBackgroundColor(Color.RED);
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                sound.setBackgroundColor(Color.GREEN);
                sound.setTextColor(Color.WHITE);
            }
        });
    }
}

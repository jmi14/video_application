package com.example.hpfolio.videoapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoPlay = (VideoView) findViewById(R.id.videoPlay);
        videoPlay.setVideoPath("android.resource://" +
                getPackageName() + "/" + R.raw.sun1);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoPlay);
        videoPlay.setMediaController(mediaController);
        videoPlay.start();
    }
}

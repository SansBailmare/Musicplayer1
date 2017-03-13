package com.example.android.musicplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.media.CamcorderProfile.get;
import static com.example.android.musicplayer.R.id.listsong;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private  int s=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       final ArrayList<media> songs =new ArrayList<media>();
        songs.add(new media("Closer",R.raw.closer));
        songs.add(new media("All We Know",R.raw.all));
        songs.add(new media("Star BOy",R.raw.star));
        songs.add(new media("Cheap Thrills",R.raw.cheap));
        songs.add(new media("Shape Of You",R.raw.shape));


        MediaAdapter mediaAdapter=new MediaAdapter(this,songs);
        ListView listView=(ListView)findViewById(R.id.activity_main);
        listView.setAdapter(mediaAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                media song = songs.get(position);
                /**if (pos ==0 ||(pos != position)) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, song.getAudioname());
                    pos=position;
                }*/

                    final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, song.getAudioname());


                    if (!(mediaPlayer.isPlaying())) {
                        mediaPlayer.start();
                    } else if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                }

        });

    }

}

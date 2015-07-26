package com.app.whiska.voicefeature;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;


public class MainActivity extends ActionBarActivity {

    Button recordButton;
    ListView mainListView;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recordButton=(Button)findViewById(R.id.record_button);
        mainListView=(ListView)findViewById(R.id.main_list_view);
        player=new MediaPlayer();
        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File testFile=new File(v.getContext().getFilesDir()+"/"+"test.txt");
                Toast.makeText(getApplicationContext(), testFile.getAbsolutePath(),Toast.LENGTH_LONG).show();
            }
        };
        recordButton.setOnClickListener(onClickListener);
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

    public void play

}

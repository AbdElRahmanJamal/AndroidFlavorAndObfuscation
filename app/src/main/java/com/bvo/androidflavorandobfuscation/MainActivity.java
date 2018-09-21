package com.bvo.androidflavorandobfuscation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.bvo.androidflavorandobfuscation.model.Club;
import com.bvo.androidflavorandobfuscation.model.Player;
import com.bvo.androidflavorandobfuscation.model.PremierLeagueClubs;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView1;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView2);
        Log.d(TAG, AppType.TYPeOFAPP);
        textView.setText(AppType.TYPeOFAPP);
        textView.setText(PremierLeagueClubs.LIVERPOOL);
        Player player = new Player();
        player.setPlayerClub(new Club());
        player.setPlayerClub(new Club());
    }
}

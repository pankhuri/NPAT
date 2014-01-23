package com.example.nameplaceanimalthing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
    /** Called when the user clicks the play button */
    public void open_play_screen(View view) {
    	Intent intent = new Intent(this, PlayScreen.class);
    	startActivity(intent);
    }
    
    public void open_help_screen(View view) {
    	Intent intent = new Intent(this, HelpScreen.class);
    	startActivity(intent);
    }
    
}

package com.example.nameplaceanimalthing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class PlayScreen extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    Intent intent = getIntent();
	    setContentView(R.layout.play);
	}

}

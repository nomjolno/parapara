package com.example.parapara;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	public int count = 0;
	public int[] images = new int[14];
	private ImageView imageView;

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageView = (ImageView)findViewById(R.id.imageView1);	
		/*
		for (int i = 0; i < 14; i++) {
			images[i] = getResources().getIdentifier("droid_chan_" + i, "drawble",getPackageName());
		}
		 * 
		 */
		int i = 0 ;
		while ( i < 14){
			images[i] = getResources().getIdentifier("droid_chan_" + i, "drawble",getPackageName());
			i = i + 1 ;
			
		}
		imageView.setImageResource(R.drawable.droid_chan_0);
	}
	public void onchange(View view) {
		count++;
			 
		if (count >= 14) {
			count = 0;	
		}
		imageView.setImageResource(images[count]);	
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

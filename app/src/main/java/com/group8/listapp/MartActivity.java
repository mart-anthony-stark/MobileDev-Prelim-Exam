package com.group8.listapp;

import android.app.Activity;
import android.os.Bundle;

public class MartActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mart);
		getActionBar().setDisplayHomeAsUpEnabled(true);
    }

	@Override
	public boolean onNavigateUp(){
		// TODO: Implement this method
		finish();
		return true;
	}
}

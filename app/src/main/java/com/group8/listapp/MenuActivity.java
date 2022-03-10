package com.group8.listapp;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MenuActivity extends Activity {
    Button viewBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
		getActionBar().hide();
		
		viewBtn = findViewById(R.id.viewBtn);
		viewBtn.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1){
					Intent i = new Intent(MenuActivity.this, MainActivity.class);
					startActivity(i);
				}
			});
    }
    
}

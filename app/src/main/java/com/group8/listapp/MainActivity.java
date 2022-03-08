package com.group8.listapp;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity { 
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		list = findViewById(R.id.list);
		final String[] names = {"Mart Anthony", "Rafael","Warren"};
		ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
					Toast.makeText(MainActivity.this, "" + names[position], Toast.LENGTH_SHORT).show();
				}
			});
    }
	
} 

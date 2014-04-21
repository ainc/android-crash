package com.example.sandboxapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class FirstActivity extends Activity {
	
	List<String> items = new ArrayList<String>();
	MyListAdapter adapter = new MyListAdapter();
	EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        
        items.add("Platypus");
        items.add("Granola");
        items.add("Jerkey");
        items.add("Lebron");
        
        ListView list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);
        
        edit = (EditText) findViewById(R.id.edittext);
        
        Button listButton = (Button) findViewById(R.id.button);
        listButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				String text = edit.getText().toString();
				Log.i("AINC", "text: "+text);
				items.add(text);
				adapter.notifyDataSetChanged();
			}
        });
        
        Button maButton = (Button) findViewById(R.id.main_activity);
        maButton.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		//Toast.makeText(FirstActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
        		Intent mIntent = new Intent(FirstActivity.this, MainActivity.class);
        		mIntent.putExtra("high_score", 100);
        		startActivity(mIntent);
        	}
        });
    }
    
    private class MyListAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return items.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View recycledView, ViewGroup container) {
			TextView v = (TextView) recycledView;
			
			if(v == null) {
				v = new TextView(FirstActivity.this);
			}
			
			v.setText(items.get(position));
			
			return v;
		}
    	
    }
}

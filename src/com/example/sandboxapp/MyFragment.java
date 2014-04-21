package com.example.sandboxapp;

import java.util.Random;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MyFragment extends Fragment {
	
	public MyFragment() {
		// this is dumb...
	}
	

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	View view = inflater.inflate(R.layout.my_fragment, null);
    	
    	Random random = new Random();
    	int r = random.nextInt(256);
    	int g = random.nextInt(256);
    	int b = random.nextInt(256);
    	view.setBackgroundColor(Color.argb(255, r, g, b));
    	
    	return view;
    }
}

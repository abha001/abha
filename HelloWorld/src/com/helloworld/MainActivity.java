package com.helloworld;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	StringBuffer s;
	TextView t;
	Button b;
	Random r = new Random();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		t=(TextView) findViewById(R.id.textView1);
		b=(Button) findViewById(R.id.button1);
		s =  new StringBuffer("Hello world!");  
		b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				for(int i=0; i<=r.nextInt(10)+1; i++){
					int x = r.nextInt(11);
					swap(x,11-x);
					
				}t.setText(s);
			}
		});
	}
	
	public void swap(int a, int b)
	{ char c;
	 c=s.charAt(a);
	 s.setCharAt(a,s.charAt(b));
	 s.setCharAt(b, c);
	 
	}
}

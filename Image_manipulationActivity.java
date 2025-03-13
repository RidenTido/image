package com.image;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Image_manipulationActivity extends Activity {
	
	ImageView imageView;
	Button prev, next;
	
	int[] images = {R.drawable.lotus,R.drawable.rainbow,R.drawable.violet};
	
	int currentIndex= 0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        imageView =(ImageView) findViewById(R.id.image);
        prev = (Button) findViewById(R.id.prev);
        next = (Button) findViewById(R.id.next);
        
        prev.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				if(currentIndex>0){
					currentIndex--;
					imageView.setImageResource(images[currentIndex]);
				}
			}
		});
        
        next.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				if(currentIndex<images.length-1){
					currentIndex++;
					imageView.setImageResource(images[currentIndex]);
				}
			}
		});
        imageView.setImageResource(images[currentIndex]);
    }
}
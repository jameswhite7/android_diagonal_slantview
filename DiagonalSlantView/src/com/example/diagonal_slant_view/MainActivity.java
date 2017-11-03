package com.example.diagonal_slant_view;

import com.example.diagonal_slant_view.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	private ImageView imageViewRound;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Hide title bar
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		 getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_main);
		imageViewRound=(ImageView)findViewById(R.id.imageView_round);
		Bitmap icon = BitmapFactory.decodeResource(getResources(),R.drawable.pic2);
		imageViewRound.setImageBitmap(icon);
	}
}

package net.codebundle.codebundle;

import android.app.Activity;
import android.os.Bundle;

public class ReviewContent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(Reviews.reviewLayout[Reviews.revlistpos]);
	}
	
}

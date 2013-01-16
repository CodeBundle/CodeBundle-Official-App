package net.codebundle.codebundle;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TutorialLoader extends Activity {

	WebView TutLoad;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web_view);

		TutLoad = (WebView) findViewById(R.id.wvTut);

		TutLoad.loadUrl("file:///android_asset/"
				+ Tutorials.TutorialName[Tutorials.revlistpos] + Nasm.revlistpos + ".html");
	}

}

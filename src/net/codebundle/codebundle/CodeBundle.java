package net.codebundle.codebundle;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings({ "deprecation" })
public class CodeBundle extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final TabHost tabHost = getTabHost();

		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("About")
				.setContent(new Intent(this, About.class)));

		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Reviews")
				.setContent(new Intent(this, Reviews.class)));

	}
}

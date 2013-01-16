package net.codebundle.codebundle;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reviews extends ListActivity {

	String reviewName[] = {"Chromium OS", "Lubuntu Vs XP", "Slax", "Slitaz"};
	public static int reviewLayout[] = {R.layout.r_chromium_os, R.layout.r_lubuntu, R.layout.r_slax, R.layout.r_slitaz};
	public static int revlistpos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Reviews.this,
				android.R.layout.simple_list_item_1, reviewName));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		revlistpos = position;
		try {
			startActivity(new Intent(Reviews.this, Class.forName("net.codebundle.codebundle.ReviewContent")));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

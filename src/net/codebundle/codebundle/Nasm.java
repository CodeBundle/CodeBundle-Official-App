package net.codebundle.codebundle;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Nasm extends ListActivity {

	String reviewName[] = {"Part 1 - Setup, Compiling and Hello World"};
	public static int revlistpos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Nasm.this,
				android.R.layout.simple_list_item_1, reviewName));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		revlistpos = position;
		try {
			startActivity(new Intent(Nasm.this, Class.forName("net.codebundle.codebundle.TutorialLoader")));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

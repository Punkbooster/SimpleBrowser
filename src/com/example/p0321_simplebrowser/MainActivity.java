package com.example.p0321_simplebrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	Button btnWeb;
	
	  /** Called when the activity is first created. */
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    
	    btnWeb = (Button)findViewById(R.id.btnWeb);
	    
	    btnWeb.setOnClickListener(this);

	/* Short method:   
	 * (findViewById(R.id.btnWeb)).setOnClickListener(new OnClickListener() {
	      @Override
	      public void onClick(View v) {
	        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
	      }
	    }); */
	  }
	  @Override
	  public void onClick(View v) {
		  Intent intent;
		  switch(v.getId()) {
		  case R.id.btnWeb:
		  intent = new Intent();
		  intent.setAction(Intent.ACTION_VIEW);
		  intent.setData(Uri.parse("http://www.google.com"));
		  startActivity(intent);
		  break;
	  }
	  }
}





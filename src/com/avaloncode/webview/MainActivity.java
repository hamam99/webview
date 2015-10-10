package com.avaloncode.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		// initiate webview
		WebView wv = (WebView) findViewById(R.id.webview);

		// Sets the WebViewClient that will receive various notifications and
		// requests.
		wv.setWebViewClient(new WebClient());

		// Enabling javascrip
		wv.getSettings().setJavaScriptEnabled(true);

		// load url
		wv.loadUrl("http://www.google.com");

	}

	// we use webclient beacuse if we click a link , the link will be opened in
	// the app
	// if you don`t use WebClient class and click a link , the link will be
	// opened using another app
	public class WebClient extends WebViewClient {

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO Auto-generated method stub
			view.loadUrl(url);
			return true;
		}

	}

}

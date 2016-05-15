package com.example.jacka.a11_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button openURLButton;
    private EditText urlEditText;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerToOpenURL();
    }

    private void addListenerToOpenURL() {
        openURLButton = (Button) findViewById(R.id.openURLButton);
        urlEditText = (EditText) findViewById(R.id.editTextURL);
        webView = (WebView) findViewById(R.id.webView);

        /* To open any web pages, it needs to get permission in the Manifest */
        openURLButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = urlEditText.getText().toString();
                webView.getSettings().setLoadsImagesAutomatically(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView.loadUrl(url);
            }
        });
    }
}

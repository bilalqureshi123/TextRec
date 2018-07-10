package com.example.raheelayasmin.textrec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    public void goBack(View view){
        Intent intento = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intento);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Intent gg = getIntent();
        Bundle bundle = gg.getExtras();

        WebView webView = (WebView) findViewById(R.id.webView1);
        WebSettings webSettings = webView.getSettings();
        webSettings.getJavaScriptEnabled();
String du = bundle.getString("recgText");
        webView.loadUrl("https://translate.google.com/?client=safari&rls=en&oe=UTF-8&um=1&ie=UTF-8&hl=en&client=tw-ob#auto/en/"+du);
//https://translate.google.com/?client=safari&rls=en&oe=UTF-8&um=1&ie=UTF-8&hl=en&client=tw-ob#auto/en/
    }
}

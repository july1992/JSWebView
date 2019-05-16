package com.vily.jswebview;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.Button;

import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button mBtn_click;
    private BridgeWebView mWeb_view;
    private Button mBtn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initListener();
    }


    private void initView() {
        mBtn_click = findViewById(R.id.btn_click);
        mBtn_send = findViewById(R.id.btn_send);
        mWeb_view = findViewById(R.id.web_view);
//        WebSettings webSettings = mWeb_view.getSettings();
////        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
////            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
////        }

    }


    private void initData() {


        mWeb_view.loadUrl("http://www.senseplay.com/support/manual/s1.html");
//        mWeb_view.loadUrl("http://www.senseplay.cn/support/manual/video.html");
//        mWeb_view.loadUrl("https://v.qq.com/");


    }
    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }
    private void initListener() {
//        mBtn_click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mWeb_view.loadUrl("file:///android_asset/wx.html");
//            }
//        });
//        mBtn_send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mWeb_view.send("----发送",new CallBackFunction(){
//                    @Override
//                    public void onCallBack(String data) {
//                        Log.e(TAG, "------来自web的回传数据：" + data);
//                    }
//                });
//            }
//        });
//
//        mWeb_view.setDefaultHandler(new BridgeHandler() {
//            @Override
//            public void handler(String data, CallBackFunction function) {
//                Log.e(TAG, "---------DefaultHandler接收全部来自web的数据："+data);
//                function.onCallBack("------DefaultHandler收到Web发来的数据，回传数据给你");
//            }
//        });
//
//        mWeb_view.registerHandler("submitFromWeb", new BridgeHandler() {
//
//            @Override
//            public void handler(String data, CallBackFunction function) {
//                Log.e(TAG, "-------指定Handler接收来自web的数据：" + data);
//                function.onCallBack("------指定Handler收到Web发来的数据，回传数据给你");
//            }
//        });
//    }

    }
}

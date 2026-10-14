package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class hn1 {
    private hn1() {
    }

    public static void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public static void a(WebView webView, float f10) {
        a(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public static void a(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public static void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public static void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void a(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            String strA = fn1.a("The WebView is null for ", str);
            if (!mm1.f23114a.booleanValue() || TextUtils.isEmpty(strA)) {
                return;
            }
            Log.i("OMIDLIB", strA);
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else {
                    if (obj instanceof String) {
                        String string = obj.toString();
                        if (string.startsWith("{")) {
                            sb2.append(string);
                        } else {
                            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                            sb2.append(string);
                        }
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                }
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                sb2.append(",");
            }
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(")}");
        String string2 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string2);
        } else {
            handler.post(new gn1(webView, string2));
        }
    }

    public static void a(WebView webView, JSONObject jSONObject) {
        a(webView, "init", jSONObject);
    }

    public static void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public static void b(WebView webView, String str) {
        a(webView, "setState", str);
    }

    public static void b(WebView webView, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }
}

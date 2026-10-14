package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhq {
    private static final zzfhq zza = new zzfhq();

    private zzfhq() {
    }

    public static final zzfhq zza() {
        return zza;
    }

    public final void zzb(WebView webView, String str, Object... objArr) {
        String string;
        if (webView == null) {
            zzfgt.zza.booleanValue();
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        if (objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    string = "\"\"";
                } else {
                    if (obj instanceof String) {
                        string = obj.toString();
                        if (!string.startsWith("{")) {
                            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                            sb2.append(string);
                            sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                        }
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                }
                sb2.append(string);
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
            handler.post(new zzfhp(this, webView, string2));
        }
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f10) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public final void zzf(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}

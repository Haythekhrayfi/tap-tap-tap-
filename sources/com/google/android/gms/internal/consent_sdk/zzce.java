package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzce {
    private static Boolean zza;

    private zzce() {
    }

    @TargetApi(19)
    public static void zza(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (zzce.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
                zBooleanValue = zza.booleanValue();
            } else {
                zBooleanValue = zza.booleanValue();
            }
            throw th;
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            String strValueOf = String.valueOf(str);
            webView.loadUrl(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
        }
    }
}

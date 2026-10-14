package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes2.dex */
final class zzbf extends WebViewClient {
    public final /* synthetic */ zzbg zza;

    public /* synthetic */ zzbf(zzbg zzbgVar, zzbe zzbeVar) {
        this.zza = zzbgVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzbg.zzc(this.zza, str)) {
            this.zza.zzb.zzd(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.zza.zzc) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbg.zze(this.zza, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zza.zzb.zze(i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (!zzbg.zzc(this.zza, string)) {
            return false;
        }
        this.zza.zzb.zzd(string);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!zzbg.zzc(this.zza, str)) {
            return false;
        }
        this.zza.zzb.zzd(str);
        return true;
    }
}

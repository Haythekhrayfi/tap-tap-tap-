package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
final class zzaux implements Runnable {
    public final ValueCallback zza;
    public final /* synthetic */ zzaup zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzauz zze;

    public zzaux(zzauz zzauzVar, final zzaup zzaupVar, final WebView webView, final boolean z10) {
        this.zze = zzauzVar;
        this.zzb = zzaupVar;
        this.zzc = webView;
        this.zzd = z10;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzauw
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzaux zzauxVar = this.zza;
                zzaup zzaupVar2 = zzaupVar;
                WebView webView2 = webView;
                boolean z11 = z10;
                zzauxVar.zze.zzd(zzaupVar2, webView2, (String) obj, z11);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}

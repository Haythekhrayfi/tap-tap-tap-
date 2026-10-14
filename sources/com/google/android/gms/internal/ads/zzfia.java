package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfia extends zzfhx {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfia(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfhz(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final void zzf(zzfha zzfhaVar, zzfgy zzfgyVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZzi = zzfgyVar.zzi();
        for (String str : mapZzi.keySet()) {
            zzfib.zze(jSONObject, str, (zzfhg) mapZzi.get(str));
        }
        zzg(zzfhaVar, zzfgyVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfhx
    public final void zzj() {
        WebView webView = new WebView(zzfho.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}

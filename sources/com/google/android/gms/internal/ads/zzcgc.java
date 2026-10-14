package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzcgc extends zzcfg {
    public zzcgc(zzcez zzcezVar, zzawz zzawzVar, boolean z10, zzebl zzeblVar) {
        super(zzcezVar, zzawzVar, z10, new zzbqv(zzcezVar, zzcezVar.zzE(), new zzbaw(zzcezVar.getContext())), null, zzeblVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzN(WebView webView, String str, Map map) {
        zzbbe zzbbeVar;
        if (!(webView instanceof zzcez)) {
            zzbzr.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcez zzcezVar = (zzcez) webView;
        zzbws zzbwsVar = this.zza;
        if (zzbwsVar != null) {
            zzbwsVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcezVar.zzN() != null) {
            zzcezVar.zzN().zzE();
        }
        if (zzcezVar.zzO().zzi()) {
            zzbbeVar = zzbbm.zzP;
        } else {
            zzbbeVar = zzcezVar.zzaA() ? zzbbm.zzO : zzbbm.zzN;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbeVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzt(zzcezVar.getContext(), zzcezVar.zzn().zza, str2);
    }
}

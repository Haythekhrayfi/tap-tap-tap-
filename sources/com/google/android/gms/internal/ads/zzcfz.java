package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfz {
    private final zzcga zza;
    private final zzcfy zzb;

    public zzcfz(zzcga zzcgaVar, zzcfy zzcfyVar) {
        this.zzb = zzcfyVar;
        this.zza = zzcgaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcga, com.google.android.gms.internal.ads.zzcgh] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r10 = this.zza;
            zzaqs zzaqsVarZzI = r10.zzI();
            if (zzaqsVarZzI == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                zzaqo zzaqoVarZzc = zzaqsVarZzI.zzc();
                if (r10.getContext() != null) {
                    Context context = this.zza.getContext();
                    zzcga zzcgaVar = this.zza;
                    return zzaqoVarZzc.zzf(context, str, (View) zzcgaVar, zzcgaVar.zzi());
                }
                str2 = "Context is null, ignoring.";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str2);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcga, com.google.android.gms.internal.ads.zzcgh] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r10 = this.zza;
        zzaqs zzaqsVarZzI = r10.zzI();
        if (zzaqsVarZzI == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            zzaqo zzaqoVarZzc = zzaqsVarZzI.zzc();
            if (r10.getContext() != null) {
                Context context = this.zza.getContext();
                zzcga zzcgaVar = this.zza;
                return zzaqoVarZzc.zzh(context, (View) zzcgaVar, zzcgaVar.zzi());
            }
            str = "Context is null, ignoring.";
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzbzr.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        zzcfy zzcfyVar = this.zzb;
        Uri uri = Uri.parse(str);
        zzcfg zzcfgVarZzaJ = ((zzcfs) zzcfyVar.zza).zzaJ();
        if (zzcfgVarZzaJ == null) {
            zzbzr.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcfgVarZzaJ.zzj(uri);
        }
    }
}

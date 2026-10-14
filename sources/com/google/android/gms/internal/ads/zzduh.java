package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduh implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzduh(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfel zzfelVar = (zzfel) this.zza.zzb();
        final CookieManager cookieManagerZzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzfec zzfecVarZzi = zzfdv.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdue
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaK));
            }
        }, zzfef.WEBVIEW_COOKIE, zzfelVar).zzi(1L, TimeUnit.SECONDS);
        final zzduf zzdufVar = new zzfdo() { // from class: com.google.android.gms.internal.ads.zzduf
            @Override // com.google.android.gms.internal.ads.zzfdo
            public final Object zza(Object obj) {
                return "";
            }
        };
        return zzfecVarZzi.zzc(Exception.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzfdy
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzh("");
            }
        }).zza();
    }
}

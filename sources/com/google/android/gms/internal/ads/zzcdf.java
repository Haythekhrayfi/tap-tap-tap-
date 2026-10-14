package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.b.a.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdf implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ zzcdl zze;

    public zzcdf(zzcdl zzcdlVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zze = zzcdlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = c.a("event", "precacheProgress");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("bytesLoaded", Integer.toString(this.zzc));
        mapA.put("totalBytes", Integer.toString(this.zzd));
        mapA.put("cacheReady", "0");
        zzcdl.zze(this.zze, "onPrecacheEvent", mapA);
    }
}

package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.b.a.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdj implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzcdl zzd;

    public zzcdj(zzcdl zzcdlVar, String str, String str2, long j10) {
        this.zzd = zzcdlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapA = c.a("event", "precacheComplete");
        mapA.put("src", this.zza);
        mapA.put("cachedSrc", this.zzb);
        mapA.put("totalDuration", Long.toString(this.zzc));
        zzcdl.zze(this.zzd, "onPrecacheEvent", mapA);
    }
}
